import java.util.ArrayList;
import java.util.Scanner;

public class arrApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		int count = 0;
		int key=sc.nextInt();
		
		System.out.println("리스트를 만들어 주세요");

		 for(int i=0;i<5;i++) {
			 System.out.print(i+"번째 숫자 : ");
			 int z = sc.nextInt();
			 numlist.add(z);
		  }		 
		 System.out.println("리스트 = "+numlist);
		 System.out.print("탐색 할 값을 입력하세요 : ");
		 	 
		 for (int i=0;i<numlist.size();i++) {
			 if (key==numlist.get(i)) {
				 System.out.print(i+"");
			 }else {
				 count++;
			 }
			 if (count==5) {
				 System.out.println("ㅄ");
			 }
		 sc.close();
	}
}

