import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;

public class Tablas extends JFrame {

	private JPanel contentPane;
	protected JPanel panel;
	protected JButton btnNewButton;
	protected JTable tablePersonas;
	protected JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas frame = new Tablas();
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
	public Tablas() {
		
		String [] cabecera = {"id", "nombre","direccion"};
		
		String [] [] Persona = {
				
				{"10","Messi","Barcelona"},
				{"4","Sergio Ramos","Madrid"},
				{"8","Iniesta","Barcelona"},
				{"5","Mascherano","Estudiantes"}
				
		};
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 543);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.panel = new JPanel();
		this.panel.setBounds(0, 0, 626, 504);
		this.contentPane.add(this.panel);
		this.panel.setLayout(null);
		
		this.btnNewButton = new JButton("New button");
		this.btnNewButton.setBounds(279, 430, 89, 23);
		this.panel.add(this.btnNewButton);
		
		this.table = new JTable();
		this.table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nombre", "Raza", "Edad", "Patologia"
			}
		));
		this.table.setBounds(33, 42, 542, 344);
		this.panel.add(this.table);
		
		this.tablePersonas = new JTable(Persona,cabecera);
		getContentPane().add(new JScrollPane(tablePersonas), BorderLayout.CENTER);
		this.tablePersonas.setBounds(36, 40, 543, 317);
		
		
	}
}
