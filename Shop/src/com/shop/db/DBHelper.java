package com.shop.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBHelper { //최상위 클래스로 만들어서 
						//customerDAO, ProductDAO, OrderDAO가 참조 하도록 만듦


		
	// DB정보
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/shop";
	private final String USER = "root";
	private final String PASS = "1234";
	
	// 자원 (편리한 프로그래밍을 위해서 변수 선언해둠) (protected : 자식 클래스에 사용 가능)
	protected Connection conn;
	protected PreparedStatement psmt;
	protected Statement stmt;
	protected ResultSet rs;
	
	// 커넥션 (protected : 자식클래스에서 사용 가능하도록)
	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");		
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	

	
	
	// 종료
	protected void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(psmt != null) {
			psmt.close();
		}
		
		if(conn != null) {
			conn.close();
			}
		}
}
