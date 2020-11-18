package smg;
import java.util.Date;
import java.util.*;
import java.text.*;

public class datedate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
		int a = Integer.parseInt(ft.format(date));
		ft = new SimpleDateFormat("HH");
		a = Integer.parseInt(ft.format(date));
		System.out.println(a);
	}

}
