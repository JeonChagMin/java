package �⺻_����������Ʈ_����;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex02 extends JFrame {
	JTextField text = new JTextField(10);
	Vector<String> v = new Vector<String>();
	public Ex02() {
		setTitle("JTextField");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> strCombo = new JComboBox<String>();
		
		c.add(text);
		c.add(strCombo);
		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				v.add(t.getText());
				strCombo.addItem(t.getText());
//				�߰��� ���� addItem�� �̿��ؼ� �߰��� �մϴ�
				t.setText("");
//				�߰��� �� �ʱ�ȭ�� ���ݴϴ�
				
				
			}
		});
		
		
		setSize(300,200);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
