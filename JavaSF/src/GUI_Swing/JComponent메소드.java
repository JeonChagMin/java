package GUI_Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JComponent�޼ҵ� extends JFrame{
	JComponent�޼ҵ�() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�");
		ImageIcon beauty = new ImageIcon("images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon nor = new ImageIcon("images\\normalicon.gif");
		JLabel label = new JLabel("���� ������ ��ȭ�ϼ���",nor,SwingConstants.LEFT);
		label.setSize(300,300);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(600,800);
		setVisible(true);
		
		
		
		
		}

	public static void main(String[] args) {
		new JComponent�޼ҵ�();

	}

}
