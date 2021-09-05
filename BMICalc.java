import java.util.Scanner;

public class BMICalc
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Double height, weight;

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		weight = keyboard.nextDouble();

		System.out.println("");
		System.out.println("Converted to inches and pounds: ");
		System.out.println((height * 39.3701) + " inches.");
		System.out.println((weight * 2.20462) + " pounds.");
		System.out.println("Your BMI is " + (weight / (height * height)));
	}
}