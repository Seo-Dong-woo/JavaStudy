// equals(==) 대소문자 구분 => id, password 
// equalsIgnoreCase: 대소문자 구분 안함 => 검색
import java.util.Scanner;
public class 문자열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin", MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력: " );
		String id=scan.next();
		System.out.print("비밀번호 입력: ");
		String pwd=scan.next();
		
		if(id.equalsIgnoreCase(id) && pwd.equals(MPWD))
		{
			System.out.println(id + "님 로그인되었습니다");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다");
		}
		
	}

}
