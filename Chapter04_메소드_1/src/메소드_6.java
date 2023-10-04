// 알파벳을 입력받아서 => 대/소문자 확인
// 1개, 2개
import java.util.Scanner;

public class 메소드_6 {
	static char alphaInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		return scan.next().charAt(0);
		// 자바 단점 => char를 받아서 처리하는 기능이 없음
		// => String으로 받아서 char로 분리
	}
	static void result(char c)
	{
		// 결과값을 자체 처리
		if(c>='A' && c<='Z')
			System.out.println(c + "는(은) 대문자 입니다");
		else if(c>='a' && c<='z')
			System.out.println(c + "는(은) 소문자 입니다");
		else
			System.out.println(c + "는(은) 알파벳이 아닙니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳 받기
		char a=alphaInput();
		result(a);
	}

}
