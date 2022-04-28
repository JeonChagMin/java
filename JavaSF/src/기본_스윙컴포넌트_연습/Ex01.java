package 기본_스윙컴포넌트_연습;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex01 extends JFrame{
	JButton j = new JButton("test button");
	
	public Ex01() {
		setTitle("CheckBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox checkbox1 = new JCheckBox("버튼 비활성화");
		JCheckBox checkbox2 = new JCheckBox("버튼 감추기");
		
		
		checkbox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==ItemEvent.SELECTED) {
					j.setEnabled(false);
//					버튼 활성화 여부
				} else {
					j.setEnabled(true);
//					버튼 활성화 여부
				}
				
			}
		});
		checkbox2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==ItemEvent.SELECTED) {
					j.setVisible(false);
				}else {
					j.setVisible(true);
				}
			}
		});
		
		c.add(checkbox1);
		c.add(checkbox2);
		c.add(j);

		
		
		
		setSize(300,200);
		setVisible(true);
		
	}
	
public static void main(String[] args) {
	new Ex01();
}
}
