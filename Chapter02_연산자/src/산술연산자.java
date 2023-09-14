/*
 *  가장 기본이 되는 연산자 => 산술연산자(38page)
 *  
 *  산술연산자: +, -, *, /, %(mod)
 *  --------- 이항연산자(피연산자 2개)
 * 
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +(산술)
		// 국어, 영어, 수학 점수의 총점을 구하라
		int kor=89, eng=90, math=87;
		int total=kor + eng + math;
				
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + total);
		
		//평균 출력
		double avg=total / 3.0;
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg); // %.2f => 소수점 이하 두자리까지 출력   what is \n?
		
		System.out.println(" ");
		int a=5, b=2;
		System.out.println(a + "%" + b + "=" + (5%2));
		System.out.println(-a + "%" + b + "=" + (-5%2));
		System.out.println(a + "%" + -b + "=" + (5%-2));
		System.out.println(-a + "%" + -b + "=" + (-5%-2));
		
		System.out.println("===== 형변환 =====");
		/*
		 *   자동 형변환
		 *     작은 데이터 => 큰 데이터형
		 *   강제 형변환
		 *     큰 데이터형 => 작은 데이터형
		 *     (데이터형)값
		 *    ====================> 자동 형변환
		 *    byte < char < int < long < float < double
		 *    <==================== 강제 형변환
		 *    
		 *    자동 형변환
		 *    int a='A' => char보다 int의 데이터형이 더 크기 떄문에 int로 변환
		 *    
		 *    double d=100; => int보다 double의 데이터형이 더 크기 떄문에 double로 변환
		 *    
		 */
		
		int aa= 'A'; // 문자열 A의 값이 65
		System.out.println("aa=" + aa);
		
		double dd=100;
		System.out.println("dd=" + dd);
		
		System.out.println(100 + 10.5 + 10.5F + 'A');// 자동 형변환이 있는 경우 => 연산은 같은 데이터형끼리만 연산
		/*
		 *  'A' + 10 => 65 + 10 => 75
		 */
		
		System.out.println('A' + 'B');// char + char => int로 계산됨!!!!!!!!!!!!!!! 
		

	}

}
