/**
 * 
 */
package fr.epita.iam.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class JDBCTest {
	
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/IAM;create=true","TOM","TOM");
		System.out.println(connection.getSchema());
		
		List<Identity> identities = listAllIdentities(connection);
		System.out.println("Identities : " + identities);
		
		boolean success = insertIdentity(connection, new Identity(null, "quentin decayeux", "qdeca@qdeca.com"));
		System.out.println("got this return from the database : "+ success);
		
		
		identities = listAllIdentities(connection);
		System.out.println("Identities After insert: " + identities);
		
		
		
		
		connection.close();
		
	}

	/**
	 * @param connection
	 * @return
	 * @throws SQLException
	 */
	private static boolean insertIdentity(Connection connection, Identity identity) throws SQLException {
		String insertStatement = 
				"insert into IDENTITIES (IDENTITIES_DISPLAYNAME, IDENTITIES_EMAIL, IDENTITIES_BIRTHDATE) "
				+ "values(?, ?, ?)";
		PreparedStatement pstmt_insert = connection.prepareStatement(insertStatement);
		pstmt_insert.setString(1, identity.getDisplayName());
		pstmt_insert.setString(2, identity.getEmail());
		Date now = new Date();
		pstmt_insert.setDate(3,new java.sql.Date(now.getTime()));
		
		boolean success = pstmt_insert.execute();
		return success;
	}

	/**
	 * @param connection
	 * @throws SQLException
	 */
	private static List<Identity>  listAllIdentities(Connection connection) throws SQLException {
		List<Identity> identities = new ArrayList<Identity>();
		
		PreparedStatement pstmt_select = connection.prepareStatement("select * from IDENTITIES");
		ResultSet rs = pstmt_select.executeQuery();
		while (rs.next()){
			String displayName = rs.getString("IDENTITIES_DISPLAYNAME");
			String uid = String.valueOf(rs.getString("IDENTITIES_UID"));
			String email = rs.getString("IDENTITIES_EMAIL");
			Date birthDate = rs.getDate("IDENTITIES_BIRTHDATE");
			Identity identity = new Identity(uid, displayName, email);
			identities.add(identity);
		}		
		return identities;
	}

}
