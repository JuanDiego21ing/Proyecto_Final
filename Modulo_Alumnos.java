import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Modulo_Alumnos {

    JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Modulo_Alumnos window = new Modulo_Alumnos();
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
    public Modulo_Alumnos() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 666, 429);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton_4 = new JButton("CONSULTAR");
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBackground(new Color(67, 67, 255));
        btnNewButton_4.setBounds(228, 279, 165, 37);
        frame.getContentPane().add(btnNewButton_4);
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConsultarAlumnos consultarAlumno = new ConsultarAlumnos();
                consultarAlumno.main(null); // Abre la ventana Modulo_Alumnos
                frame.dispose(); // Cierra la ventana actual
            }
        });

        JButton btnNewButton_5 = new JButton("REGRESAR");
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setBackground(new Color(247, 87, 87));
        btnNewButton_5.setBounds(10, 356, 109, 23);
        frame.getContentPane().add(btnNewButton_5);
        btnNewButton_5.addActionListener(e -> {
            frame.dispose();  // Cierra la ventana actual
            Menu.getInstance().setVisible(true);  // Abre la ventana Menu
        });

        JPanel panel = new JPanel();
        panel.setBackground(new Color(67, 67, 255));
        panel.setBounds(0, 0, 650, 50);
        frame.getContentPane().add(panel);

        JLabel lblNewLabel = new JLabel("MODULO ALUMNOS");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel.setBounds(180, 61, 289, 37);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\Desktop\\alumno.jpg"));
        lblNewLabel_1.setBounds(236, 102, 144, 118);
        frame.getContentPane().add(lblNewLabel_1);
        
        JButton btnNewButton_4_1 = new JButton("CREAR ALUMNO");
        btnNewButton_4_1.setForeground(Color.WHITE);
        btnNewButton_4_1.setBackground(new Color(67, 67, 255));
        btnNewButton_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra la ventana actual
                CrearAlumno crearAlumno = new CrearAlumno();
                crearAlumno.frame.setVisible(true); // Abre la ventana CrearAlumno
            }
        });
        btnNewButton_4_1.setBounds(228, 231, 165, 37);
        frame.getContentPane().add(btnNewButton_4_1);

    }
}



