/*
 * Midterm Question
 * Name: Praveen Manimaran
 * This program checks if there are any duplicates in the input entered and prints out
 * the number of times it is there
 * 
 */

import java.util.Scanner;
public class DupChecker {

	public static void main(String[] args) 
	{

		String input;
		Scanner scanner = new Scanner(System.in);
		int numTimes = 0;
		boolean matched = false;
		System.out.println("Enter words to check duplicates, maximum 64 words allowed: ");
		input = scanner.nextLine();
		
		String strArray[] = input.split(" ");

		for(int a = 0; a<strArray.length; a++ )
		{
			numTimes = 0;
			for(int b = a+1; b< strArray.length; b++)
			{
				if(strArray[a].equals(strArray[b]))
				{
					numTimes++;
					strArray[b] = " ";
				}
			}

			if( numTimes >= 1 && strArray[a] != " ")
			{
				matched = true;
				System.out.println(strArray[a] +" " +(numTimes+1));
			}
			
		}
		if(matched == false)
		{
			System.out.println("No Duplicates");
		}

	}

}
