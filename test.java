import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
	static String[] check = {"�����ϴ�.","�̰���ϴ�.","�����ϴ�."};
	static String[] win = {"����","����","��"};
	static Scanner input = new Scanner(System.in);
	static String srp = input.next();

	public static void main(String[] args) {

		Random random = new Random();	
		ArrayList<String> comList = new ArrayList();	
		for (int i  = 0;i<3;i++) {
		int bound = 3;
		comList.add(win[(random.nextInt(bound))]);
		}
		while (true) {
			
		}
				
	}
	public static boolean checkWin() {
		if (win.equals(srp)) {
		System.out.println("YOU "+srp+" vs ", +comList[0],"COM");
		}
		else {
			System.out.println("�ٽ�");
			return false;
		}
	}
}
