/*
Question: 
Create a class Phone with below attributes: 

phoneId - int 
os - String 
brand - String 
price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.



Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method: 
----------------------------------
This method will take two input parameters - array of Phone objects and string 
parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed 
as parameter. If no phones with the given brand is present in the array of phone objects, then the method should 
return 0.

getPhoneIdBasedOnOs method: 
----------------------------------
This method will take a String parameter os, along with the array of Phone objects. 
The method will return the phone object, if the input String parameter matches with the os attribute of the phone 
object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the 
method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0. 
All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater 
than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned 
value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring 
attributes in the above mentioned attribute sequence. Next, read the value for brand and os.


Input
--------------
111
iOS
Apple
30000

222
android
Samsung
50000

333
Symbian
HTC
12000

444
Paranoid
HTC
89000

Blackberry
android

Output
------------------
The given Brand is not available
222


Input
--------------
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
Samsung

Output
------------------
The given Brand is not available
222

*/ 
import java.util.*;

class Solution {

    public static void main(String[] args) 
    {
        Q2[] arr = new Q2[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine(); 
            arr[i] = new Q2(a, b, c, d);
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

        Q2 ress = getPhoneIdBasedOnOs(os, arr);

        if (ress != null) {
            System.out.println(ress.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Q2[] arr, String brand) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(brand)) {
                sum = sum + arr[i].getPrice();
            }
        }
        return sum > 0 ? sum : 0;
    }

    public static Q2 getPhoneIdBasedOnOs(String os, Q2[] arr) 
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



public class Q2 {

    private int phoneId;
    private String os;
    private String brand;
    private int price;

    Q2(int phoneId, String os, String brand, int price) {
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
