/*
 *   *=, /=
 *   
 *   int a=10;
 *   a*=20 => a=200
 *   
 *   int a=10;
 *   a/=3 => a=3
 * 
 */
public class 복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int A=10;
		int b=A*20;
		System.out.println("b=" + b);
		
		b=10;
		b=A/3;
		System.out.println("b=" + b);

	}

}
