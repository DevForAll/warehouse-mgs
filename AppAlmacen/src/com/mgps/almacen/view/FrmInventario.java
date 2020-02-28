package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JTable;

public class FrmInventario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInventario frame = new FrmInventario();
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
	public FrmInventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setIcon(new ImageIcon(FrmInventario.class.getResource("/cjava/imagenes/004-bookmarks.png")));
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblInventario.setBounds(10, 11, 734, 40);
		contentPane.add(lblInventario);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(606, 62, 127, 48);
		contentPane.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmInventario.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(484, 62, 111, 48);
		contentPane.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmInventario.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(340, 62, 134, 48);
		contentPane.add(btnEliminar);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(10, 121, 894, 512);
		contentPane.add(contentPane_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 388);
		contentPane_1_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(736, 458, 148, 43);
		contentPane_1_1.add(btnImprimir);
	}
}
