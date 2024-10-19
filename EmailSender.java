package dom;

interface INotificationSender {
    void Send(String message);
}

class EmailSender implements INotificationSender {
    public void Send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSender implements INotificationSender {
    public void Send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private INotificationSender notificationSender;

    public NotificationService(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void SendNotification(String message) {
        notificationSender.Send(message);
    }
}
