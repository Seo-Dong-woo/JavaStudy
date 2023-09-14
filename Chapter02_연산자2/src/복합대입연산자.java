/*
 *   41pgae => 증감(원하는 개수만큼) => 복합 대입 연산자
 *   
 *       op=
 *       +=
 *       -=
 *       *=
 *       /=
 *       &=
 *       ^=
 *       |=
 *       >>=
 *       <<=
 *       
 *       1 증가
 *       int a=10; => a++, ++a, a=a+1, a+=1
 *       
 *       1 감소
 *       int a=10; => a--, --a, a=a-1, a-=1 ==> 문자열 누적, 숫자 누적 시 주로 사용 
 * 
 */
public class 복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		a+=100;//a를 100증가
		System.out.println(a);
		a-=50;
		System.out.println(a);

	}

}

