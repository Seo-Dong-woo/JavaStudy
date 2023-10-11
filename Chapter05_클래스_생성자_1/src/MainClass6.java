class B
{
	int a=10;
	// 생성자(X), 일반 메소드
	void B()
	{
		System.out.println("B클래스의 default 생성자 호출");
	}
	/*
	 *   생성자 => 초기화가 필요함(명시적 초기화 불가)
	 *           제어문/파일읽기
	 *        => 시작과 동시에 처리 => 가장 먼저 호출
	 *           -------------
	 *                |
	 *             자동 로그인
	 *             윈도우 화면 설정
	 *             서버 연결
	 *             데이터베이스 연결
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new B(); // new 생성자()
		// new B().a=100;
		B b=new B();
		//b.B();
		//b.a=100;
		//new B().a=1000;
		//System.out.println(b.a);
	}

}
