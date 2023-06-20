package test1;

public class Test07 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k % 2 == 0 || k % 3 == 0) { 
			
			//k를 2로 나누었을때 나머지가 0 or k를 3으로 나누었을때 나머지가 0이면 	
			//for문에서 k를 1부터 10까지 계속 증가시킬 것
				total += k;
			//위의 결과에서 나온 k의 값을 더하기
				
			}
		}
		
		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : "+total);
		//total : 위의 k의 값을 출력
	}
}
