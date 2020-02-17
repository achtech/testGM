package com.gm.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.gm.business.control.UserControl;

public class Authentification extends JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public static void main (String [] args){
			new Authentification();
		}
		JButton login,cancel;
		JTextField uname;
		JPasswordField pass;
		JLabel u,p;
		 public Authentification()
		 {
		 setTitle("Login");
		 setLayout(new GridLayout(3,2));
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);

		 u=new JLabel("Username");
		 p=new JLabel("Password");

		 uname=new JTextField(20);
		 pass=new JPasswordField(20);

		 login=new JButton("Login");
		 cancel=new JButton("Cancel");

		 add(u);
		 add(uname);

		 add(p);
		 add(pass);

		 add(login);
		 add(cancel);

		 uname.requestFocus();

		 cancel.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent ae)
		  {
		  System.exit(0);
		  }
		 });

		 login.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent ae)
		  {
		  String login=uname.getText();
		  String password=new String(pass.getPassword());
		  UserControl user = new UserControl();
		  boolean result = user.login(login, password);		 
		  if(result){
			  dispose();
			   new Produits();
		  }
		  }
		 });

		 pack();
		 setLocationRelativeTo(null);
		 }
}
