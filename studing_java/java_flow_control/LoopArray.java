
public class LoopArray {

	public static void main(String[] args) {
		String[] user = new String[3];
		user[0]="HyunJun";
		user[1]="Nopecho";
		user[2]="Gildong";
		
		for(int i=0; i<user.length; i++) {
			System.out.println("<li> "+user[i]+" </li>");
		}

	}

}
