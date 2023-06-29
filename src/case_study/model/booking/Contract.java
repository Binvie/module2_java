package case_study.model.booking;

public class Contract {
    private String contractID;
    private String bookingID;
    private double depositAmount;
    private double totalAmount;

    public Contract() {
    }

    public Contract(String contractID, String bookingID, double depositAmount, double totalAmount) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.depositAmount = depositAmount;
        this.totalAmount = totalAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
