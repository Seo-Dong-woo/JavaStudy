/*
 * 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
 */
import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a=scan.nextInt();
		if(a>=50)
			System.out.println(a + "는(은) 50이상입니다");
		if(a<50)
			System.out.println(a + "는(은) 50미만입니다");

	}

}
