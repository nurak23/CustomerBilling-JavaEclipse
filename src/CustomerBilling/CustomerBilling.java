package CustomerBilling;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;

public class CustomerBilling extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5941095685477139116L;
	private JPanel contentPane;
	private JTextField jtextCustomerReference;
	private JTextField jtextFirstName;
	private JTextField jtextLastName;
	private JTextField jtextAddress;
	private JTextField jtextMobileNumber;
	private JTextField jtextTea;
	private JTextField jtextCoffee;
	private JTextField jtextBoost;
	private JTextField jtextComplan;
	private JTextField jtextMaltova;
	private JTextField jtextBournvita;
	private JTextField jtextTax;
	private JTextField jtextSubTotal;
	private JTextField jtextGrandTotal;
	private JFrame frame;
	String iTax, iSubTotal, iTotal; 
	double [] itemcost = new double[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBilling frame = new CustomerBilling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerBilling() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				jtextCustomerReference.setText(null);
				jtextCustomerReference.setEnabled(false);
				int refs= 5015 + (int)(Math.random()*17238);
				String cReference = "";
				cReference += refs +1560;
				
				jtextCustomerReference.setText(cReference);
				jtextTea.setEnabled(false);
				jtextCoffee.setEnabled(false);
				jtextBoost.setEnabled(false);
				jtextComplan.setEnabled(false);
				jtextMaltova.setEnabled(false);
				jtextBournvita.setEnabled(false);
				
			}
		});
		

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel.setBounds(418, 11, 386, 500);
		contentPane.add(panel);
		panel.setBounds(10, 11, 388, 500);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Reference");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(28, 35, 136, 37);
		panel.add(lblNewLabel);
		
		jtextCustomerReference = new JTextField();
		jtextCustomerReference.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextCustomerReference.setBounds(195, 40, 160, 32);
		panel.add(jtextCustomerReference);
		jtextCustomerReference.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(28, 98, 136, 37);
		panel.add(lblFirstName);
		
		jtextFirstName = new JTextField();
		jtextFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextFirstName.setColumns(10);
		jtextFirstName.setBounds(195, 103, 160, 32);
		panel.add(jtextFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastName.setBounds(28, 171, 136, 37);
		panel.add(lblLastName);
		
		jtextLastName = new JTextField();
		jtextLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextLastName.setColumns(10);
		jtextLastName.setBounds(195, 176, 160, 32);
		panel.add(jtextLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(28, 247, 136, 37);
		panel.add(lblAddress);
		
		jtextAddress = new JTextField();
		jtextAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextAddress.setColumns(10);
		jtextAddress.setBounds(195, 252, 160, 32);
		panel.add(jtextAddress);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMobileNumber.setBounds(28, 321, 136, 37);
		panel.add(lblMobileNumber);
		
		jtextMobileNumber = new JTextField();
		jtextMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextMobileNumber.setColumns(10);
		jtextMobileNumber.setBounds(195, 326, 160, 32);
		panel.add(jtextMobileNumber);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGender.setBounds(28, 392, 136, 37);
		panel.add(lblGender);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female"}));
		
		comboBox.setBounds(195, 401, 160, 28);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(418, 11, 445, 711);
		contentPane.add(panel_1);
		
		JCheckBox chckbxTea = new JCheckBox("Tea");
		chckbxTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxTea.isSelected())
				{
					jtextTea.setEnabled(true);
				jtextTea.setText("");
				jtextTea.requestFocus();
				}
					else
			{
				jtextTea.setEnabled(false);
				jtextTea.setText("0");
				
			}
				
			}
		});
		chckbxTea.setBackground(new Color(240, 248, 255));
		chckbxTea.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxTea.setBounds(44, 44, 147, 23);
		panel_1.add(chckbxTea);
		
		jtextTea = new JTextField();
		jtextTea.setHorizontalAlignment(SwingConstants.CENTER);
		jtextTea.setText("0");
		jtextTea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextTea.setColumns(10);
		jtextTea.setBounds(234, 35, 160, 32);
		panel_1.add(jtextTea);
		
		JCheckBox chckbxCoffee = new JCheckBox("Coffee");
		chckbxCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxCoffee.isSelected())
				{
					jtextCoffee.setEnabled(true);
					jtextCoffee.setText("");
					jtextCoffee.requestFocus();
				}
				else
				{
					jtextCoffee.setEnabled(false);
					jtextCoffee.setText("0");

				}
			}
		});
		chckbxCoffee.setBackground(new Color(240, 248, 255));
		chckbxCoffee.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxCoffee.setBounds(44, 110, 147, 23);
		panel_1.add(chckbxCoffee);
		
		jtextCoffee = new JTextField();
		jtextCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		jtextCoffee.setText("0");
		jtextCoffee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextCoffee.setColumns(10);
		jtextCoffee.setBounds(234, 101, 160, 32);
		panel_1.add(jtextCoffee);
		
		JCheckBox chckbxBoost = new JCheckBox("Boost");
		chckbxBoost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBoost.isSelected())
				{
					jtextBoost.setEnabled(true);
					jtextBoost.setText("");
					jtextBoost.requestFocus();
				}
				else
				{
					jtextBoost.setEnabled(false);
					jtextBoost.setText("0");

				}
			}
		});
		chckbxBoost.setBackground(new Color(240, 248, 255));
		chckbxBoost.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxBoost.setBounds(44, 177, 147, 23);
		panel_1.add(chckbxBoost);
		
		jtextBoost = new JTextField();
		jtextBoost.setHorizontalAlignment(SwingConstants.CENTER);
		jtextBoost.setText("0");
		jtextBoost.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextBoost.setColumns(10);
		jtextBoost.setBounds(234, 168, 160, 32);
		panel_1.add(jtextBoost);
		
		JCheckBox chckbxComplan = new JCheckBox("Complan");
		chckbxComplan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxComplan.isSelected())
				{
					jtextComplan.setEnabled(true);
					jtextComplan.setText("");
					jtextComplan.requestFocus();
				}
				else
				{
					jtextComplan.setEnabled(false);
					jtextComplan.setText("0");

				}
			}
		});
		chckbxComplan.setBackground(new Color(240, 248, 255));
		chckbxComplan.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxComplan.setBounds(44, 266, 147, 23);
		panel_1.add(chckbxComplan);
		
		jtextComplan = new JTextField();
		jtextComplan.setHorizontalAlignment(SwingConstants.CENTER);
		jtextComplan.setText("0");
		jtextComplan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextComplan.setColumns(10);
		jtextComplan.setBounds(234, 257, 160, 32);
		panel_1.add(jtextComplan);
		
		JCheckBox chckbxMaltova = new JCheckBox("Maltova");
		chckbxMaltova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxMaltova.isSelected())
				{
					jtextMaltova.setEnabled(true);
					jtextMaltova.setText("");
					jtextMaltova.requestFocus();
				}
				else
				{
					jtextMaltova.setEnabled(false);
					jtextMaltova.setText("0");

				}
			}
		});
		chckbxMaltova.setBackground(new Color(240, 248, 255));
		chckbxMaltova.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxMaltova.setBounds(44, 343, 147, 23);
		panel_1.add(chckbxMaltova);
		
		jtextMaltova = new JTextField();
		jtextMaltova.setHorizontalAlignment(SwingConstants.CENTER);
		jtextMaltova.setText("0");
		jtextMaltova.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextMaltova.setColumns(10);
		jtextMaltova.setBounds(234, 334, 160, 32);
		panel_1.add(jtextMaltova);
		
		JCheckBox chckbxBournvita = new JCheckBox("Bournvita");
		chckbxBournvita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxBournvita.isSelected())
				{
					jtextBournvita.setEnabled(true);
					jtextBournvita.setText("");
					jtextBournvita.requestFocus();
				}
				else
				{
					jtextBournvita.setEnabled(false);
					jtextBournvita.setText("0");

				}
			}
		});
		chckbxBournvita.setBackground(new Color(240, 248, 255));
		chckbxBournvita.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxBournvita.setBounds(44, 416, 147, 23);
		panel_1.add(chckbxBournvita);
		
		jtextBournvita = new JTextField();
		jtextBournvita.setHorizontalAlignment(SwingConstants.CENTER);
		jtextBournvita.setText("0");
		jtextBournvita.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextBournvita.setColumns(10);
		jtextBournvita.setBounds(234, 407, 160, 32);
		panel_1.add(jtextBournvita);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTax.setBounds(52, 485, 136, 37);
		panel_1.add(lblTax);
		
		jtextTax = new JTextField();
		jtextTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextTax.setColumns(10);
		jtextTax.setBounds(219, 490, 160, 32);
		panel_1.add(jtextTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubtotal.setBounds(52, 561, 136, 37);
		panel_1.add(lblSubtotal);
		
		jtextSubTotal = new JTextField();
		jtextSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextSubTotal.setColumns(10);
		jtextSubTotal.setBounds(219, 566, 160, 32);
		panel_1.add(jtextSubTotal);
		
		JLabel lblMobileNumber_1 = new JLabel("GrandTotal");
		lblMobileNumber_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMobileNumber_1.setBounds(52, 635, 136, 37);
		panel_1.add(lblMobileNumber_1);
		
		jtextGrandTotal = new JTextField();
		jtextGrandTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtextGrandTotal.setColumns(10);
		jtextGrandTotal.setBounds(219, 640, 160, 32);
		panel_1.add(jtextGrandTotal);
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_1_1.setBackground(new Color(240, 248, 255));
		panel_1_1.setBounds(873, 11, 479, 500);
		contentPane.add(panel_1_1);
		
		JTextArea jtextReceipt = new JTextArea();
		jtextReceipt.setBounds(33, 30, 415, 442);
		panel_1_1.add(jtextReceipt);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_1_2.setBackground(new Color(240, 248, 255));
		panel_1_2.setBounds(20, 522, 378, 200);
		contentPane.add(panel_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(new Color(210, 180, 140));
		panel_2_1.setBorder(new MatteBorder(15, 15, 15, 15, (Color) new Color(64, 224, 208)));
		panel_2_1.setBounds(99, 19, 1, 1);
		panel_1_2.add(panel_2_1);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					jtextReceipt.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("No Printer Found", e.getMessage());
				}
			}
		});
		btnPrint.setBounds(33, 64, 119, 76);
		panel_1_2.add(btnPrint);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(jtextTea.getText() )*1.50;
				itemcost[1] = Double.parseDouble(jtextCoffee.getText() )*1.50;
				itemcost[2] = Double.parseDouble(jtextBoost.getText() )*1.50;
				itemcost[3] = Double.parseDouble(jtextComplan.getText() )*1.50;
				
				
				itemcost[4] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3];
				iTax = String.format("$%.2f", itemcost[4]/100);
				iSubTotal = String.format("$%.2f", itemcost[4]);
				iTotal = String.format("$%.2f", itemcost[4] + itemcost[4]/100);
				
				jtextTax.setText(iTax);
				jtextSubTotal.setText(iSubTotal);
				jtextGrandTotal.setText(iTotal);
				
				//==============================================================
				jtextReceipt.setEnabled(true);
				//===================================================================
				int refs=1325 + (int)(Math.random()*4238);
				
				//============================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				//==================================================
				jtextReceipt.append("\tCustomer Billing System\n" + 
				"Reference:\t\t\t" + refs +
				"\n=====================================\t" +
				
                        "\n=====================================\t" +
                        "\nCusRef:\t\t\t" + jtextCustomerReference.getText() +
                        "\nFirstName:\t\t\t" + jtextFirstName.getText() +
                        "\nLastName:\t\t\t" + jtextLastName.getText() +
                        "\nAddress:\t\t\t" + jtextAddress.getText() +
                        
                        
                        "\nTea:\t\t\t" + jtextTea.getText() +
                        "\nCoffee:\t\t\t" + jtextCoffee.getText() +
                        "\nBoost:\t\t\t" + jtextBoost.getText() +
                        "\nComplan:\t\t\t" + jtextComplan.getText() +
                      
                        
                        "\n=====================================\t" +
                        "\ntax:\t\t\t" + iTax +
                        "\nSubTotal:\t\t\t" + iSubTotal +
                        "\nGrandTotal:\t\t\t" + iTotal +
                        "\n=====================================\t" +
                        
                        "\nDate: " + Tdate.format(timer.getTime()) +
                            "\nTime: " + tTime.format(timer.getTime()) +
                            "\n\n\tThank You for Shopping at iShop\n" );
						
				}

			
		});
		btnTotal.setBounds(199, 64, 119, 76);
		panel_1_2.add(btnTotal);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_1_2_1.setBackground(new Color(240, 248, 255));
		panel_1_2_1.setBounds(873, 525, 479, 200);
		contentPane.add(panel_1_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setForeground(new Color(210, 180, 140));
		panel_2_1_1.setBorder(new MatteBorder(15, 15, 15, 15, (Color) new Color(64, 224, 208)));
		panel_2_1_1.setBounds(99, 19, 1, 1);
		panel_1_2_1.add(panel_2_1_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtextFirstName.setText("");
				jtextLastName.setText("");
				jtextAddress.setText("");
				jtextMobileNumber.setText("");
				jtextCustomerReference.setText("");
				jtextTax.setText("");
				jtextSubTotal.setText("");
				jtextGrandTotal.setText("");
				jtextReceipt.setText("");
				
				jtextTea.setEnabled(false);
				jtextCoffee.setEnabled(false);
				jtextBoost.setEnabled(false);
				jtextComplan.setEnabled(false);
				jtextMaltova.setEnabled(false);
				jtextBournvita.setEnabled(false);
				
				jtextTea.setText("0");
				jtextCoffee.setText("0");
				jtextBoost.setText("0");
				jtextComplan.setText("0");
				jtextMaltova.setText("0");
				jtextBournvita.setText("0");
				
				chckbxTea.setSelected(false);
				chckbxCoffee.setSelected(false);
				chckbxBoost.setSelected(false);
				chckbxComplan.setSelected(false);
				chckbxMaltova.setSelected(false);
				chckbxBournvita.setSelected(false);
				
				comboBox.setSelectedIndex(0); 
				
				jtextCustomerReference.setText(null);
				jtextCustomerReference.setEnabled(false);
				int refs= 5015 + (int)(Math.random()*17238);
				String cReference = "";
				cReference += refs +1560;
				
				jtextCustomerReference.setText(cReference);
				
				
			}
		});
		btnReset.setBounds(93, 67, 119, 76);
		panel_1_2_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Customer Billing Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(259, 67, 119, 76);
		panel_1_2_1.add(btnExit);
		
	
}
}
