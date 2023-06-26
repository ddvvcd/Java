package sub3;

/*
 * 날짜 : 2023/06/26
 * 이름 : 박성용
 * 내용 : Java 예외발생 시키기 실습하기
 */

// 사용자 정의 예외클래스

class MinusException extends Exception {
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
																		//다형성이라서 마이너스, 오버는 Exception으로 가능 (위에 2개 확인)
	public void check(int score) throws MinusException, OverException { // 체크 메소드가 throws(3)
		if(score < 0) {
			// 예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");	// 마이너스익셉션을 throw(1)
		}else if(score > 100) {
			// 예외 발생 시키기
			throw new OverException("100점을 초과할 수 없습니다."); 	// 오버익셉션을 throw(2)
		}else {
			System.out.println("점수가 정상입니다.");
		}
	}
	
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);	//마이너스 익셉션
			score.check(102);	//오버 익센셥
			score.check(96);	//정상 실행
		} catch (MinusException e) { //마이너스 익섹셥 잡아내기 (4)
			e.printStackTrace();
		} catch (OverException e) { //오버 익셉션 잡아내기(5)
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
		//마이너스 익셉션만 처리되었음
	}
}
