import java.util.Arrays;

public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr)
		{
			if(i%3==0)
				System.out.print(i + " ");
	}

}
