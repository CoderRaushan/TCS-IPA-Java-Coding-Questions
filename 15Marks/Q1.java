
import java.util.Scanner;

// write a code to count the uppercase and Lowercase Letters of a given string
// avoid special characters, spaces and digits.
// input: This is A Big Line 123.
// output:
// UPPERCASE=4
// LOWERCASE: 10
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        int low = 0;
        int up = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')) 
            {
                up++;
            } else if (ch >= 'a' && ch <= 'z') 
            {
                low++;
            }
        }
        System.out.println("LowerCase:" + low + "\nUpperCase:" + up);
    }
}
