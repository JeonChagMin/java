package ±âº»_½ºÀ®ÄÄÆ÷³ÍÆ®_¿¬½À;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex08 extends JFrame {
	String word;
	int x=0;
	Ex08() {
		setTitle("TextArea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setValue(x);
		
		JTextArea jt = new JTextArea();
		jt.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				x=jt.getText().length();
				slider.setValue(x);
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				x=jt.getText().length();
				slider.setValue(x);
			}
			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		jt.addKeyListener(new KeyAdapter() {
		@Override
		public void keyTyped(KeyEvent e) {
			JTextArea j = (JTextArea)e.getSource();
			word=j.getText();
			if (j.getText().length()>=100) {
				e.consume();
			}
		}
		});
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if(slider.getValue()>x) {
					slider.setValue(x);
				}else if (slider.getValue()<x) {
					String aaa = word.substring(0,slider.getValue());
					jt.setText(aaa);
				}
			}
		});
		
		c.add(new JScrollPane(jt));
		c.add(slider);
		setSize(300,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex08();
	}
}
