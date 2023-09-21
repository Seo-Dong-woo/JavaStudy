/*
 *   제어문: 프로그램을 제어 => 반복 수행, 선택한 부분만 출력
 *         사용자 요청 처리 ...
 *   for       : 반복 횟수가 존재 => 화면 UI
 *               => 웹 프로그램(Front)
 *               형식)
 *                   for(초기값;조건식;증감식;)
 *                      반복 수행 문장
 *                      
 *                   초기값 => 조건 검색
 *                           => true => 반복 문장 수행 => 초기값을 증가
 *                           => false => 종료
 *                   ------------------------------------------
 *                   => 2차 for(중첩 조건문)
 *                   => 알고리즘(정보처리)
 *                      정렬, 검색...
 *                   => 형식)
 *                          for(초기값;조건식;증감식)
 *                          {
 *                          	for(초기값;조건식;증감식)
 *                          	{
 *                          		한 줄에 출력 내용	
 *                          	}
 *                          ]
 *                   
 *   while     : 반복 횟수가 없는 경우 => 서버(Back)
 *               => 크롤링, 데이터베이스, 파일 읽기
 *                  ----------------------- 
 *               => 선조건(수행을 못할 수 있음)
 *               => 형식)
 *                      초기값
 *                      while(조건식)
 *                      {
 *                      	반복 수행 문장
 *                      	증감식
 *                      }
 *               		==> while(true) ==> 74page
 *               
 *   do~while  : 무조건 한 번 이상 수행
 *               => 웹(사용 빈도 거의 없음)
 *               => 후조건(한 번은 반드시 수행)
 *               => 형식
 *                     초기값
 *                     do{
 *                     		반복 수행 문장
 *                          증감식	
 *                     }while(조건식);
 *                     
 *                  int i=1;
 *                  do{
 *                  	 System.out.println(i);
 *                  	 i++;
 *                  }while(i<=10);
 *   -------- 반복문 
 * 
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= for =======");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n======= while =======");
		int i=1;
		while(i<=10)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n======= do~while =======");
		i=1;
		do {
			System.out.print(i+ " ");
			i++;
		}while(i<=10);
	}

}
