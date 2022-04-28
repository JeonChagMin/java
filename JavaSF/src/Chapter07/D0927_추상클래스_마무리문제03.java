package Chapter07;

public class D0927_추상클래스_마무리문제03 {

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
		System.out.println("로그인합니다.");
		
	}
}

class FileDownloadServlet extends HttpServlet {
	@Override
	void service() {
		System.out.println("파일 다운로드합니다.");
		
	}
}
