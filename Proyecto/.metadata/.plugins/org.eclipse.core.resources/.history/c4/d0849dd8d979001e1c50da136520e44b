package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarCerámico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lnlModelo;
	private JLabel lblPrecios;
	private JLabel lblAnchocm;
	private JLabel lblLargocm;
	private JLabel lblEspesormm;
	private JLabel lblContenido;
	private JComboBox cboModelo;
	private JTextField textFPrecio;
	private JTextField textFAncho;
	private JTextField textFLargo;
	private JTextField textFEspesor;
	private JTextField textFContenido;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarCerámico dialog = new ConsultarCerámico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarCerámico() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblLargocm = new JLabel("Largo (cm)");
		lblLargocm.setBounds(10, 122, 67, 14);
		contentPanel.add(lblLargocm);
		
		lnlModelo = new JLabel("Modelo");
		lnlModelo.setBounds(10, 25, 46, 14);
		contentPanel.add(lnlModelo);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(10, 60, 57, 14);
		contentPanel.add(lblPrecios);
		
		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setBounds(10, 91, 57, 14);
		contentPanel.add(lblAnchocm);
		
		lblEspesormm = new JLabel("Espesor (mm)");
		lblEspesormm.setBounds(10, 156, 67, 14);
		contentPanel.add(lblEspesormm);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 184, 57, 14);
		contentPanel.add(lblContenido);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModelo.setBounds(116, 21, 161, 22);
		contentPanel.add(cboModelo);
		
		textFPrecio = new JTextField();
		textFPrecio.setEditable(false);
		textFPrecio.setBounds(115, 57, 162, 20);
		contentPanel.add(textFPrecio);
		textFPrecio.setColumns(10);
		
		textFAncho = new JTextField();
		textFAncho.setEditable(false);
		textFAncho.setColumns(10);
		textFAncho.setBounds(116, 88, 162, 20);
		contentPanel.add(textFAncho);
		
		textFLargo = new JTextField();
		textFLargo.setEditable(false);
		textFLargo.setColumns(10);
		textFLargo.setBounds(116, 119, 162, 20);
		contentPanel.add(textFLargo);
		
		textFEspesor = new JTextField();
		textFEspesor.setEditable(false);
		textFEspesor.setColumns(10);
		textFEspesor.setBounds(115, 150, 162, 20);
		contentPanel.add(textFEspesor);
		
		textFContenido = new JTextField();
		textFContenido.setEditable(false);
		textFContenido.setColumns(10);
		textFContenido.setBounds(115, 181, 162, 20);
		contentPanel.add(textFContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(324, 21, 89, 23);
		contentPanel.add(btnCerrar);
		
		textFPrecio.setText(MenuCerámico.precio0+"");
		textFAncho.setText(MenuCerámico.ancho0+"");
		textFLargo.setText(MenuCerámico.largo0+"");
		textFEspesor.setText(MenuCerámico.espesor0+"");
		textFContenido.setText(MenuCerámico.contenido0+"");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	
	protected void actionPerformedCboModelo(ActionEvent e) {
		switch(cboModelo.getSelectedIndex()) {
			case 0: 
				textFPrecio.setText(MenuCerámico.precio0 + "");
				textFAncho.setText(MenuCerámico.ancho0 + "");
				textFLargo.setText(MenuCerámico.largo0 + "");
				textFEspesor.setText(MenuCerámico.espesor0 + "");
				textFContenido.setText(MenuCerámico.contenido0 + "");
				break;
	
			case 1:
				textFPrecio.setText(MenuCerámico.precio1 + "");
				textFAncho.setText(MenuCerámico.ancho1 + "");
				textFLargo.setText(MenuCerámico.largo1 + "");
				textFEspesor.setText(MenuCerámico.espesor1 + "");
				textFContenido.setText(MenuCerámico.contenido1 + "");
				break;
			case 2:
				textFPrecio.setText(MenuCerámico.precio2 + "");
				textFAncho.setText(MenuCerámico.ancho2 + "");
				textFLargo.setText(MenuCerámico.largo2 + "");
				textFEspesor.setText(MenuCerámico.espesor2 + "");
				textFContenido.setText(MenuCerámico.contenido2 + "");
				break;
			case 3:
				textFPrecio.setText(MenuCerámico.precio3 + "");
				textFAncho.setText(MenuCerámico.ancho3 + "");
				textFLargo.setText(MenuCerámico.largo3 + "");
				textFEspesor.setText(MenuCerámico.espesor3 + "");
				textFContenido.setText(MenuCerámico.contenido3 + "");
				break;
			default:
				textFPrecio.setText(MenuCerámico.precio4 + "");
				textFAncho.setText(MenuCerámico.ancho4 + "");
				textFLargo.setText(MenuCerámico.largo4 + "");
				textFEspesor.setText(MenuCerámico.espesor4 + "");
				textFContenido.setText(MenuCerámico.contenido4 + "");
				break;
		
		}
	}
	
	
	
	
	
	
}
