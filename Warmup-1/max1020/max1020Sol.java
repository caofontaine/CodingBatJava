public class max1020 {
	
  public static int max1020(int a, int b) {
    // Failed implementation. Below is solution.
    
    // First make it so the bigger value is in a
    if (b > a) {
      int temp = a;
      a = b;
      b = temp;
    }
    
    // Knowing a is bigger, just check a first
    if (a >= 10 && a <= 20) return a;
    if (b >= 10 && b <= 20) return b;
    return 0;
  }
		
  public static void main(String[] args) {

    System.out.println(max1020(11, 19));
    System.out.println(max1020(19, 11));
    System.out.println(max1020(11, 9));
			
  }
		
}