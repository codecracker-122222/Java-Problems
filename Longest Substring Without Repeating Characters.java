import java.util.Scanner;
public class LongestSubstring{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int maxlength = 0;
      int left = 0;
      int[] lastseen = new int[128];
      for(int i=0;i<128;i++){
        lastseen[i] = -1;
      }
      for(int right = 0;right<s.length();right++){
        char current = s.charAt(right);
        if(lastseen[current]>=left){
            left = lastseen[current]+1;
        }
        lastseen[current] = right;
        maxlength = Math.max(maxlength,right - left+1);
      }
      System.out.println(maxlength);
    }
}
