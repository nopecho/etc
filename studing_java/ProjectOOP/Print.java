public class Print {
	private String name;
	private String delimiter;
	Print(){
		this("�̸�����","������ ����");
	}
	
	Print(String name,String delimiter){
		this.name=name;
		this.delimiter=delimiter;
	}
	public void show() {
		System.out.println(delimiter);
		System.out.println(name);
	}
}