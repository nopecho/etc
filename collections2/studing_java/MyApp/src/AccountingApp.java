import javax.swing.JOptionPane;

public class AccountingApp {

	public static void main(String[] args) {
//		ValueOfSupply: ���ް�
//		ExpenseRate: ���԰� ����
//		VatRate: �ΰ���ġ�� ����
//		VAT: �ΰ���ġ��
//		Total: �� ����
//		Expense: ����
//		Income: ������
		
		String Value = JOptionPane.showInputDialog("Enter a WON");
		double ValueOfSupply = Double.parseDouble(Value);
		double ExpenseRate = 0.3;
		double VatRate = 0.1;
		double VAT = ValueOfSupply*VatRate;
		double Total = ValueOfSupply+VAT;
		double Expense = ValueOfSupply*ExpenseRate;
		double Income = ValueOfSupply-Expense;
		double Dividend1 = Income *0.5;
		double Dividend2 = Income *0.3;
		double Dividend3 = Income *0.2;
		
		System.out.println("Value of supply : "+ValueOfSupply);		
		System.out.println("VAT : "+VAT);	
		System.out.println("TOTAL : "+Total);				
		System.out.println("Expense : "+Expense);		
		System.out.println("Income : "+Income);		
		System.out.println("Dividend 1 : "+Dividend1);		
		System.out.println("Dividend 2 : "+Dividend2);		
		System.out.println("Dividend 3 : "+Dividend3);

	}

}
