package homework.lesson6.prob1;

import javax.swing.*;

public class SwingGUI extends JFrame{
	
	SwingGUI(){
		JFrame f  = new JFrame();
		f.setSize(500, 400);
		f.setLocation(100,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton("Count Letters");
		btn1.setBounds(50, 50, 200, 40);
		JButton btn2 = new JButton("Reverse Letters");
		btn2.setBounds(50,100, 200, 40);
		JButton btn3  = new JButton("Remove Duplicates");
		btn3.setBounds(50, 150, 200, 40);
		JLabel l1 = new JLabel("Input");
		l1.setBounds(300, 50, 200, 40);
		JTextField tx1 = new JTextField(20);
		tx1.setBounds(290,75, 200, 40);
		JLabel l2 = new JLabel("Output");
		l2.setBounds(300, 105, 200, 40);
		JTextField tx2 = new JTextField(20);
		tx2.setBounds(290, 130, 200, 40);
		f.add(btn1);
		f.add(btn2);
		f.add(l1);
		f.add(tx1);
		f.add(l2);
		f.add(tx2);
		f.add(btn3);
		btn1.addActionListener(e->{
			int count = tx1.getText().length();
			tx2.setText(String.valueOf(count));
		});
		btn2.addActionListener(e->{
			String rev = reverseString(tx1.getText());
			tx2.setText(rev);
		});
		btn3.addActionListener(e->{
			String s = tx1.getText();
			s = removeDuplicates(s);
			tx2.setText(s);
		});
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		
	}

	public String reverseString(String s) {
		if (s == null || s.equals(""))
			return "";
		return reverseString(s.substring(1)) + s.charAt(0);
	}
	
	public String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		int idx;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			idx = str.indexOf(c, i + 1);
			if (idx == -1) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new SwingGUI();
	}

}
