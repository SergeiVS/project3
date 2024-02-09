package homework.task9.entity;

public enum OrderStatus {
    STATUS_RECEIVED("Received", "Order is received, prepayment is completed"),
    STATUS_PERFORMED("Performed", "Order is in production"),
    STATUS_COMPLETED("Completed", "Order is completed, accepted by customer and payment completed");

    private String status;
    private String message;

    OrderStatus(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
