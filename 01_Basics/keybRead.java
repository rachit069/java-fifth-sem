// import java.util.*;
import java.util.Scanner;

class keybRead
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		String a;
		System.out.println("May I know your name");
		a = s.nextLine();
		if(a.equals("Rachit")){
			System.out.println("Access granted");
		}
		else{
			System.out.println("hacker hai bhai hacker");
		}
		System.out.println(" ");
	}
}