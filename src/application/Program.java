package application;

import java.sql.Connection;

import db.DB;

public class Program {

	/**
	 * Using MySQL Java Connector
	 * https://dev.mysql.com/downloads/connector/j/5.1.html
	 */
	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
	}

}
