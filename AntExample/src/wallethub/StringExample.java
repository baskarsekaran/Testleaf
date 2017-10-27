package wallethub;

public class StringExample {

	public static void main(String[] args) {

		String a = "Healthoalthoa";
		int cnt = 0;
		for (int i=0; i<=a.length()-1;i++ )
		{
			if (a.charAt(i) == 'a')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		
	/*	No.	Method	Description
		1	int indexOf(int ch)	returns index position for the given char value
		2	int indexOf(int ch, int fromIndex)	returns index position for the given char value and from index
		3	int indexOf(String substring)	returns index position for the given substring
		4	int indexOf(String substring, int fromIndex)	returns index position for the given substring and from index */
		
		System.out.println(a.indexOf('a'));
		System.out.println(a.indexOf("alt"));
		System.out.println(a.indexOf("alt" , 5));
		System.out.println(a.indexOf('a' , 5));
		
		System.out.println(a.replace('a', 'b'));
		System.out.println(a.replaceAll("a", "b"));
		System.out.println(a.replaceFirst("a", "b"));
		System.out.println(a.replace("al" , "ab"));
		
		System.out.println(a.compareTo("health"));
		System.out.println(a.substring(5));
		System.out.println(a.substring(5, 7));
		System.out.println(String.join("-", "baskar"));
		
		
	}	
}
