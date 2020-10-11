package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static Connection getConnection() {

		/**
		 * Query in SQL Workbench
		 * CREATE TABLE `messages` ( `msg_id` int(11) NOT NULL AUTO_INCREMENT, `message`
		 * text, PRIMARY KEY (`msg_id`) )
		 */

		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/sqlTest";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(url, username, password);

		} catch (SQLException | ClassNotFoundException e) {
			throw new Error("Error", e);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
