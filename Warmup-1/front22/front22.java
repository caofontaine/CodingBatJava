import java.lang.String;

public class front22 {
	
  public static String front22(String str) {    
    if(str.length() < 2) {
      return str + str + str;
    }
    else {
      return str.substring(0,2) + str + str.substring(0,2);
    }
  }
		
  public static void main(String[] args) {

    System.out.println(front22("kitten"));
    System.out.println(front22("Ha"));
    System.out.println(front22("abc"));
			
  }
		
}