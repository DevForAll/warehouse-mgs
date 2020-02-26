package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Choice;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;

public class FrmReporteSalida extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmReporteSalida frame = new FrmReporteSalida();
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
	public FrmReporteSalida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(33, 163, 836, 290);
		contentPane.add(table);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(33, 22, 836, 130);
		contentPane.add(contentPane_1);
		
		JLabel lblFecha = new JLabel("FECHA INICIO:");
		lblFecha.setVerticalAlignment(SwingConstants.TOP);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(284, 25, 110, 16);
		contentPane_1.add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 52, 240, 28);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 83, 240, 28);
		contentPane_1.add(textField_2);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 60, 86, 14);
		contentPane_1.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION :");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(25, 91, 110, 20);
		contentPane_1.add(lblDescripcion);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmReporteSalida.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(685, 7, 141, 48);
		contentPane_1.add(btnBuscar);
		
		JLabel lblFechaFinal = new JLabel("FECHA FINAL");
		lblFechaFinal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaFinal.setBounds(472, 25, 110, 16);
		contentPane_1.add(lblFechaFinal);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(367, 25, 95, 33);
		contentPane_1.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(564, 22, 95, 33);
		contentPane_1.add(dateChooser_1);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(538, 464, 140, 48);
		contentPane.add(btnImprimir);
		btnImprimir.setIcon(new ImageIcon(FrmReporteSalida.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
}
