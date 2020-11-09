package smg;
import javax.swing.*;

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
