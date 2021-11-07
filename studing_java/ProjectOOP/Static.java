class Foo{
	static String classVar="i'm class var"; //static ����
	String instanceVar="i'm instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // ������ ��� : instanceVar������ ���� �޸𸮸� �Ҵ� ���� ���� ����(��ü�� ��������� ����)�̱� ������ static�޼ҵ忡�� ȣ��� ����
	}
	public void instanceMethod() {
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
}
public class Static {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); //������ ���� : instanceVar�� non-static������ ������ ��, ��ü�� ������ �� ��ü�� ���� ���ٰ���
		Foo.classMethod();
	}

}
