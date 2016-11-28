/**
 * 
 */
package fr.epita.bankaccount.launchers;

import java.util.Scanner;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.SavingsAccount;

/**
 * @author tbrou
 *
 */
public class ConsoleLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
		System.out.println("--------------");
		System.out.println("Hello, welcome to the bank account system");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a country : ");
		String country = scanner.nextLine();
		System.out.println("Please input a city : ");
		String city = scanner.nextLine();
		System.out.println("input the customer name :");
		String customerName = scanner.nextLine();
		
//		customer.setAddress(city + ", " + country);
//		customer.setName(customerName);
		Customer customer = new Customer(customerName, city + ", " + country);
		
		System.out.println(customer.getName() + " : " + customer.getAddress());
		

		System.out.println("Please input an interestRate : ");
		double interestRate = scanner.nextDouble();
		scanner.nextLine();
		SavingsAccount account = new SavingsAccount();
		account.setInterestRate(interestRate);
		
		System.out.println("account interest rate :" + account.getInterestRate());
		scanner.close();
	}

}
