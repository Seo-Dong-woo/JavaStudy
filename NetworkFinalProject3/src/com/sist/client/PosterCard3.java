package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.vo.*;
public class PosterCard3 extends JPanel{
   JLabel poLa=new JLabel();
   JLabel tLa=new JLabel();
   public PosterCard3(BookCategoryVO vo)
   {
	   setLayout(null);
	   poLa.setBounds(5, 5, 280, 120);
	   tLa.setBounds(5, 130, 280, 30);
	   
	   add(poLa);
	   add(tLa);
	   
	   try
	   {
		   	if(vo.getPoster().startsWith("http"))
		   	{
		   		URL url=new URL(vo.getPoster());
		   		Image image=ImageChange.getImage(new ImageIcon(url), 280, 150);
		   		poLa.setIcon(new ImageIcon(image));
		   	}
		   	else
		   	{
		   		Image image=ImageChange.getImage(new ImageIcon("c:\\java_data\\noimage.jpg"), 280, 150);
			     poLa.setIcon(new ImageIcon(image));
		   	}
		    tLa.setText(vo.getTitle());
		    System.out.println(vo.getTitle());
	   }catch(Exception ex) {ex.printStackTrace();}
   }
}