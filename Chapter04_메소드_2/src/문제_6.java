import java.util.Scanner;

public class 문제_6 {
	static void Reverse(String msg)
	{
		for(int i=msg.length()-1;i>=0;i--)
		{
			char c=msg.charAt(i);
			System.out.print(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse("Hello");
	}

}
