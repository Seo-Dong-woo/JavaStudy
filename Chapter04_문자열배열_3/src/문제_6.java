import java.util.Arrays;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int total=0;
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			total+=arr[i];
			avg=total/10.0;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
	}

}
