
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;

public class ConsultaDocente {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDocente window = new ConsultaDocente();
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
	public ConsultaDocente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 658, 49);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("CONSLUTA DOCENTE");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(219, 60, 218, 29);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(10, 221, 638, 143);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("ELIMINAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(10, 184, 143, 26);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EDITAR");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setBounds(252, 181, 143, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CREAR");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		btnNewButton_2.setBounds(505, 181, 143, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("REGRESAR");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_3.setBackground(new Color(255, 128, 128));
		btnNewButton_3.setBounds(10, 66, 113, 23);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(e -> {
            frame.dispose();  // Cierra la ventana actual
            Menu.getInstance().setVisible(true);  // Abre la ventana Menu
        });
	}

}

