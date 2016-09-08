import java.lang.String;

public class frontTimes {
	
  public static String frontTimes(String str, int n) {
    String frontStr = "";
    
    for (int i=0; i<n; i++) {
      if (str.length() < 3) {
        frontStr += str.substring(0,str.length());
      }
      else {
        frontStr += str.substring(0,3);
      }
    }
    
    return frontStr;
  }
		
  public static void main(String[] args) {

    System.out.println(frontTimes("Chocolate", 2));
    System.out.println(frontTimes("Chocolate", 3));
    System.out.println(frontTimes("Abc", 3));
			
  }
		
}	