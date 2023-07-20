package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test08 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
			
		}
	}
	
	
	public static Set<Integer> makeLotto() { //리턴값의 반환값 확인
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) { //for문 무한반복 (조건, 증감식 등 없음)
			int num = (int) Math.ceil(Math.random() * 45); //정수로 변환
					
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		//정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet; //리턴값 여기 있음
		
	}
}
