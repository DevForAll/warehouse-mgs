package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mgps.almacen.dao.UsuarioDAO;
import com.mgps.almacen.entity.UsuarioTO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
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
	public FrmLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmLogin.class.getResource("/cjava/imagenes/MGSOLUTIONS.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusuario = new JLabel("Usuario :");
		lblusuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblusuario.setBounds(123, 122, 87, 28);
		contentPane.add(lblusuario);
		
		JLabel lblpass = new JLabel("Contrase\u00F1a:");
		lblpass.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblpass.setBounds(123, 182, 87, 28);
		contentPane.add(lblpass);
		
		txtusuario = new JTextField();
		txtusuario.setColumns(10);
		txtusuario.setBounds(236, 122, 186, 31);
		contentPane.add(txtusuario);
		
		txtpass = new JTextField();
		txtpass.setColumns(10);
		txtpass.setBounds(236, 181, 185, 31);
		contentPane.add(txtpass);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIngresar.setIcon(new ImageIcon(FrmLogin.class.getResource("/cjava/imagenes/033-checked.png")));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String usuario = txtusuario.getText();
				String clave = txtpass.getText();

				
				UsuarioDAO  usuarioDAO=new UsuarioDAO();
				//GestionUsuario gestionUsuario = new GestionUsuario();

				UsuarioTO usuarioTO=new UsuarioTO();
				//Usuario usuario2 = new Usuario();
				
				usuarioTO.setLogin(usuario);
				usuarioTO.setPassword(clave);

				//Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
				UsuarioTO usu = usuarioDAO.obtenerUsuario(usuarioTO);

				
				if (usu != null) {
					JOptionPane.showMessageDialog(contentPane, "Bienvenido");

					this.dispose();
					
					FrmPrincipal bienvenida = new FrmPrincipal();
					bienvenida.setVisible(true);
			

				} else {
					JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnIngresar.setBounds(306, 262, 136, 43);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(FrmLogin.class.getResource("/cjava/imagenes/006-back.png")));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(164, 262, 132, 43);
		contentPane.add(btnSalir);
		
		JLabel lblInicieSesion = new JLabel("Inicie Sesion");
		lblInicieSesion.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		lblInicieSesion.setBounds(149, 23, 234, 69);
		contentPane.add(lblInicieSesion);
		
		
		}
	}
	