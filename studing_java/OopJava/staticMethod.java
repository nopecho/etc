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
class Stringout{ //StringoutŬ���� ����
	String s; //��� ����(�ʵ���1)
	public Stringout(String s) { //this : ������� ��ü �ڽ��� ��Ī
		this.s=s; //Stringout�� �ν��Ͻ��� �����ɶ� StringŸ���� �Ķ���͸� �Է� �ް�, �ش� �Ķ���͸� �ڱ��ڽ���(this) ������� s�� ������.
	}
	public void print() { //��� �Լ�(�ʵ���2)
		System.out.print(s);
	}
}

public class staticMethod {

	public static void main(String[] args) {
		Print p = new Print("-");
		p.a();
		Print.b("+");
		Stringout a=new Stringout("a�� Stringout Ŭ������ �ν��Ͻ���");
		a.print();
	}

}
