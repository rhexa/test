import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;

public class test3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lbWelcome = new JLabel("Welcome to Himalaya");
		lbWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbWelcome, BorderLayout.NORTH);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setPreferredSize(new Dimension(120, 300));
		panelLeft.setSize(new Dimension(120, 300));
		contentPane.add(panelLeft, BorderLayout.WEST);
		panelLeft.setLayout(null);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setMinimumSize(new Dimension(90, 25));
		btnDashboard.setMaximumSize(new Dimension(90, 25));
		btnDashboard.setPreferredSize(new Dimension(90, 25));
		btnDashboard.setBounds(10, 13, 100, 25);
		panelLeft.add(btnDashboard);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setMinimumSize(new Dimension(95, 25));
		btnProfile.setMaximumSize(new Dimension(95, 25));
		btnProfile.setPreferredSize(new Dimension(95, 25));
		btnProfile.setBounds(10, 41, 100, 25);
		panelLeft.add(btnProfile);
		
		JPanel panelRight = new JPanel();
		panelRight.setBackground(Color.WHITE);
		contentPane.add(panelRight, BorderLayout.EAST);
		
		JTree tree = new JTree();
		panelRight.add(tree);
		
		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		
		JTextPane txtpnLorem = new JTextPane();
		txtpnLorem.setPreferredSize(new Dimension(300, 300));
		txtpnLorem.setEditable(false);
		txtpnLorem.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		panelMain.add(txtpnLorem);
	}

}
