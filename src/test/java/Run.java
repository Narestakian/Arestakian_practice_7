public class Run {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        DrawingApp.startDrawing(circle);
        DrawingApp.startDrawing(rectangle);
        DrawingApp.startDrawing(triangle);

        PaymentProcessor CreditCardProcessor = new CreditCardProcessor();
        PaymentProcessor PayPalProcessor = new PayPalProcessor();
        CreditCardProcessor.process(600.0);
        PayPalProcessor.process(199.0);
    }

}
