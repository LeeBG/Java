package ch04;

public class TVApp {

	class TV {
		int size;
		String mf;

		public TV() {
			this("LG");			//오버로딩
		}
		public TV(String mf) {
			this(32,mf);
		}
		public TV(int size, String mf) {
			size=size;
			this.mf = mf;
			System.out.println(size + "인치 " + mf);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
