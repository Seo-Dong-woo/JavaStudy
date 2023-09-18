// 사칙연산
// 정수 두 개를 => 연산자(문자열)
// 정수 세 개 => 한 개 결과값
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int result=0; // 초기값을 줘야 함. 입력값은 num1, num2를 사용하는데 계산결과인 result는 나중에 사용하는 값이기 때문
		Scanner scan=new Scanner(System.in);
		// 초기화
		System.out.print("첫번째 정수 입력: ");
		num1=scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		num2=scan.nextInt();
		System.out.print("연산자 입력(+, -, *, /): ");
		
		switch(scan.next())
		{
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default :
			System.out.println("잘못된 연산자입니다");
		}
		System.out.println("계산 결과값: " + result);

	}

}
