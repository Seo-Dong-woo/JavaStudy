import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("최댓값: " + max);
		
	}

}
