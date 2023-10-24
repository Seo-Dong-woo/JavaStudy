package com.sist.music;
// Music을 제어하는 프로그램
import java.io.*;
import java.util.*;

public class MusicManager {
	private static Music[] musics=new Music[48];
	// 접속하는 모든 유저에게 공유 => 목록 => static
	// 초기화 ==> 클래스 블록에서는 초기화 불가
	/*
	 *   1) 인스턴스 블록: 인스턴스, static
	 *   2) static 블록: static => 인스턴스를 초기화(객체 생성)
	 *   3) 생성자: 인스턴스, static
	 *   
	 *   예외처리 종류(예외: java.io, java.net, java.sql)
	 *                           ------------------
	 *                                   | 웹(네트워크)
	 *     = 예외 복구
	 *       try
	 *       {
	 *           => 정상 수행, 예외가 발생되는 소스
	 *       }catch(예외 클래스)
	 *       {
	 *           => 예외 발생 시 복구
	 *           => 예외의 위치
	 *              => getMessage()
	 *              => printStackTrace()
	 *              => 디버깅 확인 ==> 수정
	 *       }
	 *       
	 *     = 예외 회피
	 *       => 라이브러리에서 많이 사용 => 개발자
	 *       => 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작
	 *          method() throws 예외...(순서 없음)
	 *       => 처리 방법은 throws 이용, try~catch
	 *       
	 *     = 임의 발생
	 *       => throw new 예외처리생성자()
	 *     
	 *     = 사용자 정의 예외처리
	 *       => class MyException extends Exception
	 *          {
	 *          } 
	 */
	public MusicManager()
	{
		/*
		 *   try(FileReader fr=new FileReader();)
		 *   {
		 *   }catch(Exception ex)
		 */
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt"); // FileNotFoundException
			int i=0;
			String music_data="";
			while((i=fr.read())!=-1) // EOF
			{
				music_data+=(char)i;
			}
			// 1.
			String[] mds=music_data.split("\n");
			i=0;
			for(String s:mds)
			{
				try
				{
				//System.out.println(s);
				StringTokenizer st=new StringTokenizer(s, "|");
				musics[i]=new Music();
				musics[i].setRank(Integer.parseInt(st.nextToken())); // nextToken은 String이므로 형변환 해야함
				musics[i].setTitle(st.nextToken());
				musics[i].setSinger(st.nextToken());
				musics[i].setAlbum(st.nextToken());
				musics[i].setKey(st.nextToken());
				i++;
				}catch(Exception ex) {}
			}
		}catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}finally
		{
			// 파일 닫기
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	
	}
	public Music[] musicAllData()
	{
		return musics;
	}

}
