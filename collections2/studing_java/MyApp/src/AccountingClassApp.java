
import javax.swing.JOptionPane;
class Accounting { // Accounting�̶�� Ŭ������ �����Ѵ�.(Accounting�� ���õ� �޼ҵ�鸸 ��Ƴ��� ��!)
	
	public String Value = JOptionPane.showInputDialog("Enter a WON"); 
	public double ValueOfSupply = Double.parseDouble(Value); 
	public double vatRate; 
	public double ExpenseRate; 
	public void print() { 
		System.out.println("Value of supply : "+ValueOfSupply);		
		System.out.println("VAT : "+getVAT());	
		System.out.println("TOTAL : "+getTotal());				
		System.out.println("Expense : "+getExpense());		
		System.out.println("Income : "+getIncome());		
		System.out.println("Dividend 1 : "+getDividend1());		
		System.out.println("Dividend 2 : "+getDividend2());		
		System.out.println("Dividend 3 : "+getDividend3());
	}

	public double getDividend3() { 
		return getIncome() *0.2;
	}

	public double getDividend2() { 
		return getIncome() *0.3;
	}

	public double getDividend1() { 
		return getIncome() *0.5;
	}

	public double getIncome() { 
		return ValueOfSupply-getExpense();
	}

	public double getExpense() { 
		return ValueOfSupply*ExpenseRate;
	}

	public double getTotal() {
		return ValueOfSupply+getVAT();
	}

	public double getVAT() {
		return ValueOfSupply*vatRate;
	}
}

public class AccountingClassApp {


	public static void main(String[] args) { 
//		Accounting.vatRate = 0.1;
//		Accounting.ExpenseRate = 0.3; 
//		Accounting.print();
		
		Accounting a1 = new Accounting(); // a1�̶�� �ν��Ͻ� ����(������ AccountingŬ������ ������ new Accounting�� ��ü��, �� �ν��Ͻ��� a1�̴�)
		a1.vatRate=0.1;
		a1.ExpenseRate=0.3;
		a1.print();
		
		Accounting a2 = new Accounting(); // a2��� �ν��Ͻ� ����(�ٸ����� AccountingŬ������ �ν��Ͻ� a2 ����)
		a2.vatRate=0.9;
		a2.ExpenseRate=0.5;
		a2.print();
		
	}
}


