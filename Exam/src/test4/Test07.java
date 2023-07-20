package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2023/06/30
 * 내용 : 리스트 연습문제
 */


public class Test07 {
	public static void main(String[] args) {
		//creatList(); 따로 있는데 밑에 집어 넣음
		//printList();
		
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		
		//List<Integer> list = createList();
		
		printList(creatList()); //반환값을 집어 넣은 상태
	}
	
	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
				
		for(int i=0; i<size; i++) {
			
			int score = scoreList.get(i);
					
			total += score;
			
			System.out.print(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			
		}
		
		System.out.println(total);
		
	}

	public static List<Integer> creatList() {
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1; i<=10; i++) {
			// 60 ~ 100 사이 임의의 수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
			
		}
		
		return scoreList;
		
		
	}
	
}
