import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            int count = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s.charAt(i));
            return;
            }
        }
        System.out.println(-1);
    }
}
