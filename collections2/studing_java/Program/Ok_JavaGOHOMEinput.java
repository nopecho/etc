import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class Ok_JavaGOHOMEinput {
	
	//parameter(�Ű�����)
	public static void main(String[] args) {
		String user =args[0];
		String bright =args[1];
		//������ �̸� ���α׷� �����
		//1.elevator call
		Elevator myElevator = new Elevator(user);
		myElevator.callForUp(1);
						
		//2.security off
		Security mySecurity = new Security(user);
		mySecurity.off();
		
		//3.light on
		Lighting hallLamp = new Lighting(user +" / Hall Lamp");
		hallLamp.on();
		
		Lighting roomLamp = new Lighting(user+ " / Room Lamp");
		roomLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(user+" / mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
				
	}

}
