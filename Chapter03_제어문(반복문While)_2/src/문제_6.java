// 2*3*4*5
import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("시작 값: ");
		int num1=scan.nextInt();
		System.out.print("끝 값: ");
		int num2=scan.nextInt();
		
		int a=1;
		
		for(int i=num1;i<=num2;i++)
		{
			a*=i;
		}
		System.out.println(num1 + "~" + num2 + "까지의 곱: " + a);
	}

}

