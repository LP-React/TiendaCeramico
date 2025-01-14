package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cibertec.MenuCerámico;

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
		setBounds(100, 100, 450, 370);
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
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa" }));
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
		scrollPane.setBounds(10, 114, 414, 206);
		contentPanel.add(scrollPane);

		textA = new JTextArea();
		scrollPane.setViewportView(textA);

		textFPrecio.setText(MenuCerámico.precio0 + "");
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
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			textFPrecio.setText(MenuCerámico.precio0 + "");
			precioProducto = MenuCerámico.precio0;
			break;
		case 1:
			textFPrecio.setText(MenuCerámico.precio1 + "");
			precioProducto = MenuCerámico.precio1;
			break;
		case 2:
			textFPrecio.setText(MenuCerámico.precio2 + "");
			precioProducto = MenuCerámico.precio2;
			break;
		case 3:
			textFPrecio.setText(MenuCerámico.precio3 + "");
			precioProducto = MenuCerámico.precio3;
			break;
		default:
			textFPrecio.setText(MenuCerámico.precio4 + "");
			precioProducto = MenuCerámico.precio4;
			break;
		}
	}

//Variables
	double precioProducto, impCompra, impDescuento, impPagar, CuotaDiaria, dineroAcumulado,
			PorcentajeDiario;
	int cantidad, obsequio;
	int ventasRealizadas = 0;
	
	void leerCantidad() {
		cantidad = Integer.parseInt(textFCantidad.getText());
	}
	void calcularImpCompra(double precioPro, int cantidad) {
		impCompra = precioPro * cantidad;
	}
	void calcularImporteDescuento() {
		if (cantidad <= 5) {
			impDescuento = (MenuCerámico.porcentaje1 * impCompra) / 100;
		} else if (cantidad <= 10) {
			impDescuento = (MenuCerámico.porcentaje2 * impCompra) / 100;
		} else if (cantidad <= 15) {
			impDescuento = (MenuCerámico.porcentaje3 * impCompra) / 100;
		} else {
			impDescuento = (MenuCerámico.porcentaje4 * impCompra) / 100;
		}
	}
	void calcularImportePagar() {
		impPagar = impCompra - impDescuento;
	}
	void calcularObs(int cantidad) {
		if (cantidad <= 5) {
			obsequio = (MenuCerámico.obsequioCantidad1 * cantidad);
		} else if (cantidad <= 10) {
			obsequio = (MenuCerámico.obsequioCantidad2 * cantidad);
		} else {
			obsequio = (MenuCerámico.obsequioCantidad3 * cantidad);
		}
	}
	void imprimirDatos(double precio, int cantidad, double importeCompra, double importeDescuento, double importePagar,
			String tipoObsequio, int cantidadObsequio) {
		textA.setText("BOLETA DE VENTA" + "\n\n");
		textA.append("Modelo\t\t: " + cboModelo.getSelectedItem());
		textA.append("\nPrecio\t\t: S/." + precio);
		textA.append("\nCantidad adquirida\t: " + cantidad);
		textA.append("\nImporte de Compra\t: S/." + String.format("%.2f", importeCompra));
		textA.append("\nImporte de Descuento\t: S/." + String.format("%.2f", importeDescuento));
		textA.append("\nImporte a Pagar\t: S/" + String.format("%.2f", importePagar));
		textA.append("\nTipo de Obsequio\t: " + tipoObsequio);
		textA.append("\nUnidades Obsequiadas\t: " + cantidadObsequio);
	}
	void guardarDatosVentaModelo(int cajasVendidas, int cantidadVentas, double importeTotalVentas,
			double cuotaDiariaModelo) {
		cajasVendidas += Integer.parseInt(textFCantidad.getText());
		cantidadVentas++;
		importeTotalVentas += impPagar;
		cuotaDiariaModelo = (importeTotalVentas / MenuCerámico.cuotaDiaria) * 100;
	};
	void guardarVentasModelos() {

		switch (cboModelo.getSelectedIndex()) {
		case 0:
			guardarDatosVentaModelo(MenuCerámico.CajasVendidos0, MenuCerámico.CantidadVentas0,
					MenuCerámico.TotalImporteVendido0, MenuCerámico.SaveCuotaDiaria0);
			break;
		case 1:
			guardarDatosVentaModelo(MenuCerámico.CajasVendidos1, MenuCerámico.CantidadVentas1,
					MenuCerámico.TotalImporteVendido1, MenuCerámico.SaveCuotaDiaria1);
			break;
		case 2:
			guardarDatosVentaModelo(MenuCerámico.CajasVendidos2, MenuCerámico.CantidadVentas2,
					MenuCerámico.TotalImporteVendido2, MenuCerámico.SaveCuotaDiaria2);
			break;
		case 3:
			guardarDatosVentaModelo(MenuCerámico.CajasVendidos3, MenuCerámico.CantidadVentas3,
					MenuCerámico.TotalImporteVendido3, MenuCerámico.SaveCuotaDiaria3);
			break;
		default:
			guardarDatosVentaModelo(MenuCerámico.CajasVendidos4, MenuCerámico.CantidadVentas4,
					MenuCerámico.TotalImporteVendido4, MenuCerámico.SaveCuotaDiaria4);
			break;

		}
	}
	void aumentarVentasRealizada() {
		ventasRealizadas++;
	}
	void aumentarDineroAcumulado() {
		dineroAcumulado += impPagar;
	}
	void calcularPorcentajeCuotaDiaria() {
		PorcentajeDiario = (dineroAcumulado * 100) / MenuCerámico.cuotaDiaria;
	}
	void notificarVentas5() {
		if (ventasRealizadas % 5 == 0) {
			JOptionPane.showMessageDialog(null,
							"Venta Nro. " 
							+ ventasRealizadas + "\nImporte total general acumulado: S/. "
							+ String.format("%.2f", dineroAcumulado) + "\nPorcentaje de la cuota diaria: "
							+ String.format("%.2f", PorcentajeDiario) + "%",
							"Avance de Ventas", JOptionPane.WARNING_MESSAGE);
		}

	}
// ==========================================================================

	protected void actionPerformedBtnVender(ActionEvent e) {
		
		//Ejecuta
		actionPerformedCboModelo(null);

		//------------------------------------------- Este if esta pendiente xd
		if (!IsValidNum(textFCantidad.getText())) {
			textA.setText("Debes introducir un número");
			return;
		}
		leerCantidad();
		if (cantidad < 1) {
			textA.setText("Debe introducir un número mayor a 0");
			return;
		}
		//----------------------------------------
		
		calcularImpCompra(precioProducto, cantidad);
		calcularImporteDescuento();
		calcularImportePagar();
		calcularObs(cantidad);
		imprimirDatos(precioProducto, cantidad, impCompra, impDescuento, impPagar, MenuCerámico.tipoObsequio, obsequio);
		guardarVentasModelos();
		aumentarVentasRealizada();
		aumentarDineroAcumulado();
		calcularPorcentajeCuotaDiaria();
		notificarVentas5();
		
		cboModelo.setSelectedIndex(0); // reseeleccionamos al primero del cbo
		textFCantidad.setText(""); // Formateamos la entrada
	}

	public boolean IsValidNum(String text) {
		// intenta realizar la funcionalidad del código dentro de Try
		try {
			Integer.parseInt(text);
			return true;
		}
		// En caso que suceda algún tipo de error, devolverá false.
		catch (NumberFormatException e) {
			return false;
		}
	}
}
