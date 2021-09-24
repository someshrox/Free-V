package com.igniters.somesh;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class Cvgen {

	private JFrame frame;
	private JTextField txtgen;
	private JTextField txtname;
	private JTextField txtage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cvgen window = new Cvgen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cvgen() {
		initialize();
	}
0
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Roboto Black", Font.BOLD, 30));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel Fname = new JLabel("Form ");
		Fname.setFont(new Font("Roboto Black", Font.PLAIN, 44));
		Fname.setBackground(Color.RED);
		Fname.setBounds(375, 10, 114, 106);
		frame.getContentPane().add(Fname);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 126, 416, 373);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 99, 112, 48);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(215, 7, 20, 20);
		panel.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_2.add(panel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(240, 12, 10, 10);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Roboto Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(32, 159, 112, 48);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setFont(new Font("Roboto Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(32, 220, 112, 48);
		panel.add(lblNewLabel_1_1);
		
		txtgen = new JTextField();
		txtgen.setBounds(154, 232, 223, 32);
		panel.add(txtgen);
		txtgen.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(154, 117, 223, 32);
		panel.add(txtname);
		
		txtage = new JTextField();
		txtage.setColumns(10);
		txtage.setBounds(154, 171, 223, 32);
		panel.add(txtage);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(459, 126, 416, 373);
		frame.getContentPane().add(panel_3);
		frame.setBounds(100, 100, 899, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
