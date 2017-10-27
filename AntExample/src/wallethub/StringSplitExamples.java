package wallethub;

import java.util.StringTokenizer;


public class StringSplitExamples
{
	public static void main(String[] args)
	{
		//Method 1 using StringTokenizer
		String str = "I am sample string and will be tokenized on space";
		StringTokenizer defaultTokenizer = new StringTokenizer(str);

		while (defaultTokenizer.hasMoreTokens())
		{
			System.out.println(defaultTokenizer.nextToken());
		}

		//Method 1 using StringTokenizer - with multiple tokens
		String url = "//howtodoinjava.com/java-initerview-questions";

		StringTokenizer multiTokenizer = new StringTokenizer(url, "://.-");
		while (multiTokenizer.hasMoreTokens())
		{
			System.out.println(multiTokenizer.nextToken());
		}

		//Method 2 using String.split()
		String[] tokens = "I,am ,Legend, , oh ,you ?".split(",");
		for (String token : tokens)
		{
			System.out.println(token);
		}

	}
}