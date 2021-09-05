import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Double height, weight, bmi;

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		weight = keyboard.nextDouble();

		System.out.println("");
		System.out.println("Converted to inches and pounds: ");
		System.out.println((height * 39.3701) + " inches.");
		System.out.println((weight * 2.20462) + " pounds.");
		System.out.println("Your BMI is " + (weight / (height * height)));

		bmi = (weight/ (height * height));

		if ( bmi < 15.0 )
		{
			System.out.println("BMI Category: very severely underweight");
		}
		if ( bmi >= 15.0 && bmi <= 16.0 )
		{
			System.out.println("BMI Category: severely underweight");
		}
		if ( bmi >= 16.1 && bmi <= 18.4 )
		{
			System.out.println("BMI Category: underweight");
		}
		if ( bmi >= 18.5 && bmi <= 24.9 )
		{
			System.out.println("BMI Category: normal weight");
		}
		if ( bmi >= 25.0 && bmi <= 29.9 )
		{
			System.out.println("BMI Category: overweight");
		}
		if ( bmi >= 30.0 && bmi <= 34.9 )
		{
			System.out.println("BMI Category: moderately obese");
		}
		if ( bmi >= 35.0 && bmi <= 39.9 )
		{
			System.out.println("BMI Category: severely obese");
		}
		if ( bmi >= 40.0 )
		{
			System.out.println("BMI Category: very severely (or \"morbidly\") obese");
		}
	}
}