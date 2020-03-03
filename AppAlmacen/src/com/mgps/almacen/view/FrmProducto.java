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
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import com.mgps.almacen.controller.ProductoBLL;
import com.mgps.almacen.entity.ProductoTO;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmProducto extends JFrame {

	

	ProductoBLL obj = new ProductoBLL();
	ProductoTO pr;
	    
	
	private JPanel contentPane;
	private JTextField txtCodigoProducto;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField textField_3;
	private JTable table;
	private JTextField txtCategoria;
	private JTextField txtMarca;
	private JTextField txtUnidadMedida;
	private JTextField txtUbicacion;
	private JTextField txtPrecioCompra;
	private JTextField txtStock;
	private JTextField txtStockMinimo;
	private JTextField txtVence;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProducto frame = new FrmProducto();
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
	public FrmProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 927, 46);
		contentPane.add(contentPane_1);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/027-shopping-cart.png")));
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblProductos.setBounds(22, 11, 882, 35);
		contentPane_1.add(lblProductos);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setBounds(28, 428, 894, 440);
		contentPane.add(contentPane_1_1_1);
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblNombre_1 = new JLabel("NOMBRE :");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre_1.setBounds(27, 26, 86, 14);
		contentPane_1_1_1.add(lblNombre_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/011-loupe-1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBounds(416, 11, 124, 43);
		contentPane_1_1_1.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(27, 65, 838, 229);
		contentPane_1_1_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(96, 20, 315, 28);
		contentPane_1_1_1.add(textField_3);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir.setBounds(736, 458, 148, 43);
		contentPane_1_1_1.add(btnImprimir);
		
		JButton btnImprimir_1 = new JButton("Imprimir");
		btnImprimir_1.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/042-folder.png")));
		btnImprimir_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimir_1.setBounds(724, 305, 141, 43);
		contentPane_1_1_1.add(btnImprimir_1);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setBounds(28, 65, 895, 340);
		contentPane.add(contentPane_1_1);
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblCodigoEnmpleado = new JLabel("CODIGO");
		lblCodigoEnmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCodigoEnmpleado.setBounds(25, 26, 62, 14);
		contentPane_1_1.add(lblCodigoEnmpleado);
		
		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setColumns(10);
		txtCodigoProducto.setBounds(122, 20, 86, 29);
		contentPane_1_1.add(txtCodigoProducto);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 52, 425, 28);
		contentPane_1_1.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(121, 83, 425, 28);
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
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				procesar(1);
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnGuardar.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/035-save.png")));
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(745, 19, 140, 48);
		contentPane_1_1.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/041-pencil.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBounds(742, 78, 143, 48);
		contentPane_1_1.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/042-multiply-1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(745, 137, 140, 48);
		contentPane_1_1.add(btnEliminar);
		
		JComboBox cmbCategoria = new JComboBox();
		cmbCategoria.setBounds(122, 119, 231, 27);
		contentPane_1_1.add(cmbCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(363, 117, 32, 29);
		contentPane_1_1.add(txtCategoria);
		
		JLabel lblCategoria = new JLabel("CATEGORIA :");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategoria.setBounds(25, 125, 110, 20);
		contentPane_1_1.add(lblCategoria);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(293, 156, 32, 29);
		contentPane_1_1.add(txtMarca);
		
		JComboBox cmbCategoria_1 = new JComboBox();
		cmbCategoria_1.setBounds(122, 157, 161, 27);
		contentPane_1_1.add(cmbCategoria_1);
		
		JLabel lblMarca = new JLabel("MARCA :");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMarca.setBounds(25, 158, 110, 20);
		contentPane_1_1.add(lblMarca);
		
		JComboBox cmbCategoria_2 = new JComboBox();
		cmbCategoria_2.setBounds(132, 196, 231, 27);
		contentPane_1_1.add(cmbCategoria_2);
		
		JLabel lblUnidadMedida = new JLabel("UNIDAD MEDIDA");
		lblUnidadMedida.setBounds(25, 197, 110, 20);
		contentPane_1_1.add(lblUnidadMedida);
		lblUnidadMedida.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtUnidadMedida = new JTextField();
		txtUnidadMedida.setBounds(363, 194, 32, 29);
		contentPane_1_1.add(txtUnidadMedida);
		txtUnidadMedida.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/035-add.png")));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(405, 112, 46, 43);
		contentPane_1_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/035-add.png")));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(335, 150, 46, 43);
		contentPane_1_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(FrmProducto.class.getResource("/cjava/imagenes/035-add.png")));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(405, 187, 46, 43);
		contentPane_1_1.add(btnNewButton_1_1_1_1);
		
		JLabel lblUbicacion = new JLabel("UBICACION :");
		lblUbicacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUbicacion.setBounds(25, 236, 110, 20);
		contentPane_1_1.add(lblUbicacion);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setColumns(10);
		txtUbicacion.setBounds(121, 228, 425, 28);
		contentPane_1_1.add(txtUbicacion);
		
		JLabel lblPrecioDeCompra = new JLabel("PRECIO DE COMPRA");
		lblPrecioDeCompra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioDeCompra.setBounds(239, 269, 142, 23);
		contentPane_1_1.add(lblPrecioDeCompra);
		
		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setColumns(10);
		txtPrecioCompra.setBounds(380, 267, 86, 29);
		contentPane_1_1.add(txtPrecioCompra);
		
		JLabel lblStock = new JLabel("STOCK:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStock.setBounds(25, 275, 86, 14);
		contentPane_1_1.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBounds(122, 267, 86, 29);
		contentPane_1_1.add(txtStock);
		
		txtStockMinimo = new JTextField();
		txtStockMinimo.setColumns(10);
		txtStockMinimo.setBounds(605, 267, 86, 29);
		contentPane_1_1.add(txtStockMinimo);
		
		JLabel lblStockMinimo = new JLabel("STOCK MINIMO:");
		lblStockMinimo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockMinimo.setBounds(493, 273, 102, 14);
		contentPane_1_1.add(lblStockMinimo);
		
		JLabel lblVence = new JLabel("S");
		lblVence.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVence.setBounds(48, 305, 102, 14);
		contentPane_1_1.add(lblVence);
		
		JCheckBox chkVence = new JCheckBox("SI");
		chkVence.setFont(new Font("Tahoma", Font.BOLD, 14));
		chkVence.setBounds(102, 297, 46, 29);
		contentPane_1_1.add(chkVence);
		
		JLabel lblFechaDeVencimiento = new JLabel("FECHA DE VENCIMIENTO:");
		lblFechaDeVencimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaDeVencimiento.setBounds(169, 308, 156, 13);
		contentPane_1_1.add(lblFechaDeVencimiento);
		
		JDateChooser dtFechaVencimiento = new JDateChooser();
		dtFechaVencimiento.setBounds(335, 303, 131, 23);
		contentPane_1_1.add(dtFechaVencimiento);
		
		txtVence = new JTextField();
		txtVence.setColumns(10);
		txtVence.setBounds(25, 300, 13, 29);
		contentPane_1_1.add(txtVence);
	}
	
	
	
	private void DatosProductos() {
        pr = new ProductoTO();
       
//        String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
//        String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
//        String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
//        String fecha = (year + "-" + mes+ "-" + dia);
//        txtfecha.setText(fecha);
        
        
        pr.setDescripcion(txtDescripcion.getText());
        pr.getCategoriaTO().setIdCategoria(Integer.parseInt(txtStockMinimo.getText()));
        pr.getMarcaTO().setIdMarca(Integer.parseInt(txtStockMinimo.getText()));
        pr.setCodigo(Integer.parseInt(txtCodigoProducto.getText()));
        pr.setUbicacion(txtDescripcion.getText());
        pr.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText()));
        pr.setStock(Integer.parseInt(txtStock.getText()));
        pr.setMinStock(Integer.parseInt(txtStockMinimo.getText()));
        pr.setVen(txtVence.getText());
        
        JDateChooser dtFechaVencimiento = null;
      
   	Date Fec =dtFechaVencimiento.getDate();
      long FechaNumero = Fec.getTime();
      java.sql.Date FechaX =  new java.sql.Date(FechaNumero);
                
    //    SimpleDateFormat formFecha = new SimpleDateFormat("yyyy-MM,dd");
    //    Date Fechtxt;
    //    Fechtxt=formFecha.parse(dtFechaVencimiento.getDateFormatString());
        
		pr.setFechaVen( Fec);
		
  
        
    }

	
	   private void procesar(int op) {
		   DatosProductos();// llama a metodo
	        String msg = "AAAAAAAAAAAAAAAAAAAAA";
	        int result;
	        try {
	            switch (op) {
	                case 1: // adiciona
	                    result = obj.ProductoAdicionar(pr);
	                    msg = "Producto  registrado con exito";
	                    break;
	                case 2://actualiza
	                	// pr.setIdMarca((Integer.parseInt(txtCodigo.getText())));
	              //  result = obj.MarcaActualizar(pr);
	             //  msg = "Marca actualizado con exito";
	               break;
	                case 3://elimina
	               //     pr.setIdempleado(txtIdEmpleado.getText());
	              //      result = obj.EmpleadoEliminar(pr);
	              //      msg = "Empleado eliminado con exito";
	                    break;
	            }
	            JOptionPane.showMessageDialog(this, msg);
	      // listaMarca();
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, e.getMessage());
	        }

	    }
}
