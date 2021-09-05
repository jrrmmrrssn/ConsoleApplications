import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		int earthWeight, planetVisiting;
		Double planetWeight;

		System.out.print("Please enter your current earth weight: ");
		earthWeight = keyboard.nextInt();

		System.out.println("");

		System.out.println("I have information for the following planets: ");
		System.out.println("    1. Venus  2. Mars   3. Jupiter ");
		System.out.println("    4. Saturn 5. Uranus 6. Neptune ");
		System.out.println("");

		
		System.out.print("Which planet are you visiting? ");
		planetVisiting = keyboard.nextInt();

		if ( planetVisiting == 1 )
		{
			planetWeight = earthWeight * 0.78;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}
		else if ( planetVisiting == 2 )
		{
			planetWeight = earthWeight * 0.39;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}
		else if ( planetVisiting == 3 )
		{
			planetWeight = earthWeight * 2.65;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}
		else if ( planetVisiting == 4 )
		{
			planetWeight = earthWeight * 1.17;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}
		else if ( planetVisiting == 5 )
		{
			planetWeight = earthWeight * 1.05;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}
		else if ( planetVisiting == 6 )
		{
			planetWeight = earthWeight * 1.23;
			System.out.println("");
			System.out.print("Your weight would be " + planetWeight + " pounds on that planet.");
		}

	}
}