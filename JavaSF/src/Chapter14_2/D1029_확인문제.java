package Chapter14_2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class D1029_Ȯ�ι��� {

	public static void main(String[] args) throws IOException {
		D1029_Ȯ�ι��� d = new D1029_Ȯ�ι���();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println(" 1. ��Ϻ��� | 2. �󼼺��� | 3. �����ϱ� | 4. �����ϱ� | 5. �����ϱ� | 6. ���� ");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("���� : ");
			int x = s.nextInt();
			if (x>=1 && x<=6) {
				
			switch (x) {

			case 1:
				d.list();
				break;
			case 2:
				d.see();
				break;
			case 3:
				d.change();
				break;
			case 4:
				d.dele();
				break;
			case 5:
				d.made();
				break;

			case 6:
				System.out.println("�ý��� ����");
				System.exit(0);

			}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

	}

	void list() {
		File list = new File("C:\\Temp");
		File[] f = list.listFiles();
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("------------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : f) {
			System.out.print(sdf.format(file.lastModified()));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

	void see() {
		Scanner s = new Scanner(System.in);
		System.out.print("�󼼺��� �� ���� �̸��� �Է��ϼ���");
		String name = s.nextLine();
		try {
			InputStream is = new FileInputStream("C:\\Temp\\" + name);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("��ġ�ϴ� ���� �̸��� �����ϴ�");
		}

	}

	void change() {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ϰ� ���� ������ �Է��ϼ���");
		System.out.print("�̸� : ");
		String name = s.nextLine();
		while (true) {
			
		System.out.print("�Է� : ");
		String ch = s.nextLine();
		if (ch.equals("+") || ch.equals("-")) {
			
		try {

			switch (ch) {
			case "+":
				Writer writer = new FileWriter("C:\\Temp\\" + name, true);
				System.out.println("�̾�� ���� ������ �Է��ϼ��� : �׸��̶�� �Է½� ����");
				System.out.print("�Է� : ");
				while (true) {
					String word = s.nextLine();
					if (word.equals("�׸�")) {
						System.out.println("�Է�����");
						break;
					}
					writer.write(word);
					writer.write("\r\n",0,2);
				}
				writer.flush();
				writer.close();
				System.exit(0);

			case "-":
				Writer writer1 = new FileWriter("C:\\Temp\\" + name);
				System.out.println("���� ���� ���� ������ �Է��ϼ��� : �׸��̶�� �Է½� ����");
				System.out.print("�Է� : ");
				while (true) {
					String word = s.nextLine();
					if (word.equals("�׸�")) {
						System.out.println("�Է�����");
						break;
					}
					writer1.write(word);
					writer1.write("\r\n",0,2);
				}

				writer1.flush();
				writer1.close();
				System.exit(0);
			}

		} catch (Exception e) {
			System.out.println("��ġ�ϴ� ���� �̸��� �����ϴ�.");
		}
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		}
	}

	void dele() {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ϰ���� ������ �̸��� �Է��ϼ���");
		System.out.print("�Է� : ");
		String name = s.nextLine();
		try {
			File file = new File("C:\\Temp\\" + name);
			file.delete();
			System.out.println("������ �����Ͽ����ϴ�");

		} catch (Exception e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}

	}

	void made() throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("������� �ϴ� ������ �̸��� �Է��ϼ���");
		System.out.print("�̸� : ");
		String name = s.nextLine();
		File file = new File("C:\\Temp\\" + name);
		if (file.exists()) {
			System.out.println("�̹� �����ϴ� �����Դϴ�");
		} else {
			file.createNewFile();
		}

	}

}
