package Topic.ECommerceBusiness;


import java.time.LocalDate;


public class ReturnPolicy {
    private int warrantyNumber;
    private LocalDate startDate;
    private LocalDate endDate;

    public ReturnPolicy(int warrantyNumber, LocalDate startDate, LocalDate endDate){
        this.warrantyNumber = warrantyNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getWarrantyNumber() {
        return warrantyNumber;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setWarrantyNumber(int warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isWarrantyActive() {
        LocalDate now = LocalDate.now();
        return (now.isAfter(startDate) && now.isBefore(endDate));
    }

}
