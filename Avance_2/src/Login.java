import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JTextField textField;
    private JPasswordField passwordField;
    private Timer timer;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 255, 255));
        setBounds(100, 100, 666, 429);
        getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("CREAR CORREO");
        btnNewButton.setBounds(127, 287, 152, 29);
        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(67, 67, 255));
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("INICIAR SESION");
        btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
        btnNewButton_1.setBounds(348, 287, 152, 29);
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(67, 67, 255));
        getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("SALIR");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_2.setBounds(10, 356, 87, 23);
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBackground(new Color(247, 87, 87));
        getContentPane().add(btnNewButton_2);

        textField = new JTextField();
        textField.setBounds(199, 174, 240, 29);
        textField.setForeground(new Color(0, 0, 0));
        getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Inicia Sesion");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lblNewLabel.setBounds(239, 130, 152, 33);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setToolTipText("");
        getContentPane().add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 650, 50);
        panel_1.setBackground(new Color(67, 67, 255));
        getContentPane().add(panel_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(199, 214, 240, 29);
        getContentPane().add(passwordField);

        JLabel lblNewLabel_1 = new JLabel("Bienvenido al Sistema");
        lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(164, 61, 319, 33);
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Correo/Usuario:");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(85, 176, 104, 23);
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Contraseña:");
        lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
        lblNewLabel_2_1.setBounds(102, 216, 87, 23);
        getContentPane().add(lblNewLabel_2_1);

        // Agregar el ActionListener al botón "INICIAR SESION"
        btnNewButton_1.addActionListener(this);

        // Configurar el Timer para restablecer el color de fondo de los campos de texto
        timer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setBackground(Color.WHITE);
                passwordField.setBackground(Color.WHITE);
                timer.stop();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = textField.getText();
        String contrasena = new String(passwordField.getPassword());

        // Verificar si los campos están vacíos
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete los campos correspondientes",
                    "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            // Resaltar en rojo claro los campos vacíos
            if (usuario.isEmpty()) {
                textField.setBackground(new Color(255, 200, 200));
            }
            if (contrasena.isEmpty()) {
                passwordField.setBackground(new Color(255, 200, 200));
            }

            // Iniciar el Timer para restablecer el color de fondo después de 4 segundos
            timer.restart();
        } else {
            // Verificar las credenciales
            if (usuario.equals("admin") && contrasena.equals("1234")) {
                // Cerrar la ventana actual
                dispose();
                // Abrir la ventana Menu
                Menu.getInstance().setVisible(true);
                showWelcomeDialog();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario Inexistente",
                        "Inicio de sesión fallido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

	private void showWelcomeDialog() {
		// TODO Auto-generated method stub
		
	}

  
}

