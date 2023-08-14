package Online_Exam;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class login extends JFrame implements ActionListener
{
		JButton b1;
		JPanel newPanel;
		JLabel userLabel, passLabel;
		final JTextField textField1, textField2;

		login() {
			userLabel = new JLabel();
			userLabel.setText("    Username :");
			textField1 = new JTextField(15);
			passLabel = new JLabel();
			passLabel.setText("    Password :");
			textField2 = new JPasswordField(8);
			b1 = new JButton("   SUBMIT   ");
			newPanel = new JPanel(new GridLayout(3, 1));
			newPanel.add(userLabel);
			newPanel.add(textField1);
			newPanel.add(passLabel);
			newPanel.add(textField2);
			newPanel.add(b1);
			add(newPanel, BorderLayout.CENTER);
			b1.addActionListener(this);
			setTitle("Login Form ");
		}

		public void actionPerformed(ActionEvent ae) {
			String userValue = textField1.getText();
			String passValue = textField2.getText();
			if (!passValue.equals(""))
				new OnlineTestBegin(userValue);
			else {
				textField2.setText("Enter Password");
				actionPerformed(ae);
			}
		}
	}


