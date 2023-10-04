// 리턴형
public class 문제_2 {
	static int sum()
	{
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		return hap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=sum();
		System.out.println("hap: " + sum());
	}

}
