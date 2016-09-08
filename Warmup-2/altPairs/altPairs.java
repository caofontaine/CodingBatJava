import java.lang.String;

public class altPairs {
	
  public static String altPairs(String str) {
    String newString = "";
    
    for (int i=0; i<str.length(); i+=+4){
      if (i+2 > str.length()) {
        // Avoid out of range error.
        newString += str.substring(i,str.length());
      }
      else {
        newString += str.substring(i,i+2);
      }
    }
    
    return newString;
  }
		
  public static void main(String[] args) {

    System.out.println(altPairs("kitten"));
    System.out.println(altPairs("Chocolate"));
    System.out.println(altPairs("CodingHorror"));
			
  }
		
}	