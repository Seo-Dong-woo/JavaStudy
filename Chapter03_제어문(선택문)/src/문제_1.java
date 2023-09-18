// 한 개의 정수를 입력받아 양수 or 음수
import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		num=scan.nextInt();
		if(num>=0)
			System.out.println(num + "는(은)양수입니다");
		else
			System.out.println(num + "는(은)음수입니다");
		/*
		 *   정수: nextInt()
		 *   실수: nextDouble()
		 *   논리: nextBoolean()
		 *   문자열: next()
		 *   *** 단점 char는 읽지 못함
		 *           문자열로 읽고 몇번째 문자를 읽을것인지 ex) next().charAt(0)
		 */
	}

}
