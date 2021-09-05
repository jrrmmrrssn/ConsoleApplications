import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int a = 0;
		int guess; 
		int i = 1 + r.nextInt(10);

		System.out.println("THE NUMBER GUESSING GAME!!!!!!!");
		System.out.println("");

		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
		guess = keyboard.nextInt();
		
		a++;

		System.out.println("");
		
		while ( guess != i )
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			a++;	
		}
		
		System.out.println("That's right! My secret number was " + i + "!");
		System.out.println("It only took you " + a + " tries.");
	}
}