// substring() => 문자를 자른다
/*
 *   "Hello Java"
 *    0123456789 
 *    
 *    substring(6) => "Java" ==> 6번부터 잘라옴
 *    substring(0, 5) => "Hello"
 *                 -- 마지막 인덱스는 제외 0~4까지 잘라옴
 */                
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		//String s1=s.substring(0, 5);
		//String s1=s.substring(6);
		//System.out.println(s1);
		//String addr=address.substring(0, address.indexOf("지번"));
		//String addr2=address.substring(address.indexOf("지번")+3);
		//System.out.println(addr3);
		
		//int a=address.lastIndexOf(" ");
		//String addr=address.substring(a-3, a);
		//System.out.println(addr);
		
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(s);
	}

}
