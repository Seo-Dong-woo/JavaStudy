package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 *   제목
 *   저자
 *   출판사
 *   평점
 *   가격
 */
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
				Document doc=Jsoup.connect("https://www.yes24.com/Product/Category/"
											+ "BestSeller?pageNumber=1&pageSize=24&categoryNumber=001").get();
				Elements link=doc.select("div.itemUnit span.img_grp a");
				for(int i=0;i<link.size();i++)
				{
					try
					{
						String subLink="https://www.yes24.com/" + link.get(i).attr("href");
						System.out.println(subLink);
						
						Document doc2=Jsoup.connect(subLink).get();
						
						// 제목
						Element title=doc2.selectFirst("h2.gd_name");
						System.out.println(title.text());
					}catch(Exception ex) {}
				}
			
			
		}catch(Exception ex) {}
	}

}
