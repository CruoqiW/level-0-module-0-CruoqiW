import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("When is your birthday?");
		if (b.equals("06/25")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}

	}
}