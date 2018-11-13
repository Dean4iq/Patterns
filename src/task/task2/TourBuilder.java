package task.task2;

import task.task2.model.*;

public class TourBuilder {
    private Transfer transfer = Transfer.NONE;
    private Flight flight = Flight.FORWARD;
    private Booking booking = Booking.HOTEL;
    private Insurance insurance = Insurance.LIFE;

    TourBuilder buildTransfer(Transfer transfer) {
        this.transfer = transfer;
        return this;
    }

    TourBuilder buildFlight(Flight flight) {
        this.flight = flight;
        return this;
    }

    TourBuilder buildBooking(Booking booking) {
        this.booking = booking;
        return this;
    }

    TourBuilder buildInsurance(Insurance insurance) {
        this.insurance = insurance;
        return this;
    }

    Tour build() {
        Tour tour = new Tour();
        tour.setTransfer(transfer);
        tour.setFlight(flight);
        tour.setBooking(booking);
        tour.setInsurance(insurance);

        return tour;
    }
}
