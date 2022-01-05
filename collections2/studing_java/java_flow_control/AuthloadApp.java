import javax.swing.JOptionPane;

public class AuthloadApp {

	public static void main(String[] args) {
		String[][] user = {{"nopecho","1234"},{"hyunjun","5678"},{"mrcho","6418"}};
		
		String inputId = JOptionPane.showInputDialog("Enter a ID");
		String inputPass = JOptionPane.showInputDialog("Enter a password");
		
		boolean isLogined = false;
		
		for(int i=0;i<user.length;i++) {
			String[] current = user[i];
			if(current[0].equals(inputId) && current[1].equals(inputPass)) {
				isLogined=true;
				break;
			}
		}
		if (isLogined) {
			System.out.println("<Succese Login>\nHello! "+inputId);
		}else {
			System.out.println("<False Login>\nCheck Your ID");
			
		}
	}

}
