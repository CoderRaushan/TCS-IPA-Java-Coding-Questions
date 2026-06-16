
import java.util.*;

class Solution {

    public static void main(String[] args) 
    {
        Phone[] arr = new Phone[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine(); 
            arr[i] = new Phone(a, b, c, d);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();
        sc.close();
        System.out.println("Printing result:");
        int res = findPriceForGivenBrand(arr, brand);

        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone ress = getPhoneIdBasedOnOs(os, arr);

        if (ress != null) {
            System.out.println(ress.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] arr, String brand) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(brand)) {
                sum = sum + arr[i].getPrice();
            }
        }
        return sum > 0 ? sum : 0;
    }

    public static Phone getPhoneIdBasedOnOs(String os, Phone[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice() >= 50000) 
            {
                return arr[i];
            } 
        }
        return null;
    }
}



public class Phone {

    private int phoneId;
    private String os;
    private String brand;
    private int price;

    Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
