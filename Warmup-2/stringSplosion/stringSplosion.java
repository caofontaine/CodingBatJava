import java.lang.String;

public class stringSplosion {
	
  public static String stringSplosion(String str) {
    String strSplosion = "";
    
    for (int i=0; i<str.length(); i++) {
      strSplosion += str.substring(0,i+1);
    }
    
    return strSplosion;
  }
		
  public static void main(String[] args) {

    System.out.println(stringSplosion("Code"));
    System.out.println(stringSplosion("abc"));
    System.out.println(stringSplosion("ab"));
			
  }
		
}	