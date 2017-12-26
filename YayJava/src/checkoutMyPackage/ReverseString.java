package checkoutMyPackage;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String answer;
		
		do{
		System.out.println("would you like to play a game?");
		answer = kb.next();
		if(answer.equalsIgnoreCase("no")){
			System.out.println("Okay then, goodbye");
			break;
		}
		
		System.out.println("Enter a word, and I'll tell you what it is in reverse");
		String word = kb.next();
		
		reversedString(word);
		}while(answer.equalsIgnoreCase("yes"));
	}
	
	public static void reversedString(String word){
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
			
		}
		System.out.println();
	}

}
