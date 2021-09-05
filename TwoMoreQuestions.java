import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String question1, question2;
		
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("");
		
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println("");

		System.out.print("Question 1) Does it stay inside or outside or both? ");
		question1 = keyboard.next();

		System.out.print("Question 2) Is it a living thing? ");
		question2 = keyboard.next();
	
		System.out.println("");

		if ( question1.equals("inside") && question2.equals("yes") )
		{
			System.out.println("Obviosly the living, inside thing on your mind is a houseplane.");
		}
		if ( question1.equals("inside") && question2.equals("no") )
		{
			System.out.println("Obviously the non-living, inside thing on your mind is a shower curtain.");
		}
		if ( question1.equals("outside") && question2.equals("yes") )
		{
			System.out.println("Obviously the living, outside thing on your mind is a bison.");
		}
		if ( question1.equals("outside") && question2.equals("no") )
		{
			System.out.println("Obviously the non-living, outside thing on your mind is a billboard.");
		}
		if ( question1.equals("both") && question2.equals("yes") )
		{
			System.out.println("Obviously the living, inside/outside thing on your mind is a dog.");
		}
		if ( question1.equals("both") && question2.equals("no") )
		{
			System.out.println("Obiously the non-living, inside/outside thing on your mind is a cell phone.");
		}
	}
}