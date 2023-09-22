// 문자 => 10개를 저장하는 배열 생성 => 초기화 => 출력
// 실수 배열 ==> double[] arr={10, 20, 30, 40, 50} => 10.0, 20.0...
// double[] arr=new double[10] ==> 0.0으로 초기화
// char[] arr=new char[10] ==> '0'
// boolean[] arr=new boolean[10] ==> false
// String[] arr=new String[10] ==> null(모든 클래스는 null)
/*
 *   int[] arr=new int[3];
 *   --------------------
 *      0   |  0  |  0   
 *   --------------------
 *   arr[0]  arr[1] arr[2]
 */
import java.util.Arrays;
public class 배열_생성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		// 초기화
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26) +65);
		}
		System.out.println("======= for-each: 실제 저장된 값을 읽어옴 =======");
		for(char c:alpha) // for-each문 실제 저장된 값을 하나씩 읽어옴
		{
			System.out.print(c + " ");
		}
		System.out.println("\n======= for(일반): index사용 =======");
		// 값을 변경, 초기화


		for(int i=0;i<alpha.length;i++)
		{
			System.out.print(alpha[i] + " ");
		}
		System.out.println("\n======= API =======");
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.println(alpha[i] + " ");
		}
	}

}
