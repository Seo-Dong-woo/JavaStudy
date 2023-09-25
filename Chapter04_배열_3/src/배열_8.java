import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt();
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		System.out.print("일 입력: ");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance(); // 메모리 할당 => 싱글턴(한 개만 설정)
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // month는 0번부터 저장하므로 -1 해야함, 1월=0 2월=1
		cal.set(Calendar.DATE, day);
		
		char[] strWeek= {'일', '월', '화', '수', '목', '금', '토'};
		int week=cal.get(Calendar.DAY_OF_WEEK); // 요일 읽기, week는 1번부터 저장하므로 -1, 일요일=1 월요일=2
		System.out.println(year + "년도 " + month + "월 " + day + "일은 " + strWeek[week-1] + "요일입니다");
	}

}
