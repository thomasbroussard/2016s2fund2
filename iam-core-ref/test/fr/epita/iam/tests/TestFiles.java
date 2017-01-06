/**
 * 
 */
package fr.epita.iam.tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author tbrou
 *
 */
public class TestFiles {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("tests.txt");
		if (!file.exists()){
			System.out.println("the file does not exist");
			file.createNewFile();
		}
		
		PrintWriter printer = new PrintWriter(file);
		printer.println("-----Identity:Begin------");
		printer.close();
		
	}

}
