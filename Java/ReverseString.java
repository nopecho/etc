import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			
			System.out.print("������ ���ڸ� �Է��ϼ���.>>");
			String text = sc.next();
			String[] textlist = new String[text.length()];
			
			for (int i=0;i<textlist.length;i++) {
				char c = text.charAt(i);
				textlist[i]=String.valueOf(c);
			}
			
			for (int i=textlist.length-1;i>=0;i--) {
				System.out.print(textlist[i]);
			}					
			System.out.print("\n�ٽ� �ҷ���? y or n :");
			String restart = sc.next();
			if(restart.equals("y")) {
				continue;
			}else if(restart.equals("n")) {
				break;
			}sc.close();	
		}
	}	
}	

