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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
			textFContenido = new JTextField();
			textFContenido.setText("6");
			textFContenido.setColumns(10);
			textFContenido.setBounds(115, 171, 162, 20);
			getContentPane().add(textFContenido);
		
		
			textFEspesor = new JTextField();
			textFEspesor.setText("8.0");
			textFEspesor.setColumns(10);
			textFEspesor.setBounds(115, 140, 162, 20);
			getContentPane().add(textFEspesor);
		
		
			textFLargo = new JTextField();
			textFLargo.setText("62.0");
			textFLargo.setColumns(10);
			textFLargo.setBounds(116, 109, 162, 20);
			getContentPane().add(textFLargo);
		

			textFPrecio = new JTextField();
			textFPrecio.setText("92.56");
			textFPrecio.setColumns(10);
			textFPrecio.setBounds(115, 47, 162, 20);
			getContentPane().add(textFPrecio);
		
			textFAncho = new JTextField();
			textFAncho.setText("62.0");
			textFAncho.setColumns(10);
			textFAncho.setBounds(116, 78, 162, 20);
			getContentPane().add(textFAncho);
		
	
			cboModelo = new JComboBox();
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
			cboModelo.setBounds(116, 11, 161, 22);
			getContentPane().add(cboModelo);
		
		
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(324, 11, 89, 23);
			getContentPane().add(btnCerrar);
		
		
			JLabel lnlModelo = new JLabel("Modelo");
			lnlModelo.setBounds(10, 15, 46, 14);
			getContentPane().add(lnlModelo);
		
		
			JLabel lblPrecios = new JLabel("Precio (S/)");
			lblPrecios.setBounds(10, 50, 57, 14);
			getContentPane().add(lblPrecios);
		
		
			JLabel lblAnchocm = new JLabel("Ancho (cm)");
			lblAnchocm.setBounds(10, 81, 57, 14);
			getContentPane().add(lblAnchocm);
		
		
			JLabel lblLargocm = new JLabel("Largo (cm)");
			lblLargocm.setBounds(10, 112, 67, 14);
			getContentPane().add(lblLargocm);
		

			JLabel lblEspesormm = new JLabel("Espesor (mm)");
			lblEspesormm.setBounds(10, 146, 67, 14);
			getContentPane().add(lblEspesormm);
		
		
			JLabel lblContenido = new JLabel("Contenido");
			lblContenido.setBounds(10, 174, 57, 14);
			getContentPane().add(lblContenido);
		
		
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(324, 46, 89, 23);
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
		dispose();	 // cerrar ventana
	}
	
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		
		switch(cboModelo.getSelectedIndex()){
			case 0:
				MenuCerámico.precio0 = Double.parseDouble(textFPrecio.getText());
				MenuCerámico.ancho0 = Double.parseDouble(textFAncho.getText());
				MenuCerámico.largo0 = Double.parseDouble(textFLargo.getText());
				MenuCerámico.espesor0 = Double.parseDouble(textFEspesor.getText());
				MenuCerámico.contenido0 = (int) Double.parseDouble(textFContenido.getText());
				//        int esto convierte en int al double => 5.7 => 5
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
	
	protected void actionPerformedCboModelo(ActionEvent e) {
		switch(cboModelo.getSelectedIndex()){
			case 0:
				textFPrecio.setText(MenuCerámico.precio0 + "");
				textFAncho.setText(MenuCerámico.ancho0+"");
				textFLargo.setText(MenuCerámico.largo0+"");
				textFEspesor.setText(MenuCerámico.espesor0+"");
				textFContenido.setText(MenuCerámico.contenido0+"");
				break;
			case 1:
				textFPrecio.setText(MenuCerámico.precio1 + "");
				textFAncho.setText(MenuCerámico.ancho1+"");
				textFLargo.setText(MenuCerámico.largo1+"");
				textFEspesor.setText(MenuCerámico.espesor1+"");
				textFContenido.setText(MenuCerámico.contenido1+"");
				break;
			case 2:
				textFPrecio.setText(MenuCerámico.precio2 + "");
				textFAncho.setText(MenuCerámico.ancho2+"");
				textFLargo.setText(MenuCerámico.largo2+"");
				textFEspesor.setText(MenuCerámico.espesor2+"");
				textFContenido.setText(MenuCerámico.contenido2+"");
				break;
			case 3:
				textFPrecio.setText(MenuCerámico.precio3 + "");
				textFAncho.setText(MenuCerámico.ancho3+"");
				textFLargo.setText(MenuCerámico.largo3+"");
				textFEspesor.setText(MenuCerámico.espesor3+"");
				textFContenido.setText(MenuCerámico.contenido3+"");
				break;
			default:
				textFPrecio.setText(MenuCerámico.precio4 + "");
				textFAncho.setText(MenuCerámico.ancho4+"");
				textFLargo.setText(MenuCerámico.largo4+"");
				textFEspesor.setText(MenuCerámico.espesor4+"");
				textFContenido.setText(MenuCerámico.contenido4+"");
				break;
		}
	}
}
