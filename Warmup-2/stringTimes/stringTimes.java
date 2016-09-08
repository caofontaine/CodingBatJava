import java.lang.String;

public class stringTimes {
	
  public static String stringTimes(String str, int n) {
    String strTimes = "";
    
    for(int i=0; i<n; i++) {
      strTimes += str;
    }
    
    return strTimes;
  }
		
  public static void main(String[] args) {

    System.out.println(stringTimes("Hi", 2));
    System.out.println(stringTimes("Hi", 3));
    System.out.println(stringTimes("Hi", 1));
			
  }
		
}