import java.util.Scanner;
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==2 || i==4 || i==6)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
