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
		if(inputId.equals(Id) && inputpass.equals(pass)) { //.equals는 메소드타입! 객체끼리 내용을 비교해서 blooean값을 반환한다! ==는 비교를 위한 연산자! &&==and!
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you???");
		}
	}
}
