package vn.iotstar.configs;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectSQLServer {
	private final String serverName = "DESKTOP-21LJ1QK";
	private final String dbName = "Ltwebct2_thayTrung";
	private final String portNumber = "1433";
	private final String userID = "sa";
	private final String password = "123456789";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);

	}


	public static void main(String[] args) {
		try {
			System.out.println(new DBConnectSQLServer().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
