package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MenuCerámico extends JFrame implements ActionListener {

	
	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	
	
	//Para Guardar y mantener la información disponible
	public static int CantidadVentas0;
	public static int CantidadVentas1;
	public static int CantidadVentas2;
	public static int CantidadVentas3;
	public static int CantidadVentas4;
	
	public static int CajasVendidos0;
	public static int CajasVendidos1;
	public static int CajasVendidos2;
	public static int CajasVendidos3;
	public static int CajasVendidos4;

	public static double TotalImporteVendido0;
	public static double TotalImporteVendido1;
	public static double TotalImporteVendido2;
	public static double TotalImporteVendido3;
	public static double TotalImporteVendido4;
	
	public static double SaveCuotaDiaria0;
	public static double SaveCuotaDiaria1;
	public static double SaveCuotaDiaria2;
	public static double SaveCuotaDiaria3;
	public static double SaveCuotaDiaria4;
	
	public static double precioProm = (precio0+precio1+precio2+precio3+precio4)/5;
	
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnmMenu;
	private JMenuItem mntmSalir;
	private JMenu mnmMantenimiento;
	private JMenuItem mntmConsultarCerámico;
	private JMenuItem mntmModificarCerámico;
	private JMenuItem mntmListarCerámicos;
	private JMenu mnmVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnmConfiguración;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadoptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenu mnmAyuda;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCerámico frame = new MenuCerámico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuCerámico() {
		setForeground(Color.GREEN);
		setBackground(new Color(255, 128, 0));
		setFont(new Font("Arial", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnmMenu = new JMenu("Archivo");
		menuBar.add(mnmMenu);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnmMenu.add(mntmSalir);
		
		mnmMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnmMantenimiento);
		
		mntmConsultarCerámico = new JMenuItem("Consultar cer\u00E1mico");
		mntmConsultarCerámico.addActionListener(this);
		mnmMantenimiento.add(mntmConsultarCerámico);
		
		mntmModificarCerámico = new JMenuItem("Modificar cer\u00E1mico");
		mntmModificarCerámico.addActionListener(this);
		mnmMantenimiento.add(mntmModificarCerámico);
		
		mntmListarCerámicos = new JMenuItem("Listar cer\u00E1micos");
		mntmListarCerámicos.addActionListener(this);
		mnmMantenimiento.add(mntmListarCerámicos);
		
		mnmVentas = new JMenu("Ventas");
		menuBar.add(mnmVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnmVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnmVentas.add(mntmGenerarReportes);
		
		mnmConfiguración = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnmConfiguración);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mnmConfiguración.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mnmConfiguración.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadoptima = new JMenuItem("Configurar cantidad optima");
		mnmConfiguración.add(mntmConfigurarCantidadoptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mnmConfiguración.add(mntmConfigurarCuotaDiaria);
		
		mnmAyuda = new JMenu("Ayuda");
		menuBar.add(mnmAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnmAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmListarCerámicos) {
			actionPerformedMntmListarCerámicos(e);
		}
		if (e.getSource() == mntmModificarCerámico) {
			actionPerformedMntmModificarCerámico(e);
		}
		if (e.getSource() == mntmConsultarCerámico) {
			actionPerformedMntmConsultarCerámico(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		
	}
	
    protected void actionPerformedMntmSalir(ActionEvent e) {
        System.exit(0);
    }
	   
	
	protected void actionPerformedMntmConsultarCerámico(ActionEvent e) {
		
		ConsultarCerámico CallConsultarCerámico = new ConsultarCerámico();
		CallConsultarCerámico.setVisible(true);
	}
	protected void actionPerformedMntmModificarCerámico(ActionEvent e) {
		ModificarCerámico CallModificarCerámico = new ModificarCerámico();
		CallModificarCerámico.setVisible(true);
	}
	protected void actionPerformedMntmListarCerámicos(ActionEvent e) {
		ListarCerámico CallListarCerámico = new ListarCerámico();
		CallListarCerámico.setVisible(true);
	}
}
