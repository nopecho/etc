import java.util.ArrayList;
import java.util.Scanner;

public class arrApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		int count = 0;
		int key=sc.nextInt();
		
		System.out.println("����Ʈ�� ����� �ּ���");

		 for(int i=0;i<5;i++) {
			 System.out.print(i+"��° ���� : ");
			 int z = sc.nextInt();
			 numlist.add(z);
		  }		 
		 System.out.println("����Ʈ = "+numlist);
		 System.out.print("Ž�� �� ���� �Է��ϼ��� : ");
		 	 
		 for (int i=0;i<numlist.size();i++) {
			 if (key==numlist.get(i)) {
				 System.out.print(i+"");
			 }else {
				 count++;
			 }
			 if (count==5) {
				 System.out.println("��");
			 }
		 sc.close();
	}
}

