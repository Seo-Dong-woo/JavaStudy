/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자
 */
import java.util.Scanner;
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("세 개의 정수 입력: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("MAX: " + max);
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("MIN: " + min);
		
		System.out.println("합계: " + (num1+num2+num3));
		System.out.printf("평균: %.2f\n", (num1+num2+num3)/3.0);

	}

}
