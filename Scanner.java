import java.lang.*;
import java.util.*;

class Scanner
{
	public static void main(String args[])
	{
		String name;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("may i know your name?");
		name = sc.nextLine();
		System.out.println(name);
	}
}