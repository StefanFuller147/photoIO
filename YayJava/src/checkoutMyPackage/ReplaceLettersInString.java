package checkoutMyPackage;

public class ReplaceLettersInString {
	public static void main(String[] args) {
		String myName = "Thunderballs";
		char[] myNameChars = myName.toCharArray();
		myNameChars[4] = 'x';
		myName = String.valueOf(myNameChars);
		System.out.println(myName);
	}
}
