import java.lang.String;

public class startHi {
	
  public static boolean startHi(String str) {
    // If length of given string is less than 2, return false.
    if (str.length() < 2) return false;
    return str.substring(0,2).equals("hi");
  }
		
  public static void main(String[] args) {

    System.out.println(startHi("hi there"));
    System.out.println(startHi("hi"));
    System.out.println(startHi("hello hi"));
			
  }
		
}