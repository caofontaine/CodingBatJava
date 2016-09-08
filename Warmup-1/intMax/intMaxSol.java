public class intMax {
	
  public static int intMax(int a, int b, int c) {
    int max;
  
		// First check between a and b
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		// Now check between max and c
		if (c > max) {
			max = c;
		}
		
		return max;
		
		// Could use the built in Math.max(x, y) function which selects the larger
		// of two values.
  }
		
  public static void main(String[] args) {

    System.out.println(intMax(1, 2, 3));
    System.out.println(intMax(1, 3, 2));
    System.out.println(intMax(3, 2, 1));
			
  }
		
}