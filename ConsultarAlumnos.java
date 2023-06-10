import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;

public class ConsultarAlumnos {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarAlumnos window = new ConsultarAlumnos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarAlumnos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 784, 62);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Consultar Alumnos");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(249, 73, 271, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("EDITAR ALUMNO");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(64, 149, 178, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEliminarAlumno = new JButton("ELIMINAR ALUMNO");
		btnEliminarAlumno.setForeground(new Color(0, 0, 0));
		btnEliminarAlumno.setBackground(new Color(255, 128, 128));
		btnEliminarAlumno.setBounds(533, 149, 178, 33);
		frame.getContentPane().add(btnEliminarAlumno);
		
		JButton btnCrearAlumno = new JButton("CREAR ALUMNO");
		btnCrearAlumno.setForeground(new Color(255, 255, 255));
		btnCrearAlumno.setBackground(new Color(0, 0, 255));
		btnCrearAlumno.setBounds(290, 149, 178, 33);
		frame.getContentPane().add(btnCrearAlumno);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(48, 216, 675, 209);
		frame.getContentPane().add(table);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegresar.setForeground(new Color(0, 0, 0));
		btnRegresar.setBackground(new Color(255, 128, 128));
		btnRegresar.setBounds(10, 73, 140, 23);
		frame.getContentPane().add(btnRegresar);
		btnRegresar.addActionListener(e -> {
            frame.dispose();  // Cierra la ventana actual
            Menu.getInstance().setVisible(true);  // Abre la ventana Menu
        });
	}

}
