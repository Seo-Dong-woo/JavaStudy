import java.util.*;

public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==3)
				continue; // 인덱스가 3인 값 제외
			System.out.print(arr[i] + " ");
		}
	}

}
