/*
 *   연산자
 *   ----
 *     => 결과값(데이터형 사용)
 *     1) 피연산자/연산자
 *        ----- 연상 대상
 *        
 *        1개 = 단항연산자 ++a !a (char)10
 *              => 증감연산자
 *                 -------
 *                    |
 *                 ++, -- => 1증가, 1감소
 *                 
 *                 int a=10;
 *                 a++; => a=a+1
 *                 
 *                   전치 연산자: 먼저 증가 => 다른 연산 수행
 *                   후치 연산자: 다른 연산 수행 => 증가
 *                   int a=10;
 *                   int b=a++;
 *                   
 *                   int a=10;
 *                   int b=++a;
 *                   
 *                   int a-10;
 *                   System.out.println(a++)
 *                   ==> 게시물번호 ==> --a
 *                 
 *              => 부정연산자 ==> boolean 사용(조건문)
 *                 boolean bCheck=false;
 *                 !bCheck=> true
 *                 bCheck=!bCheck
 *                 
 *                 String s="aaa";
 *                 s.repalce('a', 'b') ==> "bbb"
 *                 s="aaa"
 *                 
 *              => 형변환연산자
 *                 -------- boolean 생략
 *        2개 = 이항연산자 a+b
 *             => 산술연산자 +, -, *, /, %
 *                +(문자열 결합)
 *                  int이하 데이터형은 연산 시 int로 변경
 *                  double + int = double
 *                  char + char = int
 *                  byte + byte = byte
 *                  
 *                -
 *                  정수/정수=정수
 *                  0으로 나누면 오류
 *                  
 *                % => 왼쪽 부호를 따름
 *                  -%- = -
 *                  -%+ = -
 *                  
 *             => 비교연산자: 조건문/반복문(조건식)
 *                ==, !=, <, > , <=, >= : boolean
 *                1. 문자열은 비교 불가
 *                   equals
 *             => 논리연산자
 *                && ||
 *                --
 *                (조건) && (조건)
 *                ----     ----
 *                 |        |
 *                 ---------- true && true = true
 *                   => 범위, 기간
 *                   => (조건) && (조건)
 *                      -----
 *                        false => 뒤에 있는 조건 수행 하지 않음
 *                        => 효율적인 연산
 *                        
 *                ||
 *                --
 *                (조건) || (조건)
 *                ----     ----
 *                 |         |
 *                 ----------- true || true, true || false, false || true = true
 *                   => 오류 처리, 잘못된 입력, 범위를 벗어나는 경우)
 *                   => true => 뒤에 있는 조건 수행 하지 않음
 *             
 *             => 대입연산자
 *                =, +=, -=
 *                +=
 *                int a=10;
 *                a+=1; ==> a=a+1 ==> a=11
 *                ==> 1개증가보다 여러 개 증가일 때 사용
 *                => 비행기, 총알
 *        3개 = 삼항연산자 (조건)?값:값 ==> 페이지 변경
 *                     -----
 *                     true => 앞에 값
 *                     false => 뒤에 값     
 * 
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean bCheck=false;
		bCheck=!bCheck;
		if(bCheck)
		{
			System.out.println("출력");
		}
		System.out.println(bCheck);
		
		int a=10;
		a++;
		System.out.println(a);*/
		
		/*byte b1=10;
		byte b2=20;
		int b3=b1+b2; // int long float double*/
		
		String s="Hello";
		String s1=new String("Hello");
		if(s.equals(s1))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}

}
