import java.lang.String;

public class mixStart {
	
  public boolean mixStart(String str) {
		// Check if string is too small
		// (so substring() below does not go off the end)
		if (str.length() < 3) return false;
		
		// Pull out length 2 string for the "ix" part
		// (i.e. substring starting at index 1 and stopping just before 3).
		String two = str.substring(1, 3);
		
		if (two.equals("ix")) {
			return true;
		} else {
			return false;
		}
		// This last part can be shortened to just:
		// return(two.equals("ix"));
	}
		
  public static void main(String[] args) {

    System.out.println(mixStart("mix snacks"));
    System.out.println(mixStart("pix snacks"));
    System.out.println(mixStart("piz snacks"));
			
  }
		
}