// wrap to remove duplicate character in a string 

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        //  Mehod 1
        // HashSet<Character> hset = new HashSet<>();
        // String res = "";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch == ' ') {
        //         res += ch;
        //     } else if(!hset.contains(ch)) {
        //         hset.add(ch);
        //         res += ch;
        //     }
        // }
        // System.out.println(res);

        // Method 2
        //  String res = "";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
          
        //     if(ch==' ' || res.indexOf(ch)==-1)
        //     {
        //         res+=ch;
        //     }
        // }
        // System.out.println(res);
        String res="";
        boolean visited[]=new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                res+=ch;
            }
            else if(visited[ch]==false)
            {
                visited[ch]=true;
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
