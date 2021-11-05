class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++) {
			if(i==0||i==2||i==7) {
				cards[i]=new SutdaCard(i+1,true);
			}else {
				cards[i]=new SutdaCard(i%10+1,false);
			}
		}
	}
	
	void shuffle() {
		SutdaCard temp;
		for(int i=0;i<CARD_NUM;i++) {
			int random=(int)(Math.random()*CARD_NUM);
			temp=cards[random];
			cards[random]=cards[i];
			cards[i]=temp;
		}
	}
	SutdaCard pick(int index) { //�����ε�
		return cards[index];
	}
	SutdaCard pick() { //�����ε�
		return cards[(int)(Math.random()*CARD_NUM)];		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Quiz_1_2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");			
		}
		System.out.println();
		System.out.println("5�� ī�� >>"+deck.pick(5));
		System.out.println("���� ī�� >>"+deck.pick());
		deck.shuffle();		
		System.out.println("<<<ī�� ����>>>");
		System.out.println("ī�� ���� �� �� 5�� ī�� >>"+deck.pick(5));
	}
}
//[������]
//
//1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
