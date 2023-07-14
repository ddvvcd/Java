package com.shop.dao;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper {
	
	// 싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	// 기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) { //결과값은 0 또는 1
											  //insertCustomer를 정의한 뒤 ShopMain에서 호출 -> 출력
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			// 0:실패, 1:성공 
			result = psmt.executeUpdate();
			
			close();
				
			
			
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 사용중인 아이디 입니다.");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public CustomerVO selectCustomer(String custId) {
		
		CustomerVO vo = null; //customerVo 객체 생성 및 초기화 (null로 선언)
							  //if문 안에 CustomerVo vo 객체를 만들면 if문 안에서만 사용 가능하다
							 // 따라서 close(); 메소드 밑에서 vo를 사용 하려면 위에 작성 후 if문 안에서 초기화
		
		try {
			conn = getConnection(); //DBHelper 최상위 클래스에 만들어 놓은 메소드 호출
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) { //데이터베이스 select문의 결과값은 0 또는 1이기 때문에 반복문 while 보다는 if문 사용
				//CustomerVO vo = new CustomerVO(); //customer vo 객체는 if문 중괄호 안에서만 사용 가능
				vo = new CustomerVO(); //위에 만든 vo 객체 사용하기 위해서 작성 및 객체 생성
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			
			close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustomer(String custId) {
		return 0;
	}
	

}