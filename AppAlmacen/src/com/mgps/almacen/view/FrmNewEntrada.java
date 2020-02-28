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
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class FrmNewEntrada extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtFechaHora;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNewEntrada frame = new FrmNewEntrada();
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
	public FrmNewEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel(" Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(561, 94, 79, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setEnabled(false);
		txtUsuario.setBounds(650, 91, 149, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblFechaHora = new JLabel("Fecha y Hora :");
		lblFechaHora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaHora.setBounds(535, 119, 105, 17);
		contentPane.add(lblFechaHora);
		
		txtFechaHora = new JTextField();
		txtFechaHora.setEnabled(false);
		txtFechaHora.setColumns(10);
		txtFechaHora.setBounds(650, 116, 149, 20);
		contentPane.add(txtFechaHora);
		
		JLabel lblProveedor = new JLabel("PROVEEDOR:");
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProveedor.setBounds(34, 169, 113, 23);
		contentPane.add(lblProveedor);
		
		textField = new JTextField();
		textField.setBounds(713, 421, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(157, 160, 368, 32);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/029-add-1.png")));
		btnNewButton.setBounds(535, 158, 46, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblPrecioTotal = new JLabel("Precio Total :");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioTotal.setBounds(607, 424, 96, 14);
		contentPane.add(lblPrecioTotal);
		
		JButton btnNewButton_1 = new JButton("Productos");
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/carrito-de-tienda-online.png")));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(584, 203, 149, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/001-minus.png")));
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setToolTipText("");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1_1.setBounds(735, 203, 58, 45);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Guardar");
		btnNewButton_1_2.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/035-save.png")));
		btnNewButton_1_2.setToolTipText("");
		btnNewButton_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBackground(new Color(230, 230, 250));
		btnNewButton_1_2.setBounds(654, 460, 139, 45);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblOrdenDeCompra = new JLabel("ORDEN DE COMPRA");
		lblOrdenDeCompra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrdenDeCompra.setBounds(34, 205, 128, 20);
		contentPane.add(lblOrdenDeCompra);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(167, 203, 149, 22);
		contentPane.add(textField_1);
		
		JLabel lblCod = new JLabel("COD :");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCod.setBounds(34, 88, 35, 20);
		contentPane.add(lblCod);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(83, 92, 79, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Eliminar");
		btnNewButton_1_2_1.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/026-delete-2.png")));
		btnNewButton_1_2_1.setToolTipText("");
		btnNewButton_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1_2_1.setBounds(501, 460, 139, 45);
		contentPane.add(btnNewButton_1_2_1);
		
		JLabel lblNuevaEntradaDe = new JLabel("NUEVA ENTRADA DE PRODUCTOS AL ALMACEN");
		lblNuevaEntradaDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaEntradaDe.setIcon(new ImageIcon(FrmNewEntrada.class.getResource("/cjava/imagenes/050-wallet.png")));
		lblNuevaEntradaDe.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNuevaEntradaDe.setBounds(29, 11, 749, 41);
		contentPane.add(lblNuevaEntradaDe);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(10, 259, 783, 153);
		contentPane.add(table);
	}
}
