/*
 *  자바 => 형식
 *  1) 변수: 한 개의 데이터를 저장할 메모리 공간의 이름
 *       
 *     변수 선언
 *     데이터형 변수명;
 *     
 *     변수 초기값
 *     1. 자바에서 제공하는 데이터형(기본형)
 *        정수형
 *        	byte(1byte) => -128 ~ 127 => 8bit
 *                      => 파일 읽기/쓰기, 업로드, 다운로드, 네트워크 통신
 *          int(4byte) => 32bit => 정수의 default
 *          long(8byte) => 64bit => 빅데이터(라이브러리 => long)
 *          *** int/long => 100L(1) ***
 *        실수형
 *        	float(4byte) => 소수점 이하 6자리 => 10.7F(f)
 *        	double(8byte) => 소수점 이하 15자리 => 10.5D(d) 생략 가능
 *        	
 *        	=> 숫자 사용(정수: int, 실수: double)
 *        문자형
 *        	char(2byte) => 0 ~ 65535(모든 나라의 언어 사용 가능)
 *                         Unicode(한글은 1글자당 2byte)
 *          *** char는 연산 처리가 되면 정수로 변경됨 ***
 *          
 *          10 + 10.5 = 20.5(X) => 자바에서는 항상 같은 데이터형만 연산이 가능
 *          따라서 10.0 + 10.5로 변경해야 함
 *          
 *          'A' + 10.5 => 65.0 + 10.5 => 75.5
 *        논리형
 *        	계산용 X => true/false만 저장 가능(조건문)
 *        -------
 *        참조형(사용자 정의) => 배열/클래스
 *        
 *        데이터형 크기(boolean제외)
 *        
 *        byte < char < int < long < float < double
 *        
 *        *** 연산처리(결과값은 가장 큰 데이터형이 결과값) ***
 *        byte + int + long => long
 *        int + float + double => double
 *        byte + char => int
 *        *** int 이하 데이터형의 연산 결과값은 int ***
 *        
 *        2. 식별자(구분)
 *        	 {같은 이름의 변수를 설정할 수 없다}
 *        
 *        => 문법사항
 *        1) 알파벳이나 한글로 시작
 *        2) 알파벳의 경우 대소문자 구분
 *        3) 숫자 사용 가능(단, 맨 앞에 사용 불가)
 *        4) 특수문자 사용 가능 ex) _, $
 *        5) 키워드 사용 불가 ex) int, double, char...
 *        6) 변수에 공백 불가
 *        
 *     1) 선언
 *        데이터형 변수명;
 *        (int, double...)
 *        
 *        문자변수 선언 => char 변수명
 *        정수 선언 => int(long) 변수명
 *        실수 선언 => double 변수명
 *        논리형 선언 => boolean 변수명
 *        
 *     2) 같은 데이터형이 여러개
 *        정수 => int a, b, c, d;
 *        논리 => boolean a, b, c, d;
 *        문자 => char a, b, c, d;
 *        
 *     3) 변수 => 반드시 사용 전에 초기화
 *        int a=0;
 *        double d= 0.0;
 *        char c=' ';
 *        boolean bb=false;
 *        float f= 0.0f;
 *        long l=0L;
 *        
 *     4) 상수 선언 => 변경할 수 없다(final을 데이터형 앞에 붙이고 변수명이 보통 대문자 시작)
 *        final int A=100(상수)
 *        int b=200(변수)
 *        
 *     
 *        
 * 
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A'); //'0' => 48, '1' => 49
		
		byte b1=10;
		byte b2=20;
		int b3=b1 + b2;

	}

}