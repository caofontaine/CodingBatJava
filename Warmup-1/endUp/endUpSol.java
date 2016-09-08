import java.lang.String;

public class endUp {
	
  public static String endUp(String str) {
    if (str.length() <= 3) return str.toUpperCase();
		int cut = str.length() - 3;
		String front = str.substring(0, cut);
		String back  = str.substring(cut);  // this takes from cut to the end
		
		return front + back.toUpperCase();
  }
		
  public static void main(String[] args) {

    System.out.println(endUp("Hello"));
    System.out.println(endUp("hi there"));
    System.out.println(endUp("hi"));
			
  }
		
}