import javax.swing.JOptionPane;
import java.util.ArrayList;
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
//		ValueOfSupply: 공급가
//		ExpenseRate: 매입가 비율
//		VatRate: 부가가치세 비율
//		VAT: 부가가치세
//		Total: 총 가격
//		Expense: 마진
//		Income: 순이익
		
		String Value = JOptionPane.showInputDialog("Enter a WON");
		String person = JOptionPane.showInputDialog("Enter a person");
		double ValueOfSupply = Double.parseDouble(Value);
		double ExpenseRate = 0.3;
		double VatRate = 0.1;
		double VAT = ValueOfSupply*VatRate;
		double Total = ValueOfSupply+VAT;
		double Expense = ValueOfSupply*ExpenseRate;
		double Income = ValueOfSupply-Expense;
		ArrayList<String> Dividend = new ArrayList<String>();
		int z = 0;
		while(z < Integer.parseInt(person) ) {
			Dividend.add("Divdend"+z);
			z+=1;
		}
		double[] DividendRates = new double[Dividend.size()];// double[] <- double형 데이터로 이루어진 배열
		DividendRates[0]=0.5;
		DividendRates[1]=0.4;
		DividendRates[2]=0.3;
		DividendRates[3]=0.2;
		DividendRates[4]=0.1;
		
		System.out.println("Value of supply : "+ValueOfSupply);		
		System.out.println("VAT : "+VAT);	
		System.out.println("TOTAL : "+Total);				
		System.out.println("Expense : "+Expense);		
		System.out.println("Income : "+Income);		
		
		int i = 0;
		while( i < (Dividend.size()) ) {
			System.out.println(Dividend.get(i+1)+" : "+(Income*DividendRates[i]));
			i+=1;
		}
		

	}

}
