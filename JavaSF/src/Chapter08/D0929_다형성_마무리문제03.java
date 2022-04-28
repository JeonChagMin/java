package Chapter08;

public class D0929_������_����������03 {
	
	public static void dbWork(DataAccessObject dao) {
		dao.selcect();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}

interface DataAccessObject {
	void selcect();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject {

	@Override
	public void selcect() {
		System.out.println("Oracle DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
	
}

class MySqlDao implements DataAccessObject {

	@Override
	public void selcect() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
	
}
