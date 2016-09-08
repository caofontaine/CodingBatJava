public class array667 {
	
  public static int array667(int[] nums) {
    int count = 0;
		// Note: iterate to length-1, so can use i+1 in the loop
		for (int i=0; i < (nums.length-1); i++) {
			if (nums[i] == 6) {
				if (nums[i+1] == 6 || nums[i+1] == 7) {
					count++;
				}
			}
		}
		return count;
  }
		
  public static void main(String[] args) {

    System.out.println(array667(new int[]{6, 6, 2}));
    System.out.println(array667(new int[]{6, 6, 2, 6}));
    System.out.println(array667(new int[]{6, 7, 2, 6}));
			
  }
		
}	