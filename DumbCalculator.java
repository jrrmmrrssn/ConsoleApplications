import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Double num1, num2, num3;
	
		System.out.print("What is your first number? ");
		num1 = keyboard.nextDouble();

		System.out.print("What is your second number? ");
		num2 = keyboard.nextDouble();

		System.out.print("What is your third number? ");
		num3 = keyboard.nextDouble();

		System.out.println("");
		
		System.out.println("( " + num1 + " + " + num2 + " + " + num3 + " ) / 2 is... " + ((num1 + num2 + num3) / 2));
		
	}
}