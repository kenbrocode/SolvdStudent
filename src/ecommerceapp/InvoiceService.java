package ecommerceapp;

import java.time.LocalDate;

interface InvoiceService {
    Invoice generateInvoice(Order order, double amount, LocalDate issueDate);
}
