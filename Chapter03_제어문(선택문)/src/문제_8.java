import java.util.Scanner;
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user=scan.nextInt();
		System.out.println("컴퓨터 입력: " + com);
		
		switch(com)
		{
		case 0: // 컴퓨터 가위
			switch(user)
			{
			case 0:
				System.out.println("비겼다");
				break;
			case 1:
				System.out.println("사용자 Win");
				break;
			case 2:
				System.out.println("컴퓨터 Win");
			}
			break;
		case 1: // 컴퓨터 바위
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터 Win");
				break;
			case 1:
				System.out.println("비겼다");
				break;
			case 2:
				System.out.println("사용자 Win");
			}
			break;
		case 2: // 컴퓨터 보
			switch(user)
			{
			case 0:
				System.out.println("사용자 Win");
				break;
			case 1:
				System.out.println("컴퓨터 Win");
				break;
			case 2:
				System.out.println("비겼다");
			}
			break;
		}

	}

}
