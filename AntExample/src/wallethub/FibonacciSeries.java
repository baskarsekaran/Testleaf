package wallethub;

public class FibonacciSeries {
	public static void main(String[] args) {
		int febCount = 15;
		int a = 0;
		int b = 1;
		for (int i = 2; i < febCount; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
	}
}
