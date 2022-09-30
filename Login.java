package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon icon;
	JButton rules,back;
	Login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Socratisraj\\Desktop\\Quiz.jpg"));
		JLabel image = new JLabel(il);
		image.setBounds(0, 0, 1200, 700);
		add(image,JLabel.CENTER);
		
		JLabel heading = new JLabel("simple minds");
		heading.setBounds(400, 70, 600, 45);
		heading.setFont(new Font("Times New Roman",Font.BOLD,24));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(300, 150, 300, 20);
		name.setFont(new Font("Times New Roman",Font.BOLD,18));
		name.setForeground(new Color(000000));
		add(name);
		
		JTextField tfname = new JTextField();
		tfname.setBounds(300, 200, 300, 25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,16));
		tfname.setAlignmentX(CENTER_ALIGNMENT);
		add(tfname);
		
		JButton rules = new JButton("Rules");
		rules.setBounds(300, 270, 120, 25);
		rules.setBackground(new Color(30,144,200));		
		rules.setForeground(Color.BLACK);
		//rules.addActionListener(this);
		add(rules);
		rules.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==rules) {
					String name = tfname.getText();
					setVisible(false);
					new Rules(name);
				}
				
					
			}
		});
		
		JButton back = new JButton("back");
		back.setBounds(500, 270, 120, 25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.BLACK);
		//back.addActionListener(this);
		add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==back)
				{
					setVisible(false);
				}
			}
		});
		
		icon = new ImageIcon("C:\\Users\\Socratisraj\\Pictures\\Quiz_app\\pngtree-quiz-icon-with-chronometer-png-image_3123223.jpg");
		setIconImage(icon.getImage());
		
		setSize(900, 500);
		setLocation(400, 150);		
		setVisible(true);
	
	}
	
		public static void main(String[] args) {
			new Login();
		}
}
