/*
 *   44page
 *   비교연산자 ==> 결과값(boolean: true/false)
 *   ------- 사용처(조건문, 반복문)
 *   숫자(정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다
 *                   |
 *          ==, !=(같냐 or 다르냐만 가능)
 *   -------------------------- 문자는 어떤 연산자를 사용해도 정수형으로 변경
 *   1) ==: 같다
 *   2) !=: 같지 않다
 *   3) <: 작다
 *   4) >: 크다
 *   5) <=: 작거나 같다
 *   6) >=: 크거나 같다
 *   --------------------------
 * 
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; //0~100 랜덤, 예약가능한 날 정할 때 사용 가능
		int b=(int)(Math.random()*100)+1;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("a==b: " + (a==b));
		System.out.println("a!=b: " + (a!=b));
		System.out.println("a<b: " + (a<b));
		System.out.println("a>b: " + (a>b));
		System.out.println("a<=b: " + (a<=b));
		System.out.println("a>=b: " + (a>=b));
		
		char c=(char)((Math.random()*26)+65); //알파벳이 총 26자 이므로 *26(0부터 26미만까지 출력 A=0 B=1 C=2... Z=25 / 알파벳은 A부터 시작하므로 +65)
		char d=(char)((Math.random()*26)+65);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("c<=d: " + (c<=d));
		
		char e=(char)((Math.random()*26)+65);
		System.out.println("e=" + e);
		
		boolean b1=false;
		boolean b2=true;
		System.out.println("b1==b2: " + (b1==b2));
		System.out.println("b1!=b2: " + (b1!=b2));

	}

}
