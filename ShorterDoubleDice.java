import java.util.Random;
	
public class ShorterDoubleDice
{
	public static void main(String[] args)
	{
		Random r = new Random();

		int total, roll1, roll2;
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		total = (roll1 + roll2);
	
		System.out.println("HERE COMES THE DICE!");

		System.out.println("");

		System.out.println("Roll #1: " + roll1 );

		System.out.println("Roll #2: " + roll2 );

		System.out.println("The total is " + total + "!");

		do
		{
			roll1 = 1 + r.nextInt(6);
			roll2 = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + roll1 );
			System.out.println("Roll #2: " + roll2 );
			total = (roll1 + roll2);
			System.out.println("The total is " + total + "!");
		} while (roll1 != roll2 );
		
	}
}