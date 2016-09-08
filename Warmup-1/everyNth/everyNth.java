import java.lang.String;

public class everyNth {
	
  public static String everyNth(String str, int n) {
    String newStr = "";
    
    // If empty string is passed.
    if(str.length() == 0) return "Empty string";
    
    for(int i=0; i<str.length(); i+=n) {
      newStr += str.charAt(i);
    }
    
    return newStr;
  }
		
  public static void main(String[] args) {

    System.out.println(everyNth("Miracle", 2));
    System.out.println(everyNth("abcdefg", 2));
    System.out.println(everyNth("abcdefg", 3));
			
  }
		
}	