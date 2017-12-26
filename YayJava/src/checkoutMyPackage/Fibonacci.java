package checkoutMyPackage;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int placeHolder = num1 + num2;
		
		fibonacci(num1, num2, placeHolder);
		
	}
	
	public static int fibonacci(int num1, int num2, int placeHolder){
	for (int i = 0; i < 25; i++) {
		placeHolder = num1+num2;
		System.out.println(i + ": " +num1 + " + " + num2 + " = " + placeHolder);
		num1 = num2;
		num2 = placeHolder;
	}
	return placeHolder;
	}
}
