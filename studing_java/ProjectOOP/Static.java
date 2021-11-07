class Foo{
	static String classVar="i'm class var"; //static 변수
	String instanceVar="i'm instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // 컴파일 요류 : instanceVar변수는 아직 메모리를 할당 받지 않은 상태(객체가 만들어지지 않은)이기 때문에 static메소드에서 호출시 오류
	}
	public void instanceMethod() {
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
}
public class Static {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); //컴파일 오류 : instanceVar는 non-static영역의 변수임 즉, 객체가 생성된 후 객체를 통해 접근가능
		Foo.classMethod();
	}

}
