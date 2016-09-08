import java.lang.String;

public class stringYak {
	
  public static String stringYak(String str) {
    String noYak = "";
    
    for (int i=0; i<str.length(); i++) {
      if ((i+2<str.length()) && (str.charAt(i) == 'y') && (str.charAt(i+2) == 'k')) {
        i+=2;
      }
      else {
        noYak += str.charAt(i);
      }
    }
    
    return noYak;
  }
		
  public static void main(String[] args) {

    System.out.println(stringYak("yakpak"));
    System.out.println(stringYak("pakyak"));
    System.out.println(stringYak("yak123ya"));
			
  }
		
}	