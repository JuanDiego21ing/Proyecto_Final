
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ModuloDocente {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloDocente window = new ModuloDocente();
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
	public ModuloDocente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 664, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 648, 49);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("MODULO DOCENTE");
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(195, 60, 220, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\Desktop\\profe.jpeg"));
		lblNewLabel_1.setBounds(24, 86, 148, 144);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Crear Docente");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(235, 168, 180, 40);
		frame.getContentPane().add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                frame.dispose(); // Cierra la ventana actual
	                CrearDocente crearDocente = new CrearDocente();
	                crearDocente.frame.setVisible(true); // Abre la ventana CrearAlumno
	            }
	        });
		
		JButton btnNewButton_1 = new JButton("CONSULTAR");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.setBounds(235, 240, 180, 40);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConsultaDocente consultarDocente = new ConsultaDocente();
                consultarDocente.main(null); // Abre la ventana Modulo_Alumnos
                frame.dispose(); // Cierra la ventana actual
            }
        });
		
		JButton btnNewButton_2 = new JButton("REGRESAR");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 128, 128));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_2.setBounds(24, 351, 126, 28);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(e -> {
            frame.dispose();  // Cierra la ventana actual
            Menu.getInstance().setVisible(true);  // Abre la ventana Menu
        });
	}

}

