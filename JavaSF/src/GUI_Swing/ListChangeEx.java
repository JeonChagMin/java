package GUI_Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
JTextField tf = new JTextField(10);
Vector<String> v = new Vector<String>();
JList<String> nameList = new JList<String>(v);
	
	
	public ListChangeEx() {
		setTitle("리스트 변경 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 입력 후 <Enter> 키"));
		c.add(tf);
		
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(7);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				v.add(t.getText());
				t.setText("");
				nameList.setListData(v);
				
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListChangeEx();
	}
}
