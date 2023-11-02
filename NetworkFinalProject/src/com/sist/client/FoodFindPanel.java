package com.sist.client;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*; // URL

public class FoodFindPanel  extends JPanel implements ActionListener{
	JTextField tf;
	JButton b1, b2;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	FoodManager fm=new FoodManager();
	
	public FoodFindPanel(ControllPanel cp)
	{
		this.cp=cp; // 화면 이동
		tf=new JTextField(20);
		b1=new JButton("검색");
		b2=new JButton("홈 이동");
		
		String[] col= {"", "업체명", "음식종류"};
		Object[][] row=new Object[0][3];
		// 익명의 클래스: 상속 없이 오버라이딩 => 내부 클래스
		/*
		 *   내ㅜ 클래스: 멤버클래스(네트워크, 스레드)
		 */
		model=new DefaultTableModel(row, col) // 테이블 만들기
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		table=new JTable(model); // 테이블 만들기
		table.setRowHeight(60);; // 목록별 범위
		JScrollPane js=new JScrollPane(table);
		
		// 배치
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		setLayout(new BorderLayout());
		
		add("North", p);
		add("Center", js);
		
		b1.addActionListener(this); // 엔터 쳤을 떄
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	public void findPrint(String title) // 출력하는 곳
	{
		try
		{
			ArrayList<FoodHouseVO> list=fm.foodFindData(title);
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			
			for(FoodHouseVO vo:list)
			{
				URL url=new URL(vo.getPoster());
				Image image=ImageChange.getImage(new ImageIcon(url), 90, 90);
				Object[] obj= {new ImageIcon(image), vo.getName(), vo.getPhone()};
				model.addRow(obj);
			}
		}catch(Exception ex) {}
	}
	@Override // 어떻게 됐을 때 실행될 것인지
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1 || e.getSource()==tf)
		{
			String title=tf.getText();
			if(title.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			
			findPrint(title);
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "home");
		}
		
	}
}