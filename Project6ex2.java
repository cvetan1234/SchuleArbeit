package smg;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Project6ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ ����� � ���������(�� ������): ");
		double weight = sc.nextDouble();
		
		String[] acceptableValues = {"��������", "������", "����","������","������","����","������"};
        
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);  
		
		String input = (String)JOptionPane.showInputDialog(dialog,
                "�������� �������?",
                "?",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
       
        switch (input){
        case "��������": System.out.println(weight*0.38); break;
        case "������": System.out.println(weight*0.91); break;
        case "����": System.out.println(weight*0.38); break;
        case "������": System.out.println(weight*2.36); break;
        case "������": System.out.println(weight*0.92); break;
        case "����": System.out.println(weight*0.89); break;
        case "������": System.out.println(weight*1.13); break;
        }
	}

}
