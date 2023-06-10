import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Menu {

    private JFrame frame;
    private static Menu instance; // Instancia única de la clase Menu

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu window = Menu.getInstance(); // Obtener la instancia única de Menu
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
    private Menu() {
        initialize();
    }

    /**
     * Obtener la instancia única de Menu.
     */
    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
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

        JLabel lblNewLabel = new JLabel("BIENVENIDO ADMIN");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(172, 61, 290, 32);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\Desktop\\alumno.jpg"));
        lblNewLabel_1.setBackground(new Color(67, 67, 255));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(104, 138, 144, 118);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\Desktop\\profe.png"));
        lblNewLabel_2.setBackground(new Color(255, 255, 255));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(356, 138, 144, 118);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("ALUMNOS");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(67, 67, 255));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Modulo_Alumnos moduloAlumnos = new Modulo_Alumnos();
                moduloAlumnos.main(null); // Abre la ventana Modulo_Alumnos
                frame.dispose(); // Cierra la ventana actual
            }
        });
        btnNewButton.setBounds(104, 267, 144, 32);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("PROFESORES");
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(67, 67, 255));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModuloDocente moduloDocente = new ModuloDocente();
                ModuloDocente.main(null); // Abre la ventana Modulo_Alumnos
                frame.dispose(); // Cierra la ventana actual
            }
        });
        btnNewButton_1.setBounds(356, 267, 144, 32);
        frame.getContentPane().add(btnNewButton_1);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(67, 67, 255));
        panel.setBounds(0, 0, 650, 50);
        frame.getContentPane().add(panel);

        JButton btnCerrarSesion = new JButton("CERRAR SESION");
        btnCerrarSesion.setForeground(Color.WHITE);
        btnCerrarSesion.setBackground(new Color(255, 128, 128));
        btnCerrarSesion.setBounds(10, 356, 144, 23);
        frame.getContentPane().add(btnCerrarSesion);
        btnCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cerrar sesión?", "Confirmar cierre de sesión", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Login login = new Login();
                    login.setVisible(true); // Abre la ventana Login
                    frame.dispose(); // Cierra la ventana actual
                }
            }
        });
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}



