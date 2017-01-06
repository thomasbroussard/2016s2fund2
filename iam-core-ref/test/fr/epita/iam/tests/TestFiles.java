/**
 * 
 */
package fr.epita.iam.tests;

import java.io.IOException;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.services.FileIdentityDAO;

/**
 * @author tbrou
 *
 */
public class TestFiles {
	
	
	
	
	public static void main(String[] args) throws IOException {
		FileIdentityDAO dao = new FileIdentityDAO();
		dao.writeIdentity(new Identity(null, "Test DisplayName", "test Email"));
	}
	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("tests.txt");
//		if (!file.exists()){
//			System.out.println("the file does not exist");
//			file.createNewFile();
//		}
//		
//		PrintWriter printer = new PrintWriter(file);
//		Identity identity = new Identity(null, "Test DisplayName", "test Email");
//		writeIdentity(printer, identity);
//		
//		printer.close();
//		
//	}
//
//	/**
//	 * @param printer
//	 * @param identity
//	 */
//	private static void writeIdentity(PrintWriter printer, Identity identity) {
//		printer.println("-----Identity:Begin------");
//		printer.println(identity.getDisplayName());
//		printer.println(identity.getEmail());
//		printer.println(identity.getUid());
//		printer.println("-----Identity:End------");
//	}

}
