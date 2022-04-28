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
//			������ �ѹ��� ����ϰ� �� �Ұű� ������ �͸����� �ϴ°� ����.
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				Container c = getContentPane();
				if (b.getText().equals("Action")) {
					b.setText("�׼�");
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
