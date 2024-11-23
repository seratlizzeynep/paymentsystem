package handon1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Welcome to the Payment System!");
	        System.out.println("Select a payment method:");
	        System.out.println("1. Credit Card");
	        System.out.println("2. Cash");

	        Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
 
	        Paymwnt payment;
	        if (choice == 1) {
	            payment = new CreditCardPayment();
	        } else if (choice == 2) {
	            payment = new CashPayment();
	        } else {
	            System.out.println("Invalid choice.");
	            return;
	        }

	       
	        System.out.print("Enter the amount to pay: $");
	        
	        double amount = scanner.nextDouble();
	        payment.pay(amount);
	        payment.Receipt(amount);
	    }
	}


