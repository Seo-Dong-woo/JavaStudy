import java.util.Arrays;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		// 빈도수
		int[] count=new int[10];
		for(int i:arr)
		{
			count[i]++; // 인덱스 번호(0~9)
		}
		
		for(int i=0;i<count.length;i++)
		{
			System.out.printf("count[%d]=%d\n", i, count[i]);
		}
	}

}
