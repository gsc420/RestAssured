package testbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import utils.DbManager;

public class DB2 {

	@Test
	public void getConnection() {

		Connection connection = null;
		// Statement insertStmt = null;
		Statement selectStmt = null;
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=gaurav;user=sa;password=G@urav123";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(dbURL);

			/*
			 * insertStmt = connection.createStatement(); insertStmt.
			 * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (1,'Lokesh','Gupta',5)"
			 * ); insertStmt.
			 * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (2,'howtodoinjava','com',5)"
			 * );
			 */

			selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery("select * from Employees order by salary");
			System.out.println(rs);
			List<Map<String, String>> emps = new ArrayList();
			while (rs.next()) {
				Map<String, String> map = new HashMap();
				map.put("id", rs.getInt(1) + "");
				map.put("fName", rs.getString(2));
				emps.add(map);

			}
			System.out.println("Result :" + emps);
			System.out.println("");

			for (Map<String, String> map : emps) {
				System.out.println(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				selectStmt.close();
				// insertStmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
