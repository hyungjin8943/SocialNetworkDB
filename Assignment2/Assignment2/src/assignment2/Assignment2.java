package assignment2;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.spatial.geometry.JGeometry;
import oracle.sql.STRUCT;


class LoginPanel extends JPanel{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField username;
	JPasswordField password;
	JButton login;
	JButton signup;
	private String UserName;

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
	}

	LoginPanel(){
		this.setBounds(810, 30, 250, 100);
		this.setLayout(new GridLayout(3,2));
		this.add(new Label("UserName: "));
		username = new JTextField();
        this.add(username);
		this.add(new Label("Password: "));
		password = new JPasswordField();
        this.add(password);
        login = new JButton("Login");
        signup = new JButton("Signup");
        this.add(login);
        this.add(signup);
	}
	public String getUserName(){
		return UserName;
	}
	public void setUserName(String user){
		UserName=user;
	}
}

class SignupPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JButton login;
	JButton signup;
	JButton logout;
	JPasswordField password;
	JPasswordField password2;

	JTextField country;
	JTextField state;
	JTextField city;
	JTextField email;
	JTextField birthday;
	JTextField fname;
	JTextField lname;
	JTextField str_no;
	JTextField str_address;
	JTextField zip;

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
		enableButton();
	}

	SignupPanel(){
		this.setBounds(810, 150, 250, 300);
		this.setLayout(new GridLayout(11,2));
		this.add(new Label("Email: "));
		email = new JTextField();
        this.add(email);
		this.add(new Label("Password: "));
		password = new JPasswordField();
        this.add(password);
		this.add(new Label("ReEnter Password: "));
		password2 = new JPasswordField();
        this.add(password2);
		this.add(new Label("First Name: "));
		fname = new JTextField();
        this.add(fname);
		this.add(new Label("Last Name: "));
		lname = new JTextField();
        this.add(lname);
		this.add(new Label("City: "));
		city = new JTextField();
        this.add(city);
		this.add(new Label("Birthday : "));
		birthday = new JTextField();
        this.add(birthday);
		this.add(new Label("strNo : "));
		str_no = new JTextField();
        this.add(str_no);
		this.add(new Label("strAdress : "));
		str_address = new JTextField();
        this.add(str_address);
        this.add(new Label("Zip : "));
		zip = new JTextField();
        this.add(zip);
        this.add(new Label(""));
        signup = new JButton("signup");
        this.add(signup);
        disablePanel();
	}

	public void disableButton(){
		signup.setEnabled(false);
	}
	public void enableButton(){
		signup.setEnabled(true);
	}
}

class SqlPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextArea SQLArea = null;
	JScrollPane scrollPane = null;
	JLabel showLabel;
	SqlPanel(){
		setInputArea();
	}

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
	}

	private void setInputArea(){
		setBounds(0, 495,810, 150);
		SQLArea = new JTextArea(6,68);
		SQLArea.setLineWrap(true);
		scrollPane = new JScrollPane(SQLArea);
		this.add(scrollPane);
	}
}

class Frame0 extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtfield;
	JButton btn1;
	String lbltext;
	JLabel label;
	String FriendType[] = { "Normal Friend", "Close Friend", "Family" };
	JComboBox combo;

	Frame0(String text,int mode){
		this.lbltext = text;
		 this.setSize(300, 120);
		 this.setResizable(false);
		setLayout(new FlowLayout());
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		label = new JLabel(text);
		add(label);
		txtfield = new JTextField(10);
        add(txtfield);
        combo= new JComboBox(FriendType);
        if(mode==1)
        	add(combo);
        btn1 = new JButton("OK");
        add(btn1);

	}
}

class Frame1 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtfield;
	JButton btn1;
	JButton btn2;
	String lbltext0;
	String lbltext1;
	JLabel lbl0;
	JLabel lbl1;
	JTextArea textArea = null;

	Frame1(String text0, String text1) {
		this.lbltext0 = text0;
		this.lbltext1 = text1;
		this.setResizable(false);
		setLayout(null);
		 this.setSize(300, 256);
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl0 = new JLabel(text0);
		add(lbl0);
		lbl0.setBounds(10, 10, 70, 30);

		txtfield = new JTextField(10);
		add(txtfield);
		txtfield.setBounds(85, 10, 150, 30);

		lbl1 = new JLabel(text1);
		add(lbl1);
		lbl1.setBounds(10, 45, 70, 30);

		textArea = new JTextArea(8, 10);
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		this.add(scrollPane);
		scrollPane.setBounds(85,55,180,90);

		btn1 = new JButton("OK");
		btn1.setBounds(90,165,90, 30);
		add(btn1);

	}
}


class Frame2 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtfield;
	JButton btn1;
	JButton btn2;
	String lbltext0;
	JLabel lbl0;

	Frame2(String text0) {
		this.setResizable(false);
		this.lbltext0 = text0;
        this.setSize(300, 150);
        this.setResizable(false);
		setLayout(null);

		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl0 = new JLabel(text0);
		add(lbl0);
		lbl0.setBounds(10, 10, 70, 30);

		txtfield = new JTextField(10);
		add(txtfield);
		txtfield.setBounds(85, 10, 100, 30);

		btn1 = new JButton("Decline");
		btn2 = new JButton("Accept ALL");

		btn1.setBounds(190,10,90, 30);
		btn2.setBounds(70,60,150, 30);
		add(btn1);
		add(btn2);

	}
}


class Frame3 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField []txtfield;
	JButton btn1;
	JLabel []lbl;
	Frame3(String text0) {
		this.setResizable(false);
		this.setTitle(text0);
        this.setSize(1000, 70);
        this.setResizable(false);
		setLayout(new GridLayout(1,9));

		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl = new JLabel[4];
		for(int i=0;i<4;i++)
			lbl[i] = new JLabel();
		lbl[0].setText("topleft x:");
		lbl[1].setText("topleft y:");
		lbl[2].setText("bottomright x:");
		lbl[3].setText("bottomright y:");

		txtfield = new JTextField[4];
		for(int i=0;i<4;i++)
			txtfield[i] = new JTextField();

		btn1 = new JButton("search");
		for(int i=0;i<4;i++)
		{
			add(lbl[i]);
			add(txtfield[i]);
		}
		add(btn1);
	}
}


class PostandSearchPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextArea textArea = null;
	JScrollPane scrollPane = null;

	JTextField text;
	JLabel showLabel;
	JButton []buttons;

	public void disableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(false);
	}

	public void enableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(true);
	}

	PostandSearchPanel(){
		setLayout(null);
		this.setBounds(0, 10,780, 120);
        setInputArea();

		buttons = new JButton[2];
		buttons[0]= new JButton("Post");
		buttons[1]= new JButton("Search For Friend");

		text  = new JTextField(15);
		text.setLocation(10,3);
		text.setText("");
		text.setBounds(460, 40, 150, 25);
		buttons[0].setBounds(380,40,60,25);
		buttons[1].setBounds(620,40,130,25);

		
		this.add(buttons[0]);
		this.add(text);
		this.add(buttons[1]);

	}
	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void clearPanel(){
		text.setText("");
	    textArea.setText("");
	}

	public  void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
		enableButton();
	}

	public void setInputArea(){
		textArea = new JTextArea(4,30);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 10, 360, 90);
		this.add(textArea);
	}
 }

class ResultPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea resultArea = null;
	JScrollPane scrollPane = null;
	ResultPanel(){
		setResultArea();
	}

	public void setResultArea(){
		resultArea = new JTextArea(10,30);
		resultArea.setLineWrap(true);
		resultArea.setBounds(10, 140,750, 250);
		
		scrollPane = new JScrollPane(resultArea);
		this.add(scrollPane);

	}
}

class ButtonPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextArea textArea = null;
	JScrollPane scrollPane = null;
	JLabel showLabel;
	JButton []buttons;

	ButtonPanel(){
	  this.setBounds(10, 415, 770, 40);
	 	buttons = new JButton[8];
		this.setLayout(new GridLayout(2,4));
        for(int i=0;i<8;i++){
        	buttons[i]= new JButton();
        	this.add(buttons[i]);
        }
        buttons[0].setText("Add Friend");
        buttons[1].setText("List all posts");
        buttons[2].setText("List all comments on a post");
        buttons[3].setText("Comment on A post");
        buttons[4].setText("List all events");
        buttons[5].setText("Friend request");   
        buttons[6].setText("Find nearest friend");
        buttons[7].setText("Range query");

	}

	public void disableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(false);
	}

	public void enableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(true);
	}

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
			comps[i].enable();
		}
		enableButton();
	}
}


class MainFrame extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JLabel LogoLabel;
	JButton notifyButton;
	LoginPanel loginPanel;
	SignupPanel signUpPanel;
	SqlPanel sqlPanel;
	ButtonPanel buttonPanel;
	PostandSearchPanel postandsearch;
	ResultPanel resultPanel;
	Connection conn=null;
	ArrayList<String> requester = new ArrayList<String>();
	ArrayList<String> Relation= new ArrayList<String>();
	int countrequest=0;
	JTextArea resultArea = null;
	JScrollPane scrollPane = null;
	int trigger = 0;
	JLabel showLabel;
	int hasRequest = 0;
	StringBuffer SQLOut = new StringBuffer ();
	MainFrame(){
		setResizable(false);
		setLayout(null);
		setSize(1100, 700);
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-1100)/2,(height-700)/2);
		setTitle("This is GUI for database homework");
		setNotifyLabel();
		SetLogo();
		setLoginPanel();
		setSignupPanel();
		setSqlPanel();
		setButtonPanel();
		setPostandSearchPanel();
		setResultPanel();
		enableResult();
		postandsearch.disablePanel();
		buttonPanel.disablePanel();
	}

	public void disableResult(){
    	resultArea.setText("");
    	resultArea.setEditable(false);
    	resultArea.setEnabled(false);
    	scrollPane.setEnabled(false);
	}
public void enableResult(){
	resultArea.setEditable(true);
	resultArea.setEnabled(true);
	scrollPane.setEnabled(true);
	
}
	public void setResultPanel(){
		resultPanel =new ResultPanel();
		this.add(resultPanel);
		resultArea = new JTextArea(10,30);
		resultArea.setLineWrap(true);
		scrollPane = new JScrollPane(resultArea);
		this.add(scrollPane);
		scrollPane.setBounds(10, 140,770, 250);
	}

	public void SetLogo(){
	Image image;
	try {
		image = ImageIO.read(new File("usc_viterbi_logo.jpg"));
		ImageIcon icon = new ImageIcon(image);
		LogoLabel = new JLabel();
		LogoLabel.setIcon(icon);
		LogoLabel.setBounds(830,480,300,150);

		add(LogoLabel);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //this generates an image file

	}

	public void setNotifyLabel(){
		Image image;
		try {
			image = ImageIO.read(new File("notify.png"));
			ImageIcon icon = new ImageIcon(image);
			notifyButton = new JButton();
			notifyButton.setIcon(icon);
			notifyButton.setBounds(750,3,30,30);

			notifyButton.addActionListener(new ActionListener() {
	           
	            public void actionPerformed(ActionEvent e) {
	            	/*Fill this function*/
	            	/*Press this notification button, you should list all the friend request on the ResultPanel*/
	            	/*the output format is like "... wants to add you as 'friend type'." */
	            	Connection conn =ConnectDB.openConnection();
	            	
						try {
							conn.setAutoCommit(true);
							Statement stmt = conn.createStatement();
							
							 String query="select fr.sender as sender, fl.description as ftype from FRIENDREQUEST fr, FRIENDLOOKUP fl where fr.ftype=fl.ftype and RECEIVER= '"+loginPanel.username.getText()+"'";
							 SQLOut.append(query);
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								
							 setSQLOutput(SQLOut);
							 ResultSet rset = stmt.executeQuery(query);
							 //if(rset.next()){
							 while(rset.next()){
								 String sender= rset.getString("sender");
								 String type = rset.getString("ftype");
						
								resultArea.append(sender+" wansts to add you as '"+type+"',");
								resultArea.append(System.getProperty("line.separator"));
							 }
							
								rset.close();
								 stmt.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
	            	
	            }
	        });

			add(notifyButton);
			notifyButton.setVisible(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //this generates an image file


	}

	public void setButtonPanel(){
		buttonPanel = new ButtonPanel();
		this.add(buttonPanel);

		buttonPanel.buttons[0].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame0 frame=new Frame0("User Email",1);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);

                frame.btn1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent e) {
                    	/**
                    	 * ADD FRIEND fuction 
                    	 */
                    	/*Fill this function*/
    	            	/*Press this add friend button, input user Email information, press OK, you should be able to send friend request*/
    	            	/*After press ok, you should also pop up a standard dialog box to show the request send status <succeed or failed>*/
                    	String uremail=frame.txtfield.getText();
                    	int fype=2;// default normal friend 
                    	String type=frame.combo.getSelectedItem().toString();
                    	System.out.println(type);
                    	if(type.equals("Normal Friend")){
                    		fype=2;
                    	}
                    	else if(type.equals("Close Friend")){
                    		fype=1;
                    	}
                    	else if(type.equals("Family")){
                    		fype=0;
                    	}
                    	Connection conn =ConnectDB.openConnection();
                    	boolean friend=false;
                    	boolean reqeusted =false;
                    	try {
							conn.setAutoCommit(true);
							 Statement stmt = conn.createStatement();
							 String query= "select user1 as friend from FRIENDSHIP where user2='"+loginPanel.username.getText()+"'and ftype="+fype +
									 " union select user2 as friend from FRIENDSHIP where user1='"+loginPanel.username.getText()+"'and ftype="+fype;
							SQLOut.append(query);
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(System.getProperty("line.separator")); 
							 
							setSQLOutput(SQLOut);
							 ResultSet rset = stmt.executeQuery(query);
							 while(rset.next()){
								if(rset.getString("friend").equals(uremail)){
								 
								 JOptionPane.showMessageDialog(null, "You guys are already friends", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
								 friend=true;
								 return;
							 	}
							 }
							 
							 //checking for existing friend request
							 query = "select sender as sender from FRIENDREQUEST where receiver='"+loginPanel.username.getText()+"'";
							 SQLOut.append(query);
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(System.getProperty("line.separator")); 
							
							 setSQLOutput(SQLOut);
							  rset = stmt.executeQuery(query);
							  while(rset.next()){
								 
								 if(rset.getString("sender").equals(uremail)){
									 JOptionPane.showMessageDialog(null, "There already exist a friendrequest check your request", "Error",
			                                 JOptionPane.ERROR_MESSAGE);
									 reqeusted=true;
									 return;
								 }
								 
							 }
							 
							 if(!friend&&!reqeusted){
							query = " Insert into FRIENDREQUEST (SENDER,RECEIVER,FTYPE) values ('"+loginPanel.username.getText()+"','"+uremail+"',"+fype+")";
							SQLOut.append(query);
							  SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							  SQLOut.append(System.getProperty("line.separator"));
							
							setSQLOutput(SQLOut);
							 rset = stmt.executeQuery(query);
							 }
							 rset.close();
							 stmt.close();
							 conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							 JOptionPane.showMessageDialog(null, "Error occured in requesting friend", "Error",
	                                 JOptionPane.ERROR_MESSAGE);
							 return; 
							//e1.printStackTrace();
						}
                    	 JOptionPane.showMessageDialog(null, "Request was successfully send to "+uremail, "Success",
                                 JOptionPane.DEFAULT_OPTION);
   					
                    }
                });

            }
        });
		buttonPanel.buttons[1].addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this list all post button, you should be able to list all the post which are visible to you*/
            	/*You can define the output format*/
            	Connection conn =ConnectDB.openConnection();
            	
            	
				try {
					conn.setAutoCommit(true);
					Statement stmt = conn.createStatement();
					
					String query="select p.PID as pid, p.NOTE as note, p.SENDER as sender, p.DATETIME as ddate from post p where p.privacy = 2"+
							"UNION select p.PID as pid, p.note as note, p.sender as sender, p.datetime as ddate from post p, friendship f where p.privacy = 1 and (f.user1='"+loginPanel.username.getText()+"' and p.sender = f.user2) or(f.user2='"+loginPanel.username.getText()+"' and p.sender = f.user1)"+
						"UNION select p.PID as pid, p.NOTE as note, p.SENDER as sender, p.DATETIME as ddate from post p where p.privacy = 0 and p.sender ='"+loginPanel.username.getText()+"'"; 
					
					  SQLOut.append(query);
						SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
						SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
						
					  setSQLOutput(SQLOut);
					 ResultSet rset = stmt.executeQuery(query);
					while (rset.next()){
						int pid = rset.getInt("pid");
						String note = rset.getString("note");
						String sender = rset.getString("sender");
						String date = rset.getString("ddate");
						
						resultArea.append("PID: "+pid);
						resultArea.append(System.getProperty("line.separator"));
						resultArea.append("NOTE: "+note);
						resultArea.append(System.getProperty("line.separator"));
						resultArea.append("SENDER: "+sender);
						resultArea.append(System.getProperty("line.separator"));
						resultArea.append("DATETIME: "+date);
						resultArea.append(System.getProperty("line.separator"));
						resultArea.append("---------------------------------------------------------------");
						resultArea.append(System.getProperty("line.separator"));
						resultArea.append(System.getProperty("line.separator"));
						
					}
					 rset.close();
					 stmt.close();
					 conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			

            }
        });

		buttonPanel.buttons[2].addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
            	final Frame0 frame=new Frame0("Post ID: ",2);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
                frame.btn1.addActionListener(new ActionListener() {
                 
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
    	            	/*Press this List Comments Button, input Post ID, press OK, you should be able to list all the comment about this post*/
                    	Connection conn =ConnectDB.openConnection();
                    	String pid = frame.txtfield.getText();
                    	
    					try {
							conn.setAutoCommit(true);
							 Statement stmt = conn.createStatement();
							boolean vaild=false;
							//Checking if the PID is visible to this user
								 String query1="select p.PID as pid from post p where p.privacy = 2"+
											"UNION select p.PID as pid from post p, friendship f where p.privacy = 1 and (f.user1='"+loginPanel.username.getText()+"' and p.sender = f.user2) or(f.user2='"+loginPanel.username.getText()+"' and p.sender = f.user1)"+
										"UNION select p.PID as pid from post p where p.privacy = 0 and p.sender ='"+loginPanel.username.getText()+"'"; 
							 SQLOut.append(query1);
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(System.getProperty("line.separator")); 
							
							 setSQLOutput(SQLOut);
								 ResultSet rset = stmt.executeQuery(query1);
								while(rset.next()){
									String dpid = rset.getString("pid");
									if (dpid.equals(pid)){
										vaild=true;
										break;
									}
								}
							if(vaild){
								 String query="select  pid as pid, text as text, mid as mid, datetime as ddate from pcomment where pid ="+pid;
								 SQLOut.append(query);
								 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								 SQLOut.append(System.getProperty("line.separator"));
								  
								setSQLOutput(SQLOut);
								 rset = stmt.executeQuery(query);
								 while (rset.next()){
									 
									 String ppid = rset.getString("pid");
									 String text = rset.getString("text");
									 String sender = rset.getString("mid");
									 String date = rset.getString("ddate");
									 
									 	resultArea.append("PID: "+pid);
										resultArea.append(System.getProperty("line.separator"));
										resultArea.append("TEXT: "+text);
										resultArea.append(System.getProperty("line.separator"));
										resultArea.append("SENDER: "+sender);
										resultArea.append(System.getProperty("line.separator"));
										resultArea.append("DATETIME: "+date);
										resultArea.append(System.getProperty("line.separator"));
										resultArea.append("---------------------------------------------------------------");
										resultArea.append(System.getProperty("line.separator"));
										resultArea.append(System.getProperty("line.separator"));
									 
								 }
							}
							else{
								 JOptionPane.showMessageDialog(null, "Non Vaild PID", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
								 return; 
								
							}
							 rset.close();
							 stmt.close();
							 conn.close();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
    					 
   
                    }
                });
            }
        });
		
		buttonPanel.buttons[3].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame1 frame=new Frame1("Post ID: ","Content: ");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
                frame.btn1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
    	            	/*Press this Comment Button, input Post ID, and comment, press OK, you should be able to comment on this post*/
                    	/*After press ok, you should also pop up a standard dialog box to show the comment's status <succeed or failed>*/	

                    	
                    	Connection conn =ConnectDB.openConnection();
                    	String pid = frame.txtfield.getText();
                    	String note = frame.textArea.getText();
                    	//System.out.println(pid);
                    	//System.out.println(note);
    					try {
							conn.setAutoCommit(true);
							 Statement stmt = conn.createStatement();
							boolean vaild=false;
							//Checking if the PID is visible to this user
								 String query1="select p.PID as pid from post p where p.privacy = 2"+
											"UNION select p.PID as pid from post p, friendship f where p.privacy = 1 and (f.user1='"+loginPanel.username.getText()+"' and p.sender = f.user2) or(f.user2='"+loginPanel.username.getText()+"' and p.sender = f.user1)"+
										"UNION select p.PID as pid from post p where p.privacy = 0 and p.sender ='"+loginPanel.username.getText()+"'"; 
								
								 SQLOut.append(query1);
								 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								 SQLOut.append(System.getProperty("line.separator")); 
								 setSQLOutput(SQLOut);
								 ResultSet rset = stmt.executeQuery(query1);
								while(rset.next()){
									String dpid = rset.getString("pid");
									if (dpid.equals(pid)){
										vaild=true;
										break;
									}
								}
							if(vaild){
								String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
								String query = "Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values ("+pid+",'"+note+"','"+loginPanel.username.getText()+"',to_date('"+timeStamp+"','RR/MM/DD'))";
								 SQLOut.append(query);
								 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								 SQLOut.append(System.getProperty("line.separator")); 
								 setSQLOutput(SQLOut);
								rset = stmt.executeQuery(query);
							}
								else{
									 JOptionPane.showMessageDialog(null, "Non Vaild PID", "Error",
			                                 JOptionPane.ERROR_MESSAGE);
									 return; 
									
								}
								 rset.close();
								 stmt.close();
								 conn.close();
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								 JOptionPane.showMessageDialog(null, "Comment submission failed", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
								e1.printStackTrace();
							}
                    	
                    }
                });
            }
        });
		
		buttonPanel.buttons[4].addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this List all event Button, you should be able to list all available event*/
            	Connection conn =ConnectDB.openConnection();
            	try {
					conn.setAutoCommit(true);
					 Statement stmt = conn.createStatement();
						String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
					 String query ="select title as title, description as ds, starttime as st, duration as dr from event where starttime > to_date('"+timeStamp+"','RR/MM/DD')";
					 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					 SQLOut.append(System.getProperty("line.separator")); 
					 setSQLOutput(SQLOut);
					ResultSet rset = stmt.executeQuery(query);
					 while (rset.next()){
						 String title=rset.getString("title");
						 String ds = rset.getString("ds");
						 String st = rset.getString("st");
						 String dr = rset.getString("dr");
						 
							resultArea.append("TITLE: "+title);
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("DISCRIPTION: "+ds);
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("START TIME: "+st);
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("DURATION: "+dr);
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("---------------------------------------------------------------");
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append(System.getProperty("line.separator"));
						 
						 
					 }
					 rset.close();
					 stmt.close();
					 conn.close();
					 }catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
            }
        });


		buttonPanel.buttons[5].addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e) {
        	final Frame2 frame=new Frame2("Decline: ");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setVisible(true);

            frame.btn1.addActionListener(new ActionListener() {
               
                public void actionPerformed(ActionEvent e) {
                	/*Fill this function*/
                	/*Press this decline Button, you should be able to decline friend request*/
                	/*You could decline one at a time, or decline many at a time. e.g. using comma to separate each request*/
                	/*pop up a standard dialog box to show <succeed or failed>*/
                	Connection conn =ConnectDB.openConnection();
                	
                	
    					try {
							conn.setAutoCommit(true);
							Statement stmt = conn.createStatement();
							String[] emails = frame.txtfield.getText().split(",");
							String query = "";
							
							for (String value : emails){
								query="delete from FRIENDREQUEST where SENDER ='"+value+"' and RECEIVER= '"+loginPanel.username.getText()+"'";
								  SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								  SQLOut.append(System.getProperty("line.separator"));
								  SQLOut.append(query);
								 setSQLOutput(SQLOut);
								 stmt.executeQuery(query);
								
							}
							 JOptionPane.showMessageDialog(null, "SUCCESS: Friend request was declined", "Success",
	                                 JOptionPane.DEFAULT_OPTION);
							 stmt.close();
							 conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							 JOptionPane.showMessageDialog(null, "FAILD: Request was unable to decilne", "Success",
	                                 JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
							return;
						}
    					
                	
                }
            });


            frame.btn2.addActionListener(new ActionListener() {
           
                public void actionPerformed(ActionEvent e) {
                	/*Fill this function*/
                	/*Press this accept all Button, you should be able to accept all friend request and add this information into friend relationship table*/
                	/*pop up a standard dialog box to show <succeed or failed>*/
                	Connection conn =ConnectDB.openConnection();

				
						try {
							conn.setAutoCommit(true);
							Statement stmt = conn.createStatement();
							//searching for friend request 
							String query ="Select sender as sender, ftype as ftype from FRIENDREQUEST where RECEIVER ='"+loginPanel.username.getText()+"'";
							SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							  SQLOut.append(query);
							 setSQLOutput(SQLOut);
							 ResultSet rset = stmt.executeQuery(query);
							 
							 while(rset.next()){ 
								String sender= rset.getString("sender");
								int ftype = rset.getInt("ftype");
								query = "Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('"+loginPanel.username.getText()+"','"+sender+"',"+ftype+")";
								SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								  SQLOut.append(query);
								 setSQLOutput(SQLOut);
								 Statement stmt2 = conn.createStatement();
								 stmt2.executeQuery(query);
								 stmt2.close();
								
								 query ="delete from FRIENDREQUEST where SENDER ='"+sender+"' and RECEIVER= '"+loginPanel.username.getText()+"'";
								 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
								 SQLOut.append(System.getProperty("line.separator"));
								 SQLOut.append(query);
								 setSQLOutput(SQLOut);
								 Statement stmt3 = conn.createStatement();
								 stmt3.executeQuery(query);		
								 stmt3.close();
							 }
							 rset.close();
							 JOptionPane.showMessageDialog(null, "SUCCESS: All friend request accepted", "Success",
	                                 JOptionPane.DEFAULT_OPTION);
							 notifyButton.setVisible(false);
							 conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							 JOptionPane.showMessageDialog(null, "FAILD: Unable to accept all friend request ", "Success",
	                                 JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
							
							
							return;
						}
						
                }
            });

        }
		});

		buttonPanel.buttons[6].addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this Button, you should be able list the information(including address information) about your friend who live nearest to you*/
            	/*This is a spatial query*/
            	Connection conn =ConnectDB.openConnection();
            	try {
					conn.setAutoCommit(true);
					 Statement stmt = conn.createStatement();
					 //get friend emails 
					 String query= "select a.vertice from member m, address a where m.email ='"+loginPanel.username.getText()+"' and m.aid = a.aid";
					SQLOut.append(query);
					 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					 SQLOut.append(System.getProperty("line.separator")); 
					 
					setSQLOutput(SQLOut);
					 ResultSet rset = stmt.executeQuery(query);
					 if(rset.next()){
					 STRUCT st = (oracle.sql.STRUCT) rset.getObject(1);
					 JGeometry jgeom = JGeometry.load(st);
					 double x = jgeom.getJavaPoint().getX();
					 double y = jgeom.getJavaPoint().getY();
					
				
					 
					 query = "SELECT a.aid as aid, sdo_nn_distance (1) distance FROM  address a "+ 
							 "WHERE sdo_nn (a.vertice, MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE("+x+","+y+",NULL),NULL,NULL) , 'sdo_num_res=5',1 ) = 'TRUE' ORDER BY distance";
					 SQLOut.append(query);
					 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					 SQLOut.append(System.getProperty("line.separator")); 
					 
					setSQLOutput(SQLOut);
					 rset = stmt.executeQuery(query);
					 while (rset.next()){
						 String aid = rset.getString("aid");
						 String distance = rset.getString("distance");
						 query="select user1 as friend "+
						 "from FRIENDSHIP, member m "+
						"where user2='"+loginPanel.username.getText()+"'and (ftype=1 or ftype=2) and user1 =m.email and m.aid ="+aid+
						" union "+ 
						"select user2 as friend "+
						"from FRIENDSHIP , member m "+
						"where user1='"+loginPanel.username.getText()+"'and (ftype=1 or ftype=2) and user2 =m.email and m.aid ="+aid;
						 SQLOut.append(query);
						 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
						 SQLOut.append(System.getProperty("line.separator")); 
						 setSQLOutput(SQLOut);
						 Statement stmt2 = conn.createStatement();
							
						 ResultSet rset2 =stmt2.executeQuery(query);
						if(rset2.next()){
							
							 String nfriend = rset2.getString("friend");
							query ="select m.fname as fn, m.lname as ln, m.birthdate as bday, a.street_no as stn, a.street_address as sta, a.city as city, a.zipcode as zip"+   
									" from address a, member m where a.aid = "+aid+" and m.email ='"+nfriend+"'"; 
							
							 SQLOut.append(query);
							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(System.getProperty("line.separator")); 
							 setSQLOutput(SQLOut);
							 Statement stmt3 = conn.createStatement();
								
							 ResultSet rset3 =stmt3.executeQuery(query);
							if(rset3.next()){
							resultArea.append("FIRST NAME: "+rset3.getString("fn"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("LAST NAME: "+rset3.getString("ln"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("BIRTHDATE: "+rset3.getString("bday"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("EMAIL: "+nfriend);
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("STREET_NO: "+rset3.getString("stn"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("STREET_ADDRESS: "+rset3.getString("sta"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("CITY: "+rset3.getString("city"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("ZIPCODE: "+rset3.getString("zip"));
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append("---------------------------------------------------------------");
							resultArea.append(System.getProperty("line.separator"));
							resultArea.append(System.getProperty("line.separator"));
							}
							stmt3.close();
							rset3.close();
						 }
						 stmt2.close();
						 
						 
						 
					 }
					 }
					rset.close();
					 stmt.close();
					 conn.close();
            	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(null, "error", "Error",
                             JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
            	
            	
            	
            	
            }
        });
		buttonPanel.buttons[7].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame3 frame=new Frame3("Please input coordinate: ");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);

                frame.btn1.addActionListener(new ActionListener() {
                  
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
                    	/*Press this Button, input left top corner coordinate and right down corner coordinate*/
                    	/*press ok, you should be able list the information(including address information) about your friend who lives in this area. Close query window*/
                    	/*This is a spatial query*/
                    	
                    	String x1 = frame.txtfield[0].getText();
                    	String y1 = frame.txtfield[1].getText();
                    	String x2 = frame.txtfield[2].getText();
                    	String y2 = frame.txtfield[3].getText();
                    	Connection conn =ConnectDB.openConnection();
                    	try {
        					conn.setAutoCommit(true);
        					 Statement stmt = conn.createStatement();
        					 //get friend emails 
        					
        					 String query ="SELECT a.aid FROM address a WHERE SDO_INSIDE(a.vertice, SDO_GEOMETRY(2003, NULL, NULL,"+
        					             "SDO_ELEM_INFO_ARRAY(1,1003,3), SDO_ORDINATE_ARRAY("+x1+","+y1+","+x2+","+y2+"))) = 'TRUE'";			
        					 SQLOut.append(query);
        					 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
        					 SQLOut.append(System.getProperty("line.separator")); 
        					 
        					setSQLOutput(SQLOut);
        					 ResultSet rset = stmt.executeQuery(query);
        					 while (rset.next()){
        						 String aid = rset.getString("aid");
        						 
        						 query="select user1 as friend "+
        						 "from FRIENDSHIP, member m "+
        						"where user2='"+loginPanel.username.getText()+"'and (ftype=1 or ftype=2) and user1 =m.email and m.aid ="+aid+
        						" union "+ 
        						"select user2 as friend "+
        						"from FRIENDSHIP , member m "+
        						"where user1='"+loginPanel.username.getText()+"'and (ftype=1 or ftype=2) and user2 =m.email and m.aid ="+aid;
        						 SQLOut.append(query);
        						 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
        						 SQLOut.append(System.getProperty("line.separator")); 
        						 setSQLOutput(SQLOut);
        						 Statement stmt2 = conn.createStatement();
        							
        						 ResultSet rset2 =stmt2.executeQuery(query);
        						if(rset2.next()){
        							
        							 String nfriend = rset2.getString("friend");
        							query ="select m.fname as fn, m.lname as ln, m.birthdate as bday, a.street_no as stn, a.street_address as sta, a.city as city, a.zipcode as zip"+   
        									" from address a, member m where a.aid = "+aid+" and m.email ='"+nfriend+"'"; 
        							
        							 SQLOut.append(query);
        							 SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
        							 SQLOut.append(System.getProperty("line.separator")); 
        							 setSQLOutput(SQLOut);
        							 Statement stmt3 = conn.createStatement();
        								
        							 ResultSet rset3 =stmt3.executeQuery(query);
        							if(rset3.next()){
        							resultArea.append("FIRST NAME: "+rset3.getString("fn"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("LAST NAME: "+rset3.getString("ln"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("BIRTHDATE: "+rset3.getString("bday"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("EMAIL: "+nfriend);
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("STREET_NO: "+rset3.getString("stn"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("STREET_ADDRESS: "+rset3.getString("sta"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("CITY: "+rset3.getString("city"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("ZIPCODE: "+rset3.getString("zip"));
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append("---------------------------------------------------------------");
        							resultArea.append(System.getProperty("line.separator"));
        							resultArea.append(System.getProperty("line.separator"));
        							}
        							stmt3.close();
        							rset3.close();
        						 }
        						 stmt2.close();
        						 
        						 
        						 
        					 }
        					
        					
        					 stmt.close();
        					 conn.close();
                    	} catch (SQLException e1) {
        					// TODO Auto-generated catch block
        					 JOptionPane.showMessageDialog(null, "error", "Error",
                                     JOptionPane.ERROR_MESSAGE);
        					e1.printStackTrace();
        				}
                    	
                    }
                });
            }
        });
		
	}

	public void setPostandSearchPanel(){
		postandsearch = new PostandSearchPanel();
		this.add(postandsearch);
		StringBuffer result= new StringBuffer();


		postandsearch.buttons[0].addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) { 
            	/*Fill this function*/
            	/*Press this Button, you should be able post the information written in   the textArea*/
            	/*pop up a standard dialog box to show <succeed or failed>*/
            	
            	String note = postandsearch.textArea.getText();
            	//System.out.println(note);
            	
            	Connection conn =ConnectDB.openConnection();
            	
            	
				try {
					conn.setAutoCommit(true);
					 Statement stmt = conn.createStatement();
						String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
					 String query="select COUNT(*) from post";
							  SQLOut.append(query);
					   SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					  SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					  int  row=0;
					 setSQLOutput(SQLOut);
					ResultSet rset = stmt.executeQuery(query);
					 while (rset.next()){
						   row = rset.getInt(1);
						  }
						 // System.out.println("Number of row:"+row);
						  
					row = row+1;
					query="Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values ("+row+",'"+note+"','"+loginPanel.username.getText()+"',2,to_date('"+timeStamp+"','RR/MM/DD'))";
					SQLOut.append(query);
					   SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					  SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
					 
					 setSQLOutput(SQLOut);
					 rset = stmt.executeQuery(query);
					
				rset.close();
				 stmt.close();
				 conn.close();
				 
				 JOptionPane.showMessageDialog(null, "Post was done successfuly", "Success",
                         JOptionPane.DEFAULT_OPTION);
				 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(null, "Can't post the post", "Error",
                             JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				
            	
            }
        });


		postandsearch.buttons[1].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {  
            	/*Fill this function*/
            	/*Press this Button, you should be able search user information, list the information on the result panel*/
            	/*The search should based on email, first name or last name*/
            	if(postandsearch.text.getText().isEmpty()){
            		 JOptionPane.showMessageDialog(null, "Plese enter the email or first name or last name of the user that you want to search for", "Error",
                             JOptionPane.ERROR_MESSAGE);
            		
            	}
            	else{
            	Connection conn =ConnectDB.openConnection();
            	
            	
					try {
						conn.setAutoCommit(true);
						Statement stmt = conn.createStatement();
						String search = postandsearch.text.getText();
						
						//System.out.println(search);
						
						 String query= "select m.email as email, m.fname as fname, m.lname as lname, m.birthdate as birthdate, a.street_no as stretno, "+
						 "a.street_address as stretad, c.city as city, c.state as state, a.zipcode as zipcode, c.country as country from MEMBER m, ADDRESS a, CITYLOOKUP c"+ 
						" where m.aid=a.aid and a.city=c.city and (EMAIL='"+search+"' or fname = '"+search+"' or lname = '"+search+"')";
						
						 SQLOut.append(query);
						 SQLOut.append(System.getProperty("line.separator"));
						 SQLOut.append(System.getProperty("line.separator"));
						 setSQLOutput(SQLOut);  
						 ResultSet rset = stmt.executeQuery(query);				 
						

						while(rset.next()){ // if there is a result 
						

							String email = rset.getString("email");
							String fname = rset.getString("fname");
							String lname =rset.getString("lname");
							String bday = rset.getString("birthdate");
							String stretno = rset.getString("stretno");
							String stretad = rset.getString("stretad");
							String city = rset.getString("city");
							String state = rset.getString("state");
							String zipcode = rset.getString("zipcode");
							String country = rset.getString("country");
							
							//resultPanel.resultArea.setText(rset.getString("email"));
							resultArea.append(email +", "+fname+", "+lname+", "+bday+", "+stretno+", "+stretad+", "+city+", "+state+", "+zipcode+", "+country);
							resultArea.append(System.getProperty("line.separator"));
						
						}
						rset.close();
						 stmt.close();
						 conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					
						 
						
						
						
						
					}
            	}
            }
        });
	}

	public void setSQLOutput(StringBuffer sb)
	{
		sqlPanel.SQLArea.setText(sb.toString());
		sqlPanel.SQLArea.setEnabled(true);
	}
	public void setSqlPanel(){
		sqlPanel = new SqlPanel();
		this.add(sqlPanel);
		showLabel = new JLabel("The corresponding SQL :");
		showLabel.setBounds(20, 470, 200, 20);
		this.add(showLabel);
	}

	public void setLoginPanel(){
		loginPanel = new LoginPanel();
		this.add(loginPanel);

		loginPanel.signup.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        signUpPanel.enablePanel();
			}
        });
        loginPanel.login.addActionListener(new ActionListener() {
        
			public void actionPerformed(ActionEvent e) {  
            	//System.out.println(loginPanel.login.getText());
            	
            	
            	Connection conn =ConnectDB.openConnection();
            	
            	try {
					conn.setAutoCommit(true);
					 Statement stmt = conn.createStatement();
					// System.out.println(loginPanel.username.getText());
					 //case for login
					 if(loginPanel.login.getText().equals("Logout")){
					
						 loginPanel.login.setText("Login");
						 loginPanel.username.setText(null);
						 loginPanel.password.setText(null);
						 loginPanel.username.setEnabled(true);
						 loginPanel.password.setEnabled(true);
						 
						 loginPanel.username.setEditable(true);
						 loginPanel.password.setEditable(true);
						 loginPanel.signup.setEnabled(true);
						 
						 notifyButton.setVisible(false);
						 postandsearch.disablePanel();
						 buttonPanel.disableButton();
						 disableResult();
					 }
					 if(loginPanel.login.getText().equals("Login")&&!loginPanel.username.getText().equals(""))
		            {	 
					String uname= loginPanel.username.getText();
					String pword= loginPanel.password.getText();
					 //System.out.println(uname +" and "+pword);
					 String query="select PASSWORD from MEMBER where EMAIL= '"+uname+"'";
					 
					 SQLOut.append(query);
					 SQLOut.append(System.getProperty("line.separator"));
					 SQLOut.append(System.getProperty("line.separator"));
					 setSQLOutput(SQLOut);  
					 ResultSet rset = stmt.executeQuery(query);
						//System.out.println(loginPanel.login.getText());
					 if (rset.next()) // there is a result with the email
					 {
						 String dbpass=rset.getString(1);
						 if (dbpass.equals(pword))
						 {
							 enableResult();
							 loginPanel.login.setText("Logout");
							 loginPanel.username.setEditable(false);
							 loginPanel.signup.setEnabled(false);
							 loginPanel.password.setText("");
							 postandsearch.enablePanel();
							 buttonPanel.enableButton();
							
							 
							 
							 query="select * from FRIENDREQUEST where RECEIVER= '"+uname+"'";
	
							 SQLOut.append(query);
							 SQLOut.append(System.getProperty("line.separator"));
							 SQLOut.append(System.getProperty("line.separator"));
							 setSQLOutput(SQLOut);
							 rset = stmt.executeQuery(query);
							 if(rset.next())//there is a friend request for this user
							 {
								 notifyButton.setVisible(true);
								 
							 }	 
							
						 }
						 else {
				            	
				            	//no matching user was found in the database  
				            	 JOptionPane.showMessageDialog(null, "No user found singup first and longin", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
				            	 signUpPanel.enablePanel();		            	
				            }
						 
						 rset.close();
						  stmt.close();
						  conn.close();
					 }
					 
					 else {
			            	
			            	//no matching user was found in the database  
			            	 JOptionPane.showMessageDialog(null, "No user found singup first and longin", "Error",
	                                 JOptionPane.ERROR_MESSAGE);
			            	 signUpPanel.enablePanel();		            	
			            }
		            }
			
					 // case for logout 
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	/*Fill this function*/
            	/*Press this Button, you should be able match the user information. If valid, keep the user email information(but can't modified) and clear the password*/
            	/*at the same time, you should scan the friend request table, to determine whether current logged in user has friend request, if has, set notification icon*/
            	/*If invalid, you should pop up a dialog box to notify user, then enable signup panel for user to register*/
            	/*After logged in, you should change this button's function as logout which means disable all the panel, return to the original state*/
            }

           });
   

	}
	public boolean isValidEmailAddress(String email) {
	       java.util.regex.Pattern pat = java.util.regex.Pattern.compile(".+@.+\\.[a-z]+");
	       java.util.regex.Matcher mat = pat.matcher(email);
	       return mat.matches();
	}
	
	public boolean isValidDate(String date){

	    SimpleDateFormat dateformate = new SimpleDateFormat("yyyy/MM/dd");
	    java.util.Date testDate = null;
		try{
		 testDate = dateformate.parse(date);
		 }
		catch (ParseException e){
		return false;
		}
		if (!dateformate.format(testDate).equals(date)){
			return false;
		}
	    return true;
	
	} // end isValidDate

	public void setSignupPanel(){

		signUpPanel = new SignupPanel();
		this.add(signUpPanel);
		signUpPanel.signup.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {  
            	/*Fill this function*/
            	/*Press this signup button, you should be able check whether current account is existed. If existed, pop up an error, if not check input validation(You can design this part according to your database table's restriction) create the new account information*/
            	/*pop up a standard dialog box to show <succeed or failed>*/
            	if(signUpPanel.email.getText().isEmpty()){
					 JOptionPane.showMessageDialog(null, "Email is empty", "Error",
                            JOptionPane.ERROR_MESSAGE);
				}
            	
            	
            	Connection conn =ConnectDB.openConnection();
            	try {
					conn.setAutoCommit(true);
					 Statement stmt = conn.createStatement();
					 String email=signUpPanel.email.getText();
			         String fn =signUpPanel.fname.getText();
			         String ln = signUpPanel.lname.getText();
			         String bday=signUpPanel.birthday.getText();
					 if(isValidEmailAddress(email)){
				     
					 
					 String query="select * from MEMBER where EMAIL= '"+email+"'";
					 
					 SQLOut.append(query);
					 setSQLOutput(SQLOut);  
					 ResultSet rset = stmt.executeQuery(query);
					 
						 if (rset.next()) // there is a result with the email
						 {
							 JOptionPane.showMessageDialog(null, "The email already exist choose another email", "Error",
	                                 JOptionPane.ERROR_MESSAGE);
							 
						 }
						 else { // email is okay 
							 
							char[] pw1 = signUpPanel.password.getPassword();
							char[] pw2 = signUpPanel.password2.getPassword();
							if(!(Arrays.equals(pw1, pw2))){
								 JOptionPane.showMessageDialog(null, "Password is not matching with each other", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
							else if(signUpPanel.birthday.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Bitrhday is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
							else if(!isValidDate(bday))
					    	{
					    		 JOptionPane.showMessageDialog(null, "Bitrhday is in wrong formate", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
					    	}	
						    
							else if(signUpPanel.fname.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Fist name is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
							else if(signUpPanel.lname.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Last name is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
							
	
							//for simplicity every new user is going to be using AID = 1 
							
						  /*  if(signUpPanel.country.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Country is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
						    if(signUpPanel.state.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "State is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
						    if(signUpPanel.city.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "City is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
						    if(signUpPanel.str_no.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "StreetNumber is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
						    if(signUpPanel.str_address.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Street address is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}
						    if(signUpPanel.zip.getText().isEmpty()){
								 JOptionPane.showMessageDialog(null, "Zipcode is empty", "Error",
		                                 JOptionPane.ERROR_MESSAGE);
							}*/
							// always AID = 1 
							else{
							String pass = new String(signUpPanel.password.getText());
							query="Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('"+email+"',to_date('"+bday+"','RR/MM/DD'),'"+pass+"','"+fn+"','"+ln+"',1)";
							SQLOut.append(System.getProperty("line.separator")); // inserting newline character 
							 SQLOut.append(query);
							 setSQLOutput(SQLOut);
							 rset = stmt.executeQuery(query);
							}
						 }
						 rset.close();
						 }
					 else{//not a vaild email
						 
						 JOptionPane.showMessageDialog(null, "The email in not formated correctly", "Error",
                                 JOptionPane.ERROR_MESSAGE);	 
						 
					 }
					 
					  stmt.close();
					  conn.close();
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
            }
        });

		signUpPanel.disablePanel();

	}


}


class ConnectDB{

	public static Connection openConnection(){
       
		/*Fill this function*/
    	/*implement open  connection */
        try{
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String url = "jdbc:oracle:thin:@localhost:1521/CSCI585";
            String uname = "homework2";
            String pwd = "1";
            return DriverManager.getConnection(url, uname, pwd);
           }
           catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
            e.printStackTrace();
            return null;
           }
           catch(SQLException sqle){
            System.out.println("Connection Failed");
            sqle.printStackTrace();
		return null;
           }
		
	}
	public static void closeConnection(Connection conn)
	{
		/*Fill this function*/
    	/*implement close connection */
		try{
			conn.close();
		}
	     catch (Exception e){
	      e.printStackTrace();
	      System.out.println("connection closing error ");
	     }
	 }
	
}
public class Assignment2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	MainFrame frame = new MainFrame();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
