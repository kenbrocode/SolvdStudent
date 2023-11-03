package ECommerceApp;

class Promotion extends BaseEntity {
    private String type;
    private String code;
    private double discountAmount;

    public Promotion(int promotionId, String type, String code, double discountAmount) {
        super(promotionId);
        this.type = type;
        this.code = code;
        this.discountAmount = discountAmount;
    }

    public double applyDiscount(double originalAmount) {
        return originalAmount - (originalAmount * discountAmount / 100);
    }

    // Implementation of the abstract method getInfo()
    @Override
    public String getInfo() {
        return "Promotion: " + type + " (Code: " + code + ")";
    }

    @Override
    public double calculateCost() {
        return 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    // Other methods
}