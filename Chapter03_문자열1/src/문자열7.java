// startsWith, endsWith, contains => 검색기, 자동완성기
import java.util.Scanner;
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND Ajax",
				"Spring AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String findData=scan.nextLine(); // next()는 공백앞에서 자름, nextLine()은 문자열 전체를 가져옴
		System.out.println(findData);
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData))
			//if(data[i].endsWith(findData))
			//if(data[i].startsWith(findData))
			{
				try
				{
					Thread.sleep(1000);
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
