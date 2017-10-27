package wallethub;

public class ArmstrongExample {

	public static void main(String[] args) {
		int rem, sum = 0, temp;
		int num = 153;// It is the number variable to be checked for palindrome
		temp = num;
		while (num > 0) {
			rem = num % 10; // getting remainder
			sum = sum + (rem*rem*rem);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("armstrong number ");
		else
			System.out.println("not armstrong");
	}
}
