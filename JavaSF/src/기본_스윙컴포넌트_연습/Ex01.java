package �⺻_����������Ʈ_����;

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
		JCheckBox checkbox1 = new JCheckBox("��ư ��Ȱ��ȭ");
		JCheckBox checkbox2 = new JCheckBox("��ư ���߱�");
		
		
		checkbox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==ItemEvent.SELECTED) {
					j.setEnabled(false);
//					��ư Ȱ��ȭ ����
				} else {
					j.setEnabled(true);
//					��ư Ȱ��ȭ ����
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
