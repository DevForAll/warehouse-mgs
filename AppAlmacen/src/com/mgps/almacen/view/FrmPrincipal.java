package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrada = new JButton("");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormNewEntrada  NewEntrada = new FormNewEntrada();
				NewEntrada.setVisible(true);
		
			}
		});
		btnEntrada.setBackground(UIManager.getColor("Button.background"));
		btnEntrada.setForeground(Color.LIGHT_GRAY);
		btnEntrada.setIcon(new ImageIcon("C:\\Users\\MG_KEVIN\\git\\warehouse-mgs\\AppAlmacen\\src\\cjava\\imagenes\\+entrada.png"));
		btnEntrada.setBounds(10, 224, 138, 153);
		contentPane.add(btnEntrada);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 706, 28);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Proveedor");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Empleado");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Usuario");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Configuraciones");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Acerca de");
		menuBar.add(mnNewMenu_4);
		
		JButton btnNewButton_3_1 = new JButton("REPORTE ENTRADA");
		btnNewButton_3_1.setBounds(158, 224, 144, 153);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("SALIDA ENTRADA");
		btnNewButton_3_1_1.setBounds(312, 224, 144, 153);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_2 = new JButton("NUEVA SALIDA");
		btnNewButton_3_1_2.setBounds(466, 224, 144, 153);
		contentPane.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_1_3 = new JButton("INVENTARIO");
		btnNewButton_3_1_3.setBounds(620, 224, 144, 153);
		contentPane.add(btnNewButton_3_1_3);
	}
}
