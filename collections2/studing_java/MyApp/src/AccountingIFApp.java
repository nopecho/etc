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
		double[] DividendRates = new double[4];// double[] <- double형 데이터로 이루어진 배열
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3; 
		DividendRates[2] = 0.1;
		DividendRates[3] = 1.0;
		
		if(Income > 10000.0) { //만약 순이익이 10000원보다 많으면
		Dividend1 = Income *DividendRates[0];
		Dividend2 = Income *DividendRates[1];
		Dividend3 = Income *DividendRates[2];
		}
		else { //그게 아니라면
		Dividend1 = Income *DividendRates[3];
		Dividend2 = Income *0;
		Dividend3 = Income *0;			
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
