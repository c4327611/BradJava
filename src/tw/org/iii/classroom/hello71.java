package tw.org.iii.classroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class hello71 {

	public static void main(String[] args) {
		// 1. Load Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load OK");
		} catch (ClassNotFoundException e) {
			// Not Found Driver
			System.out.println("Driver not found");
		}
		
		// 2. Create Connection
		try { // 認證考試範例
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii?" +  //用jdbc去跟mysql說話
					"user=root&password=root"); //帳密預設為root
			
		// 3. SQL => Statement Object
		Statement stmt = conn.createStatement();
		System.out.println("213");
		
		// 4. extect Statement	
		stmt.executeUpdate("INSERT  INTO cust (cname,tel,birthday) "
				+ " VALUES ('Jeff','123','1999-01-02')");
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM cust");
		while(rs.next()){
			String id = rs.getString("id");
			String cname = rs.getString("cname");
			String tel = rs.getString("tel");
			String birthday = rs.getString("birthday");
			
			System.out.println(id + ":" + cname + ":" + tel + ":" + birthday);
		}
		
		conn.close();
		System.out.println("OK");
		
		} catch (SQLException e) {
			System.out.println("SQL Error");
		}
		
	}

}
