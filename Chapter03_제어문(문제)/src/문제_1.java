import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("2자리 정수 입력(10~99): ");
		int num=scan.nextInt();
		
		if(num<10 || num>99)
			System.out.println("잘못된 입력입니다");
		else if(num%11==0)
			System.out.println("10의 자리와 1의 자리가 같습니다");
		else if(num%11!=0)
			System.out.println("10의 자리와 1의 자리가 같지 않습니다");
	}

}
