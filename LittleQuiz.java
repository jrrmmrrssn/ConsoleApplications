import java.util.Scanner;

public class LittleQuiz
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int question1, question2, question3;
		String start ="";
		int correct = 0;

		System.out.print("Are you ready for a quiz?(Y or N) ");
		start = keyboard.next();

		if ( start.equals("y") )
		{
			System.out.println("Okay, here it comes! ");
		}
		else
		{
			System.out.println("Thank you for playing.");
		}
		System.out.println("");

		System.out.println("Q1) What is the capital of Alaska? ");
		System.out.println("         1) Melbourne ");
		System.out.println("         2) Anchorage ");
		System.out.println("         3) Juneau    ");

		System.out.println("");
		question1 = keyboard.nextInt();

		if ( question1 == 3 )
		{
			System.out.println("That's right!");
		}
		else
		{
			System.out.println("That's wrong, the correct answer is Juneau.");
		}
		System.out.println("");

		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int? ");
		System.out.println("        1) yes ");
		System.out.println("        2) no  ");

		System.out.println("");
		question2 = keyboard.nextInt();

		if ( question2 == 2 )
		{
			System.out.println("That's right!");
		}
		else
		{
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
		}
		System.out.println("");

		System.out.println("Q3) What is the result of 9+6/3? ");
		System.out.println("        1) 5   ");
		System.out.println("        2) 11  ");
		System.out.println("        3) 15/3");
		System.out.println("");
		
		question3 = keyboard.nextInt();

		if ( question3 == 2 )
		{
			System.out.println("That's correct!");
		}
		else
		{
			System.out.println("Sorry, the correct answer is 11.");
		}

		if ( question1 == 3 )
		{
			correct += 1;
		}
		if ( question2 == 2 )
		{
			correct += 1;
		}
		if ( question3 == 2 )
		{
			correct += 1;
		}

		System.out.println("");
		System.out.println("Overall, you got " + correct + " out of 3 correct.");
		System.out.println("Thanks for playing!");
	}
}