import java.lang.String;

public class stringBits {
	
  public static String stringBits(String str) {
    int index = 0;
    String bitStr = "";
    
    while(index < str.length()) {
      bitStr += str.charAt(index);
      
      index += 2;
    }
    
    return bitStr;
  }
		
  public static void main(String[] args) {

    System.out.println(stringBits("Hello"));
    System.out.println(stringBits("Hi"));
    System.out.println(stringBits("Heeololeo"));
			
  }
		
}	