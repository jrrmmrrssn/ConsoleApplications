import java.util.Scanner;

public class WorstGuessing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int guess;
		
		int i = 4;

		System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!!");
		System.out.println("");

		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
		guess = keyboard.nextInt();

		System.out.println("");
		
		if ( guess == i )
		{
			System.out.println("LOL!!!! YOU GOT IT!! I CAN'T BELIEVE YOU GUESSED IT WAS " + i + "!");
		}
		else if ( guess != i )
		{
			System.out.println("WOOT! U SUCK!!! I PWN JOOO!!! IT WAS " + i + "!");
		}
	}
}