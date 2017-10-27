package wallethub;

public class Words {
	public static void main(String[] args) {
		String str = "baskar12345";
		int counter = 0;
		int counter1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				counter++;
		}
		System.out.println(counter + " letters.");
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				counter1++;
		}
		System.out.println(counter1 + " digits.");
	}
}
