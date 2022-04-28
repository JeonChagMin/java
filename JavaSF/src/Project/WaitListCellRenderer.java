package Project;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class WaitListCellRenderer extends JLabel implements ListCellRenderer {
	 protected static Border m_noFocusBorder;
	  protected FontMetrics m_fm = null;
	  protected Insets m_insets = new Insets(0, 0, 0, 0);
	  protected int m_defaultTab = 50;
	  protected int[] m_tabs = null;

	  private int count;

	  public WaitListCellRenderer(){
	    super();
	    m_noFocusBorder = new EmptyBorder(1, 1, 1, 1);
//	    공간은 있지만 테두리는 투명한 border top, left, bottom, right테두리두께
	    setOpaque(true);
	    setBorder(m_noFocusBorder);
	    count = 0;
	  }

	  public Component getListCellRendererComponent(JList list,
	    Object value, int index, boolean isSelected, boolean cellHasFocus){
	    setText(value.toString());
//	    WaitListCellRenderer가 Label이므로 텍스트 지정
	    setBackground(isSelected ? list.getSelectionBackground() :
	      list.getBackground());
	    setForeground(isSelected ? list.getSelectionForeground() :
	      list.getForeground());

	    setFont(list.getFont());
	    setBorder((cellHasFocus) ? UIManager.getBorder(
	      "List.focusCellHighlightBorder") : m_noFocusBorder);

	    return this;
	  }

	  public void setDefaultTab(int defaultTab){
	    m_defaultTab = defaultTab;
	  }

	  public int getDefaultTab(){
	    return m_defaultTab;
	  }

	  public void setTabs(int[] tabs){
	    m_tabs =tabs;
	  }

	  public int[] getTabs(){
	    return m_tabs;
	  }

	  public int getTab(int index){
	    if (m_tabs == null)
	      return m_defaultTab * index;
	    int len = m_tabs.length;
	    if(index >= 0 && index < len)
	      return m_tabs[index];
	    return m_tabs[len-1] + m_defaultTab * (index-len-1);
	  }

	  public void paint(Graphics g){
	    m_fm = g.getFontMetrics();
//		사용한 폰트를 가져와서 사용
	    g.setColor(getBackground());
	    g.fillRect(0, 0, getWidth(), getHeight());
	    getBorder().paintBorder(this, g, 0, 0, getWidth(), getHeight());

	    g.setColor(getForeground());
	    g.setFont(getFont());
	    m_insets = getInsets();
//	    Dimension 클래스와 달리 Inset 클래스는 상하좌우 여백을 관리 할 수 있는 클래스
	    int x = m_insets.left;
	    int y = m_insets.top + m_fm.getAscent();

	    StringTokenizer st = new StringTokenizer(getText(), "=");
//	    JLabel의 텍스트를 "="기준으로 토큰화
	    while(st.hasMoreTokens()){
	      String temp = st.nextToken();
	      g.drawString(temp, x, y);
	      x += m_fm.stringWidth(temp);
	      if (!st.hasMoreTokens())
	        break;
	      int index = 0;
	      while (x >= getTab(index)) index++;
	      x = getTab(index);
	    }
	  }
	}
