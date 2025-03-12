package models;
import java.time.LocalDateTime;

public class Booking {
    private String id;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double totalPrice;
    private BookingStatus status; // PENDING, CONFIRMED, CANCELLED

    enum BookingStatus {
        PENDING,     // 待确认
        CONFIRMED,   // 已确认
        CANCELLED;   // 已取消
    }
}

