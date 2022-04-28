package Chapter11;

public class D1018_¿¹Á¦01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Member {
	String id;
	
	Member(String id) {
		this.id=id;	
		}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}