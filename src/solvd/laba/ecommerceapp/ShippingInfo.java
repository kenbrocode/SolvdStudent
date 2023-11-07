package solvd.laba.ecommerceapp;

import java.time.LocalDate;

class ShippingInfo {
    private LocalDate estimatedDeliveryDate;

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Estimated Delivery Date: " + estimatedDeliveryDate;
    }

}