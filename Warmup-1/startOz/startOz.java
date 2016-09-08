import java.lang.String;

public class startOz {
	
  public static String startOz(String str) {
    String char1, char2;
    if(str.length() < 2) {
      return str;
    }
    
    char1 = Character.toString(str.charAt(0));
    char2 = Character.toString(str.charAt(1));
        
    if ((char1.equals("o")) && (char2.equals("z"))) {
      return char1 + char2;
    }
    else if ((char1.equals("o")) && (!char2.equals("z"))) {
      return char1;
    }
    else if ((!char1.equals("o")) && (char2.equals("z"))) {
      return char2;
    }
    else {
      return "";
    }
  }
		
  public static void main(String[] args) {

    System.out.println(startOz("ozymandias"));
    System.out.println(startOz("bzoo"));
    System.out.println(startOz("oxx"));
			
  }
		
}