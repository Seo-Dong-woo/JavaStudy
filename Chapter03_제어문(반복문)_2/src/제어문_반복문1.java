/*
 *   데이터 저장
 *   --------
 *     변수/상수
 *     배열
 *     클래스
 *     ------ 메모리
 *     파일
 *     RDBMS(X) ===> JDBC(핵심)
 *     ------ 영구적인 저장 장치
 *   사용자가 요청 => 처리(데이터 가공)
 *     연산자
 *     제어문
 *     ---- 명령문
 *     메소드
 *   ------------------------------- + 클래스(컴포넌트)
 *   출력 => 화면
 *   1) 화면 출력: System.out.println()
 *   2) 브라우저 출력: HTML/CSS/JavaScript
 *   ------------------------------------- 동시에 처리 Spring
 *   
 *   => 서버(Spring)에서 요청 처리 ==> 화면 변경(구시대)
 *   => 차세대
 *      Spring Boot(서버) <==> Front
 *        Restful(JSON)       ------ 처리 속도(Vue, React)
 *          |
 *         통합 => 각 프로그램마다 따로 서버를 돌림
 *      => AI => 머신러닝/딥러닝
 *      
 *      ===> 반복문
 *           = for문: 브라우저 화면 출력
 *                   페이지 나누기
 *                   --------- 사용자가 한 눈에 볼 수 있다(15~20)
 *                   => 반복 횟수가 있는 경우
 *             형식)
 *                 for(초기값;조건식;증감식)
 *                 {
 *                   반복 수행 문장
 *                 }
 *                 초기값: 한 번만 사용 가능 => 시작점
 *                 조건식: 반복 횟수
 *                 증감식: 총 횟수 => 한 개, 여러 개
 *                                 ++    +=
 *                            ↑ 조건이 false   
 *             순서)     ①  →  ②  ← ④
 *                 for(초기값;조건식;증감식)
 *                 {              ↗
 *                            ↓ true면 문장 수행
 *                   반복 수행 문장③
 *                 }
 *                 
 *                 for(int i=1;i<=10;i++)
 *                 for(int i=1;i<=10; i+=2)
 *                 for(char c='A';c<='Z'; c++)
 *                 
 *             2차 for문
 *             ---------
 *                 for(초기값;조건식;증감식) => 줄 수
 *                 {
 *                   for(초기값;조건식;증감식) => 실제 출력물
 *                   {
 *                     반복 수행 문장
 *                   }
 *                   System.out.println()
 *                 }
 *                 
 *                 for(int i=1;i<=3;i++)
 *                 {
 *                   for(int j=1;j<=3;j++)
 *                   {
 *                   
 *                   }
 *                 }
 *                 
 *           = while문: 파일/데이터베이스(오라클)
 *   
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹에서는 2차 for문 사용하지 않음
		// 코테 => sort, 중복 없는 난수
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println();
		}
	}

}
