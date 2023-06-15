import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class CrearAsignatura {

    JFrame frame;
    private JTextField NomAsigna;
    private JTextField NomGrupoGrado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CrearAsignatura window = new CrearAsignatura();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CrearAsignatura() {
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

        JLabel lblNewLabel = new JLabel("Nombre Asignatura: ");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(26, 116, 135, 21);
        frame.getContentPane().add(lblNewLabel);

        NomAsigna = new JTextField();
        NomAsigna.setBounds(171, 117, 291, 21);
        frame.getContentPane().add(NomAsigna);
        NomAsigna.setColumns(10);
        NomAsigna.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NomAsigna.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_1_5 = new JLabel("Asignar Grupo: ");
        lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_5.setBounds(52, 186, 109, 21);
        frame.getContentPane().add(lblNewLabel_1_5);

        NomGrupoGrado = new JTextField();
        NomGrupoGrado.setColumns(10);
        NomGrupoGrado.setBounds(171, 187, 291, 20);
        frame.getContentPane().add(NomGrupoGrado);
        NomGrupoGrado.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NomGrupoGrado.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_2 = new JLabel("CREAR ASIGNATURA");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(171, 43, 287, 36);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("CANCELAR");
        btnNewButton.setBackground(new Color(247, 87, 87));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cancelar?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Cierra la ventana actual
                    Modulo_Asignatura moduloAsignatura = new Modulo_Asignatura();
                    moduloAsignatura.frame.setVisible(true); // Abre la ventana Modulo_Alumnos
                }
            }
        });
        btnNewButton.setBounds(238, 338, 154, 23);
        frame.getContentPane().add(btnNewButton);


        JButton btnCrearAlumno = new JButton("CREAR ASIGNATURA");
        btnCrearAlumno.setBackground(new Color(67, 67, 255));
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBounds(238, 304, 154, 23);
        frame.getContentPane().add(btnCrearAlumno);

        // Validar campos antes de crear el alumno
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (NomAsigna.getText().isEmpty() ||  
                        
                         NomGrupoGrado.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Campos Vacíos",
                            JOptionPane.WARNING_MESSAGE);

                    if (NomAsigna.getText().isEmpty()) {
                        NomAsigna.setBackground(new Color(255, 220, 220));
                    }
                 
                  
                    
                    if (NomGrupoGrado.getText().isEmpty()) {
                        NomGrupoGrado.setBackground(new Color(255, 220, 220));
                    }
                } else {
                    // Realizar acción de crear alumno aquí
                }
            }
        });
    }
}
