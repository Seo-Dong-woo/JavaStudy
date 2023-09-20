
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int two=0, thr=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
				two+=i;
			if(i%3==0)
				thr+=i;
		}
		System.out.println("0~12의 2의 배수 합: " + two);
		System.out.println("0~12의 3의 배수 합: "+ thr);
	}

}
