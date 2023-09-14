/*
 *   증감연산자
 *   => 1 증가 or 1 감소
 *        ++       --
 *   = 전치연산자
 *   ++a, --a
 *   = 후치연산자
 *   a++, a--
 *   
 *   ex) int a=10, b=++a; ==> a=11, b=11;
 *       int a=10, b=a++; ==> a=11, b=10;
 * 
 * 
 *       int a=10; => a=13
 *       int b=++a + ++a + a++ ==> a값은 증가된 수만큼 따라서 13
 *              11   12    12
 *              
 *       int a=10; => a=13
 *       int b=a++ + a++ + ++a;
 *              10    11   13
 *              
 *       int a=10; => a=14
 *       int b= ++a + a++ + ++a + a++
 *               11   11     13    13
 *               
 *       int a=10; => a=14
 *       int b=a++ + a++ + a++ + a++
 *              10    11    12    13
 *              
 *       int a=10; => a=10
 *       int b=a-- + a++ + --a + a++
 *             10     9     9     9
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a=" + a + " b=" + b);

	}

}
  
