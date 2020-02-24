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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusuario = new JLabel("usuario");
		lblusuario.setBounds(95, 102, 46, 14);
		contentPane.add(lblusuario);
		
		JLabel lblpass = new JLabel("pass");
		lblpass.setBounds(95, 136, 46, 14);
		contentPane.add(lblpass);
		
		txtusuario = new JTextField();
		txtusuario.setColumns(10);
		txtusuario.setBounds(164, 99, 86, 20);
		contentPane.add(txtusuario);
		
		txtpass = new JTextField();
		txtpass.setColumns(10);
		txtpass.setBounds(164, 130, 86, 20);
		contentPane.add(txtpass);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String usuario = txtusuario.getText();
				String clave = txtpass.getText();

				
				UsuarioDAO  usuarioDAO=new UsuarioDAO();
				//GestionUsuario gestionUsuario = new GestionUsuario();

				UsuarioTO usuarioTO=new UsuarioTO();
				//Usuario usuario2 = new Usuario();
				
				usuarioTO.setUsuario(usuario);
				usuarioTO.setClave(clave);

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
		btnIngresar.setBounds(119, 207, 89, 43);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(224, 207, 89, 43);
		contentPane.add(btnSalir);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(FrmLogin.class.getResource("/cjava/imagenes/1354826121_preferences-desktop-user-password.png")));
		btnNewButton.setBounds(277, 54, 147, 118);
		contentPane.add(btnNewButton);
		
		
		}
	}
	