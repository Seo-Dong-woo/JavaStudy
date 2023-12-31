/*
 *   메소드는 입력을 받아서 처리하고 결과값을 반환
 *         ---------        ---------
 *          매개변수            리턴형
 *            |                |
 *          사용자             프로그램
 *   => 구성요소
 *      리턴형/매개변수/메소드명
 *   => 선언부
 *      리턴형 메소드명(매개변수)
 *   => 구현부
 *      {
 *   	   return => void일 경우 생략 가능
 *      }
 *   => 매개변수 전송
 *      int c=add(10, 20) => 호출시에는 매개변수값을 전송
 *                 |   |
 *      int add(int a, int b) => 임시 메모리 공간 => 지역변수의 일종
 *      {
 *      	return a+b; => 30 => c에 저장
 *      }
 *   => 입력값(O), 리턴형(O)
 *   => 입력값(X), 리턴형(O)
 *   => 입력값(O), 리턴형(X) => 리턴형이 없는 경우에는 void
 *   => 입력값(X), 리턴형(X)
 *   
 *   메소드의 정의
 *   1. 특정 작업을 수행하는 명령문의 집합
 *                     ---- 변수/연산자/제어문
 *   2. 메소드를 호출할 경우에만 매개변수가 메모리 할당을 함
 *   
 *   메소드는 호출할 때마다 처음부터 return이 있는 곳까지 실행
 *   
 *   메소드의 매개변수 전송
 *     = 배열, 클래스 => 주소 참조(자체가 변경) => 같은 메모리 주소 Call By Reference
 *     = 일반 데이터형 => 값 참조(자체 변경 X) => 다른 메모리 주소 Call By Value
 *   ===================================================================
 *   절차적 프로그램 => 구조적 프로그램 => 객체 지향 프로그램
 *       |             |               |
 *    한 줄씩 나열   같은 기능별 나눠서 작업  변수+메소드
 *    
 *    변수 => 보호(데이터 손실 방지) => 캡슐화
 *    재사용 => is-a, has-a
 *              |     |
 *             상속   포함
 *    수정, 추가 => 다형성
 *     |   | 오버로딩
 *    오버라이딩
 *    
 *    = 클래스
 *      1. 사용자 정의 데이터형 => 데이터 클래스
 *      2. 메소드 모음 => 액션 클래스
 *         ex)
 *             게시판
 *               = 목록 출력
 *               = 상세 보기
 *               = 데이터 추가
 *               = 데이터 수정
 *               = 데이터 삭제
 */
class Movie{
	String title;
	String actor;
	String director;
	double score;
	String regdate;
}
public class 메소드_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie();
		m1.title="aaa";
		m1.actor="bbb";
		Movie m2=new Movie();
		m2.title="ccc";
		m2.actor="ddd";
		System.out.println(m1.title);
		System.out.println(m2.title);
	}

}
