package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/*
 * 날짜 : 2023/06/29
 * 이름 : 박성용
 * 내용 : Java 버퍼 입출력 스트림 실습하기
 * 
 * 보조스트림(버퍼)
 *  - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 *
 */

public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\Workspace2.zip";
		
		
		try {
			//스트림 생성(연결)
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
		
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
			
				//파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					
					//파일을 모두 읽었을 때 반복 종료
					break;
					
				}
				
				//파일 쓰기
				bos.write(data);
				
			}
			
			//스트림 해제
			bis.close(); 
			
			bos.flush(); //버퍼 비우기
			bos.close();
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}// main end
}