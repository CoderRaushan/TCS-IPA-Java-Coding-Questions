
import java.util.Scanner;

// write a java code to calculate the sum of numbers from a string
// * Input : 123heLL01998worLd10
// * Output : 21311
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int sum = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty())
        {
            sum+=Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}
