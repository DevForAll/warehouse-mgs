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

import com.mgps.almacen.entity.MarcaTO;
import com.mgps.almacen.entity.UnidadMedidaTO;
import com.mgps.almacen.controller.UnidadMedidaBLL;


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

public class FrmUnidadMedida extends JFrame {

	
	UnidadMedidaBLL obj = new UnidadMedidaBLL();
	UnidadMedidaTO pr;
	
	
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtNombreCorto;
	private JTextField txtCodSunat;
	private JTextField textField;
	private JTable tblUnidadMedida;

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

	
	
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public FrmUnidadMedida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 873);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 936, 270);
		contentPane.add(contentPane_1);
		
		JLabel lblUnidadDeMedida = new JLabel("UNIDAD DE MEDIDA");
		lblUnidadDeMedida.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/021-sign.png")));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidadDeMedida.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUnidadDeMedida.setBounds(35, 11, 891, 35);
		contentPane_1.add(lblUnidadDeMedida);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1.setBounds(35, 48, 891, 205);
		contentPane_1.add(contentPane_1_1);
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(25, 26, 62, 14);
		contentPane_1_1.add(lblCodigoEnmpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(120, 24, 86, 25);
		contentPane_1_1.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(120, 66, 305, 28);
		contentPane_1_1.add(txtNombre);
		
		txtNombreCorto = new JTextField();
		txtNombreCorto.setColumns(10);
		txtNombreCorto.setBounds(121, 118, 74, 28);
		contentPane_1_1.add(txtNombreCorto);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(25, 72, 86, 14);
		contentPane_1_1.add(lblNombre);
		
		JLabel lblAbreviatura = new JLabel("ABRV:");
		lblAbreviatura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAbreviatura.setBounds(25, 126, 110, 20);
		contentPane_1_1.add(lblAbreviatura);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				procesar(1);
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(741, 12, 140, 48);
		contentPane_1_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				procesar(2);
				
			}
		});
		btnEditar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(741, 71, 140, 48);
		contentPane_1_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(741, 130, 140, 48);
		contentPane_1_1.add(btnEliminar);
		
		JLabel lblCodSunat = new JLabel("COD SUNAT:");
		lblCodSunat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodSunat.setBounds(255, 119, 86, 25);
		contentPane_1_1.add(lblCodSunat);
		
		txtCodSunat = new JTextField();
		txtCodSunat.setColumns(10);
		txtCodSunat.setBounds(351, 118, 74, 28);
		contentPane_1_1.add(txtCodSunat);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1_1_1.setBounds(39, 302, 907, 512);
		contentPane.add(contentPane_1_1_1);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(21, 66, 863, 388);
		contentPane_1_1_1.add(scrollPane);
		
		tblUnidadMedida = new JTable();
		scrollPane.setViewportView(tblUnidadMedida);
		//listaCategorias();
		tblUnidadMedida.setModel(new DefaultTableModel(
					new Object[][] {
						
					//	listaCategorias();
						
						
					},
					new String[] {
						"ID", "NOMBRE", "ABRV","COD_SUNAT"
					}
				));
		tblUnidadMedida.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblUnidadMedida.getColumnModel().getColumn(1).setPreferredWidth(171);
		tblUnidadMedida.getColumnModel().getColumn(2).setPreferredWidth(171);
		tblUnidadMedida.getColumnModel().getColumn(3).setPreferredWidth(171);
		scrollPane.setViewportView(tblUnidadMedida);
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 20, 315, 28);
		contentPane_1_1_1.add(textField);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmUnidadMedida.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(736, 458, 148, 43);
		contentPane_1_1_1.add(btnImprimir);
		
		
		listaUnidadMedida();
	}
	
	
	
	
	  public void listaUnidadMedida() {
	    	try {
				List<UnidadMedidaTO> lista = obj.UnidadMedidaListar();
				verUnidadMedida(lista);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
	    }
	    
	    private void verUnidadMedida(List<UnidadMedidaTO> lista) {
	        // variable de tipo tabla
	        DefaultTableModel model =  (DefaultTableModel) tblUnidadMedida.getModel();
	        model.setRowCount(0);
	        for (UnidadMedidaTO x : lista) {
	            Object[] dato = {
	            	x.getCod(),
	                x.getDescripcion(),
	                x.getDescripcionCorta(),
	                x.getCodigoSunat()};
	            	model.addRow(dato);
	        }
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
	                    pr.setCod((Integer.parseInt(txtCodigo.getText())));
	                result = obj.UnidadMedidActualizar(pr);
	               msg = "Unidad de Medida actualizado con exito";
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
		
		
		
}
