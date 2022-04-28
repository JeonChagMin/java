package ±âº»_½ºÀ®ÄÄÆ÷³ÍÆ®_¿¬½À;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex06 extends JFrame {

	public Ex06() {
		setTitle("JSlider");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		JLabel jl = new JLabel(slider.getValue()+"");
		jl.setBackground(Color.green);
		jl.setOpaque(true);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int result = slider.getValue();
				jl.setText(result+"");
			}
		});
		
		c.add(slider);
		c.add(jl);
		setSize(400,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex06();
	}
}
