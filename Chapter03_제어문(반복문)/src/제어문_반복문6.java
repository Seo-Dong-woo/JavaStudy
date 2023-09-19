// 1~100 5의 배수의 합과 개수
public class 제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fif=0, count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				fif+=i;
				count++;
			}
			
		}
		System.out.println("1~100까지 5의 배수의 합: " + fif);
		System.out.println("1~100까지 5의 배수의 개수: " + count);
	}

}
