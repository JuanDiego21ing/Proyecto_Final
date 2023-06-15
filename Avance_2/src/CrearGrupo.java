import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class CrearGrupo {

    JFrame frame;
    private JTextField GrupoLetraGrado;
    private JTextField NomAsignatura;
    private JTextField DocAsignado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CrearGrupo window = new CrearGrupo();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CrearGrupo() {
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

        JLabel lblNewLabel = new JLabel("Grupo:");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(93, 116, 68, 21);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Asignatura:");
        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBounds(83, 256, 78, 21);
        frame.getContentPane().add(lblNewLabel_1);

        GrupoLetraGrado = new JTextField();
        GrupoLetraGrado.setBounds(171, 117, 291, 21);
        frame.getContentPane().add(GrupoLetraGrado);
        GrupoLetraGrado.setColumns(10);
        GrupoLetraGrado.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                GrupoLetraGrado.setBackground(Color.WHITE);
            }
        });

        NomAsignatura = new JTextField();
        NomAsignatura.setColumns(10);
        NomAsignatura.setBounds(171, 257, 291, 20);
        frame.getContentPane().add(NomAsignatura);
        NomAsignatura.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NomAsignatura.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_1_5 = new JLabel("Docente Asignado: ");
        lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_5.setBounds(26, 186, 135, 21);
        frame.getContentPane().add(lblNewLabel_1_5);

        DocAsignado = new JTextField();
        DocAsignado.setColumns(10);
        DocAsignado.setBounds(171, 187, 291, 20);
        frame.getContentPane().add(DocAsignado);
        DocAsignado.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                DocAsignado.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_2 = new JLabel("CREAR GRUPO");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(188, 47, 244, 36);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("CANCELAR");
        btnNewButton.setBackground(new Color(247, 87, 87));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cancelar?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Cierra la ventana actual
                    Modulo_Grupos moduloGrupo = new Modulo_Grupos();
                    moduloGrupo.frame.setVisible(true); // Abre la ventana Modulo_Alumnos
                }
            }
        });
        btnNewButton.setBounds(238, 338, 135, 23);
        frame.getContentPane().add(btnNewButton);


        JButton btnCrearAlumno = new JButton("CREAR GRUPO");
        btnCrearAlumno.setBackground(new Color(67, 67, 255));
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBounds(238, 304, 135, 23);
        frame.getContentPane().add(btnCrearAlumno);

        // Validar campos antes de crear el alumno
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (GrupoLetraGrado.getText().isEmpty() || NomAsignatura.getText().isEmpty() || 
                        
                         DocAsignado.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Campos Vacíos",
                            JOptionPane.WARNING_MESSAGE);

                    if (GrupoLetraGrado.getText().isEmpty()) {
                        GrupoLetraGrado.setBackground(new Color(255, 220, 220));
                    }
                    if (NomAsignatura.getText().isEmpty()) {
                        NomAsignatura.setBackground(new Color(255, 220, 220));
                    }
                  
                    
                    if (DocAsignado.getText().isEmpty()) {
                        DocAsignado.setBackground(new Color(255, 220, 220));
                    }
                } else {
                    // Realizar acción de crear alumno aquí
                }
            }
        });
    }
}
