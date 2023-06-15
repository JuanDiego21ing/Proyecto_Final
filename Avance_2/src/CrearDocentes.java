import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class CrearDocentes {

    JFrame frame;
    private JTextField NomDocente;
    private JTextField ApeMaterDoc;
    private JTextField FechaNaciDoc;
    private JTextField CorreoDoc;
    private JTextField TelefonoDoc;
    private JTextField ApePaterDoc;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CrearDocentes window = new CrearDocentes();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CrearDocentes() {
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

        NomDocente = new JTextField();
        NomDocente.setBounds(171, 94, 291, 21);
        frame.getContentPane().add(NomDocente);
        NomDocente.setColumns(10);
        NomDocente.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NomDocente.setBackground(Color.WHITE);
            }
        });

        ApeMaterDoc = new JTextField();
        ApeMaterDoc.setColumns(10);
        ApeMaterDoc.setBounds(171, 187, 291, 20);
        frame.getContentPane().add(ApeMaterDoc);
        ApeMaterDoc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ApeMaterDoc.setBackground(Color.WHITE);
            }
        });

        FechaNaciDoc = new JTextField();
        FechaNaciDoc.setColumns(10);
        FechaNaciDoc.setBounds(171, 233, 291, 20);
        frame.getContentPane().add(FechaNaciDoc);
        FechaNaciDoc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                FechaNaciDoc.setBackground(Color.WHITE);
            }
        });

        CorreoDoc = new JTextField();
        CorreoDoc.setColumns(10);
        CorreoDoc.setBounds(171, 281, 291, 20);
        frame.getContentPane().add(CorreoDoc);
        CorreoDoc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                CorreoDoc.setBackground(Color.WHITE);
            }
        });

        TelefonoDoc = new JTextField();
        TelefonoDoc.setColumns(10);
        TelefonoDoc.setBounds(171, 327, 291, 20);
        frame.getContentPane().add(TelefonoDoc);
        TelefonoDoc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                TelefonoDoc.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_1_5 = new JLabel("Apelllido Materno:");
        lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_5.setBounds(35, 186, 126, 21);
        frame.getContentPane().add(lblNewLabel_1_5);

        ApePaterDoc = new JTextField();
        ApePaterDoc.setColumns(10);
        ApePaterDoc.setBounds(171, 143, 291, 20);
        frame.getContentPane().add(ApePaterDoc);
        ApePaterDoc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ApePaterDoc.setBackground(Color.WHITE);
            }
        });

        JLabel lblNewLabel_2 = new JLabel("CREAR DOCENTE");
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
                    Modulo_Docentes moduloDocentes = new Modulo_Docentes();
                    moduloDocentes.frame.setVisible(true); // Abre la ventana Modulo_Alumnos
                }
            }
        });
        btnNewButton.setBounds(505, 356, 135, 23);
        frame.getContentPane().add(btnNewButton);


        JButton btnCrearAlumno = new JButton("CREAR DOCENTE");
        btnCrearAlumno.setBackground(new Color(67, 67, 255));
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBounds(505, 304, 135, 23);
        frame.getContentPane().add(btnCrearAlumno);

        // Validar campos antes de crear el alumno
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (NomDocente.getText().isEmpty() || ApeMaterDoc.getText().isEmpty() || FechaNaciDoc.getText().isEmpty()
                        || CorreoDoc.getText().isEmpty() || TelefonoDoc.getText().isEmpty()
                        || ApePaterDoc.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Campos Vacíos",
                            JOptionPane.WARNING_MESSAGE);

                    if (NomDocente.getText().isEmpty()) {
                        NomDocente.setBackground(new Color(255, 220, 220));
                    }
                    if (ApeMaterDoc.getText().isEmpty()) {
                        ApeMaterDoc.setBackground(new Color(255, 220, 220));
                    }
                    if (FechaNaciDoc.getText().isEmpty()) {
                        FechaNaciDoc.setBackground(new Color(255, 220, 220));
                    }
                    if (CorreoDoc.getText().isEmpty()) {
                        CorreoDoc.setBackground(new Color(255, 220, 220));
                    }
                    if (TelefonoDoc.getText().isEmpty()) {
                        TelefonoDoc.setBackground(new Color(255, 220, 220));
                    }
                    if (ApePaterDoc.getText().isEmpty()) {
                        ApePaterDoc.setBackground(new Color(255, 220, 220));
                    }
                } else {
                    // Realizar acción de crear alumno aquí
                	
try {
                		
                		//Class.forName("com.mysql.jdbc.Driver");
                		
                		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_escolar","root","");
                		
                		String nombre=NomDocente.getText();
                		String ApellidoPater=ApePaterDoc.getText();
                		String ApellidoMater=ApeMaterDoc.getText();
                		String FechaNaci=FechaNaciDoc.getText();
                		String Correo=CorreoDoc.getText();
                		String Telefono=TelefonoDoc.getText();
                		
                		String query="INSERT INTO docentes(NombreDoc,ApellidoPaternoDOC,ApellidoMaternoDOC,FechaNacimientoDOC,CorreoDOC,TelefonoDOC) values('"+nombre+"','"+ApellidoPater+"','"+ApellidoMater+"','"+Correo+"','"+FechaNaci+"','"+Telefono+"')";
                		PreparedStatement stmt = conexion.prepareStatement("INSERT INTO sistema_escolar VALUES (?,?,?,?,?) ");
                		
                		stmt.executeUpdate(query);
                		JOptionPane.showMessageDialog(null, "Docente Creado Exitosamente");
                		
                	}catch(Exception e1){
                		
                		
                		
                		
                	}
                }
            }
        });
    }
}
