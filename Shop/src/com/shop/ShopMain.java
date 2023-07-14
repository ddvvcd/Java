package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

/*
 * 날짜 : 2023/07/13
 * 이름 : 박성용
 * 내용 : Shop CRUD 실습하기 
 *
 */

public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("----------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDao = CustomerDAO.getInstance();
		OrderDAO    orderDao    = OrderDAO.getInstance();
		ProductDAO  productDao  = ProductDAO.getInstance();
		
		// 로그인 사용자 객체
		CustomerVO loginedCustomer = null;
		
		while(true) {
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");	
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");
			}
			
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				// 종료
				break;
			}else if(answer == 1) {
				
				if(loginedCustomer == null) {
					// 로그인 처리
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDao.selectCustomer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					// 로그아웃 처리
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;					
				}
				
			}else if(answer == 2) {
				
				if(loginedCustomer == null) {
					
				
					//회원가입 (customer 테이블에 insert 시킴)
					
					CustomerVO vo = new CustomerVO(); //vo객체를 만든다
					
					System.out.print("아이디 입력 : ");
					vo.setCustId(sc.next()); //vo객체의 custId 입력값은 CustID (set은 초기화시키는 메서드)
											 //CustId를 초기화 시킨다 (입력한 값을 초기값으로 넣어줌)
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
					
					System.out.print("휴대폰번호 입력 : ");
					vo.setHp(sc.next());
					
					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());
					
					int result = customerDao.insertCustomer(vo); //위에 입력한 값들을 vo객체에 넣은 뒤 insertCustomer에 넣는다
					
					if(result > 0) {
						System.out.println("회원가입을 축하합니다.");
					}else {
						System.out.println("회원가입에 실패 했습니다. 다시 회원가입 하십시오.");
					}
					
				}else {
					//주문현황
					String orderId = loginedCustomer.getCustId();
					List<OrderVO> myOrders = orderDao.selectOrders(orderId);
					
					
					for(OrderVO myOrder : myOrders) { //이후 OrderVO에서 toString 메소드를 만들어주기
						System.out.println(myOrder);  //리스트 내부의 값을 보기 위해서 만들어줘야 함
					}
					
					
				}
				
				
			}else if(answer == 3) {
				
				//상품목록
				List<ProductVO> products = productDao.selectProducts();
				
				
				System.out.println("--------- 상품목록 ---------");
				for(ProductVO product : products) {
					System.out.println(product);
				}
				System.out.println("--------------------------");
				
			}else if(answer == 4) {
				// 주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하십시요.");
					continue;
				}
				
				System.out.print("주문 상품번호 입력 : ");
				int prodNo = sc.nextInt();
				
				System.out.print("주문 수량 입력 : ");
				int prodCount = sc.nextInt();
				
				// 주문객체 생성
				OrderVO orderVO = new OrderVO();
				orderVO.setOrderProduct(prodNo);
				orderVO.setOrderCount(prodCount);
				orderVO.setOrderId(loginedCustomer.getCustId());
				
				// 주문처리
				int result = orderDao.insertOrder(orderVO);
				
				// 상품 재고 수정
				productDao.updateProductStock(prodNo, prodCount);
				
				if(result > 0) {
					System.out.println("상품 주문이 완료 되었습니다.");
				}else {
					System.out.println("상품 주문이 실패 했습니다.");
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("안녕히 가세요~");
		
		
	}
}
