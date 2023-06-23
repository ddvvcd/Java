package test3;
/*
 * 날짜 : 2023/06/23
 * 이름 : 박성용
 * 내용 : 정적변수 연습문제
 */

class Student {					//자식에서 부모에게 참조 : protected, //본인 내부에서 참조 : private //외부에서 참조 : public
	public static int studentId; //어디서 참조되고 있는지 확인! (1) public Student 에서 참조되므로 public 입력(3)
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++; //여기서 참조되고 있음, 증가되므로 int(2)
		this.studentName=studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studnetInfo() {
		System.out.println("==================");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentName);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("-------------------");
	}
}


public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000; //직접 참고되고있으므로 static (3)
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studnetInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studnetInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studnetInfo();
	}
}
