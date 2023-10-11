import java.util.*;

class Student
{
	// heap => 프로그램 종료시까지 메모리 유지 => 다른 클래스에서 사용 가능
	String name;
	int kor, eng, math;
	// 매개변수/지역변수 => stack에 저장
	Student(String name, int kor, int eng, int math)
	{
		// 매개변수/지역변수 => 메소드 안에서만 사용 가능 => 자동 메모리
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			System.out.print((i+1) + "번째 이름 입력: ");
			String name=scan.next();
			
			System.out.print((i+1) + " 번째 국어 입력: ");
			int kor=scan.nextInt();
			
			System.out.print((i+1) + " 번째 영어 입력: ");
			int eng=scan.nextInt();
			
			System.out.print((i+1) + " 번째 수학 입력: ");
			int math=scan.nextInt();
			
			std[i]=new Student(name, kor, eng, math);
		}
		// 출력
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n", std[i].name, std[i].kor, std[i].eng, std[i].math,
			(std[i].kor+std[i].eng+std[i].math), (std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	}

}
