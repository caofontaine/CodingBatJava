import java.lang.String;

public class frontBack {
	
  public static String frontBack(String str) {
    String char1, char2;
    
    if (str.length() <= 1) {
      return str;
    }
    
    char1 = Character.toString(str.charAt(0));
    char2 = Character.toString(str.charAt(str.length()-1));
    
    return char2 + str.substring(1, str.length()-1) + char1;
  }
		
  public static void main(String[] args) {

    System.out.println(frontBack("code"));
    System.out.println(frontBack("a"));
    System.out.println(frontBack("ab"));
    System.out.println(frontBack(""));
			
  }
		
}