package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practice {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			
			//1단계	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계
			Statement stmt = conn.createStatement();
			
			//4단계
			String sql = "Select * from `User1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5단계
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String uname = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s, %s, %s, %d\n", uid, uname, hp, age );
				
			}
			
			
			
			//6단계 - 종료
			rs.close();
			stmt.close();
			conn.close();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
