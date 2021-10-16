//패키지,클래스,메소드,인스턴스,상속

//패키지>클래스>메소드 쉽게 보면 이런식

import java.io.IOException;
import java.io.PrintWriter; // [import(가져온다)뭐를? java.io(java입출력 관련)패키지 안의 PrintWriter클래스를] import를 이용해 패키지(클래스의 모음)를 불러올수있다.
public class instanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt"); //p1 은 PrintWriter클래스의 맴버변수,new PrintWriter("result.txt")를 통해 새로운 인스턴스(객체) 생성
		p1.write("hello kdo\n");
		p1.write("12+123");
		p1.close();
		p1.toString();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello 2");
		p2.close();
		


	}

}
