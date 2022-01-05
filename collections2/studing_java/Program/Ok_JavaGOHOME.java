import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class Ok_JavaGOHOME {

	public static void main(String[] args) {
		String user ="NOPECHO APT 302";
		//집갈때 미리 프로그램 만들기
		//1.elevator call
		Elevator myElevator = new Elevator(user);
		myElevator.callForUp(1);
						
		//2.security off
		Security mySecurity = new Security(user);
		mySecurity.off();
		
		//3.light on
		Lighting hallLamp = new Lighting(user);
		hallLamp.on();
		
		Lighting roomLamp = new Lighting(user);
		roomLamp.on();
		
	}

}
