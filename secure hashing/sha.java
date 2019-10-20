import java.math.*;
import java.nio.charset.*;
import java.security.*;
import java.util.*;


class sha
{
	public static byte[] getsha(String input) throws Exception
	{
		MessageDigest md=MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	public static String tohex(byte[] hash)
	{
		BigInteger no=new BigInteger(1,hash);
		StringBuilder str=new StringBuilder(no.toString(16));
		while(str.length()<32)
		{
			str.insert(0,"0");
		}
		return str.toString();
	}
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("generated hash value is"+tohex(getsha(s)));
	}
}
