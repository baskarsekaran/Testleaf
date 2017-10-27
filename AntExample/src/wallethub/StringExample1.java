/*https://stackoverflow.com/questions/767759/occurrences-of-substring-in-a-string*/
/*junit parallel - https://examples.javacodegeeks.com/core-java/junit/junit-run-tests-in-parallel/*/
/*https://howtodoinjava.com/testng/testng-executing-parallel-tests/*/
package wallethub;

public class StringExample1 {

	public static void main(String[] args) {

		String str = "ahelloslkhellodjladfjhellobaskarhelloa"; 
		String findStr = "hello";
		System.out.println(str.split(findStr, -1).length-1); 
		
	/*	String str = "ahelloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

		    lastIndex = str.indexOf(findStr, lastIndex);
		    System.out.println("a " + lastIndex);

		    if (lastIndex != -1) {
		        count++;
		        lastIndex += findStr.length();
		        System.out.println("b " + lastIndex);
		    }
		} 
		System.out.println(count); */
	}	
}
