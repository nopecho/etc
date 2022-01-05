class MyTv2 {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1; 

	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;

	public void setIsPowerOn(){
		this.isPowerOn=true;
	}
	public boolean getIsPowerOn() {
		return this.isPowerOn;
	}
	public void setChannel(int channel) {	
		if(channel>MAX_CHANNEL ||channel<MIN_CHANNEL) {
			return;
		}
		prevChannel=this.channel;
		this.channel=channel;
	}
	public int getChannel() {
		return this.channel;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<MIN_VOLUME) {
			return;
		}
		this.volume=volume;
	}
	public int getVolume() {
		return this.volume;
	}
	public void gotoPrevChannel() {
		setChannel(this.prevChannel);
	}
}
public class Quiz_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());

		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
