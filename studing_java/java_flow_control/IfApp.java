public class IfApp {

	public static void main(String[] args) {
		
		System.out.println("a");
		if(false) { //���� ()���� ���� false���
			System.out.println(1); // 1�� ����ض�
		}else if(true) { // �׷����ʰ� ���� ()���� ���� true��
			System.out.println(2); // 2�� ����ض�
		}else { //�װ͵� �ƴϸ�
			System.out.println(3); // 3�� ����ض�
		}
		System.out.println("b");
	}
}
