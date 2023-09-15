/*
 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 */
import java.util.Scanner;
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("세 개의 정수 입력: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
		
		if(avg>=90 && avg<100)
			System.out.println("학점: A");
		if(avg>=80 && avg<90)
			System.out.println("학점: B");
		if(avg>=70 && avg<80)
			System.out.println("학점: C");
		if(avg>=60 && avg<70)
			System.out.println("학점: D");
		if(avg<60)
			System.out.println("학점: F");

	}

}
