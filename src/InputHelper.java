import java.util.*;

public class InputHelper
{
	private static Scanner sc = new Scanner(System.in);
	
	public static String readString()
	{
		return InputHelper.readString("");
	}
	
	public static String readString(String desc)
	{
		String input;
		
		while(true)
		{
			System.out.print(desc);
			
			try
			{
				input = sc.nextLine();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Invalit Input!");
			}
			System.out.println("Try again!");
		}
		
		return input;
	}
}
