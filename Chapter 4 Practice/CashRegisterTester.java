/**
 * This class tests the CashRegister calss.
 */
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister register = new CashRegister();
        
        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.recievePayment(2, 0, 5, 0, 0);
        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 0.25");
        
        register.recordPurchase(2.25);
        register.recordPurchase(19.25);
        register.recievePayment(23, 2, 0, 0, 0);
        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 2.0");
    }
}