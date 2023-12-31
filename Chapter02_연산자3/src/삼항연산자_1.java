/*
 *   컴퓨터와 가위바위보(0, 1, 2)
 *     0 => 가위 
 *     1 => 바위
 *     2 => 보
 *     
 *   => 1. 컴퓨터 난수 발생
 *   => 2. 사용자 입력
 *   => 3. 컴퓨터, 사용자의 가위바위보 출력
 *   => 4. 결과값
 *         
 *     컴퓨터       사용자     컴퓨터-사용자               컴퓨터       사용자     컴퓨터-사용자               컴퓨터       사용자     컴퓨터-사용자
 *     가위(0)    가위(0)D        0                   바위(1)     가위(0)L        1                   보(2)     가위(0)W       2
 *               바위(1)W       -1                             바위(1)D        0                              바위(1)L      1
 *                보(2)L        -2                             보(2)W        -1                              보(2)D       0
 *                
 */
import java.util.Scanner;
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터
		
		int com=(int)(Math.random()*3); // 0, 1, 2
		// 사용자
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2): ");
		int user=scan.nextInt();
		//확인
		System.out.print("컴퓨터: ");
		System.out.print(com==0? "가위" : "");
		System.out.print(com==1? "바위" : "");
		System.out.print(com==2? "보" : "");
		System.out.println();
		System.out.print("플레이어: ");
		System.out.print(user==0? "가위" : "");
		System.out.print(user==1? "바위" : "");
		System.out.print(user==2? "보" : "");
		System.out.println();
		System.out.println("==========");
		System.out.print(com-user==-1||com-user==2? "사용자 Win" : "");
		System.out.print(com-user==-2||com-user==1? "컴퓨터 Win" : "");
		System.out.print(com-user==0? "비겼다" : "");

	}

}
