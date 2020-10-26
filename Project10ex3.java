package smg;
import javax.swing.*;

class TV {
	public void print(String a) {
		System.out.println(a);
	}
	public boolean IsItTurnedOn = false;
	public int channel = 0;
	public int volume = 0;
	public TV (){
	}
	public void turnOn() {
		IsItTurnedOn = true;
		print("Turned on!");
	}
	public void turnOff() {
		IsItTurnedOn = false;
		print("Turned on!");
	}
	public void setChannel(int newChannel) {
		if (IsItTurnedOn == true) { channel = newChannel;}
		print("Channel is: " + channel);
	}
	public void setVolume(int newVolume) {
		if (IsItTurnedOn == true) { volume = newVolume;}
		print("Volume is: " + volume);
	}
	public void channelUp() {
		if (IsItTurnedOn == true) { channel++;}
		print("Channel is: " + channel);
	}
	public void channelDown() {
		if (IsItTurnedOn == true) { channel--;}
		print("Channel is: " + channel);
	}
	public void volumeUp() {
		if (IsItTurnedOn == true) { volume++;}
		print("Volume is: " + volume);
	}
	public void volumeDown() {
		if (IsItTurnedOn == true) { volume--;}
		print("Volume is: " + volume);
	}	
}
public class Project10ex3 {

	public static void main(String[] args) {
		System.out.print("");
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setVolume(100);
		tv1.setChannel(200);
		tv1.channelUp();
		tv1.volumeDown();
		tv1.channelDown();
	}

}
