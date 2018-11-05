package db1.start.desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void Calculus(int number){
	    //Even or Odd number
		if (number%2 ==0)
	        System.out.println("The number "+number+" is even.");
	    else
	        System.out.println("The number "+number+" is odd.");

		//More than ten
	    if(number > 10)
	    	System.out.println(number+ " is greater than 10.");
	    else
	    	System.out.println(number+" is less than 10.");
		//Double the value
		System.out.println("The double of "+number+" is "+number*2+".");
		
		//Prime number
		boolean isPrime=true;
		for(int i=2;i<=number/2;i++)
		{
	       int temp=number%i;
		   if(temp==0)
		   {
			  isPrime=false;
		      break;
		   }
		}
		if(isPrime)
			   System.out.println(number + " is a Prime Number.");
			else
			   System.out.println(number + " is not a Prime Number.");
	}
}