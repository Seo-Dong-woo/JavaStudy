
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// avg변수를 설정 안하고 System.out.printf("\n평균: %.1f\n, sum10.0);가능
		int sum=0;
		double avg=0;
		for(int i=1;i<=10;i++)
		{
			int rand=(int)(Math.random()*10)+1;
			System.out.print(rand + " ");
			sum+=rand;
			avg=sum/10.0;
		}
		System.out.print("\n평균: ");
		System.out.println(avg);
	}

}
