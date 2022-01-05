import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	                            //매개변수,parameter 메소드에 적용할 변수
	public static String twoTimes(String text, String delimiter) {
		String out="";
		out=out+delimiter + "\n";
		out=out+text+"\n";
		out=out+text+"\n";
		return out;
	}

	public static void main(String[] args) throws IOException {
						//인자, argument 호출된 메소드에 적용시킬 인자
		System.out.println(twoTimes("a","b"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","-"));
		fw.close();
		
		
		
	}
}
