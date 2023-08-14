package Online_Exam;
import javax.swing.*;
public class OnlineExam
{
		public static void main(String args[]) {
			try {
				login form = new login();
				form.setSize(400, 150);
				form.setVisible(true);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}

