// 1~n까지 합을 구하는 메소드 구현
// 리턴형(X), 매개변수(O)
/*
 *   메소드 사용시 => 호출
 *   ---------------- main()은 컴파일러에 의해 자동으로 호출
 *                    ----------------------------
 *                              CallBack
 *   메소드
 *   = CallBack => main => 자동 호출되는 메소드
 *   = 사용자 정의: 프로그래머가 직접 제작
 *   = 라이브러리: 이미 제작된 메소드 => 만들지 못하는 프로그램
 *     = 자바에서 제공
 *     = 외부업체에서 지원(Jsoup, Spring) => mvnrepository.com
 *     = CBD => 조립식
 *       ----------- 메소드 호출
 *     = 조립, 재사용, 유지보수
 *     = 재사용
 *       메소드를 불러옴
 *       -----------
 *       int aaa() ===> int a=aaa()
 *       double bbb() ===> double b=bbb()
 *       void ccc() ===> ccc();
 *       boolean ddd() ===> boolean d=ddd()
 *       ----------------------------------
 *       
 *       class A
 *       {
 *       	int aaa(){}
 *       }
 *       class B
 *       {
 *       	main()
 *       	{
 *       		A.aaa()
 *       	}
 *       }
 */
import java.util.Scanner;

public class 문제_3 {
	static void sum(int n)
	{
		int hap=0;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		System.out.println("hap: " + hap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		
		sum(num);
	}

}
