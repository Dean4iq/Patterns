package task.task2.model;

public class Tour {
    private Transfer transfer;
    private Flight flight;
    private Booking booking;
    private Insurance insurance;

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transfer=" + transfer +
                ", flight=" + flight +
                ", booking=" + booking +
                ", insurance=" + insurance +
                '}';
    }
}
