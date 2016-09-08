import java.lang.String;

public class front3 {
	
  public static String front3(String str) {
    String seq = "";
    
    if(str.length() == 0) {
      return str;
    }
    else {
      for(int i=0; i<3; i++) {
        if(str.length() == 1) {
          seq += str.substring(0,1);
        }
        else if(str.length() == 2){
          seq += str.substring(0,2);
        }
        else {
          seq += str.substring(0,3);
        }
      }
    }
    return seq;
  }
		
  public static void main(String[] args) {

    System.out.println(front3("Java"));
    System.out.println(front3("Chocolate"));
    System.out.println(front3("abc"));
			
  }
		
}