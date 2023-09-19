/*
 *   1차 for문
 *   for(시작점;어디까지;몇씩증감)
 *       초기갑  조건식   증감식
 *   ex) 1~100
 *       int i=1;i<=100;i++
 *   ex) 1~100
 *       int i=1;i<=100;i+=2
 *   -----------------------
 *   문자는 모든 연산 시 정수로 변경
 *   for(int i=....
 *       ----- for문 {} 안에서만 사용 가능
 *       
 *   {
 *   	int a=10;
 *   	{
 *   		int b=20;
 *   		{
 *   			int c=30;
 *   		}
 *   	}
 *   }
 *   
 *   중첩 for문 => 2차 for문
 *   
 *   for(초기값;조건식;증감식)
 *   {
 *   	for(초기값;조건식;증감식)
 *   	{
 *   
 *   	}
 *   }
 */
public class 제어문_반복문2 {
	static int aaaa=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=1;i<=100;i+=2)
		// for(int i=2;i<=100;i+=2)
		for(int i=1;i<=4;i++) // 줄 수
		{
			for(int j=1;j<=5-i;j++) // 실제 출력물
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
