package com.sist.manager;
import java.util.*;
import com.sist.vo.BookHouseVO3;
import java.io.*;
public class BookManager3 {
	
   private static ArrayList<BookHouseVO3>
        fList=new ArrayList<BookHouseVO3>();
   
   static
   {
//	   FileReader fr=null;
//	   ObjectOutputStream ois=null;
//	   FileOutputStream fis=null;
//	   try
//	   {
//		   // 정상 수행 문장 
//		   fr=new FileReader("c:\\java_data\\book.txt");
//		   String data="";
//		   int i=0;
//		   while((i=fr.read())!=-1)//-1 (EOF)
//		   {
//			   data+=(char)i;
//		   }
//		   fr.close();
//		   
//		   String[] cates=data.split("\n");
//		   for(String s:cates)
//		   {
//			   StringTokenizer st=new StringTokenizer(s,"|");
//			   
//			   BookHouseVO3 vo=new BookHouseVO3();
//			   vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//			   vo.setName(st.nextToken());
//			   vo.setAuthor(st.nextToken());
//			   vo.setPoster(st.nextToken());
//			   vo.setPubl(st.nextToken());
//			   vo.setScore(Double.parseDouble(st.nextToken()));
//			   vo.setPrice(st.nextToken());
//			   fList.add(vo);
//		   }
//		   
//		   fis=new FileOutputStream("c:\\java_data\\bc.txt");
//		   ois=new ObjectOutputStream(fis);
//		   ois.writeObject(fList);
//		   
//	   }catch(Exception ex)
//	   {
//		   // 에러 확인후 복구
//		   ex.printStackTrace();
//	   }
//	   finally
//	   {
//		   // 무조건 수행하는 문장 => 파일 닫기 , 서버 닫기
//		   try
//		   {
//			   fis.close();
//			   ois.close();
//		   }catch(Exception ex) {}
//	   }
	   
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   try
	   {
		   fis=new FileInputStream("c:\\java_data\\bc.txt");
		   ois=new ObjectInputStream(fis);
		   fList=(ArrayList<BookHouseVO3>)ois.readObject();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fis.close();
			   ois.close();
		   }catch(Exception ex) {}
	   }
   }
   public static void main(String[] args) {
	   BookManager3 fm=new BookManager3();
	   System.out.println("저장");
	   for(BookHouseVO3 vo:fList)
	   {
		   System.out.println("번호:"+vo.getFno());
		   System.out.println("제목:"+vo.getName());
		   System.out.println("작가:"+vo.getAuthor());
		   System.out.println("출판사:"+vo.getPubl());
		   System.out.println("평점:"+vo.getScore());
		   System.out.println("가격:"+vo.getPrice());
	   }
	   
   }
   public ArrayList<BookHouseVO3> BookHouseData(int no)
   {
	   ArrayList<BookHouseVO3> list=
			   new ArrayList<BookHouseVO3>();
	   int start=0;
	   int end=0;
	   if(no==1)
	   {
		   start=0;
		   end=11;
	   }
	   else if(no==2)
	   {
		   start=12;
		   end=17;
	   }
	   else if(no==3)
	   {
		   start=18;
		   end=29;
	   }
	   for(int i=start;i<=end;i++)
	   {
		   list.add(fList.get(i));
	   }
	   return list;
   }
   
   public BookHouseVO3 bookInfoData(String title)
   {
	   BookHouseVO3 vo=new BookHouseVO3();
	   for(BookHouseVO3 fvo:fList)
	   {
		   if(fvo.getName().equals(title))
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<BookHouseVO3> BookHouseListData(int fno)
   {
	   ArrayList<BookHouseVO3> list=
			   new ArrayList<BookHouseVO3>();
	   for(BookHouseVO3 fvo:fList)
	   {
		   if(fvo.getFno()==fno)
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
   public BookHouseVO3 BookInfoData(int fno)
   {
	   BookHouseVO3 vo=new BookHouseVO3();
	   for(BookHouseVO3 fvo:fList)
	   {
		   if(fvo.getFno()==fno)
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   
   public ArrayList<BookHouseVO3> BookFindData(String title)
   {
	   ArrayList<BookHouseVO3> list=
			   new ArrayList<BookHouseVO3>();
	   for(BookHouseVO3 fvo:fList)
	   {
		   if(fvo.getName().contains(title))
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
}