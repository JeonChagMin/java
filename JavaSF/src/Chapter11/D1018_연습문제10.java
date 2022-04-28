package Chapter11;

public class D1018_연습문제10 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
//		String a[] = fullPath.split("\\\\");
//		for (int i = 0; i < a.length-1; i++) {
//			path+=a[i];
//		}
//		for (int i = a.length-1; i < a.length; i++) {
//			fileName+=a[i];
//		}
		int pos = fullPath.lastIndexOf("\\");
		path=fullPath.substring(0,pos);
		fileName=fullPath.substring(pos+1);
		System.out.println("fullPath : "+fullPath);
		System.out.println("path : "+path);
		System.out.println("fileName : "+fileName);
	}

}
