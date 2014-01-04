import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	JLabel lbUid, lbPwd;
	JTextField txtUid, txtPwd;
	JButton btnOK, btnCancel, btnFpwd;
	int flag=0;
	Login()
	{
		super("Login");
		Container con = getContentPane();
		con.setLayout(null);
		setBounds(200,200,400,500);

		lbUid = new JLabel("User ID: ");
		lbUid.setForeground (Color.black);
		lbUid.setBounds (30, 65, 80 , 25); 
		lbPwd = new JLabel("Password: ");
		lbPwd.setForeground(Color.black);
		lbPwd.setBounds(30, 115, 80, 25);

		txtUid = new JTextField ();
		
		txtUid.setBounds(100,65,200,25);
		txtPwd = new JPasswordField();
		
		txtPwd.setBounds(100,115,200,25);
		//txtPwd.setEchoChar('*');
		btnOK = new JButton("OK");
		btnOK.setBounds (20, 165, 120, 25);
		btnOK.addActionListener(this);
		btnCancel = new JButton ("Cancel");
		btnCancel.setBounds (170, 165, 120, 25);
		btnCancel.addActionListener(this);
		con.add(lbUid);
		con.add(lbPwd);
			
		con.add(txtUid);
		con.add(txtPwd);

		con.add(btnOK);
		con.add(btnCancel);
		

		setVisible (true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnOK)
		{
		try{
			String url = "jdbc:mysql://localhost:3306/bank";
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver).newInstance();
			Connection cn1 = DriverManager.getConnection(url,"root","");
			Statement st1=cn1.createStatement();
			
			ResultSet rs1=st1.executeQuery("Select * from Login");
			 while(rs1.next())
			{
      			  boolean b1=rs1.getString(1).equals((String)txtUid.getText());
    			  boolean b2=rs1.getString(2).equals((String)txtPwd.getText());
     			 if( b1 && b2 )
			{
			 JOptionPane.showMessageDialog(null,"Login Sucessful");	
			 flag=1;
			 new bank_main();
			  setVisible(false);
			}
			}
			if(flag==0)
			{
				 JOptionPane.showMessageDialog(null,"Login UnSucessful");	
				 System.exit(0);
			}
			
		  }
			catch(Exception e)
			{System.out.println(e);}
			
			}
		
		if(ae.getSource()==btnCancel)
		{
			
			 JOptionPane.showMessageDialog(null,"GoodBye And Have a Nice Day");
			 System.exit(0);
		}
}

			

public static void main(String args[])
	{
		new Login();
	}
}
		
		
