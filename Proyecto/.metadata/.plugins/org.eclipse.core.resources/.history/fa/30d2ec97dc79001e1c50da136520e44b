package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cibertec.MenuCerámico;

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
							+"\n\nModelo \t\t: " + MenuCerámico.modelo0 
							+"\nCantidad de ventas \t: " +MenuCerámico.CantidadVentas0 
							+"\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos0
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCerámico.TotalImporteVendido0) 
							+"\nAporte a la cuota diaria \t: %" +String.format("%.2f",MenuCerámico.SaveCuotaDiaria0) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCerámico.modelo1
							+"\nCantidad de ventas \t: "  + MenuCerámico.CantidadVentas1 
							+"\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos1
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCerámico.TotalImporteVendido1) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCerámico.SaveCuotaDiaria1) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCerámico.modelo2
							+"\nCantidad de ventas \t: "  + MenuCerámico.CantidadVentas2
							+"\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos2
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCerámico.TotalImporteVendido2) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCerámico.SaveCuotaDiaria2) 
							+"\n" 
							
							+"\n\nModelo \t\t: " + MenuCerámico.modelo3
							+"\nCantidad de ventas \t: "  + MenuCerámico.CantidadVentas3
							+"\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos3
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCerámico.TotalImporteVendido3) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCerámico.SaveCuotaDiaria3) 
							+"\n" 
						
							+"\n\nModelo \t\t: " + MenuCerámico.modelo4
							+"\nCantidad de ventas \t: "  + MenuCerámico.CantidadVentas4
							+"\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos4
							+"\nImporte total vendido \t: S/." + String.format("%.2f",MenuCerámico.TotalImporteVendido4) 
							+"\nAporte a la cuota diaria \t: %" + String.format("%.2f",MenuCerámico.SaveCuotaDiaria4) 
							);
				break;
			case 1:
				textAG.setText("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO" 
						+"\n\nModelo \t\t: " + MenuCerámico.modelo0
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCerámico.precio0) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCerámico.TotalImporteVendido0 / MenuCerámico.CantidadVentas0))+
						"\nComparación \t\t: ");
				isPrint(MenuCerámico.precio0, (MenuCerámico.TotalImporteVendido0 / MenuCerámico.CajasVendidos0), 1);
				
				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCerámico.modelo1
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCerámico.precio1) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCerámico.TotalImporteVendido1 / MenuCerámico.CantidadVentas1))+
						"\nComparación \t\t: ");
				isPrint(MenuCerámico.precio1, (MenuCerámico.TotalImporteVendido1 / MenuCerámico.CajasVendidos1), 1);

				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCerámico.modelo2
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCerámico.precio2) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCerámico.TotalImporteVendido2 / MenuCerámico.CantidadVentas2))+
						"\nComparación \t\t: ");
				isPrint(MenuCerámico.precio2, (MenuCerámico.TotalImporteVendido2 / MenuCerámico.CajasVendidos2), 1);

				textAG.append("\n" 
						+"Modelo \t\t: " + MenuCerámico.modelo3
						+"\nPrecio \t\t: " + String.format("%.2f", MenuCerámico.precio3) 
						+"\nPrecio Promedio \t: " + String.format("%.2f",(MenuCerámico.TotalImporteVendido3 / MenuCerámico.CantidadVentas3))+
						"\nComparación \t\t: ");
				isPrint(MenuCerámico.precio3, (MenuCerámico.TotalImporteVendido3 / MenuCerámico.CajasVendidos3), 1);

				break;
			case 2:
				textAG.setText("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD OPTIMA"
						+ "\n\nModelo \t\t: " + MenuCerámico.modelo0
						+ "\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos0
						+ "\nCantidad óptima \t: " + MenuCerámico.cantidadOptima
						+ "\nComparación \t\t: ");
				isPrint(MenuCerámico.CajasVendidos0, MenuCerámico.cantidadOptima, 0);
				
				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCerámico.modelo1
						+ "\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos1
						+ "\nCantidad óptima \t: " + MenuCerámico.cantidadOptima
						+ "\nComparación \t\t: ");
				isPrint(MenuCerámico.CajasVendidos1, MenuCerámico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCerámico.modelo2
						+ "\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos2
						+ "\nCantidad óptima \t: " + MenuCerámico.cantidadOptima
						+ "\nComparación \t\t: ");
				isPrint(MenuCerámico.CajasVendidos2, MenuCerámico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCerámico.modelo3
						+ "\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos3
						+ "\nCantidad óptima \t: " + MenuCerámico.cantidadOptima
						+ "\nComparación \t\t: ");
				isPrint(MenuCerámico.CajasVendidos3, MenuCerámico.cantidadOptima, 0);

				textAG.append("\n"
						+ "Modelo \t\t: " + MenuCerámico.modelo4
						+ "\nCantidad de cajas vendidas \t: " + MenuCerámico.CajasVendidos1
						+ "\nCantidad óptima \t: " + MenuCerámico.cantidadOptima
						+ "\nComparación \t\t: ");
				isPrint(MenuCerámico.CajasVendidos4, MenuCerámico.cantidadOptima, 0);

				break;
			case 3:
				textAG.setText("ESTADISTICA SOBRE EL PRECIO\n\n");
				textAG.append("\nPrecio prom\t: S/." + MenuCerámico.precioProm);
				textAG.append("\nPrecio Mayor\t: S/." + MenuCerámico.precio0);
				textAG.append("\nPrecio Menor\t: S/." + MenuCerámico.precio1);
				break;
			default:
				break;
		}
		
		
		
		textAG.setText("");
	}
	
	void isPrint(double queda, double ToTal, int numSelect) {
		String message = " la cantidad óptima\n";
		if (numSelect == 1) 
			message = " el promedio\n";
		
		if(ToTal > queda)
			textAG.append(String.format("%2.f",ToTal - queda) + " menos que" + message);
		else if(ToTal < queda)
			textAG.append(String.format("%2.f",ToTal - queda) + " más que" + message);
		else if(ToTal == queda)
			textAG.append("igual que" + message);
		else
			textAG.append("\n");
	
		
	}
}
