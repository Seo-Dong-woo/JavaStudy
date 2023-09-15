// 54page
/*
 *   변수 => 저장(데이터)
 *   연산자 => 결과값, 사용처, 형식
 *   제어문 => 흐름(동작), 사용처, 형식
 *   
 *   1. 제어문의 정류
 *   *** 무조건 한 개의 문장만 수행할 수 있음
 *      if(조건문)
 *        문장 1 ==> 제어
 *        문장 2 ==> 일반 문장
 *        
 *      if(조건문)
 *      {
 *         문장 1
 *         문장 2
 *      }
 *      
 *      = 조건문
 *        1) 단일 조건문
 *           if(조건문) => 조건문(비교연산자, 논리연산자, 부정연산자)
 *           {
 *              조건문이 true일 경우 수행할 문장
 *           }
 *           => 명령문 제어
 *           => 여러개 사용시 속도가 느려짐
 *           => 중복이 있는 경우 사용 가능
 *        
 *        2) 선택 조건문: true와 false를 나눠서 작업
 *           ==> 삼항연산자
 *             if(조건문)
 *             {
 *                조건문이 true일 때
 *             }
 *             else
 *             {
 *                조건문이 false일 떄
 *             }
 *             
 *        3) 다중 조건문: 한 번만 수행할 때 주로 사용
 *           => 계산기: +, -, *, /
 *           if(조건문)
 *           {
 *              조건문이 true일 때 
 *           }
 *           else if(조건문)
 *           {
 *              if 조건문이 false면서 else if 조건문이 true일 때
 *           }
 *           else
 *           {
 *              if, else if 조건문이 false일 때(생략 가능)
 *           }
 *           
 *           ex)
 *           int score=80;
 *           if(score>=90)
 *             A
 *           else if(score>=80)
 *             B
 *           else if(score>=70)
 *             C
 *           else if(score>=60)
 *             D
 *           else if(score<60)
 *             F
 *           
 *           int a=15;
 *           if(a%3==0)
 *           if(a%5==0)
 *           if(a%7==0)
 *             
 *      = 선택문
 *      = 반복문
 *      = 반복제어문
 * 
 */
// 단일 조건문: 조건식(비교연산자,논리연산자,부정연산자)
// 1. 정수 한 개를 입력 받아서 짝수/홀수
import java.util.Scanner;
public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 클래스 => 키보드로 입력해서 저장 => 엔터 메모리에 저장
		/*
		 *   기능(메소드)
		 *   정수: nextInt()
		 *   문자열: next()
		 *   실수: nextDouble()
		 *   논리: nextBoolean()
		 *   문자 X ==> System.in => 정수로 출력됨 ex) A => 65
		 *   웹/윈도우(char(X))
		 */
		// Scanner 클래스 저장 => 클래스를 저장할 때 new 사용
		Scanner scan=new Scanner(System.in);
		// System.in/System.out => 자바 표준입출력
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		// 가공 
		if(num%2==0)
		{
			System.out.println(num + "는(은) 짝수입니다");
		}
		if(num%2==1)
		{
			System.out.println(num + "는(은) 홀수입니다");
		}

	}

}
