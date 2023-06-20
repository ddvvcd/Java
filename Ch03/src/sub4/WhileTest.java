package sub4;
/*
 *	날짜 : 2023/06/14
 *  이름 : 박성용 
 * 	내용 : Java 반복문 While 실습하기
 */

public class WhileTest {
	
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while( k <=10 ) {
		sum += k;
		k++;	
			
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		// do~while
		int tot = 0;
		int i = 1;
		
		
		do {
		
			if(i %2 == 0) {    //i/2 = 0 (짝수)
			tot += i;
			}
			
			i++;		
			
			
		}	
		while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + tot);	
			
	
		// break
		int num = 1;
		
		while(true) {
			
			
			if(num % 5 == 0 && num % 7 == 0) {  //num을 5로 나누었을때 나머지가 0
				break;                          //num을 7로 나누었을때 나머지가 0
			}
			
			num++;   //35번 반복 되었을때 끝남
			
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
		
		
		// continue (반복문 처음으로 이동)
		int total = 0;
		int j = 0;
		
		while(j <= 10) {
			
			j++;   //j가 1씩 증가
			
			if(j % 2 == 1) {     //j를 2로 나누었을때 나머지가 1이면
				continue;		 //위로 올라가서 반복 진행할 것
								 //홀수일 경우 올라가고 짝수일 경우 total로 내려감
								 //continue : 반복문 처음으로 이동
			}
			
			total += j;   		 //짝수를 더하게 됨
		
		}
		
		System.out.println("total : " + total);
		
	
	}
	
	
}
