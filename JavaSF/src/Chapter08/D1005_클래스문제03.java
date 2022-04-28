package Chapter08;

public class D1005_클래스문제03 {

	public static void main(String[] args) {
		Song song = new Song("스웨덴","ABBA",1978,"Dancing Queen");
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
		System.out.println(year+"년 "+country+"국적의 "+ artist+"가 부른 "+ title);
	}
	
}