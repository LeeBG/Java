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
		System.out.println(manufacturer+"���� ����"+year+"����"+size+"��ġ TV");
	}
}

