
// Write a java code tolFind the Largest word in a string
// * Input : Java programming is awesome
// * Output : programming

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String[] arr=str.split("\\s+");
        String res="";
        for(String s:arr)
        {
            if(s.length()>res.length())
            {
                res=s;
            }
        }
        System.out.println(res);
    }
}
