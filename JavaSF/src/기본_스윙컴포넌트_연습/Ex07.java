package 기본_스윙컴포넌트_연습;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex07 extends JFrame {
	int s=40;

	public Ex07() {
		setTitle("JLiser Practice");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		JLabel jl = new JLabel("I Love Java");
		jl.setFont(new Font("Arial",Font.PLAIN,s));
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,1,100,s);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				s=slider.getValue();
//				크기는 getvalue를 통해서 얻을 수 있다.
				jl.setFont(new Font("Arial",Font.PLAIN,s));
			}
		});
		
		c.add(slider,BorderLayout.NORTH);
		c.add(jl,BorderLayout.CENTER);
		setSize(400,350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}
}
