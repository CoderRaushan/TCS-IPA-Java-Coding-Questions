// Create a class Sim with below attributes:



// simId - int

// customerName - String

// balance - double

// ratePerSecond - double

// circle - String



// Write getters, setters and parameterized constructor as required. 



// Public class Solution is already created with main method.


// Code inside main method should not be altered else your solution might be 


// scored as zero.You may copy the code from main method in eclipse to 

// verify your implementation. 





// Implement static method - transferCustomerCircle in Solution class.

// This method will take first parameter as array of Sim class objects, 

// second parameter as circle to be transferred (which is String parameter 

// circle1) and third parameter as new circle (which is String parameter 

// circle2).



// Method will transfer the customer to new circle (circle2), where the

//  circle attribute would match second parameter (circle1). 


// Method will return array of Sim objects for which circle is transferred.


//  Return array should be sorted in descending order of ratePerSecond

//  (assuming ratePerSecond is not same for any of the Sim objects).





// This method should be called from main method and display the simId,

// customerName,circle and ratePerSecond of returned objects 

// (as per sample output).



// Main method mentioned above already has Scanner code to read values, 

// create objects and test above methods. Hence do not modify it.






// ************************************************************************



// Consider below sample input and output:



// Input:

// 1
// raj
// 100
// 1.5
// KOL
// 2
// chetan
// 200
// 1.6
// AHD
// 3
// asha
// 150
// 1.7
// MUM
// 4
// kiran
// 50
// 2.2
// AHD
// 5
// vijay
// 130
// 1.8
// AHD
// AHD
// KOL



// Output:

// 4 kiran KOL 2.2

// 5 vijay KOL 1.8

// 2 chetan KOL 1.6


import java.util.*;

public class Q12 {

    public static Sim[] transferCustomerCircle(Sim[] arr,
                                               String circle1,
                                               String circle2) {

        ArrayList<Sim> list = new ArrayList<>();

        for (Sim s : arr) {

            if (s.getCircle().equalsIgnoreCase(circle1)) {

                // Transfer to new circle
                s.setCircle(circle2);

                list.add(s);
            }
        }

        if (list.size() == 0)
            return null;

        Collections.sort(list,
                (a, b) -> Double.compare(b.getRatePerSecond(),
                                         a.getRatePerSecond()));

        return list.toArray(new Sim[list.size()]);
    }
}

class Sim {

    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName,
               double balance, double ratePerSecond,
               String circle)
        {

        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() 
    {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}