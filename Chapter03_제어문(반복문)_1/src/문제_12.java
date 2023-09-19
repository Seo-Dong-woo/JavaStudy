
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sev=0, nin=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				sev+=i;
			}
			if(i%9==0)
			{
				nin+=i;
			}
		}
		System.out.println("7의 배수: " + sev);
		System.out.println("9의 배수: " + nin);
		System.out.println("7의 배수 + 9의 배수: " + (sev+nin));
	}

}
