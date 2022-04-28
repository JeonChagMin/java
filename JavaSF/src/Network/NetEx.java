package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx {
	static InetAddress ia = null;
	static InetAddress ib = null;
	static InetAddress ic = null;
	public static void main(String[] args) {
		try {
			ia=InetAddress.getByName("www.naver.com");
			ib = InetAddress.getLocalHost();
			ic = InetAddress.getLoopbackAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(ia.getHostAddress());
		System.out.println(ib);
		System.out.println(ic);
		
	}

}
