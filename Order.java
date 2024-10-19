package dom;

public class Order
{
    public String ProductName;
    public int Quantity;
    public double Price;

}

class Rachet{
    public double CalculateTotalPrice(int Quantity, double Price)
    {
        return Quantity * Price * 0.9;
    }
}
class Pay{
    public void ProcessPayment(String paymentDetails)
    {
        System.out.println("Payment processed using: " + paymentDetails);
    }
}
class Send_email{
    public void SendConfirmationEmail(String email)
    {
        System.out.println("Confirmation email sent to: " + email);
    }
}