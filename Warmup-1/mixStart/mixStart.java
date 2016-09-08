import java.lang.String;

public class mixStart {
	
  public static boolean mixStart(String str) {
    // If length is less than 3, return false.
    if (str.length() < 3) return false;
    
    return str.substring(1,3).equals("ix");
  }
		
  public static void main(String[] args) {

    System.out.println(mixStart("mix snacks"));
    System.out.println(mixStart("pix snacks"));
    System.out.println(mixStart("piz snacks"));
			
  }
		
}