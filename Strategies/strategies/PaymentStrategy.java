package strategies;

public interface PaymentStrategy {
    
    public boolean pay(int paymentAmount);
    public void paymentDetails();    
}
