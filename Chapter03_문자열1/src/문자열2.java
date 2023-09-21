/*
 *   문자열
 *   ---- String 기능이 많음
 *   1. 문자 개수 확인: length()
 *   2. 검색
 *      ---
 *      startsWith: 시작하는 문자열이 같은 경우
 *      endsWith: 끝나는 문자열이 동일 => cookie
 *      contains: 포함된 문자가 있는지 ==> 추천
 *      equals: 같은 문자열인지 ==> id, password ==> 대소문자 구분
 *   3. 문자열 제어
 *      = 변경: replace(), repalceAll()
 *             replace('a', 'b') => a를 b로 바꿈
 *             replaceAll("[가=힣]","") => 한글 전체를 공백으로 바꿈
 *                        "[0-9A-Za-z]", "") => 숫자와 알파벳을 공백으로 바꿈
 *      = 문자 자르기: substring(1)
 *                  "Hello Java" => "ello Java"
 *                  substring(4,7) => 4, 5, 6번 문자열만 출력 ***7은 제외***
 *                  "Hello Java" => "o J"
 *      = 대문자: toUpperCase
 *      = 소문자: toLowerCase
 *    4. 모든 데이터형을 문자열로 변경
 *       = valueOf(1) => "1" ==> 윈도우, 웹
 *    5. 분리: split() => Spring[]
 *       charAt(index)
 *       "Hello Java" => charAt(4) => 'o'
 *       ==> index 번호가 자바는 0부터 시작, 오라클은 1부터 시작
 *       
 *    String => 일반형 =>
 *    ----------------- Call By Value/Call By Reference
 *                           |        => 배열/클래스
 *                         String
 *    형식)
 *        String s="";
 *        String s=new String("")
 *      
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
		System.out.println(s.length()); // 문자 총 개수 => 공백 포함
		if(s.startsWith("Hello")); // 서제스트
			System.out.println("포함됨");
			
	}

}
