import java.lang.String;

public class doubleX {
	
  public static boolean doubleX(String str) {
    /* Website solution implemented */
    int i = str.indexOf("x");
    if (i == -1) return false; // no "x" at all

    // Is char at i+1 also an "x"?
    if (i+1 >= str.length()) return false; // check i+1 in bounds?
    return str.substring(i+1, i+2).equals("x");
  }
		
  public static void main(String[] args) {

    System.out.println(doubleX("axxbb"));
    System.out.println(doubleX("axaxax"));
    System.out.println(doubleX("xxxxx"));
			
  }
		
}	