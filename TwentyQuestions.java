import java.util.Scanner;

public class TwentyQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String question1, question2;		

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");

		System.out.println("");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print("> ");
		question1 = keyboard.next();

		System.out.println("");
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		question2 = keyboard.next();

		if ( question1.equals( "animal" ) )
		{
			if ( question2.equals( "yes" ) )
			{
				System.out.println("My guess is that you are thinking of a moose.");
			}
			else if ( question2.equals( "no" ) )
			{
				System.out.println("My guess is that you are thinking of a squirrel.");
			}
		}
		if ( question1.equals( "vegetable" ) )
		{
			if ( question2.equals( "yes" ) )
			{
				System.out.println("My guess is that you are thinking of a watermelon.");
			}
			else if ( question2.equals( "no" ) )
			{
				System.out.println("My guess is that you are thinking of a carrot.");
			}
		}
		if ( question1.equals( "mineral" ) )
		{
			if ( question2.equals( "yes" ) )
			{
				System.out.println("My guess is that you are thinking of a Camaro.");
			}
			else if ( question2.equals( "no" ) )
			{
				System.out.println("My guess is that you are thinking of a paper clip.");
			}
		}

		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}