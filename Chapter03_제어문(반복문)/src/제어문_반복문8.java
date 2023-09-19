// 100번의 알파벳 난수 발생 ==> A, B, C의 개수
public class 제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		// 개수 ++, 누적 +=
		for(int i=1;i<=100;i++)
		{
			char ch=(char)((Math.random()*26)+65); // A~Z 난수
			System.out.println(ch + " ");
			if(ch=='A')
				a++;
			else if(ch=='B')
				b++;
			else if(ch=='C')
				c++;
		}
		System.out.println("======= 결과값 =======");
		System.out.println("A의 개수: " + a);
		System.out.println("B의 개수: " + b);
		System.out.println("C의 개수: " + c);
	}

}
