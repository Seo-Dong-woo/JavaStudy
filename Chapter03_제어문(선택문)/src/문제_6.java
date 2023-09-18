import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int score=scan.nextInt();
		int grade=score/10;
		
		switch(grade) // 정수, 문자, 문자열
		{
			case 10:
			case 9:
				System.out.println("A학점입니다");
				break;
			case 8:
				System.out.println("B학점입니다");
				break;
			case 7:
				System.out.println("C학점입니다");
				break;
			case 6:
				System.out.println("D점입니다");
				break;
			default :
				System.out.println("F학점입니다");
		}

	}

}
