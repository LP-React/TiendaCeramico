package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cibertec.MenuCer�mico;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class GenerarReportes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextArea textAG;
	private JComboBox cboListReportes;
	private JLabel lblTipoDeReporte;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReportes dialog = new GenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReportes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 414, 216);
		contentPanel.add(scrollPane);
		
		textAG = new JTextArea();
		scrollPane.setViewportView(textAG);
		
		cboListReportes = new JComboBox();
		cboListReportes.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparaci\u00F3n de precios con el precio promedio", "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima ", "Estad\u00EDstica sobre el precio"}));
		cboListReportes.addActionListener(this);
		cboListReportes.setBounds(119, 1, 145, 22);
		contentPanel.add(cboListReportes);
		
		lblTipoDeReporte = new JLabel("Tipo de Reporte");
		lblTipoDeReporte.setBounds(10, 5, 99, 14);
		contentPanel.add(lblTipoDeReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(311, 1, 89, 23);
		contentPanel.add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboListReportes) {
			actionPerformedComboBox(e);
		}
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		
		switch(cboListReportes.getSelectedIndex()) {
			case 0:
				textAG.setText("VENTAS POR MODELO" 
							+"\n\nModelo \t\t: " + MenuCer�mico.modelo0 
							+"\nCantidad de ventas \t: " +MenuCer�mico.CantidadVentas0 
							+"\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos0
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCer�mico.TotalImporteVendido0) 
							+"\nAporte a la cuota diaria \t: %" +String.format("%.2f",MenuCer�mico.SaveCuotaDiaria0) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCer�mico.modelo1
							+"\nCantidad de ventas \t: "  + MenuCer�mico.CantidadVentas1 
							+"\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos1
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCer�mico.TotalImporteVendido1) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCer�mico.SaveCuotaDiaria1) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCer�mico.modelo2
							+"\nCantidad de ventas \t: "  + MenuCer�mico.CantidadVentas2
							+"\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos2
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCer�mico.TotalImporteVendido2) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCer�mico.SaveCuotaDiaria2) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCer�mico.modelo3
							+"\nCantidad de ventas \t: "  + MenuCer�mico.CantidadVentas3
							+"\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos3
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCer�mico.TotalImporteVendido3) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCer�mico.SaveCuotaDiaria3) 
							+"\n" 
						
							+"\n\nModelo \t\t: " + MenuCer�mico.modelo4
							+"\nCantidad de ventas \t: "  + MenuCer�mico.CantidadVentas4
							+"\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos4
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCer�mico.TotalImporteVendido4) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCer�mico.SaveCuotaDiaria4) 
							);
				break;
			case 1:
				textAG.setText("COMPARACI�N DE PRECIOS CON EL PRECIO PROMEDIO" 
						+"\n\nModelo \t\t: " + MenuCer�mico.modelo0
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCer�mico.precio0) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCer�mico.TotalImporteVendido0 / MenuCer�mico.CantidadVentas0))+
						"\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.precio0, (MenuCer�mico.TotalImporteVendido0 / MenuCer�mico.CajasVendidos0), 1);
				
				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCer�mico.modelo1
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCer�mico.precio1) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCer�mico.TotalImporteVendido1 / MenuCer�mico.CantidadVentas1))+
						"\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.precio1, (MenuCer�mico.TotalImporteVendido1 / MenuCer�mico.CajasVendidos1), 1);

				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCer�mico.modelo2
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCer�mico.precio2) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCer�mico.TotalImporteVendido2 / MenuCer�mico.CantidadVentas2))+
						"\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.precio2, (MenuCer�mico.TotalImporteVendido2 / MenuCer�mico.CajasVendidos2), 1);

				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCer�mico.modelo3
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCer�mico.precio3) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCer�mico.TotalImporteVendido3 / MenuCer�mico.CantidadVentas3))+
						"\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.precio3, (MenuCer�mico.TotalImporteVendido3 / MenuCer�mico.CajasVendidos3), 1);

				break;
			case 2:
				textAG.setText("COMPARACI�N DE CAJAS VENDIDAS CON LA CANTIDAD OPTIMA"
						+ "\n\nModelo \t\t: " + MenuCer�mico.modelo0
						+ "\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos0
						+ "\nCantidad �ptima \t: " + MenuCer�mico.cantidadOptima
						+ "\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.CajasVendidos0, MenuCer�mico.cantidadOptima, 0);
				
				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCer�mico.modelo1
						+ "\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos1
						+ "\nCantidad �ptima \t: " + MenuCer�mico.cantidadOptima
						+ "\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.CajasVendidos1, MenuCer�mico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCer�mico.modelo2
						+ "\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos2
						+ "\nCantidad �ptima \t: " + MenuCer�mico.cantidadOptima
						+ "\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.CajasVendidos2, MenuCer�mico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCer�mico.modelo3
						+ "\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos3
						+ "\nCantidad �ptima \t: " + MenuCer�mico.cantidadOptima
						+ "\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.CajasVendidos3, MenuCer�mico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCer�mico.modelo4
						+ "\nCantidad de cajas vendidas \t: " + MenuCer�mico.CajasVendidos1
						+ "\nCantidad �ptima \t: " + MenuCer�mico.cantidadOptima
						+ "\nComparaci�n \t\t: ");
				isPrint(MenuCer�mico.CajasVendidos4, MenuCer�mico.cantidadOptima, 0);

				break;
			case 3:
				textAG.setText("ESTADISTICA SOBRE EL PRECIO\n\n");
				textAG.append("\nPrecio prom\t: S/." + MenuCer�mico.precioProm);
				textAG.append("\nPrecio Mayor\t: S/." + MenuCer�mico.precio0);
				textAG.append("\nPrecio Menor\t: S/." + MenuCer�mico.precio1);
				break;
			default:
				break;
		}
		
		
		
		textAG.setText("");
	}
	
	void isPrint(double queda, double ToTal, int numSelect) {
		String message = " la cantidad �ptima\n";
		if (numSelect == 1) 
			message = " el promedio\n";
		
		if(ToTal > queda)
			textAG.append(String.format("%2.f",ToTal - queda) + " menos que" + message);
		else if(ToTal < queda)
			textAG.append(String.format("%2.f",ToTal - queda) + " m�s que" + message);
		else if(ToTal == queda)
			textAG.append("igual que" + message);
		else
			textAG.append("\n");
	
		
	}
}