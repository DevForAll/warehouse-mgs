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

import com.mgps.almacen.controller.ProveedorBLL;
import com.mgps.almacen.entity.ProveedorTO;

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

public class FrmProveedor extends JFrame {

	
	
	ProveedorBLL obj = new ProveedorBLL();
	ProveedorTO pr;
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtRazonSocial;
	private JTextField txtRuc;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField textField;
	private JTable tblProveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProveedor frame = new FrmProveedor();
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
	public FrmProveedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 858);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(10, 55, 907, 224);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(295, 37, 59, 17);
		contentPane_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(354, 36, 86, 20);
		contentPane_1.add(txtCodigo);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setColumns(10);
		txtRazonSocial.setBounds(135, 94, 305, 20);
		contentPane_1.add(txtRazonSocial);
		
		txtRuc = new JTextField();
		txtRuc.setColumns(10);
		txtRuc.setBounds(131, 66, 121, 20);
		contentPane_1.add(txtRuc);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(135, 186, 121, 20);
		contentPane_1.add(txtTelefono);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar(1);
				
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(752, 20, 127, 48);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(2);
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(752, 78, 127, 48);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(752, 137, 127, 48);
		contentPane_1.add(btnEliminar);
		
		JLabel lblRazonSocial = new JLabel("RAZON SOCIAL :");
		lblRazonSocial.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRazonSocial.setBounds(10, 95, 121, 17);
		contentPane_1.add(lblRazonSocial);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(135, 123, 305, 51);
		contentPane_1.add(txtDireccion);
		
		JLabel lblRuc = new JLabel("RUC :");
		lblRuc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRuc.setBounds(10, 69, 86, 14);
		contentPane_1.add(lblRuc);
		
		JLabel lblTelefono = new JLabel("TELEFONO :");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelefono.setBounds(16, 188, 86, 14);
		contentPane_1.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("DIRECCION :");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(10, 129, 86, 14);
		contentPane_1.add(lblDireccion);
		
		JLabel lblProveedor = new JLabel("PROVEEDORES");
		lblProveedor.setBounds(28, 11, 889, 40);
		contentPane.add(lblProveedor);
		lblProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedor.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/029-add-1.png")));
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1_1.setBounds(10, 287, 907, 512);
		contentPane.add(contentPane_1_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 388);
		contentPane_1_1_1.add(scrollPane);
		
		tblProveedor = new JTable();
		tblProveedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				mostrar();
				
			}
		});
		scrollPane.setViewportView(tblProveedor);
		tblProveedor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		//listaCategorias();
		tblProveedor.setModel(new DefaultTableModel(
					new Object[][] {
						
					//	listaCategorias();
						
						
					},
					new String[] {
						"Id", "RazonSocial", "Direccion","Ruc","Telefono"
					}
				));
		tblProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblProveedor.getColumnModel().getColumn(1).setPreferredWidth(171);
		tblProveedor.getColumnModel().getColumn(2).setPreferredWidth(362);
		tblProveedor.getColumnModel().getColumn(3).setPreferredWidth(171);
		tblProveedor.getColumnModel().getColumn(4).setPreferredWidth(171);
				scrollPane.setViewportView(tblProveedor);
				
				
		
	
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmProveedor.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(736, 458, 148, 43);
		contentPane_1_1_1.add(btnImprimir);
		
		listaProveedor();
	}

	
	
	
	 public void listaProveedor() {
	    	try {
				List<ProveedorTO> lista = obj.ProveedorListar();
				verProveedor(lista);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
	    }
	    
	    private void verProveedor(List<ProveedorTO> lista) {
	        // variable de tipo tabla
	        DefaultTableModel model =  (DefaultTableModel) tblProveedor.getModel();
	        model.setRowCount(0);
	        for (ProveedorTO x : lista) {
	            Object[] dato = {
	            	x.getIdProveedor(),
	                x.getRazonSocial(),
	                x.getDireccion(),
	                x.getRuc(),
	                x.getTelefono()};
	            	model.addRow(dato);
	        }
	    }

	    
	    
	    

	    private void mostrar() {
	        try {
	      	  pr = obj.ProveedorBuscar(tblProveedor.getModel().getValueAt(tblProveedor.getSelectedRow(), 0).toString())        		;
	              if (pr != null) {
	            	txtCodigo.setText(pr.getIdProveedor() +"");
	            	txtRazonSocial.setText(pr.getRazonSocial());
	            	txtDireccion.setText(pr.getDireccion());
	            	txtRuc.setText(pr.getRuc());
	            	txtTelefono.setText(pr.getTelefono());
	            
	            } else {
	                JOptionPane.showMessageDialog(this, "Marca no existe...");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }
	    }
	    
	    
	    
	
		private void DatosProveedor() {
	        pr = new ProveedorTO();
	        pr.setRazonSocial(txtRazonSocial.getText());
	        pr.setDireccion(txtDireccion.getText());
	        pr.setRuc(txtRuc.getText());
	        pr.setTelefono(txtTelefono.getText());
	        // pr.setIdCategoria(Integer.parseInt(txtCodigo.getText()));
	        
	    }
		
		  private void procesar(int op) {
		    	DatosProveedor();// llama a metodo
		        String msg = "";
		        int result;
		        try {
		            switch (op) {
		                case 1: // adiciona
		                    result = obj.ProveedorAdicionar(pr);
		                    msg = "Proveedor registrado con exito";
		                    break;
		                case 2://actualiza
		                    pr.setIdProveedor((Integer.parseInt(txtCodigo.getText())));
		                result = obj.ProveedorActualizar(pr);
		               msg = "Proveedor actualizado con exito";
		             break;
		                case 3://elimina
		               //     pr.setIdempleado(txtIdEmpleado.getText());
		              //      result = obj.EmpleadoEliminar(pr);
		              //      msg = "Empleado eliminado con exito";
		                    break;
		            }
		            JOptionPane.showMessageDialog(this, msg);
		            listaProveedor();
		        } catch (Exception e) {
		            JOptionPane.showMessageDialog(this, e.getMessage());
		        }

		    }
			
			
			
}
