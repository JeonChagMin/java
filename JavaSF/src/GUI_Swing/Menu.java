package GUI_Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame{
Container c;
 	Menu() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
		
	}
	
	void createMenu() {
		JMenuBar mu = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		JMenuItem it = new JMenuItem("Exit");
		it.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem ji = (JMenuItem)e.getSource();
				System.exit(0);
				
				
			}
		});
		screenMenu.add(it);
		
		mu.add(screenMenu);
		mu.add(new JMenu("Edit"));
		mu.add(new JMenu("Edit"));
		mu.add(new JMenu("Edit"));
		
		setJMenuBar(mu);
		
	}

	public static void main(String[] args) {
		new Menu();
	}
}
