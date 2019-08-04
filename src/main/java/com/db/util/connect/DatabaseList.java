package com.db.util.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseList {

	public static ArrayList<String> getDataTableColumn(String SQLqyeries, String columnName) {
		ResultSet rs = null;
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "sarower");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ArrayList<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				columnValue.add(rs.getString(columnName));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(columnValue);
		// step5 close the connection object
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnValue;

	}
	
	public static int amazon(String test_id, String DESCRIPTION,
			String EXPECTED, String ACTUAL, String STATUS)
			throws SQLException {
		

		Connection conn = null;
		int recordInserted=0;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "sarower");
			String table = "amazon";
			
			
			String query = "INSERT INTO "
					+ table
					+"(test_id, DESCRIPTION, EXPECTED,ACTUAL,STATUS)"
					+ "values(?, ?, ?, ?, ?)";

			// set all the preparedstatement parameters
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setString(1, test_id);
			stmt.setString(2, DESCRIPTION);
			stmt.setString(3, EXPECTED);
			stmt.setString(4, ACTUAL);
			stmt.setString(5, STATUS);
			recordInserted =stmt.executeUpdate();
			// execute the preparedstatement insert
			
			stmt.close();
		} catch (SQLException se) {
			// log exception
			throw se;
		}
		return recordInserted;
	}
	
	
	public static void delecteTable() throws Throwable {
		
		String amazon ="delete from amazon";
		System.out.println(amazon);
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "hr");
	
	

		// set all the preparedstatement parameters
		
			PreparedStatement stmt = conn.prepareStatement(amazon);
			stmt.execute();
			stmt.close();
	}
	public static void dbTable(List<String> data) throws Throwable {
		
		//delecteTable();
		 
		data.forEach((value) -> {

			System.out.println(value);
			try {
				amazon(value.split("_")[0], value.split("_")[1], value.split("_")[2],
						value.split("_")[3], value.split("_")[4]);
			} catch (SQLException e) {
				
			}
			});

	

		
	}
}
