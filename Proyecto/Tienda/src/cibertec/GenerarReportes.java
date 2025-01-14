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
		cboListReportes.setModel(new DefaultComboBoxModel(
				new String[] { "Ventas por modelo", "Comparaci\u00F3n de precios con el precio promedio",
						"Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima ",
						"Estad\u00EDstica sobre el precio" }));
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

	// ------------------------

	void imprimirVentaModelo(String modelo, int cantidadVentas, int cantidadCajasVendidas, double importeTotalVendido,
			double porcentajeCuotaDiaria) {

		textAG.append("\n\nModelo \t\t: " + modelo + "\n");
		textAG.append("\nCantidad de ventas \t: " + cantidadVentas + "\n");
		textAG.append("\nCantidad de cajas vendidas \t: " + String.format("%.2f", importeTotalVendido) + "\n");
		textAG.append("\nImporte total vendido \t: S/." + importeTotalVendido + "\n");
		textAG.append("\nAporte a la cuota diaria \t: %" + String.format("%.2f", porcentajeCuotaDiaria) + "\n");
	}

	void imprimirVentas() {
		textAG.setText("VENTAS POR MODELO" + "\n\nModelo \t\t: ");
		imprimirVentaModelo(MenuCerámico.modelo0, MenuCerámico.CantidadVentas0, MenuCerámico.CajasVendidos0,
				MenuCerámico.TotalImporteVendido0, MenuCerámico.SaveCuotaDiaria0);
		imprimirVentaModelo(MenuCerámico.modelo1, MenuCerámico.CantidadVentas1, MenuCerámico.CajasVendidos1,
				MenuCerámico.TotalImporteVendido1, MenuCerámico.SaveCuotaDiaria1);
		imprimirVentaModelo(MenuCerámico.modelo2, MenuCerámico.CantidadVentas2, MenuCerámico.CajasVendidos2,
				MenuCerámico.TotalImporteVendido2, MenuCerámico.SaveCuotaDiaria2);
		imprimirVentaModelo(MenuCerámico.modelo3, MenuCerámico.CantidadVentas3, MenuCerámico.CajasVendidos3,
				MenuCerámico.TotalImporteVendido3, MenuCerámico.SaveCuotaDiaria3);
		imprimirVentaModelo(MenuCerámico.modelo4, MenuCerámico.CantidadVentas4, MenuCerámico.CajasVendidos4,
				MenuCerámico.TotalImporteVendido4, MenuCerámico.SaveCuotaDiaria4);

	}

	// ----------------------------

	void imprimirComparacionPrecio(String modelo, double precio, double importeTotalVendido, int cantidadVentas,
			int cantidadCajas) {

		textAG.append("\n\nModelo \t\t: " + modelo + "\n");
		textAG.append("\nPrecio \t: " + String.format("%.2f", precio) + "\n");
		textAG.append("\nPrecio promedio \t: " + String.format("%.2f", (importeTotalVendido / cantidadVentas)) + "\n");
		textAG.append("\nComparacion \t\t: ");
		isPrint(MenuCerámico.precio0, (importeTotalVendido / cantidadCajas), 1);
	}

	void imprimirComparacion() {
		textAG.setText("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO");
		imprimirComparacionPrecio(MenuCerámico.modelo0, MenuCerámico.precio0, MenuCerámico.TotalImporteVendido0,
				MenuCerámico.CantidadVentas0, MenuCerámico.CajasVendidos0);
		imprimirComparacionPrecio(MenuCerámico.modelo1, MenuCerámico.precio1, MenuCerámico.TotalImporteVendido1,
				MenuCerámico.CantidadVentas1, MenuCerámico.CajasVendidos1);
		imprimirComparacionPrecio(MenuCerámico.modelo2, MenuCerámico.precio2, MenuCerámico.TotalImporteVendido2,
				MenuCerámico.CantidadVentas2, MenuCerámico.CajasVendidos2);
		imprimirComparacionPrecio(MenuCerámico.modelo3, MenuCerámico.precio3, MenuCerámico.TotalImporteVendido3,
				MenuCerámico.CantidadVentas3, MenuCerámico.CajasVendidos3);
		imprimirComparacionPrecio(MenuCerámico.modelo4, MenuCerámico.precio4, MenuCerámico.TotalImporteVendido4,
				MenuCerámico.CantidadVentas4, MenuCerámico.CajasVendidos4);
	}

	// -------------------------------
	
	void imprimirComparacionCaja(String modelo, int cajasVendidas, int cantidadOptima) {
		
		textAG.append("\n\nModelo \t\t: " + modelo);
		textAG.append("\nCantidad de cajas vendidas \t: " + cajasVendidas);
		textAG.append("\nCantidad óptima \t: " + cantidadOptima);
		textAG.append("\nComparación \t\t: ");
		isPrint(cajasVendidas, cantidadOptima, 0);
	}
	
	void imprimirComparacionCajas() {
		
		textAG.setText("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD OPTIMA");
	
		imprimirComparacionCaja(MenuCerámico.modelo0, MenuCerámico.CajasVendidos0, MenuCerámico.cantidadOptima);
		imprimirComparacionCaja(MenuCerámico.modelo1, MenuCerámico.CajasVendidos1, MenuCerámico.cantidadOptima);
		imprimirComparacionCaja(MenuCerámico.modelo2, MenuCerámico.CajasVendidos2, MenuCerámico.cantidadOptima);
		imprimirComparacionCaja(MenuCerámico.modelo3, MenuCerámico.CajasVendidos3, MenuCerámico.cantidadOptima);
		imprimirComparacionCaja(MenuCerámico.modelo4, MenuCerámico.CajasVendidos4, MenuCerámico.cantidadOptima);

	}

	//---------------------------------------
	
	void imprimirEstadistica() {
		textAG.setText("ESTADISTICA SOBRE EL PRECIO\n\n");
		textAG.append("\nPrecio prom\t: S/." + MenuCerámico.precioProm);
		textAG.append("\nPrecio Mayor\t: S/." + MenuCerámico.precio0);
		textAG.append("\nPrecio Menor\t: S/." + MenuCerámico.precio1);
	}

	protected void actionPerformedComboBox(ActionEvent e) {

		switch (cboListReportes.getSelectedIndex()) {
		case 0:
			imprimirVentas();
			break;
		case 1:
			imprimirComparacion();
			break;
		case 2:
			imprimirComparacionCajas();
			break;
		case 3:
			imprimirEstadistica();
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

		if (ToTal > queda)
			textAG.append(String.format("%2.f", ToTal - queda) + " menos que" + message);
		else if (ToTal < queda)
			textAG.append(String.format("%2.f", ToTal - queda) + " más que" + message);
		else if (ToTal == queda)
			textAG.append("igual que" + message);
		else
			textAG.append("\n");

	}
}
