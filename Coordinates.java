package toado2d;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class Coordinates implements ActionListener {

	GraphicsDemo gd = new GraphicsDemo();

	JFrame frame = new JFrame();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
	JPanel panel1 = new JPanel();
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        
	JButton bt1 = new JButton();

	public Coordinates() {
		// frame
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ex1 - NHOM 13");

		

		tf1.setBounds(60, 50, 120, 40);
		tf1.setFocusable(true);
		tf1.setText("");
		tf1.setEditable(true);
		
		tf2.setBounds(60, 110, 120, 40);
		tf2.setFocusable(true);
		tf2.setText("");
		tf2.setEditable(true);
                
                tf3.setBounds(60, 260, 120, 40);
		tf3.setFocusable(true);
		tf3.setText("");
		tf3.setEditable(true);
                
                tf4.setBounds(60, 320, 120, 40);
		tf4.setFocusable(true);
		tf4.setText("");
		tf4.setEditable(true);
		
		label1.setBounds(10, 50, 50, 40);
		label1.setEnabled(false);
		label1.setText("Xa: ");
		label1.setFont(new Font("Ink Free", Font.BOLD, 13));

		label2.setBounds(10, 110, 50, 40);
		label2.setEnabled(false);
		label2.setText("Ya: ");
		label2.setFont(new Font("Ink Free", Font.BOLD, 13));

		label3.setBounds(45, 170, 200, 30);
		label3.setEnabled(false);
		label3.setText("Limit: (-40,40)");
		label3.setFont(new Font("Ink Free", Font.BOLD, 18));

                label4.setBounds(10, 260, 50, 40);
		label4.setEnabled(false);
		label4.setText("Xb: ");
		label4.setFont(new Font("Ink Free", Font.BOLD, 13));
                
                label5.setBounds(10, 320, 50, 40);
		label5.setEnabled(false);
		label5.setText("Yb: ");
		label5.setFont(new Font("Ink Free", Font.BOLD, 13));
                
		bt1.setText("Draw!");
		bt1.setBounds(70, 210, 80, 40);
		bt1.setBorder(BorderFactory.createBevelBorder(1));
		bt1.setFocusable(false);
		bt1.setFont(new Font("Ink Free", Font.BOLD, 18));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int a = Integer.parseInt(tf1.getText()) * 5;
					int b = Integer.parseInt(tf2.getText()) * 5;
                                        int c = Integer.parseInt(tf3.getText()) * 5;
                                        int d = Integer.parseInt(tf4.getText()) * 5;
					
                                        if (a >= -200 && a <= 200 && b >= -200 && b <= 200
                                                && c>= -200 && c <= 200 && d >= -200 && d <= 200) {
						if (a <= 0)
							a = 200 + a;
						else
							a = 200 + a;
						if (b <= 0)
							b = 200 - b;
						else
							b = 200 - b;
                                                if (c <= 0)
							c = 200 + c;
						else
							c = 200 + c;
						if (b <= 0)
							d = 200 - d;
						else
							d = 200 - d;
                                                                                               
                                                   
						gd.x = a;
						gd.y = b;
						System.out.println(gd.x);
						System.out.println(gd.y);
                                                
                                                gd.m = c;
						gd.n = d;
						System.out.println(gd.m);
						System.out.println(gd.n);
                                                
						gd.repaint();
					} 
						else {
						String message = "Vui long nhap dung dinh dang! ";
						JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception q) {
					String message = "Vui long nhap dung dinh dang! ";
					JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		frame.add(label3);
		frame.add(label2);
		frame.add(label1);
                frame.add(label4);
                frame.add(label5);
                frame.add(tf4); 
                frame.add(tf3);                
		frame.add(tf2);
		frame.add(tf1);
		frame.add(bt1);
		frame.add(gd);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

	}

}

