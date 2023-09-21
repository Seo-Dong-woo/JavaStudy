
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sum+=i;
				i++;
			}
		}
		System.out.println("1~100까지의 짝수 합: " + sum);
	}

}
