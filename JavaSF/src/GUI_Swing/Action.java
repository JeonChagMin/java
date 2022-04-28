package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action extends JFrame{
	Action() {
		setTitle("Action Listener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
//			어차피 한번만 사용하고 안 할거기 때문에 익명으로 하는게 좋다.
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				Container c = getContentPane();
				if (b.getText().equals("Action")) {
					b.setText("액션");
					c.setBackground(Color.green);
				}else {
					b.setText("Action");
					c.setBackground(Color.white);
				}
				
			}
		});
		c.add(btn);
		
		setSize(500,500);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Action();
	}
}
