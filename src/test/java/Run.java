public class Run {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        DrawingApp.startDrawing(circle);
        DrawingApp.startDrawing(rectangle);
        DrawingApp.startDrawing(triangle);

        Notification SMSNotification = new SMSNotification();
        Notification EmailNotification = new EmailNotification();

        NotificationService.sendAlert(SMSNotification, " You have message!");
        NotificationService.sendAlert(EmailNotification, " You have email!");



    }

}
