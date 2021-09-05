import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int guess;
		String response1 = "";
		String response2 = "";
		String response3 = "";
		String response4 = "";
		int winner = 1 + r.nextInt(3);

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");

		System.out.println("");
		
		System.out.println("Which one is the ace? ");
		System.out.println("");
		System.out.println("        **  **  ** ");
		System.out.println("        **  **  ** ");
		System.out.println("        1   2   3  ");

		System.out.println("");

		System.out.print("> ");
		guess = keyboard.nextInt();

		if ( winner == 1 ) {
			response1 = "";
			response2 = "        AA  **  ** ";
			response3 = "        AA  **  ** ";
			response4 = "        1   2   3  ";
		}
		if ( winner == 2 ) {
			response1 = "";
			response2 = "        **  AA  ** ";
			response3 = "        **  AA  ** ";
			response4 = "        1   2   3  ";
		}
		if ( winner == 3 ) {
			response1 = "";
			response2 = "        **  **  AA ";
			response3 = "        **  **  AA ";
			response4 = "        1   2   3  ";
		}

		if ( guess == winner )
		{
			System.out.println("");
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			System.out.println(response1);
			System.out.println(response2);
			System.out.println(response3);
			System.out.println(response4);
		}
		else if ( guess != winner )
		{
			System.out.println("");
			System.out.println("Ha, Fast Eddie wins again! The ace was card number " + winner + ".");
			System.out.println(response1);
			System.out.println(response2);
			System.out.println(response3);
			System.out.println(response4);
		}
	}
}
		

			