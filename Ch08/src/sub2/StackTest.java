package sub2;

import java.util.Stack;

/*
 * 날짜 : 2023/06/28
 * 이름 : 박성용
 * 내용 : Java 자료구조 스택 실습하기
 * 
 * 스택(Stack)
 *  - 스택은 데이터가 순서대로 쌓이는 자료구조(LIFO:후입선출)
 *  - 변수 선언과 메서드 실행에 사용
 */
public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //스택을 만듦 (제네릭)
		
		stack.push(1);	//데이터 넣음
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		//System.out.println("stack pop : " + stack.pop()); //스택에서 자료 꺼내기 : pop 
		//System.out.println("stack pop : " + stack.pop()); //마지막 자료가 먼저 나옴
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		
		while(!stack.empty()) { //스택이 비어있지 않다면. 자료를 꺼내라 (반복)
			System.out.println("stack pop : " + stack.pop());
		}
		
		
	}
}
