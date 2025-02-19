package src;

public class Passenger {
    private String bookingReferenceCode;
    private String name;
    private String flightCode;
    private boolean checkedIn;
    private double baggageWeight;
    private double baggageVolume;

    
    public Passenger(String bookingReferenceCode, String name, String flightCode, boolean checkedIn) {
        this.bookingReferenceCode = bookingReferenceCode;
        this.name = name;
        this.flightCode = flightCode;
        this.checkedIn = checkedIn;
    }

    // Getter and Setter method
    public String getBookingReferenceCode() {
        return bookingReferenceCode;
    }

    public void setBookingReferenceCode(String bookingReferenceCode) {
        this.bookingReferenceCode = bookingReferenceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public double getBaggageVolume() {
        return baggageVolume;
    }

    public void setBaggageVolume(double baggageVolume) {
        this.baggageVolume = baggageVolume;
    }

    // toString method, print passenger's information
    @Override
    public String toString() {
        return "Passenger{" +
                "bookingReferenceCode='" + bookingReferenceCode + '\'' +
                ", name='" + name + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", checkedIn=" + checkedIn +
                ", baggageWeight=" + baggageWeight +
                ", baggageVolume=" + baggageVolume +
                '}';
    }
}
