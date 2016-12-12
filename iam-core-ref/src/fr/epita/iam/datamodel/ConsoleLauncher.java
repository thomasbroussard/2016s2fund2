/**
 * 
 */
package fr.epita.iam.datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tbrou
 *
 */
public class ConsoleLauncher {

	/**
	 * 
	 */
	private static final String LINE_SEP = System.getProperty("line.separator");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Identity> identities = new ArrayList<Identity>();
		// 1 . Authentication
		System.out.println("Welcome to the IAM application");
		boolean authenticated = authenticate(scanner);
		if (!authenticated) {
			scanner.close();
			return;
		}

		System.out.println("Here are the possible actions ");
		System.out.println("1. Create an identity");
		System.out.println("2. Update an identity");
		System.out.println("3. Delete an identity");
		System.out.println("Please input your choice :");
		String choice = scanner.nextLine();

		switch (choice) {
		case "1":
			// Creation
			break;
		case "2":
			// Update
			break;
		case "3":
			// Deletion
			break;

		default:
			break;
		}

		scanner.close();
	}

	/**
	 * @param scanner
	 */
	private static boolean authenticate(Scanner scanner) {
		System.out.println("Please enter your login :");
		String login = scanner.nextLine();

		System.out.println("Please enter your password :");
		String password = scanner.nextLine();

		if (login.equals("admin") && password.equals("password")) {
			System.out.println("You are authenticated");
			return true;
		} else {
			System.out.println("Authentication failed");

			return false;
		}
	}

}
