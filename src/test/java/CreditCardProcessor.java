public class CreditCardProcessor implements PaymentProcessor{
   public void  process(double amount){
       System.out.println("Payment is being processed by the CreditCard: " + amount);
   }

}
