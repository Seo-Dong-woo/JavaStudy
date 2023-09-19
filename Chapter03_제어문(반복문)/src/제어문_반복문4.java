// 1~100 => 루프 변수
// 총합, 짝수 합, 홀수 합 ==> 누적 변수
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+i
			// System.out.println("sum=" + sum + ", i=" + i);
			if(i%2==0)
				even+=i; // 짝수 누적
			else
				odd+=i; // 홀수 누적
		}
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
		System.out.println("총합: " + sum);
	}

}
