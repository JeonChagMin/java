package 기본_스윙컴포넌트_연습;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex05 extends JFrame {
	
	public Ex05() {
		setTitle("Focus Event 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl = new JLabel("입력한 후 다른 창을 클릭하면 입력한 영문자가 대문자로 변경");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setLocation(20,40);
		jl.setSize(400,50);
		c.add(jl);
		
		JTextField jf = new JTextField(20);
		jf.setLocation(50,70);
		jf.setSize(400,50);
		c.add(jf);
		
		jf.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String word = jf.getText().toUpperCase();
				jf.setText(word);
//				jtextfield의 focus가 움직이기 때문에 jtextfield의 listeneer를 달아야한다.
			}
			
		});
			
		
		requestFocus();
		setFocusable(true);
		setSize(500,250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex05();

	}
}
