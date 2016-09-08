public class monkeyTrouble {
	
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
			return true;
		}
		if (!aSmile && !bSmile) {
			return true;
		}
		return false;
		// The above can be shortened to:
		//   return ((aSmile && bSmile) || (!aSmile && !bSmile));
		// Or this very short version (think about how this is the same as the above)
		//   return (aSmile == bSmile);
	}
		
  public static void main(String[] args) {

    System.out.println(monkeyTrouble(true, true));
    System.out.println(monkeyTrouble(false, false));
    System.out.println(monkeyTrouble(true, false));
			
  }
		
}