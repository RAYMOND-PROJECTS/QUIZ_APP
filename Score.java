package Quiz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame{
	
	Score(String name,int score)
	{
		setBounds(750, 150, 750, 550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
				
		JLabel heading = new JLabel("Thankyou "+name+" for playing simple minds");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font("Times New Roman",Font.PLAIN,26));
		add(heading);
		
		JLabel lblscore = new JLabel("Your score is "+score);
		lblscore.setBounds(350, 200, 300, 30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lblscore);
		
		JButton submit = new JButton("play again");
		submit.setBounds(380, 270, 120, 30);
		submit.setBackground(new Color(30,144,255));
		submit.setForeground(Color.WHITE);
		add(submit);
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Login();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Score("User",0);
	}
}
