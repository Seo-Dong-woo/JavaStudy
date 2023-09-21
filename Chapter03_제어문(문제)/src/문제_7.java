
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		while(true)
		{
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			if(num1==num2)
			{
				System.out.println("두 개의 주사위 값이 같습니다");
				System.out.println("첫 번째 주사위 값: " + num1);
				System.out.println("두 번째 주사위 값: " + num2);
				System.out.println("주사위를 던진 횟수: " + count);
				break;
			}
			
			else
			{
				System.out.println("두 개의 주사위 값이 같지 않습니다");
				System.out.println("첫 번째 주사위 값: " + num1);
				System.out.println("두 번째 주사위 값: " + num2);
				System.out.println("===================");
				count++;
			}
			
		}
		
	}

}
