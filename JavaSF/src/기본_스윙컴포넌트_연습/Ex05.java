package �⺻_����������Ʈ_����;

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
		setTitle("Focus Event ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl = new JLabel("�Է��� �� �ٸ� â�� Ŭ���ϸ� �Է��� �����ڰ� �빮�ڷ� ����");
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
//				jtextfield�� focus�� �����̱� ������ jtextfield�� listeneer�� �޾ƾ��Ѵ�.
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
