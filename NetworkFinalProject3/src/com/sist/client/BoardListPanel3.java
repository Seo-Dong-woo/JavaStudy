package com.sist.client;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;
import javax.swing.text.SimpleAttributeSet;

import com.sist.vo.*;
import com.sist.manager.*;
import java.util.*;
import java.text.*;

public class BoardListPanel3 extends JPanel implements ActionListener, MouseListener{
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	ControllPanel3 cp;   // 화면 변경 ==> <jsp:include>
	int curpage=1;
	int totalPage=0;
	BoardManager3 bm=new BoardManager3();
	public BoardListPanel3(ControllPanel3 cp)
	{
		this.cp=cp;
		String[] col= {"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			// 익명의 클래스 => 오버라이딩(소스 -> 오버라이딩 -> isCellEditable)
			// 편집 방지
			
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(51);  //간격 넓힘
		
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		JScrollPane js=new JScrollPane(table);
		
		b1=new JButton("새글");
		b2=new JButton("검색");
		b3=new JButton("이전");
		b4=new JButton("다음");
		la=new JLabel("자유게시판");
		pageLa=new JLabel("1 page / 1 pages");
		
		//배치
		setLayout(null);   //사용자 정의 배치
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("맑은 고딕",Font.BOLD,35));
		la.setBounds(100,15,700,50);
		add(la);
		
		b1.setBounds(10,75,100,30);
		add(b1);
		
		js.setBounds(10, 115, 990, 530);
		add(js);
		
		JPanel p=new JPanel();
		p.add(b3);
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(130, 660, 710, 35);
		add(p);
		
		//이벤트
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		table.addMouseListener(this);
		boardList();
	}
	public void boardList()
	{
		//전체를 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		ArrayList<BoardVO3> list=bm.boardListData(curpage);
		totalPage=bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalPage+" pages");
		for(int i=list.size()-1;i>=0;i--)
		{
			BoardVO3 vo=list.get(i);
			String[] data= {String.valueOf(vo.getNo()),
					vo.getSubject(), vo.getName(),
					new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
					String.valueOf(vo.getHit())};
			model.addRow(data);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			cp.bip.tf1.setText("");
			cp.bip.tf2.setText("");
			cp.bip.tf3.setText("");
			cp.bip.ta.setText("");
			cp.card.show(cp, "insert");
		}
		else if(e.getSource()==b3)
		{
			if(curpage>1)
			{
				curpage--;
				boardList();
			}
		}
		else if(e.getSource()==b4)
		{
			if(curpage<totalPage)
			{
				curpage++;
				boardList();
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String no=model.getValueAt(row, 0).toString();
				
				BoardVO3 vo=bm.boardDetailData(Integer.parseInt(no));
				cp.bdp.noLa.setText(no);
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				
				cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.bdp.pane.setText(vo.getContent());
				cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.card.show(cp, "detail");
				
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
