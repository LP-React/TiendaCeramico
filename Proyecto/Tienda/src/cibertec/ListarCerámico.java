package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Menu;

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
		setBounds(100, 100, 450, 360);
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
		btnListar.setBounds(220, 282, 89, 23);
		contentPanel.add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(125, 282, 89, 23);
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
	
	//Modulamiento xd
	
	void imprimir(String modelo, double precio, double ancho, double largo, double espesor, int contenido){
		textS.append("\n");
		textS.append("Modelo \t:  " + modelo + "\n");
        textS.append("Precio \t:  S/  " + precio + "\n");
        textS.append("Ancho(cm)\t:  " + ancho + " cm\n");
        textS.append("Largo(cm)\t:  " + largo + " cm\n");
        textS.append("Espesor(cm) \t:  " + espesor + " cm\n");
        textS.append("Contenido \t:  " + contenido + " unidades\n");
	}
	
	
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		textS.setText("LISTADO DE CERÁMICOS" + "\n");
        imprimir(MenuCerámico.modelo0 , MenuCerámico.precio0, MenuCerámico.ancho0, MenuCerámico.largo0, MenuCerámico.espesor0, MenuCerámico.contenido0);
        imprimir(MenuCerámico.modelo1 , MenuCerámico.precio1, MenuCerámico.ancho1, MenuCerámico.largo1, MenuCerámico.espesor1, MenuCerámico.contenido1);
        imprimir(MenuCerámico.modelo2 , MenuCerámico.precio2, MenuCerámico.ancho2, MenuCerámico.largo2, MenuCerámico.espesor2, MenuCerámico.contenido2);
        imprimir(MenuCerámico.modelo3 , MenuCerámico.precio3, MenuCerámico.ancho3, MenuCerámico.largo3, MenuCerámico.espesor3, MenuCerámico.contenido3);
        imprimir(MenuCerámico.modelo4 , MenuCerámico.precio4, MenuCerámico.ancho4, MenuCerámico.largo4, MenuCerámico.espesor4, MenuCerámico.contenido4);
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
