package com.sist.exception;
/*
 *   throws => 라이브러리에서 제공 => 결정(try~catch)
 *   => 복잡한 소스가 있는 경우 => 소스 추가 할 때 throws를 가끔 사용
 *   => 예외처리 클래스
 *      Thorwable/Exception
 *      --------- 예외의 최상위 클래스
 *      => 자동완성기
 *   => 예외처리: 수정이 가능한 에러
 *        => 네트워크: IP, Web Site
 *        => IO: 파일 경로명 / 파일명
 *        => SQL: 오라클 문장(SELECT, INSERT, UPDATE, DELETE)
 *           => DML(데이터 조작)
 *   => throw
 *      => 임의로 발생 => 테스트(견고한 프로그램)
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			if(a%2==0)
			{
				throw new Exception(a + "는 홀수가 아닙니다");
				// 밑에 소스 코딩을 할 수 없음
				// throw => 사용자 정의 예외처리
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
