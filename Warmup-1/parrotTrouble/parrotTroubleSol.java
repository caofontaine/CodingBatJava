public class parrotTrouble {
	
  public static boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
		// Need extra parenthesis around the || clause
		// since && binds more tightly than ||
		// && is like arithmetic *, || is like arithmetic +
	}
		
  public static void main(String[] args) {

    System.out.println(parrotTrouble(true, 6));
    System.out.println(parrotTrouble(true, 7));
    System.out.println(parrotTrouble(false, 6));
			
  }
		
}