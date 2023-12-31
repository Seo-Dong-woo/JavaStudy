// 년 월 일을 입력 받아서 요일을 출력
import java.util.Scanner;

public class 메소드_문제_5 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg + " 입력: ");
		int num=scan.nextInt();
		
		return num;
	}
	static String check(int year, int month, int day)
	{
		// 전년도까지의 총 일수
				int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
				
				// 전 달까지의 총 일수
				int[] lastday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				
				if((year%4==0 && year%100!=0) || (year%400==0))
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				
				// ---------------- + +day
				total+=day;
				
				// 총 일수%7 => 요일
				int week=total%7;
				
				String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
				
				return strWeek[week];
	}
	static void print(int year, int month, int day, String week)
	{
		System.out.println(year + "년도 " + month + "월 " + day + "일은 " + week + "요일 입니다");
	}
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");
		int day=userInput("일");
		String week=check(year, month, day);
		print(year, month, day, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 입력
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt();
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		System.out.print("일 입력: ");
		int day=scan.nextInt();
		
		// 요일
		// 전년도까지의 총 일수
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// 전 달까지의 총 일수
		int[] lastday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		// ---------------- + +day
		total+=day;
		
		// 총 일수%7 => 요일
		int week=total%7;
		
		String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year + "년도 " + month + "월 " + day + "일은 " + strWeek[week] + "요일 입니다");*/
	}

}
