import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<String> rps = new ArrayList<>(Arrays.asList("가위", "바위","보"));
		while(true) {
			System.out.print("안내면 진다 가위 바위 보! : ");
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
		List<String> rps = new ArrayList<>(Arrays.asList("가위", "바위","보"));		
		HashMap<Integer,String> winner = new HashMap<Integer,String>();
		winner.put(0, "졌습니다.");
		winner.put(1, "이겼습니다.");
		winner.put(2, "비겼습니다.");
		int win;
				
		if (!rps.contains(user)) {
			System.out.println("다시 입력해 주세요");
			return false;
		}
		System.out.println("YOU = "+user+" vs "+com+" = COM");
		if (user.equals(com)) {
			win = 2;
		}else if (user.equals(rps.get(0)) && com.equals(rps.get(2)) ) {
			win = 1;
		}else if (user.equals(rps.get(1)) && com.equals(rps.get(0)) ) {
			win = 1;
		}else if (user.equals(rps.get(2)) && com.equals(rps.get(1)) ) {
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
			System.out.print("계속하려면 1번, 끝내려면 2번을 입력하세요. : ");
			Scanner input = new Scanner(System.in);
			String i = input.next();
			if (Integer.valueOf(i) == 1) {
				return true;
			}else if (Integer.valueOf(i) == 2 ) {
				return false;
			}else {
				System.out.println("1또는 2를 입력하세요.");
			}
		}
	}
}


