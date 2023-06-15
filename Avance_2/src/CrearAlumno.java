import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;




public class CrearAlumno {

    JFrame frame;
    private JTextField NomAlum;
    private JTextField ApeMaterAlum;
    private JTextField FechaNaciAlum;
    private JTextField CorreoAlum;
    private JTextField TelefonoAlum;
    private JTextField ApeternoAlum;

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
        lblNewLabel_1.setBounds(49, 142, 112, 21);
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

        NomAlum = new JTextField();
        NomAlum.setBounds(171, 94, 291, 21);
        frame.getContentPane().add(NomAlum);
        NomAlum.setColumns(10);
        NomAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NomAlum.setBackground(Color.WHITE);
            }
        });

        ApeMaterAlum = new JTextField();
        ApeMaterAlum.setColumns(10);
        ApeMaterAlum.setBounds(171, 187, 291, 20);
        frame.getContentPane().add(ApeMaterAlum);
        ApeMaterAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ApeMaterAlum.setBackground(Color.WHITE);
            }
        });

        FechaNaciAlum = new JTextField();
        FechaNaciAlum.setColumns(10);
        FechaNaciAlum.setBounds(171, 233, 291, 20);
        frame.getContentPane().add(FechaNaciAlum);
        FechaNaciAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                FechaNaciAlum.setBackground(Color.WHITE);
            }
        });

        CorreoAlum = new JTextField();
        CorreoAlum.setColumns(10);
        CorreoAlum.setBounds(171, 281, 291, 20);
        frame.getContentPane().add(CorreoAlum);
        CorreoAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                CorreoAlum.setBackground(Color.WHITE);
            }
        });

        TelefonoAlum = new JTextField();
        TelefonoAlum.setColumns(10);
        TelefonoAlum.setBounds(171, 327, 291, 20);
        frame.getContentPane().add(TelefonoAlum);
        TelefonoAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                TelefonoAlum.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_1_5 = new JLabel("Apelllido Materno:");
        lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_5.setBounds(35, 186, 126, 21);
        frame.getContentPane().add(lblNewLabel_1_5);

        ApeternoAlum = new JTextField();
        ApeternoAlum.setColumns(10);
        ApeternoAlum.setBounds(171, 143, 291, 20);
        frame.getContentPane().add(ApeternoAlum);
        ApeternoAlum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ApeternoAlum.setBackground(Color.WHITE);
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
                if (NomAlum.getText().isEmpty() || ApeMaterAlum.getText().isEmpty() || FechaNaciAlum.getText().isEmpty()
                        || CorreoAlum.getText().isEmpty() || TelefonoAlum.getText().isEmpty()
                        || ApeternoAlum.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Campos Vacíos",
                            JOptionPane.WARNING_MESSAGE);

                    if (NomAlum.getText().isEmpty()) {
                        NomAlum.setBackground(new Color(255, 220, 220));
                    }
                    if (ApeMaterAlum.getText().isEmpty()) {
                        ApeMaterAlum.setBackground(new Color(255, 220, 220));
                    }
                    if (FechaNaciAlum.getText().isEmpty()) {
                        FechaNaciAlum.setBackground(new Color(255, 220, 220));
                    }
                    if (CorreoAlum.getText().isEmpty()) {
                        CorreoAlum.setBackground(new Color(255, 220, 220));
                    }
                    if (TelefonoAlum.getText().isEmpty()) {
                        TelefonoAlum.setBackground(new Color(255, 220, 220));
                    }
                    if (ApeternoAlum.getText().isEmpty()) {
                        ApeternoAlum.setBackground(new Color(255, 220, 220));
                    }
                } else {
                    // Realizar acción de crear alumno aquí
                	
                	
                	try {
                		
                		Class.forName("com.mysql.jdbc.Driver");
                		
                		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_escolar","root","");
                		
                		String nombre=NomAlum.getText();
                		String ApellidoPater=ApeternoAlum.getText();
                		String ApellidoMater=ApeMaterAlum.getText();
                		String FechaNaci=FechaNaciAlum.getText();
                		String Correo=CorreoAlum.getText();
                		String Telefono=TelefonoAlum.getText();
                		
                		String query="INSERT INTO alumnos(Nombre,ApellidoPaterno,ApellidoMaterno,FechaNacimiento,Correo,Telefono) values('"+nombre+"','"+ApellidoPater+"','"+ApellidoMater+"','"+Correo+"','"+FechaNaci+"','"+Telefono+"')";
                		PreparedStatement stmt = conexion.prepareStatement("INSERT INTO sistema_escolar VALUES (?,?,?,?,?) ");
                		
                		stmt.executeUpdate(query);
                		JOptionPane.showMessageDialog(null, "Alumno Creado Exitosamente");
                		
                	}catch(Exception e1){
                		
                		
                		
                		
                	}
                		
                		
                		
                	}
                	
                	
                	
                	
                	
                }
            });
        };
    }






