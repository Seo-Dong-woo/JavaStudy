/*
 *   1. 반복문 => 중복 제거
 *              ------ 메소드
 *              
 *       1) 데이터 저장
 *          변수(한 개만 저장 가능) => 묶어서 사용
 *          
 *          국어, 영어, 수학, 총점, 평균
 *          --------------------- 배열 ==> 클래스
 *       2) 명령문 => 묶어서 사용
 *          ---------------- 메소드
 *                           ----------------+ 클래스
 *   2. 반복문의 종류
 *       1) for: 횟수가 지정된 경우에 주로 사용
                 => 화면 출력(영화 목록, 맛집 목록)
            일반 for문/향상된 for문(배열, 컬렉션)
              |
            => 2차 for문 까지(웹에서 아주 가끔 등장) => 코딩테스트
         
         2) while: 횟수가 없는 경우에 주로 사용
                   => 무한루프(파일 읽기, 데이터베이스)
                   
         3) do~while: 반드시 한 번 이상을 수행(사용빈도가 거의 없음)
         ----------------------------------------------
             | 규정/문법사항은 아니다
             ------------------
         4) 제어(다시 시작, 종료)
            ----------------
              break; => 반복문 중단
              continue; => 특정 부분 제외
         ------------------------------
         for: 1) 형식  2) 동작(순서)  3) 패턴
              for(초기값;조건식;증감식)
              {
              	반복실행문장
              }
              
              동작       | false면 종료
                        |     -------
                   1    2 <== |      |
              for(초기값;조건식;증감식)    |
              {         | true       |
                        |            |
                  	반복실행문장 --------
              }
              
 */
import java.io.*;
public class 제어문_반복문1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		/*String s="ABCDEFGHIJKLMNOP";
		String[] alpha=s.split("");
		for(int i=0;i<alpha.length;i++)
		{
			System.out.print(alpha[i]); 
		}
		System.out.println();
		for(String ss:alpha)
		{
			System.out.print(ss);
		}*/
		
		FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter03_제어문(반복문)_1\\src\\제어문_반복문1.java");
		int i=0;
		while((i=fr.read())!=-1) // EOF
		{
			System.out.print((char)i);
		}
 	}

}
