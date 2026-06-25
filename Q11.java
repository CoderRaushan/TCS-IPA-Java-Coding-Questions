import java.util.*;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel[] arr = new Hotel[4];

        for (int i = 0; i < 4; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String date = sc.nextLine();

            int roomsBooked = sc.nextInt();
            sc.nextLine();

            String wifi = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Hotel(
                    id,
                    name,
                    date,
                    roomsBooked,
                    wifi,
                    totalBill
            );
        }

        Hotel result = findSecondHighestTotalBill(arr);

        if (result == null) {
            System.out.println("No Hotel Found");
        } else {
            System.out.println(result.getHotelId());
            System.out.println(result.getHotelName());
        }
    }

    public static Hotel findSecondHighestTotalBill(Hotel[] arr) {

        Hotel first = null;
        Hotel second = null;

        for (Hotel h : arr) {

            if (first == null ||
                    h.getTotalBill() > first.getTotalBill()) {

                second = first;
                first = h;

            } else if (second == null ||
                    h.getTotalBill() > second.getTotalBill()) {

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

    Hotel(int id,
          String name,
          String date,
          int noofroombooked,
          String wifi,
          double totalbill) {

        hotelId = id;
        hotelName = name;
        dateOfBooking = date;
        noOfRoomsBooked = noofroombooked;
        wifiFacility = wifi;
        totalBill = totalbill;
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