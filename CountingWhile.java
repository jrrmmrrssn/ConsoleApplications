import java.util.Scanner;

public class CountingWhile
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in a message");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		System.out.println("How many times would you like to display your message? ");
		int a = keyboard.nextInt();

		int n = 1;
		while ( n <= a )
		{
			System.out.println( (n*10) + ". " + message );
			n=n+1;
		}
	}
}