import java.lang.String;

public class last2 {
	
  public static int last2(String str) {
    if (str.length() < 2) return 0;
    
    int count = 0;
    
    for (int i=0; i<str.length()-2; i++) {
      if (str.substring(i, i+2).equals(str.substring(str.length()-2))) {
        count++;
      }
    }
    
    return count;
  }
		
  public static void main(String[] args) {

    System.out.println(last2("hixxhi"));
    System.out.println(last2("xaxxaxaxx"));
    System.out.println(last2("axxxaaxx"));
			
  }
		
}	