//this program is practice using the what if statement by testing variable amounts with indicators.

public class WhatIf
{
	public static void main(String[] args)
	{
		//Decalare variables people, cats, and dogs and their values.
		int people = 20;
		int cats = 30;
		int dogs = 15;
		//If people is less than cats print statement
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		}
		//If people is greater than cats print statement
		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}
		//If people is less than dogs print statement
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}
		//If people is greater than dogs print statement
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		//Adds five to the total value of dogs
		dogs += 5;
		
		//If people greater than or equal to dogs print statement
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		//If peopel are less than or equal to dogs print statement
		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}
		//If people are equal to dogs print statement
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}