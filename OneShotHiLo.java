import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int guess;
		
		int i = 1 + r.nextInt(100);

		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print("> ");
		guess = keyboard.nextInt();
		System.out.println("");
	
		if ( guess == i )
			System.out.println("You guessed it! What are the odds!? ");
		else if ( guess < i )
			System.out.println("Sorry, you are too low. I was thinking of " + i + ".");
		else if ( guess > i )
			System.out.println("Sorry, you are too high. I was thinking of " + i + ".");
		else
			System.out.println("ERROR");
	}
}
		
		