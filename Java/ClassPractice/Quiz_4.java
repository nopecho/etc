class Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product(){
		this(3000);
	}
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super();
	}

	public String toString() {
		return "Tv";
	}
}


public class Quiz_4 {

	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.bonusPoint);
	}
}
