
// Digital Root (Repeated Sum of Digits until One Digit)
// * Input
// 196
// * Output
// 195
// 1+9+5=15  1+5=6 op

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
       while(s.length()>1)
       {
        int sum=0;
         for(int i=0;i<s.length();i++)
        {
            sum=sum+(s.charAt(i)-'0');
        }
        s=String.valueOf(sum);
       }
       System.out.println(s);
    //    int ans = (n == 0) ? 0 : 1 + (n - 1) % 9;
    }
}
