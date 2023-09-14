/*
 *   변수: 저장 공간
 *   ===
 *     자바 저장 공간 설정(자료형, 데이터형)
 *     --------------
 *       정수
 *         byte(8bit) => 0, 1을 8개 채워서 숫자 한 개 저장 128~127
 *         int(32bit) => -21억 4천 ~ 21억 4천 --- default(컴퓨터에서 모든 숫자는 int를 인식)
 *         long(64bit) => 금융권, 빅데이터
 *         
 *       실수
 *         double(64bit) => 소수점 15자리 이상
 *       
 *       문자
 *         char(16bit) => 0~65535(문자번호)
 *         'A'(X) ==> 65
 *         
 *       논리
 *         boolean: true, false(8bit) => 0, 1
 *         ----------------------------------
 *           정수 3개 저장
 *           int a, b, c;
 *           
 *           실수 2개 저장
 *           double d1, d2;
 *           
 *           문자 1개 저장
 *           char c;
 *           
 *           true or false 저장
 *           boolean bb;
 *       ---> 데이터 저장 ---> 사용자 요쳥에 맞게 가공 ---> 화면 출력
 *       ---> 프로그램(반복)           |
 *                                연산자
 *       자바에서 제공하는 연산자
 *       -----------------
 *        단항연산자
 *        = 증감연산자(++, --)
 *          ++a: a값을 1증가 시킨 후에 다른 연산 수행
 *          int a=10;
 *          int b=++a;(증가 후 대입)
 *          
 *          a++: 먼저 다른 연산 후에 1증가
 *          int a=10;
 *          int b=a++;(대입 후 증가)
 *          
 *          --a: a값을 1감소 시킨 후에 다른 연산 수행
 *          int a=10;
 *          int b=--a;(감소 후 대입)
 *          
 *          a--: 먼저 다른 연산 후에 1감소
 *          int a=10;
 *          int b=a--;(감소 후 대입)
 *          
 *          ++, -- => 1증가, 1감소
 *          
 *        = 부정연산자(!) => boolean에서만 사용 가능
 *          => true => false
 *          => false => true
 *          ex) boolean bCheck=false;
 *              bCheck=!bCheck ==> bCheck=true
 *              
 *              예약 가능한 날 => !(예약 가능한 날)
 *              
 *        = 형변환연산자(type) => 강제 형변환
 *          -------- 객체지향 형변환(클래스)
 *          숫자관련만(정수, 실수, 문자)
 *          ---------------------
 *            UpCasting: 데이터형을 크게 만듬
 *              int => double
 *              char => int
 *              ----------------- 자동 형변환
 *              int a='A'('A' => 65)
 *              double d=100(100 => 100.0)
 *              
 *            DownCasting: 데이터형을 작게 만듬
 *              char c=(char)65     c='A'
 *              int i=(int)100.0    i=100
 *              
 *           데이터형의 크기
 *           byte < char < int < long < float < double
 *           
 *           자동 형변환(큰 값으로 변경)
 *           연산 처리 시 많이 변경
 *           double + int(X) => double + double(O)
 *           char + int(X) => int + int(O)
 *           int + long(X) => long + long(O)
 *           
 *           *** 주의점 ***
 *           int이하는 무조건 int로
 *           ex) char + char => int
 *        
 *        이항연산자
 *        = 산술연산자(+, - *, /, %)
 *          +: 두 개의 값을 더함
 *             문자를 합침("7"+"7"="77")
 *             7+"7"+7/7(O) => "771" ==> 우선순위가 '/'먼저
 *             
 *          /: 정수/정수 = 정수, 정수/실수
 *             정수/(double)정수
 *             int hit=135           int hit=135
 *             int count=10          int count=10
 *             hit/count=13          hit/(double)count=13.5
 *             *** 0으로 나눌 수 없음 ***
 *             
 *          %: 왼쪽 부호
 *             => 윤년 구하기, 숫자 자르기, 배수 구하기
 *                    
 *        = 비교연산자(==, !=. <, >, <=, >=) 결과값 => true/false
 *          => 문자, 정수, 실수
 *             'A' "A" => 자바는 Unicode를 사용(모든 국가의 언어 사용 가능)
 *                             ------- 한 글자당 2byte
 *             '홍'(한글은 한 글자당 2byte)
 *          ==: 같다
 *          !=: 같지 않다
 *          <: 작다
 *          >: 크다
 *          <=: 작거나 같다
 *          >=: 크거나 같다
 *          *** 날짜, 문자열 비교할 수 없음 ***
 *          
 *        = 논리연산자(&&, ||)
 *          &&: 직렬연산자(조건 2개가 true일 경우에만 true)
 *              (조건) && (조건)
 *              사용처: 기간, 범위가 포함된 상대
 *          ||: 병렬연산자 (조건 2개 중 1개 이상 true일 경우 true)
 *              (조건) || (조건)
 *              사용처: 잘못된 입력        
 *        
 *        = 대입연산자(=, +=, -=)
 *          일반 대입
 *          += ===> a+=1 => a=a+1 
 *          -= ===> a-=1 => a=a-1
 *          
 *        삼항연산자: 조건연산자 ?:
 *        (조건)? 값1:값2
 *        -----
 *         true => 값1
 *         false => 값2 ==> 페이징
 * 
 */
//산술연산자
//정수 3개 입력을 받아서 총점, 평균
import java.util.Scanner; //Scanner 클래스를 가지고 옴
//c=> include
//c# => using
//javascript => import
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math; 
		int total;
		double avg;
		//선언(메모리 저장하는 공간만 만듬)
		//메모리 공간에 값을 첨부 => 변수의 초기화
		Scanner scan=new Scanner(System.in);
		//                       --------- 키보드 입력
		System.out.println("국어, 영어, 수학 점수 입력(90 90 90): ");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		//활용할 수 있음
		//new => 메모리에 저장(클래스)
		//연산처리
		total=kor+eng+math;
		avg=total/3.0;
		//결과 출력
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println();
		System.out.print(avg>=90 && avg<=100? "A학점" : "");
		System.out.print(avg>=80 && avg<90? "B학점" : "");
		System.out.print(avg>=70 && avg<80? "C학점" : "");
		System.out.print(avg>=60 && avg<70? "D학점" : "");
		System.out.print(avg>=50 && avg<60? "E학점" : "");
		System.out.println(avg<50? "F학점" : "");

	}

}
