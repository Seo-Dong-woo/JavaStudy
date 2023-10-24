package com.sist.lib;
/*
 *   java.lang => 자바 소스의 기본 => 많이 사용 되는 패키지
 *             => import를 생각할 수 있음
 *             => java.lang에 있는 대부분의 클래스는 final 클래스 ==> 확장 불가(있는 그대로 사용)
 *                                   String, StringBuffer, Math, System
 *                                   Wrapper
 *                                   예외: Object
 *   => Object: 최상위 클래스 => 모든 클래스의 상위 클래스
 *              (사용자 정의, 라이브러리 => 모든 클래스 Object로부터 상속을 받음)
 *              = toString(): 객체를 문자열화
 *                            기본은 메모리 주소 출력
 *                            => 오버라이딩(멤버변수 값 확인) 
 *              = clone(): 메모리 주소를 복제 => 새로운 메모리 생성
 *              = finalize: 소멸자(자동 호출) => 메모리 해제 시 자동 호출
 *   => System: 출력, 메모리 해제, 프로그램 종료
 *              = println(): => 에러 출력
 *                           => 멤버변수 값 확인
 *                           => 전송 값 확인
 *                윈도우/브라우저 => 자체 출력 => 디버깅
 *              = gc(): garbage collection을 호출해서 메모리를 비워줌
 *                => 멀티미디어, 애니메이션
 *                   ==> 실시간 도로 cctv
 *              = exit() => 종료
 *   => Math: 수학 => 모든 메소드가 static
 *            => 메모리 할당을 하지 않음
 *            => Math.메소드명()
 *            = *** random() => 리턴형(double => 0.0 ~ 0.99)
 *            = *** ceil() => 올림
 *   => StringBuffer: String을 보완 => 문자열 결합 시 최적화
 *                    => *** append()
 *   => String: 문자열 관리하는 클래스
 *   
 *   
String 클래스의 주요 메소드 문제 (다음 설명에 맞는 메소드의 원형을 작성하시오)
1. 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
   public boolean startsWith(String s)

2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
   public boolean endsWith(String s)

3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교) 
   객체 생성
   -------
    => 모든 값을 저장할 수 없음
    => 모든 값을 저장하기 위해 메모리를 모아서 저장 ==> Heap
    => 객체에는 heap 영역에 저장되어 있는 메모리 주소를 가지고 있음
                                 -------- 참조 변수
    (주소 비교 시 ==, 실제 저장된 값 비교 equals)
    public boolean equals(String s)
    => 웹: 로그인, 아이디 찾기, 아이디 중복
       -- CRUD(게시판) => 회원가입 => 로그인...
       -- 목록(페이지 나누기) => 상세보기(댓글)
       -- 최신방문(쿠키), 로그인상태 유지(세션)
       => 대소문자를 구분해서 비교

4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
   String => char[]을 이용한 클래스
             ------
              => 문자열의 index가 0번부터 시작
   String s="Hello Java";
             0123456789
   public char charAt(int index)

5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
   public int lastIndexOf(char c)
   public int lastIndexOf(String s)
   --------------------------------
     오버로딩
      = 한 클래스에서 만들어짐
      = 같은 메소드명 이용
      = 데이터형이나 매개변수의 개수가 다름
      = 리턴형 관계없음
      = 접근지정어 관계없음
      = 중복 메소드 정의

6. 문자열의 길이를 반환한다.
   public int lenth()

7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다. Replace(char 1, char 2)
   public String replace(char c)
   public String replace(String s)
   => 오라클 => 값을 저장
              ------ 이미지 => &, ||
              & => Scanner ==> &, #
              || => 문자열 결합
              
8. 정규표현식을 지정한 문자로 바꿔서 출력한다.
   replaceAll(String regexp, String s)
              ------------- 정규식, split()
              공부: 데이터 분석(챗봇)
                  ---------
     => 패턴(문자열의 형태)
     => 맛집 => 어떤 맛
               짜다, 싱겁다, 맵다...
               ---
               짜다, 짜고, 짜니...
               짜+
     => 기호(+, *, ^, $, ., |) ==> 자체 => \\+

9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
   public String[] split(String regexp) => 정규식 이용
   => java.util => StringTokenizer
 
10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
    public String substring(int b)
      => b부터 전체 반환
    public String substring(int b, int e)
      => b부터 e-1까지 반환
    *** 원본은 변경되지 않음
    String s="Hello Java"
              0123456789
    s.substring(6) => Java

11. 문자열에 대문자를 소문자로 변환한다. 
    toLowerCase()

12. 문자열에 소문자를 대문자로 변환한다.
    toUpperCase()
    
13. 문자열을 그대로 반환해준다.
    public String toString()

14. 문자열에 공백을 제거해 준다.
    public String trim() => 좌우에 있는 공백만 제거

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
    toString() => Object가 가지고 있는 toString() 오버라이딩
    ---------- 문자열 반환 => 데이터형을 문자형으로 변경
 
16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다. 
    public boolean contains(String s)

17. 지정한 index번째에 문자를 반환한다. 
    public char charAt(int index)

18. 문자와 문자를 결합해준다.
    public String concat(String s) ==> +
    String s="A";
    String s1="B";
    s.concat(s1) => "AB"

19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
    String.format("%d%d%d", 10, 20, 30)
    ------ static
    public static String format(String s, Object...obj)

Object 클래스의 주요 메소드
1. 객체의 복사본을 만들어 리턴한다.
   clone()

2. 현재 객체와 매개 변수로 넘겨 받은 객체가 같은지 확인하다. 같으면 true를 다르면 false를 리턴한다.
   equals()

3. 현재 객체가 더 이상 쓸모가 없어졌을 때 가비지 컬렉터에 의해서 이 메소드가 호출된다.
   finalize()

4. 객체를 문자열로 표현하는 값을 리턴한다. 
   toString()
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		System.out.println(s.substring(6));
		System.out.println(s);
	}

}
