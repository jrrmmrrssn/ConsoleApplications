import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int counter = 1;
		int winner = 1 + r.nextInt(100);
		int maxTries = 8;
		int guess;
		
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.print("First guess: ");
		guess = keyboard.nextInt();
		
		counter++;

		while ( guess != winner && counter < maxTries )
		{
			if ( guess < winner )
			{
				System.out.println("Sorry, you are too low.");
			}
			else if ( guess > winner )
			{
				System.out.println("Sorry, that guess is too high.");
			}
			
			System.out.print("Guess #" + counter + ": ");
			guess = keyboard.nextInt();
			counter++;
		}

		if ( counter == maxTries )
			System.out.println("Sorry, you didn't guess it in " + maxTries + " tries. You lose.");
		else if ( guess == winner )
			System.out.println("You guessed it! What are the odds!?");
	}
}