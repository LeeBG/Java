package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Generic04 {

	List<String> getData(){
//		return new ArrayList<>();	//비동기
		ArrayList<String> list =new ArrayList<>();
	
		return new Vector<>();		//동기
	}
	
	public static void main(String[] args) {
		
	}
}
