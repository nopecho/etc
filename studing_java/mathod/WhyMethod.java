import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	                            //�Ű�����,parameter �޼ҵ忡 ������ ����
	public static String twoTimes(String text, String delimiter) {
		String out="";
		out=out+delimiter + "\n";
		out=out+text+"\n";
		out=out+text+"\n";
		return out;
	}

	public static void main(String[] args) throws IOException {
						//����, argument ȣ��� �޼ҵ忡 �����ų ����
		System.out.println(twoTimes("a","b"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","-"));
		fw.close();
		
		
		
	}
}
