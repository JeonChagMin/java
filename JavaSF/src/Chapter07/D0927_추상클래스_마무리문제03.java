package Chapter07;

public class D0927_�߻�Ŭ����_����������03 {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
		
	}
		public static void method(HttpServlet servlet) {
			servlet.service();
		}
	}


abstract class HttpServlet {
	abstract void service();
}

class LoginServlet extends HttpServlet {
	@Override
	void service() {
		System.out.println("�α����մϴ�.");
		
	}
}

class FileDownloadServlet extends HttpServlet {
	@Override
	void service() {
		System.out.println("���� �ٿ�ε��մϴ�.");
		
	}
}
