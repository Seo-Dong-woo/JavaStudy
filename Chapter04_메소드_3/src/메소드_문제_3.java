// 1. 국어, 영어, 수학 점수 입력 => 총점, 평균
import java.util.Scanner;

public class 메소드_문제_3 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg + " 점수: ");
		int num=scan.nextInt();
		
		return num; 
	}
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static void print(int kor, int eng, int math, int total, double avg, char c)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n", kor, eng, math, total, avg, c);
	}
	static char score(int avg)
	{
		char c='A';
		switch(avg)
		{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
		}
		return c;
	}
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor, eng, math);
		double avg=avg(total);
		char c=score((int)(avg/10));
		print(kor, eng, math, total, avg, c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수: ");
		int kor=scan.nextInt();
		System.out.print("영어 점수: ");
		int eng=scan.nextInt();
		System.out.print("수학 점수: ");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n", kor, eng, math, total, avg);
		
		
	}

}
