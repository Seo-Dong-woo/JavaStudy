import java.util.Scanner;
/*
 *   형식)
 *        if(조건문)
 *        {
 *           실행문장 => 조건문이 true일 때만
 *        }
 *        => 조건문: 반드시(true/false)
 *                      -----------
 *                      비교연산자/논리연산자/부정연산자
 *        두 개의 정수, 연산자 +, -, *, /
 *        => 간단한 계산기
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("첫번쨰 정수 입력: ");
		num1=scan.nextInt();
		System.out.print("두번쨰 정수 입력: ");
		num2=scan.nextInt();
		System.out.print("연산자 입력(+, -, *, /): ");
		op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		if(op=='-')
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		if(op=='*')
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		if(op=='/')
		{
			// 중첩 조건문
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			if(num2!=0)
			{	
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			}
		}
		if(!(op=='+' || op=='-' || op=='*' || op=='/'))
		System.out.println("잘못된 연산자 입니다");

	}

}
