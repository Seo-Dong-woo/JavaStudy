/*
 *   => 자바 기본 문법
 *      ----------
 *       데이터형(메모리 크기)
 *        기본형
 *        참조형 => 클래스/배열
 *       클래스
 *        = 데이터만 모아서 관리 => 변수
 *          --------------
 *           => 초기화
 *              = 명시적 초기화
 *              = 초기화 블록
 *              = 생성자 ==> 가장 많이 사용
 *        = 메소드만 모아서 관리
 *        
 *        1) 클래스의 구성
 *           class ClassName
 *           {
 *               --------------
 *                데이터 저장 공간 => 멤버변수 => 프로그램 종료시까지 유지
 *                                      => 다른 클래스에서도 사용 가능
 *                인스턴스 변수 => new를 이용해서 메모리에 저장
 *                             메모리 공간 따로 생성 됨
 *                 데이터형 변수명;
 *                공유 변수 => 컴파일러에 의해 자동 생성
 *                          메모리 공간을 공용으로 한 개만 사용
 *                 staic 데이터형 변수명;
 *               --------------
 *                생성자 => 변수에 대한 초기화
 *                        *** 클래스 영역에서는 선언만 가능 ***
 *                        = 특징
 *                          클래스명과 동일
 *                          리턴형이 없음
 *                          여러 개 사용 가능(오버로딩)
 *                          
 *                          *** 오버로딩 ***
 *                          => 중복 함수 정의
 *                          => new, add
 *                          => 메소드명 동일
 *                          => 매개변수의 개수나 데이터형이 다름
 *                          => 리턴형은 관계 없음
 *                        A() => ()
 *                        A(int a, int b) => A(int, int)(X)-----------|
 *                        A(String s, double d) => A(Stirng, double)  |- 동일
 *                        A(int c, int d) => A(int, int)(X)-----------|
 *                        *** void도 리턴형임 ***
 *                기타
 *                  생성자를 사용하지 않고 초기화하는 방법
 *                  => 인스턴스 블록
 *                     {
 *                         구현 => 변수의 초기화
 *                     }
 *                     
 *                  => 정적 블록
 *                     static
 *                     {
 *                         구현 => static에 대한 초기화
 *                     }
 *                     
 *                ex)
 *                    class A
 *                    {
 *                        int[] arr=new int[5];
 *                        
 *                        A()
 *                        {
 *                            
 *                        }
 *                    }
 *                    A a=new A();
 *                    
 *                    class A
 *                    {
 *                        static int[] arr=new int[5];
 *                        
 *                        static
 *                        {
 *                            초기화 => 자동
 *                        }
 *                    }
 *                    A.arr
 *               -------------
 *                멤버 메소드
 *                 = static 메소드 => 메모리 한 개만 생성
 *                   static 리턴형 메소드(매개변수)
 *                   {
 *                   
 *                   }
 *                 = 인스턴스 메소드 => 메소드별 메모리 따로 생성
 *                   리턴형 메소드(매개변수)
 *                   {
 *                   
 *                   }
 *           }
 */
// 생성자 => 오라클 연동(데이터가 저장된 장소)
// 윈도우 초기화 => 시작과 레이아웃 처리
// 서버 연결, 서버 구동
/*
 *   메소드: 인스턴스 메소드 => new를 이용해 메모리에 저장할 때마다 생성
 *         ----------- 객체 생성마다 => 다로 작동
 *         호출 => 객체명.메소드()
 *         ------------------
 *   형식)
 *       리턴형 메소드명(매개변수) => 선언부
 *       {
 *           구현부
 *       }
 *       
 *       리턴형 => 요청에 대한 결과값(한 개만 사용 가능)
 *               => 여러 개인 경우: 클래스/배열
 *               => 리턴형이 없는 경우: void
 *         | 기본형, 배열, 클래스
 *       메소드명 => 알파벳이나 한글로 시작
 *                숫자 사용 가능(첫 자로 사용 금지)
 *                키워드 사용 불가
 *                ---- 클래스명, 메소드명은 키워드가 아님
 *                공백이 있으면 안됨
 *                특수문자 => (_, $)
 *                약속) 소문자로 시작, 두 번째 단어의 첫 자는 대문자
 *                *** 소프트웨어 이행 ***
 *                    ---------- 한글에 문제가 생김
 *                               가급적이면 영문 사용 권장
 *                    윈도우 개발 => 서버 리눅스 사용
 *                    Full Stack   AWS
 *                    => STS: 11
 *                    => tomcat => 9 => 11
 *                       spring-boot => 2.7.4 => 3
 *                       javax =>
 *                    -----------------------------
 *       매개변수: 사용자가 보내준 값
 *              ------------- 여러 개 있을 수 있음(가급적이면 3개 이상 금지)
 *              3개 이상일 때는 클래스/배열 이용
 *              
 *       void 메소드명()
 *       {
 *           --- 구현
 *           return; => 생략 가능 => 컴파일러가 자동 추가
 *           ------ 메소드 종료: 원하는 위치에 설정 가능
 *       }
 *       
 *       void 메소드명()
 *       {
 *           if()
 *               reuturn;
 *               // 코드 사용이 불가
 *           else
 *               return;
 *       }
 *       
 *       int 메소드명()
 *       ---
 *       {
 *           return 정수값;
 *                  ---- 일치
 *       }
 *       
 *       int[] 메소드명()
 *       {
 *           int[] arr=new int[10];
 *           return arr;
 *       }
 *       
 *       class A
 *       
 *       A 메소드명()
 *       {
 *           A a=new A();
 *           return a;
 *       }
 *       
 *       *** 메소드는 호출 시마다 처음부터 return이 있는 곳까지 실행 => 호출된 위치로 다시 돌아감 ***
 *       
 *       ex)
 *           void aaa()
 *           {
 *               1       --- 3, 8
 *               2       --- 4, 9
 *               3       --- 5, 10
 *               return;
 *           }
 *           
 *           void main()
 *           {
 *               4       --- 1
 *               5       --- 2
 *               aaa();
 *               6       --- 6
 *               7       --- 7
 *               aaa();
 *               8       --- 11
 *               9       --- 12
 *               return;
 *           }
 *           
 *           반복 제거, 재사용, 유지보수 용이
 *           객체지향 프로그램 => 메소드
 *           
 *       프로그램 기획
 *         벤치마킹/요구사항 분석
 *         --------------- 메소드/변수
 *         
 *         ex)
 *             숫자 야구게임
 *             멤버변수
 *               com[] user[] s
 *             컴퓨터 난수 발생 => 3개 => com[]
 *             사용자 입력 => 3개 => user[]
 *             비교 => com[] user[]
 *             힌트 => user[] s, b
 *             종료 => s
 */
import java.util.*;

class User
{
	int []arr=new int[5];
	// 5개의 정수 난수발생 => 정렬하는 프로그램 제작 => 출력
	User()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
	}
	void sort()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	void print()
	{
		System.out.println("정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.sort();
		user.print();
	}

}
