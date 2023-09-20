
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3;i<=4464;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("3~4464의 짝수 합: " + sum);
	}

}
