import java.lang.String;

public class stringX {
	
  public static String stringX(String str) {
    String noMidX = "";
    
    if (str.length() <= 2) return str;
    else noMidX = str.substring(0,1);
    
    for(int i=1; i<str.length()-1; i++) {
      if (Character.toString(str.charAt(i)).equals("x")) {
        // Do nothing.
      }
      else {
        noMidX += Character.toString(str.charAt(i));
      }
    }
    noMidX += str.substring(str.length()-1);
    return noMidX;
  }
		
  public static void main(String[] args) {

    System.out.println(stringX("xxHxix"));
    System.out.println(stringX("abxxxcd"));
    System.out.println(stringX("xabxxxcdx"));
    System.out.println(stringX(""));
			
  }
		
}