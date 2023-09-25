import java.util.Scanner;
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력: ");
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		System.out.println(arr);

	}

}
