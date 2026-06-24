
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hotel[] arr = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String date = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();

            String wifi = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Hotel(
                    id,
                    name,
                    date,
                    noOfRoomsBooked,
                    wifi,
                    totalBill
            );
        }
    }

    public static Hotel secondHighestBill(Hotel[] arr) {
        Hotel first = null;
        Hotel second = null;

        for (Hotel h : arr) {
            if (first == null || h.getTotalBill() > first.getTotalBill()) {
                second = first;
                first = h;
            } else if (second == null
                    || h.getTotalBill() > second.getTotalBill()) {
                second = h;
            }
        }

        return second;
    }
}

class Hotel {

    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;

    Hotel(
            int id,
            String name,
            String date,
            int noOfRoomsBooked,
            String wifi,
            double totalBill
    ) {
        hotelId = id;
        hotelName = name;
        dateOfBooking = date;
        this.noOfRoomsBooked = noOfRoomsBooked;
        wifiFacility = wifi;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }
}
