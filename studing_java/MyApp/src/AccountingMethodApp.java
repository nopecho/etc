import javax.swing.JOptionPane;

public class AccountingMethodApp {
	public static String Value = JOptionPane.showInputDialog("Enter a WON"); // 전역변수
	public static double ValueOfSupply = Double.parseDouble(Value); // 전역변수
	public static double vatRate; // 전역변수
	public static double ExpenseRate; // 전역변수

	public static void main(String[] args) { //main메소드 부분
		vatRate = 0.1; // 지역변수 
		ExpenseRate = 0.3; // 지역변수		
		print();
	}

	public static void print() { //메소드 선언
		System.out.println("Value of supply : "+ValueOfSupply);		
		System.out.println("VAT : "+getVAT());	
		System.out.println("TOTAL : "+getTotal());				
		System.out.println("Expense : "+getExpense());		
		System.out.println("Income : "+getIncome());		
		System.out.println("Dividend 1 : "+getDividend1());		
		System.out.println("Dividend 2 : "+getDividend2());		
		System.out.println("Dividend 3 : "+getDividend3());
	}

	public static double getDividend3() { //메소드 선언
		return getIncome() *0.2;
	}

	public static double getDividend2() { //메소드 선언
		return getIncome() *0.3;
	}

	public static double getDividend1() { //메소드 선언
		return getIncome() *0.5;
	}

	public static double getIncome() { //메소드 선언
		return ValueOfSupply-getExpense();
	}

	public static double getExpense() { //메소드 선언
		return ValueOfSupply*ExpenseRate;
	}

	public static double getTotal() { //메소드 선언
		return ValueOfSupply+getVAT();
	}

	public static double getVAT() { //메소드 선언
		return ValueOfSupply*vatRate;
	}

}
