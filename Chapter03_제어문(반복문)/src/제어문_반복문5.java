// 1~100까지 => 3의 배수의 합, 5의 배수의 합, 7의 배수의 합 => 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thr=0, fif=0, sev=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				thr+=i;
			if(i%5==0)
				fif+=i;
			if(i%7==0)
				sev+=i;
		}
		System.out.println("1~100까지 3의 배수의 합: " + thr);
		System.out.println("1~100까지 5의 배수의 합: " + fif);
		System.out.println("1~100까지 7의 배수의 합: " + sev);
	}

}
