package testbase;


import java.sql.SQLException;
import java.util.List;

import org.testng.annotations.Test;

import utils.DbManager;

public class TestDBDemo {

	@Test
	public void dbDemo() throws ClassNotFoundException, SQLException{
	
		DbManager.setDbConnection();
		
		List<String> al = (DbManager.getQuery("select id from Employees"));
		for (String string : al) {
			System.out.println(string);
		}
		
	}
	
}
