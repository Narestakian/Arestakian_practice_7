public class PayPalProcessor implements PaymentProcessor{
    public  void process(double amount){
        System.out.println("Payment is being processed by the PayPol: " + amount);
    }
}
