/* Factorial.java
*
*  Description: This class implements a tail recursion method for calculating
*  factorials.
*
*  Author: Ted Mader, 3/12/2014
*/

import java.util.Scanner;

public class Factorial
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter number to calculate the factorial: " );
		
		int number = input.nextInt();
		int result = tailSum( number, 1 );
		
		System.out.println( "Factorial is: " + result );
	}
	
	public static int tailSum( int n, int total )
	{
		if( n == 1 )
		{
			return total;
		}
		
		else
		{
			return tailSum( n - 1, total * n );
		}
	}
}