public interface PaymentProcessor {
   void  process(double amount);
   public static void executePayment(PaymentProcessor paymentProcessor, double amount){
      paymentProcessor.process(amount);
   }

}
