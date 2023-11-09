package solvd.laba.ecommerceapp.base;

import java.time.LocalDate;

public class ShippingInfo {
    private LocalDate estimatedDeliveryDate;

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Estimated Delivery Date: " + estimatedDeliveryDate;
    }
}