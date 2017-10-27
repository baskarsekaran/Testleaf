package wallethub;

public class TestStringEquals {
	public static void main(String... args) {
		String a = "String";
		String b = "String";
		String c = new String("String");
		String d = new String("String");
		if (a.equals(b)) { // 1
			System.out.println("1");
		}
		if (c.equals(d)) { // 2
			System.out.println("2");
		}
		if (a == b) { // 3
			System.out.println("3");
		}
		if (c == d) { // 4 
			System.out.println("4");
		}
	}
}

