package com.sist.exception;
// 예외처리의 기본(267page)
/*
 *   가장 많이 사용됨 => 예외복구
 *   try~catch~finally
 *   1) 형식
 *      try
 *      {
 *          에러없이 실행이 가능한 소스
 *          // main ==> 정상 수행하는 문장 => 개발자 실수, 사용자의 입력
 *      }catch(Exception e)
 *      {
 *          예외복구 ==> 다시 입력 요청 => 다음 문장으로 이동
 *      } ==> catch는 예상되는 예외를 따로 처리 => 여러 개 사용 가능
 *      
 *   2) 동작 흐름
 *   
 *      문장 1
 *      문장 2
 *      try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *      {
 *          문장 3
 *          문장 4
 *          문장 5
 *      }catch(Exception e)
 *      {
 *          문장 6
 *      }
 *      문장 7
 *      문장 8
 *      
 *      에러가 발생하지 않았을 경우
 *      => 문장 1 => 문장 2 => 문장 3 => 문장 4 => 문장 5 => 문장 7 => 문장 8
 *      ------------------------------------------------------------
 *      문장 1
 *      문장 2
 *      try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *      {
 *          문장 3
 *          문장 4 => int a=10/0; => 에러 발생 ==> catch로 이동
 *          문장 5
 *      }catch(Exception e)
 *      {
 *          문장 6
 *      }
 *      문장 7
 *      문장 8
 *      
 *      => 문장 1 => 문장 2 => 문장 3 => 문장 6 => 문장 7 => 문장 8
 *      -------------------------------------------------------------
 *      문장 1
 *      문장 2 ==> 에러 발생
 *      try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *      {
 *          문장 3
 *          문장 4
 *          문장 5
 *      }catch(Exception e)
 *      {
 *          문장 6
 *      }
 *      문장 7
 *      문장 8
 *      
 *      => 문장 1 => 프로그램 종료 ==> 비정상 종료
 *      
 *      try ==> 정상으로 수행하는 문장
 *              => 개발자 실수, 사용자 입력값: 에러 발생
 *                                      ------
 *                                        | 종료 => 종료 방지를 위해
 *      *** 수행 문장에 이상이 없는 경우(에러가 없는 경우) ***
 *          try{소스}
 *      *** 수행 문장에 이상이 있는 경우(에러가 있는 경우) ***
 *                  --------- 무시 => catch로 이동
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2");
		try
		{
			System.out.println("문장3");
			System.out.println(10/0);
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8==정상종료");
	}

}
