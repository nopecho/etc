
public class AccountingApp {
	//공급가액
	public static double valueOfSupply=10000;
	//부가가치세율
	public static double vatRate=0.1;
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
	
	public static void main(String[] args) {
		System.out.println("공급가액 : "+valueOfSupply);
		System.out.println("부가 가치세 : "+getVAT());
		System.out.println("합계 : "+getTotal());
		
		
	}

}
