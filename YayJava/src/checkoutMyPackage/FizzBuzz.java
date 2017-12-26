package checkoutMyPackage;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String answer;
		do{
		System.out.println("Would you like to play a game?");
		answer = kb.next();
		if(answer.equalsIgnoreCase("no")){
			break;
		}
		System.out.println("Enter a number");
		int i = kb.nextInt();
		
		if(i % (3*5) == 0){
			System.out.println("FizzBuzz");
		}
		else if(i  % 5 == 0){
			System.out.println("Fizz");
		}
		else if(i % 3 == 0){
			System.out.println("Buzz");
		}
		else{
			System.out.println(i);
		}
		}while(answer.equalsIgnoreCase("yes"));
	}
}
