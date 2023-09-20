/*
 *   while
 *   -----
 *     => 10개의 난수
 *     => 최댓값 최솟값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1, min=100;
		int i=1;
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+ " ");
			if(max<rand)
				max=rand;
			if(min>rand)
				min=rand;
			i++;
		}
		System.out.println("\n최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

}
