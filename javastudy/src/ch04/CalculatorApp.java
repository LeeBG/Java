package ch04;

public class CalculatorApp {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();		//new 해서 heap메모리에 띄움
		int sum = cal.add(10, 5);
		int mult = cal.multi(sum,20);
		int div = cal.div(mult,5);
		int minus = cal.minus(div, 100);
			
		int result = minus;
		
		System.out.println("1.10 + 5 결과값은 : "+sum);
		System.out.println("2."+sum+" x 20 결과값은 : "+mult);
		System.out.println("3."+mult+" / 5 결과값은 : "+div);
		System.out.println("4."+div+" - 100 결과값은 : "+minus);
		System.out.println("5.결과값은 : "+result);
		System.out.println("6.결과값은 : "+cal.minus(cal.div(cal.multi(cal.add(10, 5), 20), 5), 100));
	}

}
