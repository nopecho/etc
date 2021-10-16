import javax.swing.JOptionPane;

public class AccountingIFApp {

	public static void main(String[] args) {
//		ValueOfSupply: 공급가
//		ExpenseRate: 매입가 비율
//		VatRate: 부가가치세 비율
//		VAT: 부가가치세
//		Total: 총 가격
//		Expense: 마진
//		Income: 순이익
		
		String Value = JOptionPane.showInputDialog("Enter a WON");
		double ValueOfSupply = Double.parseDouble(Value);
		double ExpenseRate = 0.3;
		double VatRate = 0.1;
		double VAT = ValueOfSupply*VatRate;
		double Total = ValueOfSupply+VAT;
		double Expense = ValueOfSupply*ExpenseRate;
		double Income = ValueOfSupply-Expense;
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		
		if(Income > 10000.0) {
		Dividend1 = Income *0.5;
		Dividend2 = Income *0.3;
		Dividend3 = Income *0.2;
		}
		else {
		Dividend1 = Income *1.0;
		Dividend2 = Income *0.0;
		Dividend3 = Income *0.0;			
		}
		
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
