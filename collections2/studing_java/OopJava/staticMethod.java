class Print{
	
	public String del;
	
	public Print() {
	}	
	public Print(String del) {
		this.del=del;
	}
	
	public void a() {
		System.out.print(this.del);
		System.out.println("a");
	}
	public static void b(String del) {
		System.out.print(del);
		System.out.println("b");
	}
}
class Stringout{ //Stringout클래스 생성
	String s; //멤버 변수(필드요소1)
	public Stringout(String s) { //this : 만들어진 객체 자신을 지칭
		this.s=s; //Stringout의 인스턴스는 생성될때 String타입의 파라미터를 입력 받고, 해당 파라미터를 자기자신의(this) 멤버변수 s로 가진다.
	}
	public void print() { //멤버 함수(필드요소2)
		System.out.print(s);
	}
}

public class staticMethod {

	public static void main(String[] args) {
		Print p = new Print("-");
		p.a();
		Print.b("+");
		Stringout a=new Stringout("a는 Stringout 클래스의 인스턴스임");
		a.print();
	}

}
