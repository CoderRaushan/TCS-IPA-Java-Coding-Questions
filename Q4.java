
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Inventory[] arr = new Inventory[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <arr.length; i++) 
        {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            int d = sc.nextInt();
  
            arr[i] = new Inventory(a, b, c, d);
        }
        int limit = sc.nextInt();
        sc.close();

        Inventory[] res = Replenish(arr, limit);
        for (int i = 0; i < res.length; i++) {
            if (res[i].getthreshold() > 75) {
                System.out.println(res[i].getinventoryid()+" Critical Filling");
            } else if (res[i].getthreshold() >= 50 && res[i].getthreshold() <= 75) {
                System.out.println(res[i].getinventoryid()+" Moderate Filling");
            } else {
                System.out.println(res[i].getinventoryid()+" Non-Critical Filling");
            }
        }

    }

    public static Inventory[] Replenish(Inventory[] arr, int limit) {
        ArrayList<Inventory> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (limit >= arr[i].getthreshold()) {
                list.add(arr[i]);
            }
        }
        return list.toArray(new Inventory[list.size()]);
    }
}

class Inventory {

    int inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getinventoryid() {
        return inventoryId;
    }

    public int getmaximumQuantity() {
        return maximumQuantity;
    }

    public int getcurrentQuantity() {
        return currentQuantity;
    }

    public int getthreshold() {
        return threshold;
    }
}
