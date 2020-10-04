package smg;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Project6ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведето своето тегло в килограми(на Земята): ");
		double weight = sc.nextDouble();
		
		String[] acceptableValues = {"Меркурий", "Венера", "Марс","Юпитер","Сатурн","Уран","Нептун"};
        
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);  
		
		String input = (String)JOptionPane.showInputDialog(dialog,
                "Изберете планета?",
                "?",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
       
        switch (input){
        case "Меркурий": System.out.println(weight*0.38); break;
        case "Венера": System.out.println(weight*0.91); break;
        case "Марс": System.out.println(weight*0.38); break;
        case "Юпитер": System.out.println(weight*2.36); break;
        case "Сатурн": System.out.println(weight*0.92); break;
        case "Уран": System.out.println(weight*0.89); break;
        case "Нептун": System.out.println(weight*1.13); break;
        }
	}

}
