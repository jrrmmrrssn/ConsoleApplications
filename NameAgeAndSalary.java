import java.util.Scanner;

public class NameAgeAndSalary
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		String name;
		int age;
		Double hourlyWage;

		System.out.print("Hello. What is your name? ");
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		System.out.print("So you're " + age + ", eh? That's not old at all! How much do you make, " + name + "? ");
		hourlyWage = keyboard.nextDouble();

		System.out.print(hourlyWage + "! I hope that's per hour and not per year! LOL!");
	}
}