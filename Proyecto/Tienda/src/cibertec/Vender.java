package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cibertec.MenuCer�mico;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class Vender extends JDialog implements ActionListener {

	
	
	double DatoCompra = 0, DatoDescuento = 0, DatoSeleccionado = 0, DatoPagar = 0, DatoCuotaDiaria = 0;
	double DatoCantidad = 0, DatoObsequios = 0;
	double GeneralAcumulado = 0, PorcentajeDiario = 0;
	int VentasRealizadas = 0;
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField textFPrecio;
	private JComboBox cboModelo;
	private JTextField textFCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender dialog = new Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(21, 23, 46, 14);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(21, 56, 69, 14);
		contentPanel.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(21, 89, 69, 14);
		contentPanel.add(lblCantidad);
		
		textFPrecio = new JTextField();
		textFPrecio.setEditable(false);
		textFPrecio.setBounds(100, 53, 176, 20);
		contentPanel.add(textFPrecio);
		textFPrecio.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModelo.setBounds(100, 19, 176, 22);
		contentPanel.add(cboModelo);
		
		textFCantidad = new JTextField();
		textFCantidad.setBounds(100, 86, 176, 20);
		contentPanel.add(textFCantidad);
		textFCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(323, 19, 89, 23);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(323, 52, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 114, 403, 136);
		contentPanel.add(scrollPane);
		
		textA = new JTextArea();
		scrollPane.setViewportView(textA);
		
		textFPrecio.setText(MenuCer�mico.precio0 + "");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {
		switch(cboModelo.getSelectedIndex()) {
			case 0:
				textFPrecio.setText(MenuCer�mico.precio0+"");
				break;
			case 1:
				textFPrecio.setText(MenuCer�mico.precio1+"");
				break;
			case 2:
				textFPrecio.setText(MenuCer�mico.precio2+"");
				break;
			case 3:
				textFPrecio.setText(MenuCer�mico.precio3+"");
				break;
			default: 
				textFPrecio.setText(MenuCer�mico.precio4+"");
				break;
		}
	}
	
	
	//Funci�n! : ) need call! Nestor YES! Backend!
	public double isVender(String Varible, double PrecioA, double PorcentajeA, double PorcentajeB, double PorcentajeC, double PorcentajeD) {
		
		DatoCompra = PrecioA * DatoCantidad;
		if (DatoCantidad <= 5) {
			DatoDescuento = (PorcentajeA * DatoCompra) / 100;
			DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad1;
		}
		else if(DatoCantidad <= 10) {
			DatoDescuento = (PorcentajeB * DatoCompra) / 100;
			DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad2;
			}
		else if(DatoCantidad <= 15) {
			DatoDescuento = (PorcentajeC * DatoCompra) / 100;
			DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad3;
			}
		else {
			DatoDescuento = (PorcentajeD * DatoCompra) / 100;
			DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad3;
		}
			DatoPagar = DatoCompra - DatoDescuento;
			
			if(Varible == "DatoSeleccionado")
				return DatoSeleccionado;
			else if(Varible == "DatoCompra")
				return DatoCompra;
			else if(Varible == "DatoDescuento")
				return DatoDescuento;
			else if(Varible == "DatoPagar")
				return DatoPagar;
			else if(Varible == "DatoObsequios")
				return DatoObsequios;
			else
				return 0;
				
	}
	
	protected void actionPerformedBtnVender(ActionEvent e) {
		if (!IsValidNum(textFCantidad.getText())) {
			textA.setText("Debes introducir un n�mero");
			return;
		}
		DatoCantidad = Integer.parseInt(textFCantidad.getText());
		
		if(DatoCantidad < 1) {
			textA.setText("Debe introducir un n�mero mayor a 0");
			return;
		}
		switch(cboModelo.getSelectedIndex()) {
			case 0:
				DatoSeleccionado = MenuCer�mico.precio0;
				DatoCompra = MenuCer�mico.precio0 * DatoCantidad;
				if (DatoCantidad <= 5) {
					DatoDescuento = (MenuCer�mico.porcentaje1 * DatoCompra) / 100;
					DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad1;
				}
				else if(DatoCantidad <= 10) {
					DatoDescuento = (MenuCer�mico.porcentaje2 * DatoCompra) / 100;
					DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad2;
					}
				else if(DatoCantidad <= 15) {
					DatoDescuento = (MenuCer�mico.porcentaje3 * DatoCompra) / 100;
					DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad2;
					}
				else {
					DatoDescuento = (MenuCer�mico.porcentaje4 * DatoCompra) / 100;
					DatoObsequios = DatoCantidad * MenuCer�mico.obsequioCantidad3;
				}
					DatoPagar = DatoCompra - DatoDescuento;
				break;
			case 1:
				DatoSeleccionado = MenuCer�mico.precio1;
				isVender("",MenuCer�mico.precio1, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoCompra = isVender("DatoCompra",MenuCer�mico.precio1, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoDescuento = isVender("DatoDescuento",MenuCer�mico.precio1, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoPagar = isVender("DatoPagar",MenuCer�mico.precio1, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoObsequios = isVender("DatoObsequios",MenuCer�mico.precio1, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);				
				break;
			case 2:
				DatoSeleccionado = MenuCer�mico.precio2;
				isVender("",MenuCer�mico.precio2, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoCompra = isVender("DatoCompra",MenuCer�mico.precio2, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoDescuento = isVender("DatoDescuento",MenuCer�mico.precio2, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoPagar = isVender("DatoPagar",MenuCer�mico.precio2, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoObsequios = isVender("DatoObsequios",MenuCer�mico.precio2, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				break;
			case 3:
				DatoSeleccionado = MenuCer�mico.precio3;
				isVender("",MenuCer�mico.precio3, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoCompra = isVender("DatoCompra",MenuCer�mico.precio3, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoDescuento = isVender("DatoDescuento",MenuCer�mico.precio3, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoPagar = isVender("DatoPagar",MenuCer�mico.precio3, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoObsequios = isVender("DatoObsequios",MenuCer�mico.precio3, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				break;
			case 4:
				DatoSeleccionado = MenuCer�mico.precio4;
				isVender("",MenuCer�mico.precio4, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoCompra = isVender("DatoCompra",MenuCer�mico.precio4, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoDescuento = isVender("DatoDescuento",MenuCer�mico.precio4, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoPagar = isVender("DatoPagar",MenuCer�mico.precio4, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);
				DatoObsequios = isVender("DatoObsequios",MenuCer�mico.precio4, MenuCer�mico.porcentaje1,MenuCer�mico.porcentaje2,MenuCer�mico.porcentaje3,MenuCer�mico.porcentaje4);

				break;
		}	
		
			textA.setText("BOLETA DE VENTA" + "\n\n");
			textA.append("Modelo\t\t: " + cboModelo.getSelectedItem());
			textA.append("\nPrecio\t\t: S/." + DatoSeleccionado);
			textA.append("\nCantidad adquirida\t: " + textFCantidad.getText());
			textA.append("\nImporte de Compra\t: S/." + String.format("%.2f",DatoCompra));
			textA.append("\nImporte de Descuento\t: S/." + String.format("%.2f",DatoDescuento));
			textA.append("\nImporte a Pagar\t: S/" + String.format("%.2f",DatoPagar));
			textA.append("\nTipo de Obsequio\t: " + MenuCer�mico.tipoObsequio );
			textA.append("\nUnidades Obsequiadas\t: " + (int)DatoObsequios );
			
			// Guardando datos para GenerarReportes
			switch(cboModelo.getSelectedIndex()) {
				case 0:
					MenuCer�mico.CajasVendidos0 += Integer.parseInt(textFCantidad.getText());
					MenuCer�mico.CantidadVentas0++;
					MenuCer�mico.TotalImporteVendido0 += DatoPagar;
					MenuCer�mico.SaveCuotaDiaria0 = (MenuCer�mico.TotalImporteVendido0 / MenuCer�mico.cuotaDiaria)*100;
					break;
				case 1:
					MenuCer�mico.CajasVendidos1 += Integer.parseInt(textFCantidad.getText());
					MenuCer�mico.CantidadVentas1++;
					MenuCer�mico.TotalImporteVendido1 += DatoPagar;
					MenuCer�mico.SaveCuotaDiaria1 = (MenuCer�mico.TotalImporteVendido1 / MenuCer�mico.cuotaDiaria)*100;
					break;
				case 2:
					MenuCer�mico.CajasVendidos2 += Integer.parseInt(textFCantidad.getText());
					MenuCer�mico.CantidadVentas2++;
					MenuCer�mico.TotalImporteVendido2 += DatoPagar;
					MenuCer�mico.SaveCuotaDiaria2 = (MenuCer�mico.TotalImporteVendido2 / MenuCer�mico.cuotaDiaria)*100;
					break;
				case 3:
					MenuCer�mico.CajasVendidos3 += Integer.parseInt(textFCantidad.getText());
					MenuCer�mico.CantidadVentas3++;
					MenuCer�mico.TotalImporteVendido3 += DatoPagar;
					MenuCer�mico.SaveCuotaDiaria3 = (MenuCer�mico.TotalImporteVendido3 / MenuCer�mico.cuotaDiaria)*100;
					break;
				default:
					MenuCer�mico.CajasVendidos4 += Integer.parseInt(textFCantidad.getText());
					MenuCer�mico.CantidadVentas4++;
					MenuCer�mico.TotalImporteVendido4 += DatoPagar;
					MenuCer�mico.SaveCuotaDiaria4 = (MenuCer�mico.TotalImporteVendido4 / MenuCer�mico.cuotaDiaria)*100;
					break;
			
			}
			
			VentasRealizadas++; // suma cada vez que recorre
			
			GeneralAcumulado += DatoPagar; // Guarda el Dato en GeneralAcumulado
			
			//			Acumula por cada vez que se le da al bot�n vender / y saca el valor del menuCer�mico Principal para dividir y luego multiplicar por 100
			PorcentajeDiario = (GeneralAcumulado / MenuCer�mico.cuotaDiaria) * 100;
			
			
			// VentasRealizadas es multiplo de 5,10,15,20,25..? s� es cierto el resultado ser�a 0.
			if (VentasRealizadas % 5 == 0) {
		        JOptionPane.showMessageDialog(null, "Venta Nro. " + VentasRealizadas +
		        		"\nImporte total general acumulado: S/. " +
		        		String.format("%.2f", GeneralAcumulado)   +
		        		"\nPorcentaje de la cuota diaria: "       +
		        		String.format("%.2f", PorcentajeDiario) + "%",
		        		"Avance de Ventas",
		        		JOptionPane.WARNING_MESSAGE);
		      }
			
			cboModelo.setSelectedIndex(0); // reseeleccionamos al primero del cbo
			textFCantidad.setText("");  // Formateamos la entrada
	}
	

	
	public boolean IsValidNum(String text) {
		// intenta realizar la funcionalidad del c�digo dentro de Try
        try {
            Integer.parseInt(text);
            return true;
        } 
        // En caso que suceda alg�n tipo de error, devolver� false.
        catch (NumberFormatException e) {
            return false;
        }
}
}