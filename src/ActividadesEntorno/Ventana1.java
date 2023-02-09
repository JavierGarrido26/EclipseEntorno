package ActividadesEntorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField NombreDeProducto;
	private JTextField PrecioDelProducto;
	private JRadioButton botonExtra;
	private JRadioButton BotonSegunda;
	private JRadioButton BotonPrimera;
	private JRadioButton BotonSuperExtra;
	private JRadioButton iva4;
	private JRadioButton iva10;
	private JRadioButton iva21;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Entrada De Datos De Texto\r\n");
		lblNewLabel.setBounds(115, 11, 223, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Producto:\r\n");
		lblNewLabel_1.setBounds(10, 69, 113, 14);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Producto");
		lblNewLabel_2.setBounds(15, 109, 81, 14);
		
		JLabel lblNewLabel_2_1 = new JLabel("Precio del Producto\r\n");
		lblNewLabel_2_1.setBounds(15, 147, 92, 14);
		
		JLabel lblNewLabel_2_2 = new JLabel("Categoria:\r\n");
		lblNewLabel_2_2.setBounds(15, 182, 81, 14);
		
		JLabel lblNewLabel_2_3 = new JLabel("IVA\r\n");
		lblNewLabel_2_3.setBounds(31, 289, 43, 14);
		
		botonExtra = new JRadioButton("Extra\r\n");
		botonExtra.setBounds(105, 198, 83, 23);
		buttonGroup.add(botonExtra);
		ButtonModel ext=botonExtra.getModel();
		botonExtra.setBackground(new Color(192, 192, 192));
		
		BotonPrimera = new JRadioButton("Primera");
		BotonPrimera.setBounds(105, 233, 83, 23);
		buttonGroup.add(BotonPrimera);
		ButtonModel prim=BotonPrimera.getModel();
		BotonPrimera.setBackground(new Color(192, 192, 192));
		
		BotonSegunda = new JRadioButton("Segunda");
		BotonSegunda.setBounds(197, 198, 67, 23);
		buttonGroup.add(BotonSegunda);
		ButtonModel seg=BotonSegunda.getModel();
		BotonSegunda.setBackground(new Color(192, 192, 192));
		
		BotonSuperExtra = new JRadioButton("Super-Extra\r\n\r\n");
		BotonSuperExtra.setBounds(197, 233, 83, 23);
		buttonGroup.add(BotonSuperExtra);
		ButtonModel SuperExtr=BotonSuperExtra.getModel();
		BotonSuperExtra.setBackground(new Color(192, 192, 192));
		
		iva4 = new JRadioButton("4%");
		iva4.setBounds(103, 285, 43, 23);
		buttonGroup_1.add(iva4);
		ButtonModel iv4=iva4.getModel();
		iva4.setBackground(new Color(192, 192, 192));
		
		iva10 = new JRadioButton("10%");
		iva10.setBounds(148, 285, 49, 23);
		buttonGroup_1.add(iva10);
		ButtonModel iv10=iva10.getModel();
		iva10.setBackground(new Color(192, 192, 192));
		
		
		iva21 = new JRadioButton("21%\r\n");
		iva21.setBounds(199, 285, 49, 23);
		buttonGroup_1.add(iva21);
		ButtonModel iv21=iva21.getModel();
		iva21.setBackground(new Color(192, 192, 192));
		
		JComboBox tipoproducto = new JComboBox();
		tipoproducto.setBounds(130, 106, 109, 20);
		tipoproducto.setModel(new DefaultComboBoxModel(new String[] {"De temporada ", "Importado ", "Consumo popular", "Durarero ", "No durarero "}));
		
		JButton btnNewButton = new JButton("Ver datos relacionados ");
		btnNewButton.setBounds(105, 325, 145, 23);
		
		
		
		
		JButton limpiardatos = new JButton("Limpiar Datos \r\n");
		limpiardatos.setBounds(263, 325, 99, 23);
		limpiardatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NombreDeProducto.setText("");
			
				PrecioDelProducto.setText("");
				
			}
		});
		
		JCheckBox TASA = new JCheckBox("Aplicar Tasa");
		TASA.setBounds(302, 65, 83, 23);
		TASA.setBackground(new Color(192, 192, 192));
		
		
		NombreDeProducto = new JTextField();
		NombreDeProducto.setBounds(133, 66, 86, 20);
		NombreDeProducto.setColumns(10);
		
		PrecioDelProducto = new JTextField();
		PrecioDelProducto.setBounds(130, 144, 86, 20);
		PrecioDelProducto.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 348, 257, 112);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_2_3);
		contentPane.add(BotonPrimera);
		contentPane.add(botonExtra);
		contentPane.add(iva4);
		contentPane.add(iva10);
		contentPane.add(iva21);
		contentPane.add(BotonSuperExtra);
		contentPane.add(BotonSegunda);
		contentPane.add(lblNewLabel_2_2);
		contentPane.add(lblNewLabel_2_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(NombreDeProducto);
		contentPane.add(TASA);
		contentPane.add(PrecioDelProducto);
		contentPane.add(tipoproducto);
		contentPane.add(lblNewLabel);
		contentPane.add(scrollPane);
		contentPane.add(btnNewButton);
		contentPane.add(limpiardatos);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Los datos teclados son");
				textArea.append("\n================================================");
				textArea.append("\nEl nombre del producto es: " +NombreDeProducto.getText());
				textArea.append("\nEl precio del producto es: " +PrecioDelProducto.getText());
				textArea.append ("\nEl tipo de Producto es: "+tipoproducto.getSelectedItem());
				textArea.append("\n================================================");

		
				
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection().equals( ext)) {
						textArea.append("\nPulsaste extra");
					}
					if(buttonGroup.getSelection().equals(prim)) {
						textArea.append("\nPulsaste Primera");
					}
					if(buttonGroup.getSelection().equals(seg)) {
						textArea.append("\nPulsaste Segunda");
					}
					if(buttonGroup.getSelection().equals(SuperExtr)) {
						textArea.append("\nPulsaste Super-Extra");
					}
					
				} // cierre if
				
				else {
					textArea.append("\nCategoria no seleccionada"); 

				}
					
				
				if(TASA.isSelected()){
					if(buttonGroup_1.getSelection()!=null) {
						if(buttonGroup_1.getSelection().equals( iv4)) {
				
							textArea.append("\nIva seleccionado es 4%");
						}
						if(buttonGroup_1.getSelection().equals(iv10)) {
							textArea.append("\nIva seleccionado es 10% ");
						}
						if(buttonGroup_1.getSelection().equals(iv21)) {
							textArea.append("\nIva seleccionado es 21%");
						}
						


					} // cierre if
					textArea.append("\nTasa seleccionada"); 
					textArea.append("\n================================================");
					
							
				} // cierre if tasa
					
					
				else {
					textArea.append("\nTasa no seleccionada"); 
					textArea.append("\n================================================");
				

				}
			}
		});
		
		
		
		
		
	
	}
}
