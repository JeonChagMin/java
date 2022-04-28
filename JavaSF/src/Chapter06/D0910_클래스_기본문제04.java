package Chapter06;

public class D0910_Ŭ����_�⺻����04 {

	public static void main(String[] args) {
		Marine m1=new Marine();
		Marine m2=new Marine(2, 2);
		System.out.println(m2);
		Marine m3=new Marine(3, 3, 60);
		System.out.println(m3);
		Marine m4=new Marine(4, 4, 50, 1);
		System.out.println(m4);
		Marine m5=new Marine(5, 5, 70, 1, 1);
		System.out.println(m5);
		
		Marine.armorUp();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		Marine.weaponUp();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		m1.hpDown();
		System.out.println(m1);
		m2.hpDown();
		System.out.println(m2);
		
		m1.marineMove(4, 6);
		System.out.println(m1);

	}

}

class Marine {
	private int x;
	private int y;
	private int hp;
	private static int weapon;
	private static int armor;

	Marine() {
	}

	Marine(int x, int y){
	this(x,y,100,1,1);
	}
	
	Marine(int x, int y, int hp){
		this(x,y,hp,1,1);
	}
	
	Marine(int x, int y, int hp, int weapon){
		this(x,y,hp,weapon,1);
	}

	Marine(int x, int y, int hp, int weapon, int armor) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.weapon = weapon;
		this.armor = armor;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if (hp<0) {
			return;
		}
		this.hp = hp;
	}

	public int getChang() {
		return x;
	}
	public void setChang(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static int getWeapon() {
		return Marine.weapon;
	}

	public static void setWeapon() {
		Marine.weapon=weapon;
	}

	public static int getArmor() {
		return Marine.armor;
	}

	public static void setArmor() {
		Marine.armor=armor;
	}
	
	public static void weaponUp() {
		weapon++;
	}
	
	public static void armorUp() {
		armor++;
	}
	
	public void hpDown() {
		hp--;
	}
	
	public void marineMove(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "[ Marine�� ��ġ�� ("+x+", "+y+")�̰�, ü���� "+
				hp+", "+"���ݷ��� "+weapon+", "+"������ "+
				armor+" �Դϴ�. ]";
	}
//	�ּҰ� �ƴ϶� ������ ���� ���´�.
	
	
	
	
	
	

}