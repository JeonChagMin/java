package Chapter08;

public class D1005_Ŭ��������03 {

	public static void main(String[] args) {
		Song song = new Song("������","ABBA",1978,"Dancing Queen");
		song.show();

	}

}

class Song {
	String title;
	String artist;
	int year;
	String country;
	Song() {
		
	}
	
	Song(String title,String artist,int year, String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
		
	}
	
	void show() {
		System.out.println(year+"�� "+country+"������ "+ artist+"�� �θ� "+ title);
	}
	
}