//��Ű��,Ŭ����,�޼ҵ�,�ν��Ͻ�,���

//��Ű��>Ŭ����>�޼ҵ� ���� ���� �̷���

import java.io.IOException;
import java.io.PrintWriter; // [import(�����´�)����? java.io(java����� ����)��Ű�� ���� PrintWriterŬ������] import�� �̿��� ��Ű��(Ŭ������ ����)�� �ҷ��ü��ִ�.
public class instanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt"); //p1 �� PrintWriterŬ������ �ɹ�����,new PrintWriter("result.txt")�� ���� ���ο� �ν��Ͻ�(��ü) ����
		p1.write("hello kdo\n");
		p1.write("12+123");
		p1.close();
		p1.toString();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello 2");
		p2.close();
		


	}

}
