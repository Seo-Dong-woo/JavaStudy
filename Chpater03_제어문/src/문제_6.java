/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 */
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=' ';
		int a=(int)(Math.random()*2);
		
		if(a==0)
			c=(char)((Math.random()*26)+65); // 대문자
		if(a==1)
			c=(char)((Math.random()*26)+97); // 소문자
		
		// 대소문자 확인
		if(c>='A' && c<='Z')
			System.out.println(c + "는(은) 대문자입니다");
		if(c>='a' && c<='z')
			System.out.println(c + "는(은) 소문자입니다");
	}

}
