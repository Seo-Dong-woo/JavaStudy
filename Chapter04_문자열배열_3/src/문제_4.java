import java.util.*;

public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; 
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("인덱스가 1인 곳의 값: " + arr[1]);
		
		// 문제_5
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int index=0;
		for(int i=0;i<arr.length;i++)
			if(max==arr[i])
			{
				index=i;
				break;
			}
		System.out.println("최댓값의 인덱스: " + index);
		
	}

}
