
public class 문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0, odd=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			if(i%2!=0)
			{
				odd+=i;
			}
		}
		System.out.println("짝수 합: " + even);
		System.out.println("홀수 합: " + odd);
	}

}
