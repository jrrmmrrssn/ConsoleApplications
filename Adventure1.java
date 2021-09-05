import java.util.Scanner;

public class Adventure1
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String question1, question2, question3;

		System.out.println("");
		System.out.println("WELCOME TO JEREMY'S TINY ADVENTURE!");
		System.out.println("");
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		System.out.print("> ");
		question1 = keyboard.next();

		if ( question1.equals( "upstairs" ) )
		{
			System.out.println("");
			System.out.println("You proceed up the stairs, there is a \"bedroom\" at the end of the hall or a \"door\" to your right rumbling?");
			System.out.print("> ");
			question2 = keyboard.next();
	
			if ( question2.equals( "bedroom" ) )
			{
				System.out.println("");
				System.out.println("You walk down the hall, floor creeking along the way, and walk through the door at the end of the hall. You notice a lot of old furniture, cobwebs, and a distinct smell of aged cat urine. you decide to leave the room, do you go \"home\" or check the rumbling \"door\" along the way?");
				System.out.print("> ");
				question3 = keyboard.next();
			
				if ( question3.equals( "home" ) )
				{
					System.out.println("");
					System.out.println("You head back down the stairs, out the door, and say goodbye to the big creepy house!");
				}
				else if ( question3.equals( "door" ) )
				{
					System.out.println("");
					System.out.println("You double back down the hall to the door that was rumbling. You nervously open the door. It was nothing but the wind whistling and rumbling the door. Whew.");
				}
			}
			else if ( question2.equals( "door" ) )
			{
				System.out.println("");
				System.out.println("The door rumbles as you reach for the doorknob, their is whistling sound almost as if a ghost of someone who passed away is still calling for help just beyond the door. To your suprise, it is just a bathroom and a window is cracked open and wind is whistling and rumbling the door. Do you go \"home\" or would you like to \"camp\" overnight?");
				System.out.print("> ");
				question3 = keyboard.next();
			
				if ( question3.equals( "home" ) )
				{
					System.out.println("");
					System.out.println("You walk back down the stairs, out the door, and say goodbye to the big creepy house!");
				}
				else if ( question3.equals( "camp" ) )
				{
					System.out.println("");
					System.out.println("You head back to the room to set up camp in the room at the end of the hall, now the real fun begins!");
				}
			}
		}
		else if ( question1.equals( "kitchen" ) )
		{
			System.out.println("");
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refridgerator. You may open the \"refridgerator\" or look in a \"cabinet\".");
			System.out.print("> ");
			question2 = keyboard.next();
		
			if ( question2.equals( "refridgerator" ) )
			{
				System.out.println("");
				System.out.println("Inside the refridgerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\"");
				System.out.print("> ");
				question3 = keyboard.next();
			
				if ( question3.equals( "yes" ) )
				{
					System.out.println("");
					System.out.println("You take a big bite out of some old pizza, it was the safest looking bit of food their. You immediatly regret it as you get this sharp pain in your stomach. Soon after you vomit, time to head home!");
				}
				else if ( question3.equals( "no" ) )
				{
					System.out.println("");
					System.out.println("Probably the best choice, don't wana get sick!");
				}
			}
			else if ( question2.equals( "cabinet" ) )
			{
				System.out.println("");
				System.out.println("You open a cabinet door, and you notice there is a tunnel leading as far into darkness as the light will allow you to see. Will you enter the \"tunnel\" or leave and go \"home\"?");
				System.out.print("> ");
				question3 = keyboard.next();
			
				if ( question3.equals( "home" ) )
				{
					System.out.println("");
					System.out.println("Bye, chicken shit!");
				}
				else if ( question3.equals( "tunnel" ) )
				{
					System.out.println("");
					System.out.println("You enter the dark tunnel, the door slams shut behind you and you were never seen again!");
				}
			}
		}
		System.out.println("");
		System.out.println("THANK'S FOR PLAYING!");
		System.out.println("I'm tired of making nested if statements :) ");
	}
}