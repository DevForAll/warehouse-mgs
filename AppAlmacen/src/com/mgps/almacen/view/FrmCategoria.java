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
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;

public class FrmCategoria extends JFrame {
	
	CategoriaBLL obj = new CategoriaBLL();
	CategoriaTO pr;
	    
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTable tblCategoria;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCategoria frame = new FrmCategoria();
					frame.setVisible(true);
					
				//	listaCategorias();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	
	public FrmCategoria() {
		//listaCategorias();
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmCategoria.class.getResource("/cjava/imagenes/MGSOLUTIONS.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 783);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/007-share.png")));
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCategoria.setBounds(35, 11, 743, 35);
		contentPane.add(lblCategoria);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBounds(35, 48, 894, 176);
		contentPane.add(contentPane_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(20, 17, 62, 14);
		contentPane_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(133, 11, 86, 28);
		contentPane_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(133, 51, 273, 28);
		contentPane_1.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(133, 90, 494, 28);
		contentPane_1.add(txtDescripcion);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(20, 57, 86, 14);
		contentPane_1.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION :");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(20, 93, 110, 20);
		contentPane_1.add(lblDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(1);
																	
				
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(744, 11, 140, 45);
		contentPane_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(2);
				
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(744, 65, 140, 45);
		contentPane_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(744, 121, 140, 45);
		contentPane_1.add(btnEliminar);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(35, 229, 894, 512);
		contentPane.add(contentPane_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1.add(btnBuscar);
		
			btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 66, 863, 388);
			contentPane_1_1.add(scrollPane);
			scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			
			
			
			tblCategoria = new JTable();
			tblCategoria.setFont(new Font("Tahoma", Font.BOLD, 12));
			//listaCategorias();
			tblCategoria.setModel(new DefaultTableModel(
				new Object[][] {
					
				//	listaCategorias();
					
					
				},
				new String[] {
					"ID", "NOMBRE", "DESCRIPCION"
				}
			));
			tblCategoria.getColumnModel().getColumn(0).setPreferredWidth(50);
			tblCategoria.getColumnModel().getColumn(1).setPreferredWidth(171);
			tblCategoria.getColumnModel().getColumn(2).setPreferredWidth(362);
			scrollPane.setViewportView(tblCategoria);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(96, 20, 315, 28);
			contentPane_1_1.add(textField);
			
			JButton btnImprimir = new JButton("Imprimir");
			btnImprimir.setIcon(new ImageIcon(FrmCategoria.class.getResource("/cjava/imagenes/042-folder.png")));
			btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnImprimir.setBounds(736, 458, 148, 43);
			contentPane_1_1.add(btnImprimir);
		
		
		listaCategorias();

	}

	   public void listaCategorias() {
	    	try {
				List<CategoriaTO> lista = obj.CategoriaListar();
				verCategorias(lista);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
	    }
	    
	    private void verCategorias(List<CategoriaTO> lista) {
	        // variable de tipo tabla
	        DefaultTableModel model =  (DefaultTableModel) tblCategoria.getModel();
	        model.setRowCount(0);
	        for (CategoriaTO x : lista) {
	            Object[] dato = {
	            	x.getIdCategoria(),
	                x.getNombre(),
	                x.getDescripcion()};
	            	model.addRow(dato);
	        }
	    }
	

	    

//	    private void mostrar() {
//	        try {
//	            pr = obj.CategoriaListar(txtIdEmpleado.getText());
//	            if (pr != null) {
//	                txtNombre.setText(pr.getNombre());
//	                txtApellido.setText(pr.getApellido());
//	                txtEmail.setText(pr.getEmail());
//	                txtUsuario.setText(pr.getUsuario());
//	                txtPassword.setText(pr.getClave());
//	            } else {
//	                JOptionPane.showMessageDialog(this, "Empleado no existe...");
//	            }
//	        } catch (Exception e) {
//	            JOptionPane.showMessageDialog(this, e.getMessage());
//	        }

	    
	    
	    
	    
	    
	    
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
                case 2://actualiza  getIdCategoria
						 pr.setIdCategoria(Integer.parseInt(txtCodigo.getText()));
						 result = obj.CategoriaActualizar(pr);
						 msg = "Categoria actualizado con exito";
	                break;
                case 3://elimina
               //     pr.setIdempleado(txtIdEmpleado.getText());
              //      result = obj.EmpleadoEliminar(pr);
              //      msg = "Empleado eliminado con exito";
                    break;
            }
            JOptionPane.showMessageDialog(this, msg);
            listaCategorias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}
