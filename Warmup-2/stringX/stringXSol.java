import java.lang.String;

public class stringX {
	
  public static String stringX(String str) {
    String result = "";
		for (int i=0; i<str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
				result = result + str.substring(i, i+1); // Could use str.charAt(i) here
			}
		}
		return result;
  }
		
  public static void main(String[] args) {

    System.out.println(stringX("xxHxix"));
    System.out.println(stringX("abxxxcd"));
    System.out.println(stringX("xabxxxcdx"));
    System.out.println(stringX(""));
			
  }
		
}	