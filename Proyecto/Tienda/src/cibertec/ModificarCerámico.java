package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarCerámico extends JDialog implements ActionListener {
	private JTextField textFContenido;
	private JTextField textFEspesor;
	private JTextField textFLargo;
	private JTextField textFPrecio;
	private JTextField textFAncho;
	private JButton btnCerrar;
	private JButton btnGrabar;
	private JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarCerámico dialog = new ModificarCerámico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarCerámico() {
		setBounds(100, 100, 467, 250);
		getContentPane().setLayout(null);

		textFContenido = new JTextField();
		textFContenido.setText("6");
		textFContenido.setColumns(10);
		textFContenido.setBounds(133, 171, 162, 20);
		getContentPane().add(textFContenido);

		textFEspesor = new JTextField();
		textFEspesor.setText("8.0");
		textFEspesor.setColumns(10);
		textFEspesor.setBounds(133, 140, 162, 20);
		getContentPane().add(textFEspesor);

		textFLargo = new JTextField();
		textFLargo.setText("62.0");
		textFLargo.setColumns(10);
		textFLargo.setBounds(133, 109, 162, 20);
		getContentPane().add(textFLargo);

		textFPrecio = new JTextField();
		textFPrecio.setText("92.56");
		textFPrecio.setColumns(10);
		textFPrecio.setBounds(133, 47, 162, 20);
		getContentPane().add(textFPrecio);

		textFAncho = new JTextField();
		textFAncho.setText("62.0");
		textFAncho.setColumns(10);
		textFAncho.setBounds(133, 78, 162, 20);
		getContentPane().add(textFAncho);

		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa" }));
		cboModelo.setBounds(133, 11, 161, 22);
		getContentPane().add(cboModelo);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(338, 11, 89, 23);
		getContentPane().add(btnCerrar);

		JLabel lnlModelo = new JLabel("Modelo");
		lnlModelo.setBounds(10, 15, 89, 14);
		getContentPane().add(lnlModelo);

		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(10, 50, 89, 14);
		getContentPane().add(lblPrecios);

		JLabel lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setBounds(10, 81, 89, 14);
		getContentPane().add(lblAnchocm);

		JLabel lblLargocm = new JLabel("Largo (cm)");
		lblLargocm.setBounds(10, 112, 89, 14);
		getContentPane().add(lblLargocm);

		JLabel lblEspesormm = new JLabel("Espesor (mm)");
		lblEspesormm.setBounds(10, 146, 89, 14);
		getContentPane().add(lblEspesormm);

		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 174, 89, 14);
		getContentPane().add(lblContenido);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(338, 46, 89, 23);
		getContentPane().add(btnGrabar);

		textFPrecio.setText(MenuCerámico.precio0 + "");
		textFAncho.setText(MenuCerámico.ancho0 + "");
		textFLargo.setText(MenuCerámico.largo0 + "");
		textFEspesor.setText(MenuCerámico.espesor0 + "");
		textFContenido.setText(MenuCerámico.contenido0 + "");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose(); // cerrar ventana
	}

	void grabarDatos() {
		switch (cboModelo.getSelectedIndex()) {
		
		case 0:
			MenuCerámico.precio0 = Double.parseDouble(textFPrecio.getText());
			MenuCerámico.ancho0 = Double.parseDouble(textFAncho.getText());
			MenuCerámico.largo0 = Double.parseDouble(textFLargo.getText());
			MenuCerámico.espesor0 = Double.parseDouble(textFEspesor.getText());
			MenuCerámico.contenido0 = (int) Double.parseDouble(textFContenido.getText());
			break;
			
		case 1:
			MenuCerámico.precio1 = Double.parseDouble(textFPrecio.getText());
			MenuCerámico.ancho1 = Double.parseDouble(textFAncho.getText());
			MenuCerámico.largo1 = Double.parseDouble(textFLargo.getText());
			MenuCerámico.espesor1 = Double.parseDouble(textFEspesor.getText());
			MenuCerámico.contenido1 = (int) Double.parseDouble(textFContenido.getText());
			break;
			
		case 2:
			MenuCerámico.precio2 = Double.parseDouble(textFPrecio.getText());
			MenuCerámico.ancho2 = Double.parseDouble(textFAncho.getText());
			MenuCerámico.largo2 = Double.parseDouble(textFLargo.getText());
			MenuCerámico.espesor2 = Double.parseDouble(textFEspesor.getText());
			MenuCerámico.contenido2 = (int) Double.parseDouble(textFContenido.getText());
			break;
			
		case 3:
			MenuCerámico.precio3 = Double.parseDouble(textFPrecio.getText());
			MenuCerámico.ancho3 = Double.parseDouble(textFAncho.getText());
			MenuCerámico.largo3 = Double.parseDouble(textFLargo.getText());
			MenuCerámico.espesor3 = Double.parseDouble(textFEspesor.getText());
			MenuCerámico.contenido3 = (int) Double.parseDouble(textFContenido.getText());
			break;
			
		default:
			MenuCerámico.precio4 = Double.parseDouble(textFPrecio.getText());
			MenuCerámico.ancho4 = Double.parseDouble(textFAncho.getText());
			MenuCerámico.largo4 = Double.parseDouble(textFLargo.getText());
			MenuCerámico.espesor4 = Double.parseDouble(textFEspesor.getText());
			MenuCerámico.contenido4 = (int) Double.parseDouble(textFContenido.getText());
			break;
			
		}
	}	
	
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		grabarDatos();
	}

	// ==============================================================================================================================
	
	void mostrarDatos(double precio, double ancho, double largo, double espesor, int contenido) {
		textFPrecio.setText(precio + "");
		textFAncho.setText(ancho + "");
		textFLargo.setText(largo + "");
		textFEspesor.setText(espesor + "");
		textFContenido.setText(contenido + "");	
	}

	void seleccionarModelo() {
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			mostrarDatos(MenuCerámico.precio0, MenuCerámico.ancho0, MenuCerámico.largo0, MenuCerámico.espesor0, MenuCerámico.contenido0);
			break;
		case 1:
			mostrarDatos(MenuCerámico.precio1, MenuCerámico.ancho1, MenuCerámico.largo1, MenuCerámico.espesor1, MenuCerámico.contenido1);
			break;
		case 2:
			mostrarDatos(MenuCerámico.precio2, MenuCerámico.ancho2, MenuCerámico.largo2, MenuCerámico.espesor2, MenuCerámico.contenido2);
			break;
		case 3:
			mostrarDatos(MenuCerámico.precio3, MenuCerámico.ancho3, MenuCerámico.largo3, MenuCerámico.espesor3, MenuCerámico.contenido3);
			break;
		default:
			mostrarDatos(MenuCerámico.precio4, MenuCerámico.ancho4, MenuCerámico.largo4, MenuCerámico.espesor4, MenuCerámico.contenido4);
			break;
		}
	}
	
	protected void actionPerformedCboModelo(ActionEvent e) {
		seleccionarModelo();
	}
}
