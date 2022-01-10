package org.constudy21.creataScreen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.constudy21.GuiEx.myvframe.MyFrame;

public class Scr extends MyFrame {
	Panel textarea = new Panel(new FlowLayout());
	Panel southPan = new Panel(new GridBagLayout());
	Panel westPan = new Panel(new GridLayout(7, 3, 5, 10));
	
	Label l1 = new Label("번    호");
	Label l2 = new Label("이    름");
	Label l3 = new Label("이 메 일");
	Label l4 = new Label("전화번호");
	
	Panel no = new Panel();
	Panel name = new Panel();
	Panel email = new Panel();
	Panel tel = new Panel();
	
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	TextField t3 = new TextField(10);
	TextField t4 = new TextField(10);
	
	Button btn1 = new Button("전체보기");
	Button btn2 = new Button("추    가");
	Button btn3 = new Button("삭    제");
	Button btn4 = new Button("검    색");
	Button btn5 = new Button("취    소");
	
	
	public Scr() {
		lay01();
	}
	
	private void lay01() {
		// 센터
		this.add(BorderLayout.CENTER, textarea);
		TextArea area = new TextArea(15, 40);
		textarea.add(area);
		
		// 왼쪽
		westPan.add(l1);
		westPan.add(t1);
		westPan.add(l2);
		westPan.add(t2);
		westPan.add(l3);
		westPan.add(t3);
		westPan.add(l4);
		westPan.add(t4);
		this.add(BorderLayout.WEST, westPan);
		
		
		// 하단 메뉴
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(btn3);
		southPan.add(btn4);
		southPan.add(btn5);
		this.add(BorderLayout.SOUTH, southPan);
	}

	
	
	public static void main(String[] args) {
		new Scr().setVisible(true);
	}
	
}
