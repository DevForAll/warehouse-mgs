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

import com.mgps.almacen.controller.MarcaBLL;
import com.mgps.almacen.entity.EspecialidadTO;
import com.mgps.almacen.entity.MarcaTO;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmMarca extends JFrame {

	
	
	MarcaBLL obj = new MarcaBLL();
	MarcaTO pr;
	    
	
	
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField textField;
	private JTable tblMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMarca frame = new FrmMarca();
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
	public FrmMarca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 921, 270);
		contentPane.add(contentPane_1);
		
		JLabel lblMarca = new JLabel("MARCA");
		lblMarca.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/035-flag.png")));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMarca.setBounds(0, 11, 901, 35);
		contentPane_1.add(lblMarca);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(0, 54, 901, 205);
		contentPane_1.add(contentPane_1_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(235, 30, 62, 14);
		contentPane_1_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(307, 24, 86, 20);
		contentPane_1_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 52, 273, 28);
		contentPane_1_1.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(121, 83, 273, 28);
		contentPane_1_1.add(txtDescripcion);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 60, 86, 14);
		contentPane_1_1.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION :");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(25, 91, 110, 20);
		contentPane_1_1.add(lblDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				procesar(1);
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(726, 12, 140, 45);
		contentPane_1_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				procesar(2);
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(726, 71, 140, 45);
		contentPane_1_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(726, 127, 140, 45);
		contentPane_1_1.add(btnEliminar);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1_1.setBounds(10, 290, 906, 450);
		contentPane.add(contentPane_1_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 312);
		contentPane_1_1_1.add(scrollPane);
		
		tblMarca = new JTable();
		tblMarca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				mostrar();
			}
		});
		scrollPane.setViewportView(tblMarca);
		tblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		//listaCategorias();
		tblMarca.setModel(new DefaultTableModel(
			new Object[][] {
				
			//	listaCategorias();
				
				
			},
			new String[] {
				"ID", "NOMBRE", "DESCRIPCION"
			}
		));
		tblMarca.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblMarca.getColumnModel().getColumn(1).setPreferredWidth(171);
		tblMarca.getColumnModel().getColumn(2).setPreferredWidth(362);
		scrollPane.setViewportView(tblMarca);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmMarca.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(733, 389, 148, 43);
		contentPane_1_1_1.add(btnImprimir);
		
		
		listaMarca();
	}
	
	
	  public void listaMarca() {
	    	try {
				List<MarcaTO> lista = obj.MarcaListar();
				verMarca(lista);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
	    }
	    
	    private void verMarca(List<MarcaTO> lista) {
	        // variable de tipo tabla
	        DefaultTableModel model =  (DefaultTableModel) tblMarca.getModel();
	        model.setRowCount(0);
	        for (MarcaTO x : lista) {
	            Object[] dato = {
	            	x.getIdMarca(),
	                x.getNombre(),
	                x.getDescripcion()};
	            	model.addRow(dato);
	        }
	    }
	    
	    

	    private void mostrar() {
	        try {
	      	  pr = obj.MarcaBuscar(tblMarca.getModel().getValueAt(tblMarca.getSelectedRow(), 0).toString())        		;
	              if (pr != null) {
	            	txtCodigo.setText(pr.getIdMarca() +"");
	            	txtNombre.setText(pr.getNombre());
	            	txtDescripcion.setText(pr.getDescripcion());
	            
	            } else {
	                JOptionPane.showMessageDialog(this, "Marca no existe...");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }
	    }
	    
	    
	    

		private void DatosCategoria() {
	        pr = new MarcaTO();
	        pr.setNombre(txtNombre.getText());
	        pr.setDescripcion(txtDescripcion.getText());
	      //  pr.setIdMarca(Integer.parseInt(txtCodigo.getText()));
	        
	    }


	    private void procesar(int op) {
	    	DatosCategoria();// llama a metodo
	        String msg = "";
	        int result;
	        try {
	            switch (op) {
	                case 1: // adiciona
	                    result = obj.MarcaAdicionar(pr);
	                    msg = "Marca registrado con exito";
	                    break;
	                case 2://actualiza
	                	 pr.setIdMarca((Integer.parseInt(txtCodigo.getText())));
	                result = obj.MarcaActualizar(pr);
	               msg = "Marca actualizado con exito";
	               break;
	                case 3://elimina
	               //     pr.setIdempleado(txtIdEmpleado.getText());
	              //      result = obj.EmpleadoEliminar(pr);
	              //      msg = "Empleado eliminado con exito";
	                    break;
	            }
	            JOptionPane.showMessageDialog(this, msg);
	       listaMarca();
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }

	    }
		
	    

}
