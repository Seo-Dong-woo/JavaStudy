import java.util.Arrays;

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[5];
		int[] rank=new int[5];
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("국어 점수 출력");
		System.out.println(Arrays.toString(kor));
		
		// 등수
		for(int i=0;i<rank.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++;
				}
			}
		}
		// 결과 출력
		for(int i=0;i<kor.length;i++)
		{
			System.out.println(kor[i] + " " + rank[i]);
		}
	}

}
