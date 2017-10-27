package wallethub;

public class Test {

	public static void main(String... args) {
		System.out.println(test());
	}

	static String test () {
		try {
			if (true) throw new Exception();
			return returnMethod();
		} catch (Exception e) {
			return catchMethod();
		} finally {
			return finallyMethod();
		}
	}

	static String returnMethod() {
		System.out.println("1");
		return "Return method";
	}

	static String catchMethod() {
		System.out.println("2");
		return "Catch method";
	}

	static String finallyMethod() {
		System.out.println("3");
		return "Finally method";
	}

}

