/*
 *  &&(직렬연산자)  ||(병렬연산자)
 *  
 *  사용처
 *  && => 기간이나 범위 안에 포함
 *  || => 기간이나 범위가 아닌 경우
 *  
 *  사용법
 *  ==> 조건에 사용할 수 있는 연산자(부정연산자, 비교연산자)
 *  (조건) && (조건), (조건) || (조건)
 *    |       |
 *    ---------
 *        |
 *      결과값
 *      
 *   경우의 수
 *                   &&              ||
 *   true true  ==> true            true
 *   true false ==> false           true
 *   false true ==> false           true
 *   false false ==> false          false
 *   
 *   &&, ||는 효율적인 연산을 수행함
 *   ------------------------
 *   && => false면 뒤에 있는 조건은 수행 X
 *   || => true면 뒤에 있는 조건은 수행 X
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
	    int b=9;
	    
	    boolean bCheck=a<b && ++b==a; // a<b 조건이 false 이므로 ++b==a의 조건을 수행하지 않음 따라서 b는 그대로 9
	    System.out.println("bCheck=" + bCheck);
	    System.out.println("b=" + b);
	    
	    int x=10;
	    int y=20;
	    
	    boolean yCheck=(a%2==0) && (b%2!=0);
	    System.out.println("yCheck=" + yCheck);

	}

}
