public class arrayFront9 {
	
  public static boolean arrayFront9(int[] nums) {
    int size = 0;
    
    // Check if array length is less than 4.
    if (nums.length < 4) {
      size = nums.length;
    }
    else {
      size = 4;
    }
    
    for(int i=0; i<size; i++) {
      if (nums[i] == 9) return true;
    }
    return false;
  }
		
  public static void main(String[] args) {

    System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
    System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
    System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
			
  }
		
}	