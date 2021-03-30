package GUI;
import model.customers.transaction.CustomersTransaction;
import model.database.DB_Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ValuedCustomer extends JPanel {

	private String customerName, accNo, CustomerAddress, CustomerPhone;
	private JLabel customer_name, acc_no, address, phone, custLabel, accLabel, addLabel, phoneLabel, custDetLabel, miniBapersLabel;
	private JButton updateButton, addJobButton, retrieveJob, backButton, discountPlanButton, menuButton;
	private GUI f;
	private JPanel lastPanel;

	public ValuedCustomer(int width, int height, String[] customerData, GUI f) {
		this.customerName = customerData[0];
		this.accNo = customerData[1];
		this.CustomerAddress = customerData[2];
		this.CustomerPhone = customerData[3];
		this.f = f;
		this.lastPanel = f.getCurrentPanel();
		f.setLastPanel(lastPanel);
		f.setCurrentPanel(this);

		setSize(width, height);
		setName("Customer Details");
		setBackground(new Color(157, 195, 230));

		updateButton = new JButton();
		updateButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		updateButton.setForeground(Color.white);
		updateButton.setBackground(new Color(1, 23, 71));
		updateButton.setText("Update Details");
		updateButton.addMouseListener(new updateListener());

		addJobButton = new JButton();
		addJobButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addJobButton.setForeground(Color.white);
		addJobButton.setBackground(new Color(1, 23, 71));
		addJobButton.setText("Add Job");
		addJobButton.addMouseListener(new addJobListener());

		discountPlanButton = new JButton();
		discountPlanButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		discountPlanButton.setForeground(Color.white);
		discountPlanButton.setBackground(new Color(1, 23, 71));
		discountPlanButton.setText("Add Discount Plan");
		discountPlanButton.addMouseListener(new addDiscountListener());

		customer_name = new JLabel();
		customer_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		customer_name.setText(customerName);

		acc_no = new JLabel();
		acc_no.setFont(new Font("Tahoma", Font.PLAIN, 16));
		acc_no.setText(accNo);

		address = new JLabel();
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setText(CustomerAddress);

		phone = new JLabel();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phone.setText(CustomerPhone);

		custLabel = new JLabel();
		custLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		custLabel.setText("Name:");

		accLabel = new JLabel();
		accLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		accLabel.setText("Account No:");

		addLabel = new JLabel();
		addLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		addLabel.setText("Address:");

		phoneLabel = new JLabel();
		phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		phoneLabel.setText("Phone:");

		custDetLabel = new JLabel();
		custDetLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		custDetLabel.setForeground(new Color(1, 23, 71));
		custDetLabel.setText("Customer Details");
		custDetLabel.setHorizontalTextPosition(JLabel.CENTER);

		backButton = new JButton();
		backButton.setForeground(Color.white);
		backButton.setBackground(new Color(1, 23, 71));
		backButton.setText("Back");
		backButton.addMouseListener(new backListener());

		retrieveJob = new JButton();
		retrieveJob.setForeground(Color.white);
		retrieveJob.setBackground(new Color(1, 23, 71));
		retrieveJob.setText("Retrieve Job");
		retrieveJob.addMouseListener(new retrieveListener());

		menuButton = new JButton();
		menuButton.setForeground(Color.white);
		menuButton.setBackground(new Color(1, 23, 71));
		menuButton.setText("Menu");
		menuButton.addMouseListener(new menuListener());

		miniBapersLabel = new JLabel();
		miniBapersLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		miniBapersLabel.setForeground(new java.awt.Color(1, 23, 71));
		miniBapersLabel.setText("Bapers");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(145,145,240)
								.addComponent(custDetLabel)
								.addGap(145, 145, 1000))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addComponent(backButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(menuButton)
								.addGap(19, 19, 19))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addGap(65, 65, 1000)
												.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
														.addComponent(phoneLabel)
														.addComponent(addLabel)
														.addComponent(accLabel)
														.addComponent(custLabel))
												.addGap(29, 29, 29)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(acc_no)
														.addComponent(phone)
														.addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
														.addComponent(customer_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(layout.createSequentialGroup()
												.addGap(30, 30, 30)
												.addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(46, 46, 46)
												.addComponent(retrieveJob, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(46, 46, 46)
												.addComponent(addJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(46, 46, 46)
												.addComponent(discountPlanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addGap(379, 379, 379)
												.addComponent(miniBapersLabel)))
								.addContainerGap(70, 1000))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addGap(45, 45, 45)
												.addComponent(custDetLabel))
										.addGroup(layout.createSequentialGroup()
												.addGap(19, 19, 19)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(menuButton)
														.addComponent(backButton))))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(miniBapersLabel)
												.addContainerGap())
										.addGroup(layout.createSequentialGroup()
												.addGap(18, 18, 18)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(custLabel)
														.addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(accLabel)
														.addComponent(acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(addLabel)
														.addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(phoneLabel)
														.addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(updateButton)
														.addComponent(addJobButton)
														.addComponent(retrieveJob)
														.addComponent(discountPlanButton))
												.addGap(55, 55, 55))))
		);
		}

		class backListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.setLastPanel(lastPanel);
				f.getLastPanel().setVisible(true);
				f.remove(f.getCurrentPanel());
				f.setCurrentPanel(lastPanel);
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		}

		class updateListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] cD = {customerName,accNo,CustomerAddress,CustomerPhone,"Valued"};
				f.updateCustomer(cD);
				setVisible(false);
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		}

		class addJobListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.addJob(Integer.parseInt(accNo));
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		}

		class addDiscountListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}

		class retrieveListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			f.retrieveJobs(Integer.parseInt(accNo));
			setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}

		class menuListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			f.home();
			setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}
}

