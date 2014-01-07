import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bank_main extends JFrame implements ActionListener
 {
    JMenuBar bar;
    JMenu customer,account,search,loan,hlp,employee;
    JMenuItem newln,viewln,updatec,newac,viewac,sc,abt,reportc,deleteac,sname,sno,deposit,withdraw,statement,newe,viewe,deletee,exit;
  
  bank_main()
	{
	super("Main");
	JPanel con = (JPanel) getContentPane();
	con.setLayout(new FlowLayout(0));
	setBounds(200,200,400,500);
	

	bar=new JMenuBar();
	customer=new JMenu("Customer");
	customer.setMnemonic((int)'C');
	
	account=new JMenu("Account");
	account.setMnemonic((int)'A');
		
		
	search=new JMenu("Search");
	search.setMnemonic((int)'S');
	
	loan=new JMenu("Loan");
	loan.setMnemonic((int)'L');
	
      	hlp=new JMenu("Help");	
	hlp.setMnemonic((int)'H');

	employee=new JMenu("Employee");
	employee.setMnemonic((int)'E');
	
        	newac=new JMenuItem("Create new Account");
	customer.add(newac);
	newac.addActionListener(this);
	viewac=new JMenuItem("View Account");
	customer.add(viewac);
	deleteac=new JMenuItem("Delete Account");
	deleteac.addActionListener(this);
	customer.add(deleteac);
	updatec=new JMenuItem("Update Account");
	customer.add(updatec);
	reportc=new JMenuItem("Print Report");
	reportc.addActionListener(this);
	customer.add(reportc);
	

	sname=new JMenuItem("Search By Name");
	sname.addActionListener(this);
	search.add(sname);
	sno=new JMenuItem("Search By Number");
	sno.addActionListener(this);
	search.add(sno);
	
	newe=new JMenuItem("New Employee Record");
	newe.addActionListener(this);
	employee.add(newe);
	viewe=new JMenuItem("View Employee Record");
	employee.add(viewe);
	deletee=new JMenuItem("Delete Record");
	deletee.addActionListener(this);
	employee.add(deletee);
	
	
	deposit=new JMenuItem("Deposit");
	deposit.addActionListener(this);
	account.add(deposit);
	withdraw=new JMenuItem("Withdraw");
	withdraw.addActionListener(this);
	account.add(withdraw);
	statement=new JMenuItem("Show Statement");
	account.add(statement);


	newln=new JMenuItem("Create new Loan");
	loan.add(newln);
	newln.addActionListener(this);
	
	viewln=new JMenuItem("View Loan Account");
	loan.add(viewln);
	viewln.addActionListener(this);

	sc=new JMenuItem("Shortcuts");
	hlp.add(sc);
	abt=new JMenuItem("About");
	abt.addActionListener(this);
	hlp.add(abt);
	exit=new JMenuItem("Exit");
	hlp.add(exit);
	exit.addActionListener(this);


	bar.add(customer);
	bar.add(account);
	bar.add(search);
	bar.add(loan);
	bar.add(employee);
	bar.add(hlp);

	con.add(bar);
	
	setVisible(true);
	System.out.println("Thank You For Using Bank System");
	System.out.println("A Project By");
	System.out.println("Harshal Tendulkar & Bhavin Shah");
	
	}


		public void actionPerformed (ActionEvent ae) 
		{
			Object obj = ae.getSource();
			{
			if(obj==newe)
			{
			new new_employee();
			setVisible(false);
			}
	
			if(obj==abt)
			{
			new about();
			setVisible(false);
			}
			

			if(obj==deletee)
			{
			new delete_employee();
			setVisible(false);
			}
			
			
			if(obj==newac)
			{
			new new_account();
			setVisible(false);
			}
			
			if(obj==deleteac)
			{
			new delete_account();
			setVisible(false);
			}
		
			if(obj==viewln)
			{
			new existing_loan();
			setVisible(false);
			}

			if(obj==newln)
			{
			new new_loan();
			setVisible(false);
			}
			
			if(obj==deposit)
			{
			new deposit();
			setVisible(false);
			}

			if(obj==withdraw)
			{
			new withdraw();
			setVisible(false);
			}

			if(obj==exit)
			{
			JOptionPane.showMessageDialog(null,"Thankyou for Using Bank System");
			System.exit(0);
			}
			
			if(obj==sno)
			{
			new search_customer_number();
			setVisible(false);
			}

			if(obj==sname)
			{
			new search_customer_name();
			setVisible(false);
			}

			if(obj==reportc)
			{
			new reportc("1");
			setVisible(false);
			}	
		}



		








}
	    public static void main(String str[])
		{
 			bank_main obj= new bank_main();
			
 		}
	}

	
	
	
