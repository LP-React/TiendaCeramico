package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import cibertec.MenuCerámico;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarCerámico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scp;
	private JTextArea textS;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarCerámico dialog = new ListarCerámico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarCerámico() {
		setBounds(100, 100, 450, 336);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scp = new JScrollPane();
		scp.setBounds(10, 11, 414, 260);
		contentPanel.add(scp);
		
		textS = new JTextArea();
		scp.setViewportView(textS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(135, 274, 89, 23);
		contentPanel.add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(234, 274, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		textS.setText("LISTADO DE CERÁMICOS" + "\n");
        textS.append("\n");
        textS.append("Modelo \t: " + MenuCerámico.modelo0 + "\n");
        textS.append("Precio \t: " + MenuCerámico.precio0 + "\n");
        textS.append("Ancho(cm)\t: " + MenuCerámico.ancho0 + "\n");
        textS.append("Largo(cm)\t: " + MenuCerámico.largo0 + "\n");
        textS.append("Espesor(cm) \t: " + MenuCerámico.espesor0 + "\n");
        textS.append("Contenido \t: " + MenuCerámico.contenido0 + "\n");
        textS.append("\n");
        textS.append("Modelo \t: " + MenuCerámico.modelo1 + "\n");
        textS.append("Precio \t: " + MenuCerámico.precio1 + "\n");
        textS.append("Ancho(cm)\t: " + MenuCerámico.ancho1 + "\n");
        textS.append("Largo(cm)\t: " + MenuCerámico.largo1 + "\n");
        textS.append("Espesor(cm) \t: " + MenuCerámico.espesor1 + "\n");
        textS.append("Contenido \t: " + MenuCerámico.contenido1 + "\n");
        textS.append("\n");
        textS.append("Modelo \t: " + MenuCerámico.modelo2 + "\n");
        textS.append("Precio \t: " + MenuCerámico.precio2 + "\n");
        textS.append("Ancho(cm)\t: " + MenuCerámico.ancho2 + "\n");
        textS.append("Largo(cm)\t: " + MenuCerámico.largo2 + "\n");
        textS.append("Espesor(cm) \t: " + MenuCerámico.espesor2 + "\n");
        textS.append("Contenido \t: " + MenuCerámico.contenido2 + "\n");
        textS.append("\n");
        textS.append("Modelo \t: " + MenuCerámico.modelo3 + "\n");
        textS.append("Precio \t: " + MenuCerámico.precio3 + "\n");
        textS.append("Ancho(cm)\t: " + MenuCerámico.ancho3 + "\n");
        textS.append("Largo(cm)\t: " + MenuCerámico.largo3 + "\n");
        textS.append("Espesor(cm) \t: " + MenuCerámico.espesor3 + "\n");
        textS.append("Contenido \t: " + MenuCerámico.contenido3 + "\n");
        textS.append("\n");
        textS.append("Modelo \t: " + MenuCerámico.modelo4 + "\n");
        textS.append("Precio \t: " + MenuCerámico.precio4 + "\n");
        textS.append("Ancho(cm)\t: " + MenuCerámico.ancho4 + "\n");
        textS.append("Largo(cm)\t: " + MenuCerámico.largo4 + "\n");
        textS.append("Espesor(cm) \t: " + MenuCerámico.espesor4 + "\n");
        textS.append("Contenido \t: " + MenuCerámico.contenido4 + "\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
