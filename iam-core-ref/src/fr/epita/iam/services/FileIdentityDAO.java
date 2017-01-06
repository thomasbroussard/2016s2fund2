/**
 * 
 */
package fr.epita.iam.services;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class FileIdentityDAO {
	
	private PrintWriter printer;
	
	/**
	 * @throws IOException 
	 * 
	 */
	public FileIdentityDAO() throws IOException {
		File file = new File("tests.txt");
		if (!file.exists()){
			System.out.println("the file does not exist");
			file.createNewFile();
		}
		
		this.printer = new PrintWriter(file);
	}
	
	/**
	 * @param printer
	 * @param identity
	 */
	public void writeIdentity(Identity identity) {
		this.printer.println("-----Identity:Begin------");
		this.printer.println(identity.getDisplayName());
		this.printer.println(identity.getEmail());
		this.printer.println(identity.getUid());
		this.printer.println("-----Identity:End------");
		this.printer.flush();
	}

}
