
public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users= new String[3]; //데이터타입[] 변수명 = new 데이터타입[] 으로 array생성 가능
		users[0]="hyunjun";
		users[1]="hayeon";
		users[2]="nopecho";
		
		System.out.println(users[2]);
		System.out.println(users.length);
		
		int[] score = {10,100,50};
		System.out.println(score[2]);

	}

}
