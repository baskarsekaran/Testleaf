package wallethub;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "baskar12345";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			//if (Character.isLetter(str.charAt(i)))
			//	counter++;
			if((str.charAt(i) >=65 && str.charAt(i) <=91) || (str.charAt(i) >=97 && str.charAt(i) <= 122))
			{
				//System.out.println(str.charAt(i));
				counter++;
			}

		}
		System.out.println(counter + " letters.");
	}
}

