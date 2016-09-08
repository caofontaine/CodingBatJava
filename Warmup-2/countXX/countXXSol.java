import java.lang.String;

public class countXX {
	
  public static int countXX(String str) {
    int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("xx")) count++;
		}
		return count;
		
		// Solution notes: the loop is shortened to end at str.length()-1
		// so we can pull out a length 2 substring without going out of bounds.
		// Remember to use equals() to compare strings, not ==.
  }
		
  public static void main(String[] args) {

    System.out.println(countXX("abcxx"));
    System.out.println(countXX("xxx"));
    System.out.println(countXX("xxxx"));
			
  }
		
}	