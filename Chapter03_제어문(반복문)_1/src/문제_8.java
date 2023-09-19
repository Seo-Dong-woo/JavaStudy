
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("7의 배수 갯수: " + count);
		System.out.println("7의 배수 합: " + sum);
	}

}
