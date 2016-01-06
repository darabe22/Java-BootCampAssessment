package com.cooksys.assessment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.GridBagLayout;

import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JSplitPane;

import java.awt.Component;

import javax.swing.AbstractListModel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.SwingConstants;

import java.awt.GridLayout;

import javax.swing.JScrollPane;

import java.util.List;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application. The main method is the entry point to a Java application. 
	 * For this assessment, you shouldn't have to add anything to this.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. This is the constructor for this Window class.
	 * All of the code here will be executed as soon as a Window object is made.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. This is where Window Builder
	 * will generate its code.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 270, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnFile.add(menuItem);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {70, 90, 90, 30, 0};
		gbl_panel.rowHeights = new int[] {125, 30, 30, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JList list = new JList();
		list.setAlignmentY(Component.TOP_ALIGNMENT);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Case", "Motherboard", "CPU", "GPU", "PSU", "RAM", "HDD"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.anchor = GridBagConstraints.NORTHWEST;
		gbc_list.insets = new Insets(5, 5, 5, 5);
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		panel.add(list, gbc_list);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton button = new JButton(">>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//list_1.set
				//List <E> workingList=list.getSelectedValuesList();
			}
		});
		panel_1.add(button);
		
		JButton button_1 = new JButton("<<");
		panel_1.add(button_1);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.gridx = 2;
		gbc_list_1.gridy = 0;
		panel.add(list_1, gbc_list_1);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane);
	}

}
