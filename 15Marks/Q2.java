
import java.util.Scanner;

// Write main method in Solution class.
// In the main method, read a string and find the count of words starting
// with a vowel in the string. If no words are present in the String value
// it should print "No String found".
// 1
// Note:
// ALL search should be case insensitive.
// Sample inputl:
// Everyone should practice and Learn to became professional.
// Output: 2
// Sample input2:
// hi guys
// Output:No String found
public  class  Q2
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        sc.close();
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            char ch=Character.toUpperCase(arr[i].charAt(0));
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')
            {
                cnt++;
            }
        }
        if(cnt>0)
        {
            System.out.println(cnt);
        }else 
        {
            System.out.println("No String found");
        }
    }
}