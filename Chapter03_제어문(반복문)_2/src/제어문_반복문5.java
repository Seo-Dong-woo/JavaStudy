/*
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   A
 *   BC
 *   DEF
 *   GHIJ
 *   
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}*/
		
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
