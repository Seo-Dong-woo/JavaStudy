// 형변환 연산자
/*
 *   (int)값
 *   
 *   ==> 크기
 *   byte < char < int < long < float < double 
 * 
 */
public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		double d=(double)a;
		// 생략 가능
		char c=(char)a;
		// 특수한 경우 => 생략 가능(실제 값 대입)
		// char c=65
		// 연산처리가 되면 생략 불가
		System.out.println("a=" + a);
		System.out.println("a=" + d);
		System.out.println("a=" + c);
		c='0';
		System.out.println("c=" + (int)c);
		//'A'=65, 'a'=97, '0'=48

	}

}
