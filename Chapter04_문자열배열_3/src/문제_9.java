
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[26];
		char c='A';
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c++;
		}
		
		for(char i:arr)
		{
			System.out.print(i);
		}
		
		// 문제_10
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
