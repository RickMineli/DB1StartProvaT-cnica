package db1.start.application;
import java.util.Scanner;

import db1.start.desafios.Desafio1;
import db1.start.desafios.Desafio2;;

public class App {

	public static void main(String[] args) {
		//Desafio1
		System.out.println("Enter an integer number in the console: ");
		System.out.println("Caution! It will result in error if number is not an integer!");
	    Scanner input = new Scanner(System.in);
	    
	    int number = input.nextInt();
		    
	    Desafio1.Calculus(number);		
	    System.out.println("|-------------------------------------|");
	    input.nextLine();
	    
	    //Desafio2
	    System.out.println("Enter a text in the console: ");
	    String text = input.nextLine();
	    Desafio2.AnalyzeText(text);
	    
	    
	    
	    
	}

}
