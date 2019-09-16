package homework.lesson6.prob2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class ActionHandler implements ActionListener {

	private String description;

	public ActionHandler(String description) {
		this.description = description;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		showMessageDialog(source, description, "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
	}
}