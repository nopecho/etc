public class IfApp {

	public static void main(String[] args) {
		
		System.out.println("a");
		if(false) { //만약 ()안의 값이 false라면
			System.out.println(1); // 1을 출력해라
		}else if(true) { // 그렇지않고 만약 ()안의 값이 true면
			System.out.println(2); // 2를 출력해라
		}else { //그것도 아니면
			System.out.println(3); // 3을 출력해라
		}
		System.out.println("b");
	}
}
