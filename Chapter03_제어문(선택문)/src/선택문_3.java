// 12, 1, 2 => 겨울
// 3, 4, 5 => 봄
// 6, 7, 8 => 여름
// 9, 10, 11 => 가을
// case 값이 동일할 수 없음. 실수 사용할 수 없음
// case 값:
// case 문장을 수행하고 종료시 반드시 break;
// case에 사용하는 순서 상관 없음
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 임의로 추출
		int month=(int)(Math.random()*12)+1;
		System.out.println("입력된 달: " + month);
		
		switch(month)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
		case 3:
		case 4:
		case 5: // (if month==3 || month==4 || month==5)
			System.out.println("봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다");
			break;
		}

	}

}
