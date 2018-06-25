import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String c = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you went to China last summer," + c );
	}

}
