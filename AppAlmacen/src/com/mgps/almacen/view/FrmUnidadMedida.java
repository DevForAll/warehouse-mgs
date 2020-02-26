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

import com.mgps.almacen.entity.UnidadMedidaTO;
import com.mgps.almacen.controller.UnidadMedidaBLL;


import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmUnidadMedida extends JFrame {

	
	UnidadMedidaBLL obj = new UnidadMedidaBLL();
	UnidadMedidaTO pr;
	
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtNombreCorto;
	private JTextField txtCodSunat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmUnidadMedida frame = new FrmUnidadMedida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	private void DatosUnidadMedida() {
        pr = new UnidadMedidaTO();
        pr.setDescripcion(txtNombre.getText());
        pr.setDescripcionCorta(txtNombreCorto.getText());
        pr.setCodigoSunat(txtCodSunat.getText());
       // pr.setIdCategoria(Integer.parseInt(txtCodigo.getText()));
        
    }


    private void procesar(int op) {
    	DatosUnidadMedida();// llama a metodo
        String msg = "";
        int result;
        try {
            switch (op) {
                case 1: // adiciona
                    result = obj.UnidadMedidaAdicionar(pr);
                    msg = "Unidad de Medida registrado con exito";
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
	
	
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public FrmUnidadMedida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 476, 270);
		contentPane.add(contentPane_1);
		
		JLabel lblUnidadDeMedida = new JLabel("UNIDAD DE MEDIDA");
		lblUnidadDeMedida.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/021-sign.png")));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadDeMedida.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUnidadDeMedida.setBounds(35, 11, 424, 35);
		contentPane_1.add(lblUnidadDeMedida);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(35, 48, 424, 205);
		contentPane_1.add(contentPane_1_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(235, 30, 62, 14);
		contentPane_1_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(307, 24, 86, 20);
		contentPane_1_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 52, 273, 28);
		contentPane_1_1.add(txtNombre);
		
		txtNombreCorto = new JTextField();
		txtNombreCorto.setColumns(10);
		txtNombreCorto.setBounds(121, 83, 74, 28);
		contentPane_1_1.add(txtNombreCorto);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 60, 86, 14);
		contentPane_1_1.add(lblNombre);
		
		JLabel lblAbreviatura = new JLabel("ABRV:");
		lblAbreviatura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAbreviatura.setBounds(25, 91, 110, 20);
		contentPane_1_1.add(lblAbreviatura);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(1);
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(274, 149, 140, 48);
		contentPane_1_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(157, 149, 111, 48);
		contentPane_1_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(10, 149, 134, 48);
		contentPane_1_1.add(btnEliminar);
		
		JLabel lblCodSunat = new JLabel("COD SUNAT:");
		lblCodSunat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodSunat.setBounds(221, 86, 86, 25);
		contentPane_1_1.add(lblCodSunat);
		
		txtCodSunat = new JTextField();
		txtCodSunat.setColumns(10);
		txtCodSunat.setBounds(319, 83, 74, 28);
		contentPane_1_1.add(txtCodSunat);
	}
}
