import java.util.*;

public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 인덱스 입력: ");
		int index1=scan.nextInt();
		System.out.print("두번째 인덱스 입력: ");
		int index2=scan.nextInt();
		
		// 교환 => 임시변수
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
