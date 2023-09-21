// 문자열을 입력 받아서 A, a가 몇 개인지 확인
import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String data=scan.next();
		
		int count=0; // A, a 개수의 합
		// charAt(); => 문자를 한 개씩 자르는 경우 사용
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c=='A' || c=='a')
				count++;
		}
		System.out.println("A|a의 개수는 " + count + "개입니다");
		
	}

}
