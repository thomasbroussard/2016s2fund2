/**
 * 
 */
package fr.epita.iam.launcher;

import java.util.Scanner;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class ConsoleLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, welcome to the IAM application");
		Scanner scanner = new Scanner(System.in);
		
		
		//authentication
		System.out.println("Please enter your login");
		String login = scanner.nextLine();
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		
		if(!authenticate(login, password)){
			scanner.close();
			return;
		}
		
		// menu
		String answer = menu(scanner);
		
		switch (answer) {
		case "a":
			// creation
			createIdentity(scanner);
			break;
		case "b":
			
			break;
		case "c":
			
			break;
		default:
			System.out.println("This option is not recognized ("+ answer + ")");
			break;
		}
		
		scanner.close();

	}

	/**
	 * @param scanner
	 */
	private static void createIdentity(Scanner scanner) {
		System.out.println("You've selected : Identity Creation");
		System.out.println("Please enter the Identity display name");
		String displayName = scanner.nextLine();
		System.out.println("Please enter the Identity email");
		String email = scanner.nextLine();
		Identity newIdentity = new Identity(null, displayName, email);
		System.out.println("you created this identity :" + newIdentity);
	}

	/**
	 * @param scanner
	 * @return
	 */
	private static String menu(Scanner scanner) {
		System.out.println("You're authenticated");
		System.out.println("Here are the actions you can perform :");
		System.out.println("a. Create an Identity");
		System.out.println("b. Modify an Identity");
		System.out.println("c. Delete an Identity");
		System.out.println("d. List Identities");
		System.out.println("e. quit");
		System.out.println("your choice (a|b|c|d|e) ? : ");
		String answer = scanner.nextLine();
		return answer;
	}

	/**
	 * @param login
	 * @param password
	 */
	private static boolean authenticate(String login, String password) {

		// TODO replace this hardcoded check by the real authentication method
		return "adm".equals(login) && "pwd".equals(password);
	}

}
