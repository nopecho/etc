import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<String> rps = new ArrayList<>(Arrays.asList("����", "����","��"));
		while(true) {
			System.out.print("�ȳ��� ���� ���� ���� ��! : ");
			Scanner input2 = new Scanner(System.in);
			String user = input2.next();
			
			Random random = new Random();
			int bound = 3;
			String com = rps.get(random.nextInt(bound));
			
			if (checkWin(user,com)) {
			}
				if (continueGame()) {
					continue;
				}else {
					break;
				}
			}
		}


	public static boolean checkWin(String user,String com) {
		List<String> rps = new ArrayList<>(Arrays.asList("����", "����","��"));		
		HashMap<Integer,String> winner = new HashMap<Integer,String>();
		winner.put(0, "�����ϴ�.");
		winner.put(1, "�̰���ϴ�.");
		winner.put(2, "�����ϴ�.");
		int win;
				
		if (!rps.contains(user)) {
			System.out.println("�ٽ� �Է��� �ּ���");
			return false;
		}
		System.out.println("YOU = "+user+" vs "+com+" = COM");
		if (user == com) {
			win = 2;
		}else if (user == rps.get(0) && com == rps.get(2) ) {
			win = 1;
		}else if (user == rps.get(1) && com == rps.get(0)) {
			win = 1;
		}else if (user == rps.get(2) && com == rps.get(1)) {
			win = 1;
		}else {
			win = 0;
		}
		String getWin = winner.get(win);
		System.out.println(getWin);
		return true;
	}
	
	@SuppressWarnings("resource")
	public static boolean continueGame() {
		while (true) {
			System.out.print("����Ϸ��� 1��, �������� 2���� �Է��ϼ���. : ");
			Scanner input = new Scanner(System.in);
			String i = input.next();
			if (Integer.valueOf(i) == 1) {
				return true;
			}else if (Integer.valueOf(i) == 2 ) {
				return false;
			}else {
				System.out.println("1�Ǵ� 2�� �Է��ϼ���.");
			}
		}
	}
}


