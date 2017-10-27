package wallethub;

import java.util.HashSet;

public class ArrayDuplicate {
	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "abc" };
		// 1. Using Brute Force Method
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if ((strArray[i].equals(strArray[j])) && (i != j)) {
					System.out
							.println("Brute Force Method : Duplicate Element is : "
									+ strArray[i]);
				}
			}
		}
		// 2. Using Colections -HashSet
		HashSet<String> hs = new HashSet<String>();
		for (String arrayElement : strArray) {
			if (!hs.add(arrayElement)) {
				System.out.println("HashSet :Duplicate Element is : "
						+ arrayElement);
			}
		}
	}
}