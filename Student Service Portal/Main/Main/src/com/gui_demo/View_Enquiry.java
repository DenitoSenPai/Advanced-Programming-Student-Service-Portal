package com.gui_demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class View_Enquiry extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private static JTextArea textArea;
	private static JScrollPane pane;
     static JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private String login_id; 
	Student_Dashboard s;
	/**
	 * Create the frame.
	 */
	public void setLoginId (String login_id)
	{
		this.login_id = login_id; 
	}
	public String getLoginId ()
	{
		return this.login_id; 
	}

	public View_Enquiry(String login_id) {
		
		setLoginId(login_id); 
		
		setTitle("View Enquiry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 585);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(View_Enquiry.class.getResource("/res/FrameLiner.png")));
		label.setBounds(0, 0, 209, 200);
		contentPane.add(label);
		
		JLabel lblSubmittedEnquiries = new JLabel("Submitted Enquiry");
		lblSubmittedEnquiries.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmittedEnquiries.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblSubmittedEnquiries.setBounds(338, 10, 209, 45);
		contentPane.add(lblSubmittedEnquiries);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName_1.setBounds(249, 87, 80, 43);
		contentPane.add(lblName_1);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNumber.setBounds(190, 210, 139, 26);
		contentPane.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(249, 156, 80, 26);
		contentPane.add(lblEmail);
		
		JLabel lblComplaint = new JLabel("Complaint");
		lblComplaint.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplaint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComplaint.setBounds(220, 276, 105, 26);
		contentPane.add(lblComplaint);
		
		JLabel lblNatureOfEnquiry = new JLabel("Nature of Enquiry");
		lblNatureOfEnquiry.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatureOfEnquiry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNatureOfEnquiry.setBounds(159, 336, 170, 26);
		contentPane.add(lblNatureOfEnquiry);
		
		JLabel lblFurtherDetails = new JLabel("Further Details");
		lblFurtherDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblFurtherDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFurtherDetails.setBounds(190, 394, 139, 26);
		contentPane.add(lblFurtherDetails);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setColumns(10);
		textField.setBounds(330, 79, 228, 50);
		textField.setEditable(false);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_1.setColumns(10);
		textField_1.setBounds(330, 140, 228, 50);
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_2.setColumns(10);
		textField_2.setBounds(330, 200, 228, 50);
		textField_2.setEditable(false);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_3.setColumns(10);
		textField_3.setBounds(330, 260, 228, 50);
		contentPane.add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_4.setColumns(10);
		textField_4.setBounds(330, 320, 228, 50);
		contentPane.add(textField_4);
		textField_4.setEditable(false);
		
		pane = new JScrollPane();
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		textArea = new JTextArea("If Necessarry");
		textArea.setEditable(false);
		textArea.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent arg0)
			{
				if(textArea.getText().equals("If Necessary"))
				{
				    
					textArea.setText("");
				}
				else {
					textArea.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent arg0)
			{
				if(textArea.getText().equals(""))
				{
					textArea.setText("If Necessary");	
				}
			}
		});
		textArea.setBounds(330, 380, 228, 65);
		textArea.setBorder(new LineBorder(Color.BLACK));
		
		pane.setBounds(330,380,228,65);
		pane.getViewport().setBackground(Color.black);
		pane.setViewportView(textArea);
		getContentPane().add(pane);
		
		JLabel lblEnquiryId = new JLabel("Enquiry ID");
		lblEnquiryId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnquiryId.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblEnquiryId.setBounds(64, 452, 144, 26);
		contentPane.add(lblEnquiryId);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_5.setColumns(10);
		textField_5.setBounds(27, 488, 228, 50);
		textField_5.setEditable(false);
		contentPane.add(textField_5);
		
		JRadioButton rdbtnUrgent = new JRadioButton("Schedule Live");
		rdbtnUrgent.setIcon(null);
		rdbtnUrgent.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnUrgent.setBackground(Color.WHITE);
		rdbtnUrgent.setBounds(308, 511, 139, 21);
		contentPane.add(rdbtnUrgent);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnEdit.setBackground(new Color(25, 25, 112));
		btnEdit.setBorder(null);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBounds(473, 508, 85, 21);
		btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Edit s = new Edit(getLoginId ());
        		dispose();
        		Edit.textField_5.setText(textField_5.getText());
        		s.setVisible(true);
        	}
        });
		contentPane.add(btnEdit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(View_Enquiry.class.getResource("/res/utech.jpg")));
		lblNewLabel.setBounds(632, 47, 230, 214);
		contentPane.add(lblNewLabel);
		
		JLabel lblName_1_1 = new JLabel("Student Name");
		lblName_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName_1_1.setBounds(677, 276, 155, 43);
		contentPane.add(lblName_1_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_6.setColumns(10);
		textField_6.setBounds(634, 320, 228, 50);
		contentPane.add(textField_6);
		
		JLabel lblName_1_1_1 = new JLabel("Student ID");
		lblName_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName_1_1_1.setBounds(677, 380, 155, 43);
		contentPane.add(lblName_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_7.setColumns(10);
		textField_7.setBounds(632, 417, 228, 50);
		contentPane.add(textField_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(25, 25, 112));
		btnBack.setBounds(718, 511, 85, 21);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Student_Dashboard s = new Student_Dashboard(getLoginId());
        		dispose();
        		s.setVisible(true);
        	}
        });
		contentPane.add(btnBack);
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			View_Enquiry frame = new View_Enquiry(getLoginId());
			frame.setVisible(true);
		} catch (Exception f) {
			f.printStackTrace();
		}
	}
}	
