import javax.swing.JOptionPane;

public class AuthApp {

	public static void main(String[] args) {
		String inputId = JOptionPane.showInputDialog("Enter a ID");
		String inputpass = JOptionPane.showInputDialog("Enter a password");
		String Id = "nopecho";
		String pass = "1234";
		System.out.println("hi.");
		
//		if (inputId.equals(Id)) {
//			if(inputpass.equals(pass)) {
//				System.out.println("nopecho!");
//			}else {
//				System.out.println("Wrong password!!");
//			}
//		}else {
//			System.out.println("Who are You??");
//		}
		if(inputId.equals(Id) && inputpass.equals(pass)) { //.equals�� �޼ҵ�Ÿ��! ��ü���� ������ ���ؼ� blooean���� ��ȯ�Ѵ�! ==�� �񱳸� ���� ������! &&==and!
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you???");
		}
	}
}
