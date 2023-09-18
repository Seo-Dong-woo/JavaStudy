// 한 개의 정수를 입력받아 절대값 출력
import java.util.Scanner;
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		num=scan.nextInt();
		
		if(num<0)
			System.out.println("a=" + num*-1);
		else
			System.out.println("a=" + num);

	}

}
