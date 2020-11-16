package quiz;

public class Song {
	String title;
	String artist;
	int year;
	String country;

	public Song() {

	}

	public Song(String title,String artist,int year,String country){
		this.artist=artist;
		this.title=title;
		this.year=year;
		this.country=country;
	}
	void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}

}
