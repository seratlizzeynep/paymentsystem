package handon1;

public class CreditCardPayment implements Paymwnt{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing credit card payment of $" + amount );
	}

	@Override
	public void Receipt(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Receipt:");
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: $" + amount);
        System.out.println("Thank you for using your credit card!");
	}

	
}
