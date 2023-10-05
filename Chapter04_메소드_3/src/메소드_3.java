/*
 *   년도를 입력받아서 윤년 여부 확인
 *   1. 입력 => 초기화 => 회원가입에 필요한 데이터 입력
 *   2. 윤년확인 => 오라클 연결해서 데이터 추가
 *   3. 결과값 출력 => 로그인 이동
 */
import java.util.Scanner;

public class 메소드_3 {
	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt(); 
		return year;
	}
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
			bCheck=true;
		return bCheck;
	}
	static void print(boolean bCheck)
	{
		if(bCheck)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
	}
	static void process()
	{
		int year=userInput();
		boolean bCheck=isYear(year);
		print(bCheck);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 입력하는 메소드
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt();
		
		// 처리
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
			bCheck=true;
		
		// 처리 결과
		if(bCheck)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");*/
	}

}
