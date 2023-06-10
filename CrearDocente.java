
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearDocente {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearDocente window = new CrearDocente();
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
	public CrearDocente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 668, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 652, 49);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("CREAR DOCENTE");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(213, 60, 188, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 122, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("APELLIDOS: ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(48, 166, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FECHA DE NACIMIENTO: ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(48, 203, 177, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CORREO ELECTRONICO: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(48, 239, 188, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TELEFONO: ");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(48, 277, 95, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GRADO DE ESTUDIO: ");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(48, 319, 163, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(125, 120, 288, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 164, 274, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 201, 241, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(234, 237, 241, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 275, 196, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(202, 317, 263, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("CREAR DOCENTE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(486, 338, 143, 30);
		frame.getContentPane().add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()
	                        || textField_3.getText().isEmpty() || textField_4.getText().isEmpty()
	                        || textField_5.getText().isEmpty()) {
	                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Campos Vacíos",
	                            JOptionPane.WARNING_MESSAGE);

	                    if (textField.getText().isEmpty()) {
	                        textField.setBackground(new Color(255, 220, 220));
	                    }
	                    if (textField_1.getText().isEmpty()) {
	                        textField_1.setBackground(new Color(255, 220, 220));
	                    }
	                    if (textField_2.getText().isEmpty()) {
	                        textField_2.setBackground(new Color(255, 220, 220));
	                    }
	                    if (textField_3.getText().isEmpty()) {
	                        textField_3.setBackground(new Color(255, 220, 220));
	                    }
	                    if (textField_4.getText().isEmpty()) {
	                        textField_4.setBackground(new Color(255, 220, 220));
	                    }
	                    if (textField_5.getText().isEmpty()) {
	                        textField_5.setBackground(new Color(255, 220, 220));
	                    }
	                } else {
	                    // Realizar acción de crear alumno aquí
	                }
	            }
	        });
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setBounds(10, 60, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		 btnNewButton_1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cancelar?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
	                if (confirm == JOptionPane.YES_OPTION) {
	                    frame.dispose(); // Cierra la ventana actual
	                    ModuloDocente moduloDocente = new ModuloDocente();
	                    moduloDocente.frame.setVisible(true); // Abre la ventana Modulo_Alumnos
	                }
	            }
	        });
	}

}
