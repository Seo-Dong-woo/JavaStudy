import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("농구공 갯수 :");
		int a=scan.nextInt();
		System.out.print("필요한 상자의 수 : ");
		System.out.println(a%5==0? a/5 : a/5+1);
		
		System.out.println("필요한 상자의 수 : " + (int)(Math.ceil(a/5.0))); // 올림 함수
	}

}
