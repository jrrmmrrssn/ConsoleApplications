import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int total, choice;
		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		choice = keyboard.nextInt();
		total = choice;
		System.out.println("The total so far is " + total );
		while ( choice != 0 )
		{
			System.out.print("Number: ");
			choice = keyboard.nextInt();
			total = (total + choice);
			System.out.println("The total so far is " + total );
		}
		if ( choice == 0 )
			System.out.println("");
			System.out.println("The total is " + total );
	}
}