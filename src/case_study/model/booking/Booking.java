package case_study.model.booking;

public class Booking {
    private int bookingID;
    private String bookingDate;
    private String startDay;
    private String stopDay;
    private int customerID;
    private String serviceID;

    public Booking() {
    }

    public Booking(int bookingID, String bookingDate, String startDay, String stopDay, int customerID, String serviceID) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.startDay = startDay;
        this.stopDay = stopDay;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStopDay() {
        return stopDay;
    }

    public void setStopDay(String stopDay) {
        this.stopDay = stopDay;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", bookingDate='" + bookingDate + '\'' +
                ", startDay='" + startDay + '\'' +
                ", stopDay='" + stopDay + '\'' +
                ", customerID=" + customerID +
                ", serviceID='" + serviceID + '\'' +
                '}';
    }
}
