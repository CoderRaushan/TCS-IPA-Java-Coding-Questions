
import java.util.Scanner;

// Write a java code to Count number of prime digitll in a Number
// Input : 254786135
//  output : 5
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int cnt=0;
        while(num>0)
        {
            int dig=num%10;
            num/=10;
            if(dig==2 || dig==3|| dig==5|| dig==7)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
