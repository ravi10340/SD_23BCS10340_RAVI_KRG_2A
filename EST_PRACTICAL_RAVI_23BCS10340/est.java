class Warehouse {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }
}

class PaymentGateway {
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
        return true;
    }
}

class EmailService {
    public void sendReceipt(String email) {
        System.out.println("Sending receipt to: " + email);
    }
}

class OrderFacade {
    private Warehouse warehouse = new Warehouse();
    private PaymentGateway paymentGateway = new PaymentGateway();
    private EmailService emailService = new EmailService();

    public void placeOrder(String productId, double amount, String email) {
        if (!warehouse.checkStock(productId)) return;
        if (!paymentGateway.processPayment(amount)) return;
        emailService.sendReceipt(email);
        System.out.println("Order placed successfully!");
    }
}

public class es {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("P101", 1500.0, "ravi@gmail.com");
    }
}
