package ch05;

public abstract	class Factory {
	protected abstract void 색칠();	//일반클래스에서는 abstract쓰면 오류
	protected void 건조() {
		System.out.println("건조 완료");
	}
	//protected 는 같은 패키지 + 자식만 상속
	//protected 는 자식만 찾을 수 있도록 범위지정
	public void 가동() {
		색칠();
		건조();
	}
}
