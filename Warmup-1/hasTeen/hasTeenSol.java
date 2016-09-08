import java.lang.String;

public class backAround {
	
  public static boolean hasTeen(int a, int b, int c) {
		// Here it is written as one big expression,
		// vs. a series of if-statements.
		return (a>=13 && a<=19) ||
					 (b>=13 && b<=19) ||
					 (c>=13 && c<=19);
	}
		
  public static void main(String[] args) {

    System.out.println(backAround("cat"));
    System.out.println(backAround("Hello"));
    System.out.println(backAround("a"));
			
  }
		
}
	