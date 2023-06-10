import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class CrearAlumno {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_6;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CrearAlumno window = new CrearAlumno();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CrearAlumno() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 666, 429);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(67, 67, 255));
        panel.setBounds(0, 0, 650, 36);
        frame.getContentPane().add(panel);

        JLabel lblNewLabel = new JLabel("Nombre:");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(93, 94, 68, 21);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBounds(35, 186, 112, 21);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Fecha de Nacimiento:");
        lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1.setBounds(17, 232, 144, 21);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Correo Electronico: ");
        lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_2.setBounds(31, 280, 130, 21);
        frame.getContentPane().add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("Telefono:");
        lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_3.setBounds(95, 326, 78, 21);
        frame.getContentPane().add(lblNewLabel_1_3);

        textField = new JTextField();
        textField.setBounds(171, 94, 291, 21);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setBackground(Color.WHITE);
            }
        });

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(171, 187, 291, 20);
        frame.getContentPane().add(textField_1);
        textField_1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_1.setBackground(Color.WHITE);
            }
        });

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(171, 233, 291, 20);
        frame.getContentPane().add(textField_2);
        textField_2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_2.setBackground(Color.WHITE);
            }
        });

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(171, 281, 291, 20);
        frame.getContentPane().add(textField_3);
        textField_3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_3.setBackground(Color.WHITE);
            }
        });

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(171, 327, 291, 20);
        frame.getContentPane().add(textField_4);
        textField_4.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_4.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_1_5 = new JLabel("Apelllido Materno:");
        lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_5.setBounds(35, 142, 126, 21);
        frame.getContentPane().add(lblNewLabel_1_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(171, 143, 291, 20);
        frame.getContentPane().add(textField_6);
        textField_6.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_6.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_2 = new JLabel("CREAR ALUMNO");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(203, 47, 225, 36);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("CANCELAR");
        btnNewButton.setBackground(new Color(247, 87, 87));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cancelar?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Cierra la ventana actual
                    Modulo_Alumnos moduloAlumnos = new Modulo_Alumnos();
                    moduloAlumnos.frame.setVisible(true); // Abre la ventana Modulo_Alumnos
                }
            }
        });
        btnNewButton.setBounds(505, 356, 135, 23);
        frame.getContentPane().add(btnNewButton);


        JButton btnCrearAlumno = new JButton("CREAR ALUMNO");
        btnCrearAlumno.setBackground(new Color(67, 67, 255));
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBounds(505, 304, 135, 23);
        frame.getContentPane().add(btnCrearAlumno);

        // Validar campos antes de crear el alumno
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()
                        || textField_3.getText().isEmpty() || textField_4.getText().isEmpty()
                        || textField_6.getText().isEmpty()) {
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
                    if (textField_6.getText().isEmpty()) {
                        textField_6.setBackground(new Color(255, 220, 220));
                    }
                } else {
                    // Realizar acción de crear alumno aquí
                }
            }
        });
    }
}





