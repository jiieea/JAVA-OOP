package Enum;

class Payment {
    Transaction transaction = Transaction.SUCCESS;
    void paymentStatus() {
        System.out.println("Payment Status = " + transaction );
    }
}
public class Main {
    String name;
    public static void main(String[] args) {
    Payment payment  = new Payment();
    payment.paymentStatus();


    Level level = Level.LOW;
    System.out.print(level.getDescription());
    }
}
