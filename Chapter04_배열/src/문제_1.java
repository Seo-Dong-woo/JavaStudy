import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			int num=scan.nextInt();
			arr[i]=num;
			if(num%3==0)
			{
				System.out.println(arr[i] + " ");
			}
		}

	}

}
