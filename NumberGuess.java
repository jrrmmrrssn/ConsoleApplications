import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int guess; 
		int i = 1 + r.nextInt(10);

		System.out.println("THE NUMBER GUESSING GAME!!!!!!!");
		System.out.println("");

		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
		guess = keyboard.nextInt();

		System.out.println("");
		
		if ( guess == i )
		{
			System.out.println("That's right! My secret number was " + i + "!");
		}
		else if ( guess != i )
		{
			System.out.println("Sorry, but I was really thinking of " + i + ".");
		}
	}
}