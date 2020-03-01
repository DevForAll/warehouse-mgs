package com.mgps.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.mgps.almacen.controller.EspecialidadBLL;
import com.mgps.almacen.entity.EspecialidadTO;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmEspecialidad extends JFrame {

	

	EspecialidadBLL obj = new EspecialidadBLL();
	EspecialidadTO pr;
	
	
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField textField;
	private JTable tblEspecialidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEspecialidad frame = new FrmEspecialidad();
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
	public FrmEspecialidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(20, 46, 894, 168);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(25, 26, 62, 14);
		contentPane_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(132, 20, 86, 28);
		contentPane_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(132, 59, 273, 28);
		contentPane_1.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(132, 98, 443, 28);
		contentPane_1.add(txtDescripcion);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 73, 86, 14);
		contentPane_1.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION :");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(25, 106, 110, 20);
		contentPane_1.add(lblDescripcion);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesar(2);
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(725, 59, 141, 45);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(725, 110, 139, 45);
		contentPane_1.add(btnEliminar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar(1);
				
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(725, 11, 141, 45);
		contentPane_1.add(btnGuardar);
		
		JLabel lblEspecialidad = new JLabel("ESPECIALIDAD");
		lblEspecialidad.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/034-favourites.png")));
		lblEspecialidad.setBounds(20, 11, 894, 35);
		contentPane.add(lblEspecialidad);
		lblEspecialidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(20, 235, 894, 407);
		contentPane.add(contentPane_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 283);
		contentPane_1_1.add(scrollPane);
		
		tblEspecialidad = new JTable();
		tblEspecialidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				mostrar();
			}
		});
		scrollPane.setViewportView(tblEspecialidad);
		tblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		//listaCategorias();
		tblEspecialidad.setModel(new DefaultTableModel(
			new Object[][] {
				
			//	listaCategorias();
				
				
			},
			new String[] {
				"ID", "NOMBRE", "DESCRIPCION"
			}
		));
		tblEspecialidad.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblEspecialidad.getColumnModel().getColumn(1).setPreferredWidth(171);
		tblEspecialidad.getColumnModel().getColumn(2).setPreferredWidth(362);
		scrollPane.setViewportView(tblEspecialidad);
		
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmEspecialidad.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(739, 353, 145, 43);
		contentPane_1_1.add(btnImprimir);
		
		
		listaEspecialidad();
	}
	

	   public void listaEspecialidad() {
	    	try {
				List<EspecialidadTO> lista = obj.EspecialidadListar();
				verEspecialidad(lista);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
	    }
	    
	    private void verEspecialidad(List<EspecialidadTO> lista) {
	        // variable de tipo tabla
	        DefaultTableModel model =  (DefaultTableModel) tblEspecialidad.getModel();
	        model.setRowCount(0);
	        for (EspecialidadTO x : lista) {
	            Object[] dato = {
	            	x.getIdEspecialidad(),
	                x.getNombre(),
	                x.getDescripcion()};
	            	model.addRow(dato);
	        }
	    }
	
	    
	    
	    
	    private void mostrar() {
	        try {
	      	  pr = obj.EspecialidadBuscar(tblEspecialidad.getModel().getValueAt(tblEspecialidad.getSelectedRow(), 0).toString())        		;
	              if (pr != null) {
	            	txtCodigo.setText(pr.getIdEspecialidad() +"");
	            	txtNombre.setText(pr.getNombre());
	            	txtDescripcion.setText(pr.getDescripcion());
	            
	            } else {
	                JOptionPane.showMessageDialog(this, "Especialidad no existe...");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }
	    }
	    
	    
	    private void DatosCategoria() {
	        pr = new EspecialidadTO();
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
	                    result = obj.EspecialidadAdicionar(pr);
	                    msg = "Especialidad registrado con exito";
	                    break;
	                case 2://actualiza
	                	pr.setIdEspecialidad((Integer.parseInt(txtCodigo.getText())));
	                result = obj.EspecialidadActualizar(pr);
	               msg = "Especialidad actualizado con exito";
	                 break;
	                case 3://elimina
	               //     pr.setIdempleado(txtIdEmpleado.getText());
	              //      result = obj.EmpleadoEliminar(pr);
	              //      msg = "Empleado eliminado con exito";
	                    break;
	            }
	            JOptionPane.showMessageDialog(this, msg);
	           listaEspecialidad();
	           } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }

	    }
		
}
