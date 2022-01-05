import javax.swing.JOptionPane;

public class AccountingMethodApp {
	public static String Value = JOptionPane.showInputDialog("Enter a WON"); // ��������
	public static double ValueOfSupply = Double.parseDouble(Value); // ��������
	public static double vatRate; // ��������
	public static double ExpenseRate; // ��������

	public static void main(String[] args) { //main�޼ҵ� �κ�
		vatRate = 0.1; // �������� 
		ExpenseRate = 0.3; // ��������		
		print();
	}

	public static void print() { //�޼ҵ� ����
		System.out.println("Value of supply : "+ValueOfSupply);		
		System.out.println("VAT : "+getVAT());	
		System.out.println("TOTAL : "+getTotal());				
		System.out.println("Expense : "+getExpense());		
		System.out.println("Income : "+getIncome());		
		System.out.println("Dividend 1 : "+getDividend1());		
		System.out.println("Dividend 2 : "+getDividend2());		
		System.out.println("Dividend 3 : "+getDividend3());
	}

	public static double getDividend3() { //�޼ҵ� ����
		return getIncome() *0.2;
	}

	public static double getDividend2() { //�޼ҵ� ����
		return getIncome() *0.3;
	}

	public static double getDividend1() { //�޼ҵ� ����
		return getIncome() *0.5;
	}

	public static double getIncome() { //�޼ҵ� ����
		return ValueOfSupply-getExpense();
	}

	public static double getExpense() { //�޼ҵ� ����
		return ValueOfSupply*ExpenseRate;
	}

	public static double getTotal() { //�޼ҵ� ����
		return ValueOfSupply+getVAT();
	}

	public static double getVAT() { //�޼ҵ� ����
		return ValueOfSupply*vatRate;
	}

}
