package db1.start.desafios;

public class Desafio2 {

	public static void AnalyzeText(String text) {
		//Text size
		System.out.println("Text size is "+text.length());
		//Space and vowels quantity
	   int vowels = 0;
	   int space = 0;
	   text.toLowerCase();
	   for (int j = 0; j < text.length(); j++){
	        char c = text.charAt(j);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
	        	vowels++;
	   		if (c ==' ')
	   			space++;
	    }
	   System.out.println("Vowels quantity: "+vowels);
	   System.out.println("Space quantity: "+space);
	   
	}
}
