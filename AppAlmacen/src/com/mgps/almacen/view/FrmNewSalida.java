package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class FrmNewSalida extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNewSalida frame = new FrmNewSalida();
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
	public FrmNewSalida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 803, 516);
		contentPane.add(contentPane_1);
		
		JLabel lblUsuario = new JLabel(" Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(554, 93, 86, 14);
		contentPane_1.add(lblUsuario);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(650, 91, 149, 20);
		contentPane_1.add(textField);
		
		JLabel lblFechaHora = new JLabel("Fecha y Hora :");
		lblFechaHora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaHora.setBounds(535, 119, 105, 17);
		contentPane_1.add(lblFechaHora);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(650, 116, 149, 20);
		contentPane_1.add(textField_1);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmpleado.setBounds(34, 169, 88, 23);
		contentPane_1.add(lblEmpleado);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(713, 421, 86, 20);
		contentPane_1.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(132, 169, 393, 23);
		contentPane_1.add(comboBox);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/003-add-user.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(535, 158, 46, 41);
		contentPane_1.add(btnNewButton);
		
		JLabel lblPrecioTotal = new JLabel("Precio Total :");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioTotal.setBounds(607, 424, 96, 14);
		contentPane_1.add(lblPrecioTotal);
		
		JButton btnNewButton_1 = new JButton("Productos");
		btnNewButton_1.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/016-cart.png")));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setBounds(584, 203, 149, 45);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/001-minus.png")));
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setToolTipText("");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1.setBounds(735, 203, 58, 45);
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Guardar");
		btnNewButton_1_2.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/035-save.png")));
		btnNewButton_1_2.setToolTipText("");
		btnNewButton_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBackground(new Color(230, 230, 250));
		btnNewButton_1_2.setBounds(654, 460, 139, 45);
		contentPane_1.add(btnNewButton_1_2);
		
		JLabel lblOrdenDeSalida = new JLabel("ORDEN DE SALIDA");
		lblOrdenDeSalida.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrdenDeSalida.setBounds(34, 90, 128, 20);
		contentPane_1.add(lblOrdenDeSalida);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(168, 91, 149, 22);
		contentPane_1.add(textField_3);
		
		JLabel lblCod = new JLabel("COD :");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCod.setBounds(34, 65, 35, 14);
		contentPane_1.add(lblCod);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(130, 59, 79, 20);
		contentPane_1.add(textField_4);
		
		JButton btnNewButton_1_2_1 = new JButton("Eliminar");
		btnNewButton_1_2_1.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/026-delete-2.png")));
		btnNewButton_1_2_1.setToolTipText("");
		btnNewButton_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1_2_1.setBounds(501, 460, 139, 45);
		contentPane_1.add(btnNewButton_1_2_1);
		
		JLabel lblSalidaDeProducto = new JLabel("   SALIDA DE PRODUCTO");
		lblSalidaDeProducto.setIcon(new ImageIcon(FrmNewSalida.class.getResource("/cjava/imagenes/027-menu.png")));
		lblSalidaDeProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalidaDeProducto.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSalidaDeProducto.setBounds(10, -3, 749, 41);
		contentPane_1.add(lblSalidaDeProducto);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(16, 259, 783, 153);
		contentPane_1.add(table);
	}
}
