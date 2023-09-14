/*
 *  % => 배수 ==> 화폐 매수 구하기
 * 
 */
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=3;
		
		System.out.println(a + "%" + b + "=" + (a%b));
		System.out.println(-a + "%" + b + "=" + -(a%b));
		System.out.println(a + "%" + -b + "=" + (a%-b));
		System.out.println(-a + "%" + -b + "=" + (-a%-b));
		
		System.out.println("==========");
		int c= 369; //백단위: 3, 십단위: 6, 일단위: 9
		int x=c/100, y=c%100/10, z=c%10;
		System.out.println("백단위: " + x + " 십단위: " + y + " 일단위: " + z);
	}

}
