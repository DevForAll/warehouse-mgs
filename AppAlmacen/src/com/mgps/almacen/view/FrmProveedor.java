package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FrmProveedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProveedor frame = new FrmProveedor();
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
	public FrmProveedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 472, 340);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(295, 37, 59, 17);
		contentPane_1.add(lblCodigoEnmpleado);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(354, 36, 86, 20);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 94, 305, 20);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 66, 121, 20);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 186, 121, 20);
		contentPane_1.add(textField_3);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(298, 279, 127, 48);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(176, 279, 111, 48);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(32, 279, 134, 48);
		contentPane_1.add(btnEliminar);
		
		JLabel lblRazonSocial = new JLabel("RAZON SOCIAL :");
		lblRazonSocial.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRazonSocial.setBounds(10, 95, 121, 17);
		contentPane_1.add(lblRazonSocial);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 123, 305, 51);
		contentPane_1.add(textField_4);
		
		JLabel lblRuc = new JLabel("RUC :");
		lblRuc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRuc.setBounds(10, 69, 86, 14);
		contentPane_1.add(lblRuc);
		
		JLabel lblTelefono = new JLabel("TELEFONO :");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelefono.setBounds(16, 188, 86, 14);
		contentPane_1.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("DIRECCION :");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(10, 129, 86, 14);
		contentPane_1.add(lblDireccion);
		
		JLabel lblProveedor = new JLabel("PROVEEDORES");
		lblProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedor.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/029-add-1.png")));
		lblProveedor.setBounds(10, 0, 430, 40);
		contentPane_1.add(lblProveedor);
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 19));
	}

}
