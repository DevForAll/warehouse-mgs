package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FrmEmpleados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtEmail;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEmpleados frame = new FrmEmpleados();
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
	public FrmEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(30, 42, 435, 302);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEmpleado = new JLabel("COD:");
		lblCodigoEmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEmpleado.setBounds(201, 25, 46, 14);
		contentPane_1.add(lblCodigoEmpleado);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(254, 22, 86, 20);
		contentPane_1.add(textField);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(110, 50, 231, 20);
		contentPane_1.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(110, 112, 121, 20);
		contentPane_1.add(txtDni);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(110, 143, 231, 20);
		contentPane_1.add(txtEmail);
		
		JLabel lblApellido = new JLabel("APELLIDOS :");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBounds(0, 53, 86, 14);
		contentPane_1.add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(110, 81, 231, 20);
		contentPane_1.add(txtNombre);
		
		JLabel lblEspecialidad = new JLabel("ESPECIALIDAD :");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(0, 180, 110, 14);
		contentPane_1.add(lblEspecialidad);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(0, 84, 86, 14);
		contentPane_1.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBounds(0, 115, 86, 14);
		contentPane_1.add(lblDni);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(-1, 146, 86, 14);
		contentPane_1.add(lblEmail);
		
		JComboBox cmbEspecialidad = new JComboBox();
		cmbEspecialidad.setBounds(120, 177, 231, 20);
		contentPane_1.add(cmbEspecialidad);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(276, 236, 127, 48);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(154, 236, 111, 48);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(10, 236, 134, 48);
		contentPane_1.add(btnEliminar);
		
		JLabel lblEmpleados = new JLabel("EMPLEADOS");
		lblEmpleados.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/003-add-user.png")));
		lblEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleados.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEmpleados.setBounds(30, 11, 430, 40);
		contentPane.add(lblEmpleados);
	}

}
