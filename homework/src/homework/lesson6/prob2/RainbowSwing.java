package homework.lesson6.prob2;

import java.awt.*;

import javax.swing.*;

public class RainbowSwing extends JFrame{
	
	RainbowSwing(){
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(400, 100, 800, 600);

	        JPanel panel = new JPanel();

	        for (RainBowDesc rainBow: RainBowDesc.get()) {
	            JButton btn = new JButton();
	            btn.setBackground(rainBow.getColor());
	            btn.setOpaque(true);
	            btn.setPreferredSize(new Dimension(100, 100));
	            btn.setBorderPainted(false);
	            btn.addActionListener(new ActionHandler(rainBow.getDescription()));
	            panel.add(btn);
	        }

	        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	        add(panel);
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new RainbowSwing();
	}
}
