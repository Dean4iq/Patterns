package task.task2;

import task.task2.model.*;

public class Main {
    public static void main(String[] args) {
        Tour tour = new TourBuilder()
                .buildTransfer(Transfer.TO_AIRPORT)
                .buildFlight(Flight.FORWARD)
                .buildBooking(Booking.APARTMENT)
                .buildInsurance(Insurance.ALL)
                .build();

        System.out.println(tour.toString());
    }
}
