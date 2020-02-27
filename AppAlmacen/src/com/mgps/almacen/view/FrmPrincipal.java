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
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmPrincipal.class.getResource("/cjava/imagenes/MGSOLUTIONS.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevaEntrada = new JButton("");
		btnNuevaEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrmNewEntrada  NewEntrada = new FrmNewEntrada();
				NewEntrada.setVisible(true);
		
			}
		});
		btnNuevaEntrada.setBackground(UIManager.getColor("Button.background"));
		btnNuevaEntrada.setForeground(Color.LIGHT_GRAY);
		btnNuevaEntrada.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/029-package.png")));
		btnNuevaEntrada.setBounds(161, 70, 138, 122);
		contentPane.add(btnNuevaEntrada);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.setBounds(0, 0, 842, 48);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Proveedor");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FrmProveedor Proveedor = new FrmProveedor();
				Proveedor.setVisible(true);
			}
		});
	
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setBackground(new Color(240, 240, 240));
		mnNewMenu.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/029-add-1.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Empleado");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FrmEmpleados Empleado = new FrmEmpleados();
				Empleado.setVisible(true);
				
			}
		});
		
		
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/003-add-user.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_5 = new JMenu("Especialidad");
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FrmEspecialidad Especialidad = new FrmEspecialidad();
				Especialidad.setVisible(true);
				
			}
		});
		
		JMenu mnNewMenu_1_1 = new JMenu("Productos");
		mnNewMenu_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FrmProducto Productos = new FrmProducto();
				Productos.setVisible(true);
				
			}
		});
		mnNewMenu_1_1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/027-shopping-cart.png")));
		mnNewMenu_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1_1);
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/034-favourites.png")));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_2 = new JMenu("Usuario");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FrmUsuario Usuario = new FrmUsuario();
				Usuario.setVisible(true);
				
			}
		});
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/033-user.png")));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Configuraciones");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	
				
			}
		});
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_3.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/043-settings.png")));
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_6 = new JMenu("Categoria");
		mnNewMenu_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				FrmCategoria Categoria = new FrmCategoria();
				Categoria.setVisible(true);
			}
		});
		mnNewMenu_6.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/007-share.png")));
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu_3.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("Unidad de Medida");
		mnNewMenu_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FrmUnidadMedida UnidadMedida = new FrmUnidadMedida();
				UnidadMedida.setVisible(true);
				
				
			}
		});
		mnNewMenu_7.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/021-sign.png")));
		mnNewMenu_7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu_3.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Marca");
		mnNewMenu_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FrmMarca Marca = new FrmMarca();
				Marca.setVisible(true);
				
			}
		});
		mnNewMenu_8.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/035-flag.png")));
		mnNewMenu_8.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu_3.add(mnNewMenu_8);
		
		JMenu mnNewMenu_4 = new JMenu("Acerca de");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				FrmMgSolutionsPeru MgSolutionsPeru = new FrmMgSolutionsPeru();
				MgSolutionsPeru.setVisible(true);
				
			}
		});
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_4.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/MG_LOGO - 10.png")));
		menuBar.add(mnNewMenu_4);
		
		JButton btnReporteEntrada = new JButton("");
		btnReporteEntrada.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/023-list.png")));
		btnReporteEntrada.setBounds(544, 70, 144, 122);
		contentPane.add(btnReporteEntrada);
		
		JButton btnInventario = new JButton("");
		btnInventario.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/047-shelf.png")));
		btnInventario.setBounds(349, 201, 144, 122);
		contentPane.add(btnInventario);
		
		JLabel lblNewLabel = new JLabel("ENTRADA");
		lblNewLabel.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/045-plus.png")));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(161, 182, 138, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/004-bookmarks.png")));
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInventario.setBounds(332, 323, 172, 42);
		contentPane.add(lblInventario);
		
		JLabel lblReporte = new JLabel("REPORTE");
		lblReporte.setVerticalAlignment(SwingConstants.TOP);
		lblReporte.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/028-download.png")));
		lblReporte.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblReporte.setBounds(544, 189, 144, 42);
		contentPane.add(lblReporte);
		
		JLabel lblEntrada = new JLabel("ENTRADA");
		lblEntrada.setVerticalAlignment(SwingConstants.TOP);
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEntrada.setBounds(564, 218, 124, 30);
		contentPane.add(lblEntrada);
		
		JButton btnNuevaSalida = new JButton("");
		btnNuevaSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				FrmNewSalida  Salida = new FrmNewSalida();
				Salida.setVisible(true);
				
			}
			
			
		});
		btnNuevaSalida.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/021-add-to-cart.png")));
		btnNuevaSalida.setForeground(Color.LIGHT_GRAY);
		btnNuevaSalida.setBackground(SystemColor.menu);
		btnNuevaSalida.setBounds(171, 323, 138, 122);
		contentPane.add(btnNuevaSalida);
		
		JButton btnReporteSalida = new JButton("");
		btnReporteSalida.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/023-list.png")));
		btnReporteSalida.setBounds(544, 329, 144, 122);
		contentPane.add(btnReporteSalida);
		
		JLabel lblNewLabel_1_1 = new JLabel("SALIDA");
		lblNewLabel_1_1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/090-plus.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(171, 447, 138, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblReporte_1 = new JLabel("REPORTE");
		lblReporte_1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/cjava/imagenes/028-download.png")));
		lblReporte_1.setVerticalAlignment(SwingConstants.TOP);
		lblReporte_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblReporte_1.setBounds(544, 450, 144, 42);
		contentPane.add(lblReporte_1);
		
		JLabel lblSalida = new JLabel("SALIDA");
		lblSalida.setVerticalAlignment(SwingConstants.TOP);
		lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalida.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSalida.setBounds(564, 472, 124, 25);
		contentPane.add(lblSalida);
	}
}
