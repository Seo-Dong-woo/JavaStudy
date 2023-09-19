/*
 *   updown 게임
 *   	컴퓨터 난수 발생: 1~100
 *   	=> 힌트
 *   	   => 정답이 나올때까지 반복 ==> 무한루프
 *                                ------ for(;;), while(true)
 */
import java.util.Scanner;
// import java.lang.*
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		// 종료 => break, System.exit(0)
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;) // 무한루프
		{
			System.out.print("1~100 사이의 값 입력: ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다");
				continue; // 처음으로 복귀
			}
			count++;
			// hint
			if(com>user)
			{
				System.out.println("높은 정수 입력(UP)");
			}
			else if(com<user)
			{
				System.out.println("낮은 정수 입력(DOWN)");
			}
			else
			{
				System.out.println("Game Over");
				System.out.println("입력 횟수: " + count);
				System.exit(0); // 프로그램 종료
			}
		}
	}

}
