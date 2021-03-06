package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import data.customer;

import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import java.awt.Font;
import javax.swing.JButton;

public class CustomerInfoPanel extends JPanel {
	private JTextField textFieldBillCustomer;
	private JTextField textFieldBillAddress;
	private JTextField textFieldBillCity;
	private JTextField textFieldBillZip;
	private JTextField textFieldShipAddress;
	private JTextField textFieldShipCity;
	private JTextField textFieldShipZip;

	/**
	 * Create the panel.
	 */
	public CustomerInfoPanel() {
		setLayout(new BorderLayout(0, 0));
		this.setPreferredSize(new Dimension(1000, 250));
		
		JLabel lblCustomerInfo = new JLabel("Customer Info");
		lblCustomerInfo.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCustomerInfo, BorderLayout.NORTH);
		
		JPanel customerPanel = new JPanel();
		add(customerPanel, BorderLayout.WEST);
		customerPanel.setLayout(null);
		customerPanel.setPreferredSize(new Dimension(500, 200));
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 37, 73, 14);
		customerPanel.add(lblNewLabel);
		
		ArrayList<String> customers = new ArrayList<String>();
		customers.add("A-1111");
		customers.add("B-2222");
		
		JComboBox comboBoxCustomerID = new JComboBox(customers.toArray());
		comboBoxCustomerID.setEditable(true);
		comboBoxCustomerID.setBounds(81, 34, 126, 20);
		customerPanel.add(comboBoxCustomerID);
		
		JLabel lblNewLabel_1 = new JLabel("Customer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 71, 62, 14);
		customerPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 104, 46, 14);
		customerPanel.add(lblNewLabel_2);
		
		textFieldBillCustomer = new JTextField();
		textFieldBillCustomer.setBounds(66, 69, 374, 17);
		customerPanel.add(textFieldBillCustomer);
		textFieldBillCustomer.setColumns(10);
		
		textFieldBillAddress = new JTextField();
		textFieldBillAddress.setBounds(66, 102, 374, 17);
		customerPanel.add(textFieldBillAddress);
		textFieldBillAddress.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCity.setBounds(10, 142, 30, 14);
		customerPanel.add(lblCity);
		
		textFieldBillCity = new JTextField();
		textFieldBillCity.setBounds(36, 139, 180, 20);
		customerPanel.add(textFieldBillCity);
		textFieldBillCity.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblState.setBounds(226, 142, 30, 14);
		customerPanel.add(lblState);
		
		JComboBox comboBoxBillState = new JComboBox();
		comboBoxBillState.setEditable(true);
		comboBoxBillState.setBounds(266, 139, 46, 20);
		customerPanel.add(comboBoxBillState);
		
		textFieldBillZip = new JTextField();
		textFieldBillZip.setBounds(342, 139, 98, 20);
		customerPanel.add(textFieldBillZip);
		textFieldBillZip.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblZip.setBounds(322, 142, 21, 14);
		customerPanel.add(lblZip);
		
		JLabel lblBillTo = new JLabel("Bill To:");
		lblBillTo.setBounds(10, 12, 46, 14);
		customerPanel.add(lblBillTo);
		
		JPanel propertyPanel = new JPanel();
		add(propertyPanel, BorderLayout.EAST);
		propertyPanel.setLayout(null);
		propertyPanel.setPreferredSize(new Dimension(500, 200));
		
		JLabel lblShipTo = new JLabel("Ship To:");
		lblShipTo.setBounds(10, 11, 46, 14);
		propertyPanel.add(lblShipTo);
		
		JLabel lblProperty = new JLabel("Property");
		lblProperty.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProperty.setBounds(10, 71, 46, 14);
		propertyPanel.add(lblProperty);
		
		JComboBox comboBoxProperty = new JComboBox();
		comboBoxProperty.setEditable(true);
		comboBoxProperty.setBounds(66, 68, 365, 20);
		propertyPanel.add(comboBoxProperty);
		
		JLabel label = new JLabel("Address");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(10, 104, 46, 14);
		propertyPanel.add(label);
		
		textFieldShipAddress = new JTextField();
		textFieldShipAddress.setColumns(10);
		textFieldShipAddress.setBounds(65, 101, 365, 20);
		propertyPanel.add(textFieldShipAddress);
		
		JLabel label_1 = new JLabel("City");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_1.setBounds(10, 142, 30, 14);
		propertyPanel.add(label_1);
		
		textFieldShipCity = new JTextField();
		textFieldShipCity.setColumns(10);
		textFieldShipCity.setBounds(36, 139, 180, 20);
		propertyPanel.add(textFieldShipCity);
		
		JLabel label_2 = new JLabel("State");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBounds(226, 142, 30, 14);
		propertyPanel.add(label_2);
		
		JComboBox comboBoxShipState = new JComboBox();
		comboBoxShipState.setEditable(true);
		comboBoxShipState.setBounds(266, 139, 46, 20);
		propertyPanel.add(comboBoxShipState);
		
		textFieldShipZip = new JTextField();
		textFieldShipZip.setColumns(10);
		textFieldShipZip.setBounds(342, 139, 88, 20);
		propertyPanel.add(textFieldShipZip);
		
		JLabel label_3 = new JLabel("Zip");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_3.setBounds(322, 142, 21, 14);
		propertyPanel.add(label_3);
		
		
		
		

	}
}
