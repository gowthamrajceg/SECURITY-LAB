import java.lang.*;
import java.util.*;
import java.io.*;

class Obj
{
int id,sec;
String data;
Obj(int id,int sec,String data)
{
this.id=id;
this.data=data;
this.sec=sec;
}
public void read(Obj obj)
{
if(sec<obj.sec)
{
System.out.println("can't read");
}
else
{
System.out.println("object read "+obj.data);
}
}
public void  write(Obj obj,String data)
{
if(sec>obj.sec)
{
System.out.println("can't write");
}
else
{obj.data=data;
System.out.println("object written successfully ");
}
}

public void print()
{
System.out.println("id:"+this.id+"securitylvel"+sec+"data"+data);
}

}

class BLP
{
	public static void main(String[] args){
Obj obj1,obj2;
obj1=new Obj(1,0,"this is obj1 data");
obj2=new Obj(2,1,"this is obj2 data");
obj1.print();
obj2.print();
obj1.read(obj2);
obj2.read(obj1);
obj1.write(obj2,"this is modified data");
obj2.write(obj1,"this is modified data");
obj1.print();
	obj2.print();}

}
