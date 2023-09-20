import java.util.Scanner;
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thr=0, fiv=0;
		Scanner scan=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i + "번째 정수 입력: ");
			int num=scan.nextInt();
			
			if(num%3==0)
				thr++;
			if(num%5==0)
				fiv++;			
		}
		System.out.println("3의 배수의 개수: " + thr);
		System.out.println("3의 배수의 개수: " + fiv);

	}

}
