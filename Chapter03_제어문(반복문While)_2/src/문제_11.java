import java.util.Scanner;
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i + "번째 정수 입력: ");
			int num=scan.nextInt();
			
			if(num%2==0)
				count++;
				
		}
		System.out.println("짝수의 개수: " + count);
	}

}
