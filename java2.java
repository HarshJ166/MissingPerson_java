// using Java Swing
//Found person form

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class java2
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton others;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel aadh;
	private JTextField taadh;
	private JLabel fol;
	private JTextField tfol;
	private JLabel Ma;
	private JTextField tMa;
	private JLabel Fa;
	private JTextField tFa;
	private JLabel ea;
	private JTextField tea;
	private JLabel rp;
	private JTextField trp;
	private JLabel sk;
	private JTextField tsk;
	private JLabel uf;
	private JTextField tuf;
	private JLabel aof;
	private JTextField taof;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;


	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019","2020","2021","2022" };

	public java2()
	{
		setTitle("Found person Form");
		setBounds(300, 90, 900, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		
		

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Found person Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(650, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(190, 20);
		tmno.setLocation(200, 150);
		c.add(tmno);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		c.add(female);

		others = new JRadioButton("others");
		others.setFont(new Font("Arial", Font.PLAIN, 15));
		others.setSelected(false);
		others.setSize(80, 20);
		others.setLocation(275, 200);
		c.add(others);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
		gengp.add(others);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		c.add(year);

		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 300);
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 300);
		tadd.setLineWrap(true);
		c.add(tadd);

		Ma = new JLabel("Mother's name");
		Ma.setFont(new Font("Arial", Font.PLAIN, 20));
		Ma.setSize(200, 20);
		Ma.setLocation(25, 400);
		c.add(Ma);

		tMa = new JTextField();
		tMa.setFont(new Font("Arial", Font.PLAIN, 15));
		tMa.setSize(190, 20);
		tMa.setLocation(200, 400);
		c.add(tMa);

		Fa = new JLabel("Father's name");
		Fa.setFont(new Font("Arial", Font.PLAIN, 20));
		Fa.setSize(200, 20);
		Fa.setLocation(25, 450);
		c.add(Fa);

		tFa = new JTextField();
		tFa.setFont(new Font("Arial", Font.PLAIN, 15));
		tFa.setSize(190, 20);
		tFa.setLocation(200, 450);
		c.add(tFa);

		ea = new JLabel("Email");
		ea.setFont(new Font("Arial", Font.PLAIN, 20));
		ea.setSize(350, 20);
		ea.setLocation(100, 500);
		c.add(ea);

		tea = new JTextField();
		tea.setFont(new Font("Arial", Font.PLAIN, 15));
		tea.setSize(190, 20);
		tea.setLocation(200, 500);
		c.add(tea);

		fol = new JLabel("Found  location");
		fol.setFont(new Font("Arial", Font.PLAIN, 20));
		fol.setSize(350, 20);
		fol.setLocation(500, 100);
		c.add(fol);

		tfol = new JTextField();
		tfol.setFont(new Font("Arial", Font.PLAIN, 15));
		tfol.setSize(190, 20);
		tfol.setLocation(700, 100);
		c.add(tfol);

		sk = new JLabel("Skin color");
		sk.setFont(new Font("Arial", Font.PLAIN, 20));
		sk.setSize(350, 20);
		sk.setLocation(500, 150);
		c.add(sk);

		tsk = new JTextField();
		tsk.setFont(new Font("Arial", Font.PLAIN, 15));
		tsk.setSize(190, 20);
		tsk.setLocation(700, 150);
		c.add(tsk);

		uf = new JLabel("Unique feature");
		uf.setFont(new Font("Arial", Font.PLAIN, 20));
		uf.setSize(190, 20);
		uf.setLocation(500, 200);
		c.add(uf);

		tuf = new JTextField();
		tuf.setFont(new Font("Arial", Font.PLAIN, 15));
		tuf.setSize(190, 20);
		tuf.setLocation(700, 200);
		c.add(tuf);

		
		aof = new JLabel("Any other feature");
		aof.setFont(new Font("Arial", Font.PLAIN, 20));
		aof.setSize(190, 20);
		aof.setLocation(500, 250);
		c.add(aof);

		taof = new JTextField();
		taof.setFont(new Font("Arial", Font.PLAIN, 15));
		taof.setSize(190, 50);
		taof.setLocation(700, 250);
		c.add(taof);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 50);
		term.setLocation(500, 310);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(700, 370);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(500, 370);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 500);
		tout.setLocation(1000, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(1030, 650);
		c.add(res);

		



		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			String data1;
			if (male.isSelected())
			data1 = "Gender : Male"
					+ "\n \n";
		else
			data1 = "Gender : Female"
					+ "\n \n";
		String data2
			= " DOB : "
			+ (String)date.getSelectedItem()
			+ "/" + (String)month.getSelectedItem()
			+ "/" + (String)year.getSelectedItem()
			+ "\n \n";
			if (term.isSelected()) {
				String data
				    
					= "\n Name : "
					+ tname.getText() + "\n \n"
					+ " Mobile : "
					+ tmno.getText() + "\n \n"
					+ " Mother's name :"
					+  tMa.getText() + "\n \n"
					+ " Father's name :"
					+ tFa.getText() + "\n \n"
					+ " Email :"
					+ tea.getText() + "\n \n"
					+ " Found at location :"
					+ tfol.getText() + "\n \n"
					+ " Skin color :"
					+ tsk.getText() + "\n \n"
					+ " Unique feature :"
					+ tuf.getText() + "\n \n";
				

				String data3 = " Address : " + tadd.getText() + "\n \n";
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registered Successfully..");

				String data4 = "Any other feature :" + taof.getText() + "\n \n";

					
				
			}
			else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			tfol.setText(def);
			tMa.setText(def);
			tFa.setText(def);
			tea.setText(def);
			trp.setText(def);
			tsk.setText(def);
			tuf.setText(def);
			taof.setText(def);
		}
	}
}

// Driver Code
class Registration {

	public static void main(String[] args) throws Exception
	{
		java2 f = new java2();
	}
}
