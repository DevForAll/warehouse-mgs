package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.controller.CategoriaBLL;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCategoria extends JFrame {

	CategoriaBLL obj = new CategoriaBLL();
	CategoriaTO pr;
	    
	    
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCategoria frame = new FrmCategoria();
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
	
	private void DatosCategoria() {
        pr = new CategoriaTO();
        pr.setNombre(txtNombre.getText());
        pr.setDescripcion(txtDescripcion.getText());
       // pr.setIdCategoria(Integer.parseInt(txtCodigo.getText()));
        
    }


    private void procesar(int op) {
    	DatosCategoria();// llama a metodo
        String msg = "";
        int result;
        try {
            switch (op) {
                case 1: // adiciona
                    result = obj.CategoriaAdicionar(pr);
                    msg = "Categoria registrado con exito";
                    break;
                case 2://actualiza
               //     pr.setIdempleado(txtIdEmpleado.getText());
                //    result = obj.EmpleadoActualizar(pr);
             //       msg = "Empleado actualizado con exito";
                //    break;
                case 3://elimina
               //     pr.setIdempleado(txtIdEmpleado.getText());
              //      result = obj.EmpleadoEliminar(pr);
              //      msg = "Empleado eliminado con exito";
                    break;
            }
            JOptionPane.showMessageDialog(this, msg);
         //   listaEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
	
	
	
	public FrmCategoria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmCategoria.class.getResource("/cjava/imagenes/MGSOLUTIONS.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/007-share.png")));
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCategoria.setBounds(35, 11, 424, 35);
		contentPane.add(lblCategoria);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(35, 48, 424, 205);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(235, 30, 62, 14);
		contentPane_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(307, 24, 86, 20);
		contentPane_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 52, 273, 28);
		contentPane_1.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(121, 83, 273, 28);
		contentPane_1.add(txtDescripcion);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 60, 86, 14);
		contentPane_1.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION :");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(25, 91, 110, 20);
		contentPane_1.add(lblDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(1);
																	
				
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(274, 149, 140, 48);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(157, 149, 111, 48);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(10, 149, 134, 48);
		contentPane_1.add(btnEliminar);
		
		


	}
}
