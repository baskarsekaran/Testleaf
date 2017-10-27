package wallethub;

public class StringPalindrome {
	public static void main(String[] args) {
		String text = "madam";
		/************** Using String buffer methods *************/
		String rev = new StringBuffer(text).reverse().toString();
		if (rev.equalsIgnoreCase(text))
			System.out
					.println("Validated with String Buffer Method: The given string is palindrome");
		else
			System.out
					.println("Validated with String Buffer Method:The given string is not palindrome");
		/**********************************************************/
		/************** Without Using String buffer methods *************/
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}
		if (rev.equalsIgnoreCase(text))
			System.out
					.println("Validated without String Buffer Method: The given string is palindrome");
		else
			System.out
					.println("Validated without String Buffer Method:The given string is not palindrome");
	}
}
