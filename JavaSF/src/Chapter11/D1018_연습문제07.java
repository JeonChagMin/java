package Chapter11;

import java.util.StringTokenizer;

public class D1018_¿¬½À¹®Á¦07 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/"); 
		while (st.hasMoreTokens())
		System.out.println(st.nextToken());
	}

}
