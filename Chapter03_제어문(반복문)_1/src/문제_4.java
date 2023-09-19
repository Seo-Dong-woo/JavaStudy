import java.util.Scanner;
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("1~" + num + "까지의 합: " + sum);
	}

}
