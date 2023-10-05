// 정수 한 개를 입력받아 짝수 or 홀수 출력 
import java.util.Scanner;

public class 메소드_문제_1 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		
		return num;
	}
	static String check(int num)
	{
		String res="";
		if(num%2==0)
			res=num+"는(은) 짝수입니다";
		else
			res=num+"는(은) 홀수입니다";
		
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int num=userInput();
		String res=check(num);
		print(res);	
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		/*Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		
		String res="";
		if(num%2==0)
			res=num+"는(은) 짝수입니다";
		else
			res=num+"는(은) 홀수입니다";
			
		System.out.println(res);*/
	}

}
