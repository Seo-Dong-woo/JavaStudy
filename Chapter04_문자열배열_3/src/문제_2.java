import java.util.Arrays;

public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int max=0;
		int min=100;
		
		// 초기화
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("배열 저장된 값");
		System.out.println(Arrays.toString(arr));
		
		// 최댓값, 최솟값
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

}
