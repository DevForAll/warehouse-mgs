package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mgps.almacen.controller.EmpleadosBLL;
import com.mgps.almacen.entity.EmpleadoTO;
import com.mgps.almacen.entity.EspecialidadTO;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

public class FrmEmpleados extends JFrame {

	
	
	EmpleadosBLL obj = new EmpleadosBLL();
	EmpleadoTO pr;
	EspecialidadTO es;
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtEmail;
	private JTextField txtNombre;
	private JTextField txtCodigoEspecialidad;
	private JTextField textField;

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

	private void DatosEmpleados() {
        pr = new EmpleadoTO();
        EspecialidadTO esp = new EspecialidadTO();
        pr.setNombre(txtNombre.getText());
        pr.setApellido(txtApellido.getText());
        pr.setNombre(txtNombre.getText());
        pr.setDni(txtDni.getText());
        pr.setEmail(txtEmail.getText());
    //    pr.setEspecialidad(esp.getIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText())));
        
      //  pr.getEspecialidad(esp.setIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText())));
        
        
      //  pr.setEspecialidad(esp.getIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText())));
        
        
        
       // pr.setEspecialidad(especialidad);(es.setIdEspecialidad((Integer.parseInt(txtCodigoEspecialidad.getText()))));
        //  pr.setEspecialidad(es.setIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText())));
//        pr.setEspecialidad().setIdEspecialidad((Integer.parseInt(txtCodigoEspecialidad.getText())));
       // pr.setEspecialidad(es.setIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText())));
        
    //  es.setIdEspecialidad(Integer.parseInt(txtCodigoEspecialidad.getText()));
        
//     pr.setIdCategoria(Integer.parseInt(txtCodigo.getText()));
        
    }

    private void procesar(int op) {
    	DatosEmpleados();// llama a metodo
        String msg = "";
        int result;
        try {
            switch (op) {
                case 1: // adiciona
                    result = obj.EmpleadosAdicionar(pr);
                    msg = "Empleados registrado con exito";
                    break;
                case 2://actualiza  getIdCategoria
						 pr.setIdEmpleado(Integer.parseInt(txtCodigo.getText()));
						 result = obj.EmpleadosActualizar(pr);
						 msg = "Empleados actualizado con exito";
	                break;
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
	public FrmEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 842);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(30, 42, 894, 223);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEmpleado = new JLabel("COD:");
		lblCodigoEmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEmpleado.setBounds(11, 18, 46, 14);
		contentPane_1.add(lblCodigoEmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(107, 11, 86, 31);
		contentPane_1.add(txtCodigo);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(110, 50, 299, 32);
		contentPane_1.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(110, 93, 121, 32);
		contentPane_1.add(txtDni);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(330, 93, 385, 32);
		contentPane_1.add(txtEmail);
		
		JLabel lblApellido = new JLabel("APELLIDOS :");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBounds(11, 50, 86, 14);
		contentPane_1.add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(487, 50, 231, 32);
		contentPane_1.add(txtNombre);
		
		JLabel lblEspecialidad = new JLabel("ESPECIALIDAD :");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(11, 152, 110, 14);
		contentPane_1.add(lblEspecialidad);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(419, 53, 68, 24);
		contentPane_1.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBounds(11, 92, 46, 32);
		contentPane_1.add(lblDni);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(262, 96, 58, 24);
		contentPane_1.add(lblEmail);
		
		JComboBox cmbEspecialidad = new JComboBox();
		cmbEspecialidad.setBounds(120, 141, 329, 39);
		contentPane_1.add(cmbEspecialidad);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				procesar(1);
			}
			
			
		});
		btnGuardar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(746, 22, 138, 48);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(2);
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(746, 81, 138, 48);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(746, 143, 138, 48);
		contentPane_1.add(btnEliminar);
		
		JLabel lblCodEspecialidad = new JLabel("1");
		lblCodEspecialidad.setBounds(379, 160, 46, 20);
		contentPane_1.add(lblCodEspecialidad);
		
		txtCodigoEspecialidad = new JTextField();
		txtCodigoEspecialidad.setColumns(10);
		txtCodigoEspecialidad.setBounds(455, 150, 32, 20);
		contentPane_1.add(txtCodigoEspecialidad);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/035-add.png")));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(500, 137, 46, 43);
		contentPane_1.add(btnNewButton_1_1_1_1);
		
		JLabel lblEmpleados = new JLabel("EMPLEADOS");
		lblEmpleados.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/003-add-user.png")));
		lblEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleados.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEmpleados.setBounds(30, 0, 874, 40);
		contentPane.add(lblEmpleados);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(30, 290, 894, 512);
		contentPane.add(contentPane_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 388);
		contentPane_1_1.add(scrollPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmEmpleados.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(736, 458, 148, 43);
		contentPane_1_1.add(btnImprimir);
	}
}
