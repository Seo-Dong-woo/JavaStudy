
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			total=total+arr[i];
		}
		for(int j:arr)
		{
			System.out.print(j + " ");
		}
		System.out.println("평균: " + total/3.0);
	}

}
