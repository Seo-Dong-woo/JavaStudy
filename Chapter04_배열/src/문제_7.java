import java.util.Scanner;
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int[] arr=new int[10];
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			total=total+arr[i];
		}
		System.out.print("총점: " + total);
		System.out.print("\n평균: " + total/10.0);
	}

}
