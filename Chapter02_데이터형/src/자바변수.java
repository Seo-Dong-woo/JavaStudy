/*   25page 관리할 데이터를 저장하는 공간
 *   변수: 변수명 => 소문자로 시작
 *        식별자(명명규칙)
 *        1. 알파벳이나 한글로 시작
 *           --- 대소문자 구분
 *        2. 명칭의 개수는 제한하지 않음
 *           => 3~7로 압축
 *           a, b, c => kor, math, eng
 *        3. 숫자 사용 가능
 *           맨 앞에 사용 불가 ex) 2a(x) a2(O)
 *        4. 특수문자 사용 가능($, _)
 *           _는 많이 사용 ex) flie_name, file_ account
 *                          _name, _count => 임시변수
 *        5. 변수명에는 공백 사용 불가
 *        6. 키워드로 사용 불가
 *           --- 자바에서 사용하는 단어(purple color is keyword)
 *        
 *    변수
 *     1) 선언
 *        => 데이터형 변수명;
 *        int a; ==> 4byte 메모리 공간을 만들고 이름을 a로 부여
 *     2) 초기값 부여
 *        a=100;
 *        
 *     3) 동시 => int a=100;
 *     4) 값 읽기/값 변경
 *     -------------- 읽기(값을 가지고 옴)/쓰기(저장)/수정
 *     
 *   26page
 *   형식)
 *       데이터형 변수명
 *       ------ ---- 명명규칙
 *       filename, file_name
 *       
 *       정수값을 저장(200)
 *       int num-200;
 *       
 *       => 프로그램 개발: 가독성, 퍼포먼스(속도)
 *                     -----
 *                     리펙토링
 *       
 *       byte < char < int < long < float < double
 *       
 *       각 데이터형 표현법
 *       byte
 *           byte b=100;
 *           int i=100;
 *           long l-100L;
 *       char
 *           char c='A', char c=65('A')
 *       boolean
 *           boolean b=true; b=false;
 *       float
 *           float f=10.5F
 *       double
 *           double d='A' d=65.0
 *           double d=10  d=10.0
 *           double d=10.5F  d=10.5
 *           double d=10L    d=10.0
 *           
 *                      
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte=127;
		int _int=20000;
		long _long=20000; //20000L
		float _float=10.5f;
		double _double=100; //100.0
		char _char=65; //'A'
		boolean _boolean=true;
		
		System.out.println("byte" + _byte);
		System.out.println("int" + _int);
		System.out.println("long" + _long);
		System.out.println("float" + _float);
		System.out.println("double" + _double);
		System.out.println("char" + _char);
		System.out.println("boolean" + _boolean);
	}

}
