import java.util.Scanner;
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		score=scan.nextInt();
		
		if(score>=90)
			System.out.println("A학점입니다");
		else if(score>=80)
			System.out.println("B학점입니다");
		else if(score>=70)
			System.out.println("C학점입니다");
		else if(score>=60)
			System.out.println("D학점입니다");
		else if(score<0)
			System.out.println("F학점입니다");

	}

}
