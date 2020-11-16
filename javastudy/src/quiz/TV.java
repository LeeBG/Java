package quiz;

public class TV {
	String manufacturer;
	int year;
	int size;
	public TV(String manufacturer,int year,int size) {
		this.manufacturer=manufacturer;
		this.year=year;
		this.size=size;
	}
	public TV() {}
		
	void show() {
		System.out.println(manufacturer+"에서 만든"+year+"년형"+size+"인치 TV");
	}
}

