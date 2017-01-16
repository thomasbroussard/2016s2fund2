/**
 * 
 */
package fr.epita.iam.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author tbrou
 *
 */
public class JDBCTest {
	
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/IAM;create=true","TOM","TOM");
		System.out.println(connection.getSchema());
		
		
		PreparedStatement pstmt = connection.prepareStatement("select * from IDENTITIES");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()){
			System.out.println(rs.getString("IDENTITIES_DISPLAYNAME"));
		}
		
		connection.close();
		
	}

}
