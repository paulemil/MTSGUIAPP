/**
 * 
 */
package edu.gatech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author student
 *
 */
public class DBConnection {

	private static DBConnection dbConnection = null;

	private DBConnection() {

	}

	public static DBConnection getDBConnection() {
		if (null == dbConnection) {
			dbConnection = new DBConnection();
		}
		return dbConnection;
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/martadb";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "cs6310");
		props.setProperty("ssl", "true");
		Connection conn = DriverManager.getConnection(url, props);
		return conn;
	}
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
