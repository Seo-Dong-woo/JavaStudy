// 4의 배수가 아닌 수의 개수와 합
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("갯수: " + count);
		System.out.println("합: " + sum);
	}

}
