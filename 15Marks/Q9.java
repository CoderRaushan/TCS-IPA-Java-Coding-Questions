
import java.util.Scanner;

public class Q9 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();

        System.out.println("Enter no of column:");
        int m = sc.nextInt();
        if (n != m) {
            System.out.println("Diagonal exists only for square matrix");
            sc.close();
            return;
        }
        int[][] arr = new int[n][m];
        System.out.println("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int maxP = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || (i + j == n - 1)) {
                    if (isPrime(arr[i][j])) {
                        maxP = Math.max(maxP, arr[i][j]);
                    }
                }
            }
        }
        if (maxP != 0) {
            System.out.println("Result:" + maxP);
        }else
        {
            System.out.println("No prime no exist");
        }
    }
}
