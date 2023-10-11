/*
 *   클래스
 *     용도 1. 사용자 정의 데이터형 => 데이터형 클래스
 *            => 메모리 저장/메모리 읽기
 *            => 실무/프로젝트 => ~VO, ~DTO
 *                            --------- 캡슐화
 *            => 관련된 데이터를 묶어서 사용 => 관리 용이
 *            => 초기화
 *                |
 *               초기화 블록
 *               --------
 *               생성자
 *               --------
 *         2. 액션 클래스 => 메소드의 묶음
 *            => 게시판(목록, 수정, 상세보기, 삭제, 추가, 검색)
 *         3. 코드를 재사용
 *            코드 관리 용이
 *            신뢰성
 *            ------------- 객체 지향 프로그램
 *   => 기본 문법 => 활용
 *      => 자바/오라클/HTML/CSS/JavaScript
 *                          -----------
 *                               |
 *                       Ajax/Jquery/VueJs/React
 *                       => React-Query
 *      => JSP: 활용 => 사이트
 *      => 실무: Spring/Spring-Boot
 *         => MSA(서버 분산) => DevOps(CI/CD) => Git
 *   => 자바
 *      ---
 *       1. 변수
 *       2. 연산자
 *       3. 제어문
 *       ------- 기본 문법
 *       4. 배열
 *       5. 메소드
 *       -------
 *       6. 클래스
 *          => 1) 구성요소
 *             [접근지정어][옵션] class ClassName{
 *                 ---------
 *                 변수: 클래스 전체, 다른 클래스에서 사용 가능
 *                      (멤버변수)
 *                      1) 기본형: int, long, double, boolean
 *                      2) 배열
 *                      3) 클래스
 *                  => 멤버변수(인스턴스 변수)
 *                     => new 사용시마다 따로 저장하는 변수
 *                     class ClassName
 *                     {
 *                         int a;
 *                         int b;
 *                         String s;
 *                         int[] arr;
 *                         // 클래스 영역 전체에서 사용 가능
 *                         // 다른 클래스에서 사용 가능
 *                     }
 *                     생성시점
 *                     ClassName a=new ClassName()
 *                                 ---------------
 *                     ClassName b=new ClassName()
 *                                 ---------------
 *                                 
 *                     --a--
 *                     0x100 ==> new
 *                     -----    0x100 ----------
 *                                  a => 0
 *                                  b => 0
 *                                  s => null => ClassNaem()
 *                                  arr --> ---------
 *                              ----------
 *                                          ---------
 *                     --b--
 *                     0x100 ==> new
 *                     -----    0x100 ----------
 *                                  a => 0
 *                                  b => 0
 *                                  s => null => ClassNaem()
 *                                  arr --> ---------
 *                              ----------
 *                                          ---------
 *                  => 공유변수(클래스 변수)
 *                     => 메모리 공간이 1개(오라클의 저장된 변수)
 *                     => static
 *                 ---------
 *                 생성자
 *                 초기화블록
 *                 
 *                 => 변수의 초기화
 *                    1) 기본 디폴트 초기화
 *                       class ClassName
 *                       {
 *                          int a; => 0
 *                          long b; => 0L
 *                          double c; => 0.0
 *                          float f; => 0.0F
 *                          boolean bb; => false
 *                          int[] arr; => null
 *                          String s; => null
 *                       }
 *                    2) 명시적 초기화 => 우선시 
 *                       class ClassName
 *                       {
 *                       	int a=10;
 *                       	String name="홍길동";
 *                       }
 *                       파일 읽기/크롤링/오라클/제어문
 *                       ----------------------
 *                        => 클래스 블록에서는 사용 불가
 *                        class ClassName
 *                        {
 *                           int[] arr=new int[5]; --- 선언
 *                           -------------------------------------
 *                           for(int i=0;i<arr.length;i++)
 *                           {
 *                              arr[i]=(int)(Math.random()*100)
 *                           }
 *                           ------------------------------------- 구현
 *                           클래스 블록에서는 선언만 가능. 구현 불가
 *                           int a;
 *                           a=100; => 오류    int a=100;(O)
 *                           
 *                           = 초기화 블록
 *                           = 생성자
 *                           ------------- 동시에 사용하는 빈도는 거의 없음
 *                        }
 *                        
 *                        class A
 *                        {
 *                           int a=100;
 *                           // 초기화 블록
 *                           {
 *                              // => 파일 읽기/자동로그인...
 *                           }
 *                           A()
 *                           {
 *                              // 배열에 초기화
 *                           }
 *                        }
 *                        
 *                       클래스의 구성요소
 *                         데이터 저장: 변수(멤버변수)
 *                         데이터 활용: 메소드
 *                         데이터 값 주입: 생성자
 *                 ---------
 *                 메소드
 *             }
 *             
 *   class Sawon
 *   {
 *       // 사원 관리에 필요한 변수 설정
 *   }
 *   class SawonSystem
 *   {
 *       // 사원 관리 기능 처리
 *       static Sawon[] sawons=new Sawon[10];
 *   }
 *   
 *   A => SawonSystem s=new SawonSystem();
 *        sawons[1]=A
 *   B => SawonSystem s=new SawonSystem();
 *        sawons[1]=A
 *   C => SawonSystem s=new SawonSystem();
 *        sawons[1]=A
 *        
 *   *** 자바는 모든 코딩(변수, 메소드...) => 클래스안에서만
 *       => static 변수는 지역변수로는 사용 불가
 *          클래스 블록에서만 사용 가능
 *       ex)
 *           class ClassName
 *           {
 *              static int a;
 *              void aaa()
 *              {
 *                  static int b; => 오류
 *              }
 *           }
 *           
 *           class A
 *           {
 *           	ClassName.a
 *           	ClassName aa=new ClassName();
 *           	aa.b
 *           }
 *           
 *           한 개의 파일 => class를 여러 개 사용 가능
 *           --------- class를 한 개만 사용(권장)
 *           
 *           자바 코딩
 *           ------
 *           package => 소속 => 한 번만 사용 가능
 *           import => 외부에 있는 클래스를 불러올 때
 *                     라이브러리/사용 정의 클래스
 *                     여러 번 사용 가능
 *           class A
 *           {
 *           	=> A.class
 *           }
 *           class B
 *           {
 *              반드시 => main()
 *              => B.class
 *           }
 *   = 생성자
 *     => 클래스를 메모리에 저장할 때 호출되는 메소드
 *        A a=new A()
 *                --- 생성자
 *     => 특징
 *        = 클래스명과 동일
 *          class A => A()
 *          class B => B()
 *        = 리턴형이 없다
 *          class A
 *            A() => 생성자,  void A/int A() => 일반 메소드
 *        = 여러 개를 만들 수 있음
 *          매개변수의 개수나 데이터형이 다름 --- 오버로딩
 *        = 상속에서 예외
 *        = 생성자는 필요시에 사용
 *          --------------- 서버 연결/데이터 연결/자동 로그인
 *          생성자는 반드시 필요
 *          --------------
 *                |
 *          생성자를 만들지 않는 경우에는 자동으로 생성자를 만듬
 *          => 디폴트 생성자
 *     => 용도
 *        => 멤버변수의 초기화(명시적인 초기화가 불가능할 때)
 *        => 윈도우 초기화, 웹 초기화, 서버 연결...
 *        => 생성자는 한 번만 호출 가능
 *        => 생성자 호출 시에는 반드시 new 생성자()
 *     => 오버로딩
 *        => 새성자 여러 개 만들 수 있음
 *        => 생성자명 동일
 *        => 매개변수의 개수/데이터형이 달라야 함
 *        class A
 *        A()
 *        A(int a)
 *        A(int a, int b)
 *        A(double d)
 *        A(String s)
 *        
 *        class A
 *        {
 *           => A() 자동 생성
 *        }
 *        
 *        class A
 *        {
 *           A(){} => 자동 생성(X)
 *        }
 *        
 *        class A
 *        {
 *           A(int a){} => 자동 생성(x)
 *        }
 *        매개변수가 있는 경우도 생성자
 */
class Sawon
{
	int sabun;
	String name;
	String dept, job, loc;
	static int a;
	// Sawon(){} => Sawon s=new Sawon()
	Sawon()
	{
	    sabun=1;
	    name="홍길동";
	    dept="개발부";
	    job="대리";
	    loc="서울";
	    
	}
	Sawon(int s, String name, String dept, String job, String loc)
	{
		// 지역변수 우선순위
		System.out.println("this=" + this);
		sabun=s;
		this.name=name; // this는 클래스 자신의 객체명
		this.dept=dept;
		this.job=dept;
		this.loc=dept;
		a=100;
	}
}

public class MainClass {
	// MainClass()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		System.out.println("사번: " + sa.sabun);
		System.out.println("이름: " + sa.name);
		
		Sawon sa1=new Sawon();
		System.out.println("사번: " + sa.sabun);
		System.out.println("이름: " + sa.name);
		
		Sawon sa2=new Sawon(2, "박문수", "영업부", "과장", "경기");
		System.out.println("sa2=" + sa2);
		System.out.println("사번: " + sa2.sabun);
		System.out.println("이름: " + sa2.name);
		System.out.println("부서: " + sa2.dept);
		
		/*
		 *   Sawon s=new Sawon();
		 *        --- 메모리 주소 => 주소를 활용(참조변수)
		 *   JVM
		 *     this=s; => 자신 객체
		 *     1) 멤버변수와 지역변수가 같은 경우 구분하기 위해
		 *     2) 모든 클래스는 this를 가지고 있음
		 *                  ---- static => JSP(page)
		 */
	}

}
