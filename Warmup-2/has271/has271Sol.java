public class has271 {
	
  public static boolean has271(int[] nums) {
    // Iterate < length-2, so can use i+1 and i+2 in the loop.
		// Return true immediately when seeing 271.
		for (int i=0; i < (nums.length-2); i++) {
			int val = nums[i];
			if (nums[i+1] == (val + 5) &&
				Math.abs(nums[i+2] - (val-1)) <= 2)  return true;
		}
		
		// If we get here ... none found.
		return false;
  }
		
  public static void main(String[] args) {

    System.out.println(has271(new int[]{1, 2, 7, 1}));
    System.out.println(has271(new int[]{1, 2, 8, 1}));
    System.out.println(has271(new int[]{2, 7, 1}));
    System.out.println(has271(new int[]{3, 8, 2}));
			
  }
		
}	