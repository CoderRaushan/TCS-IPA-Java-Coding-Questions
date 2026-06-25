import java.util.*;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop[] arr = new Laptop[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String brand = sc.nextLine();
            String os = sc.nextLine();

            double price = sc.nextDouble();
            int rating = sc.nextInt();
            sc.nextLine();

            arr[i] = new Laptop(id, brand, os, price, rating);
        }

        String os = sc.nextLine();

        int result1 = func1(arr);
        System.out.println(result1);

        Laptop[] result2 = func2(arr, os);

        if (result2 == null) {
            System.out.println("No Laptop Found");
        } else {
            for (Laptop l : result2) {
                System.out.println(l.id);
            }
        }
    }

    public static int func1(Laptop[] arr) {

        int cnt = 0;

        for (Laptop l : arr) {
            if (l.rating > 3) {
                cnt++;
            }
        }

        return cnt;
    }

    public static Laptop[] func2(Laptop[] arr, String os) {

        ArrayList<Laptop> list = new ArrayList<>();

        for (Laptop l : arr) {
            if (l.os.equalsIgnoreCase(os)) {
                list.add(l);
            }
        }

        Collections.sort(list, (a, b) -> b.id - a.id);

        if (list.isEmpty()) {
            return null;
        }

        return list.toArray(new Laptop[list.size()]);
    }
}

class Laptop {

    int id;
    String brand;
    String os;
    double price;
    int rating;

    Laptop(int id, String brand, String os, double price, int rating) {
        this.id = id;
        this.brand = brand;
        this.os = os;
        this.price = price;
        this.rating = rating;
    }
}