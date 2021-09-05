import java.util.Scanner;
	
public class GenderGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String gender, firstName, lastName, married;
		int age;
		
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next();

		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();
		
		System.out.print("Age: ");
		age = keyboard.nextInt();

		System.out.println("");
		
		if ( gender.equals("F") )
		{
			if ( age >= 20 )
			{
				System.out.print("Are you married, " + firstName + " (y or n)? ");
				married = keyboard.next();
				
				if ( married.equals("y") )
				{
					System.out.println("Then I shall call you Mrs. " + lastName + ".");
				}
				else if ( married.equals("n") )
				{
					System.out.println("Then I shall call you Ms. " + lastName + ".");
				}
			}
			else if ( age < 20 )
			{
				System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
			}
		}
		else if ( gender.equals("M") )
		{
			if (age >= 20 )
			{
				System.out.println("Then I shall call you Mr. " + lastName + ".");
			}
			else if (age < 20 )
			{
				System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
			}
		}

	}
}