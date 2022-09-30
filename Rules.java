package Quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame{
	
	JButton back,start;
	String name;
	
	Rules(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("welcome "+name+" to simple minds");
		heading.setBounds(20, 20, 700, 26);
		heading.setFont(new Font("Times New Roman",Font.BOLD,30));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules = new JLabel();	
		rules.setBounds(20, 90, 700, 315);
		rules.setFont(new Font("Times New Roman",Font.PLAIN,16));
		
		rules.setText(
				"<html>"+
		                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
		                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
		                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
		                "4. Crying is allowed but please do so quietly." + "<br><br>" +
		                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
		                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
		                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
		                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
		            "<html>"	
		);
		add(rules);
		JButton back = new JButton("back");
		back.setBounds(500, 400, 120, 25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.BLACK);
		//back.addActionListener(this);
		add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==back) {
					setVisible(false);
				}
			}
		});

		JButton start = new JButton("start");
		start.setBounds(100, 400, 120, 25);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.BLACK);
		add(start);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()== start) {
					setVisible(false);
					new Quiz(name);	
				}else {
					setVisible(false);
					new Login();
				}
			}
		});
		
		setSize(750, 500);
		setLocation(350, 100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Rules("User");
	}
}
