import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Conector.ConexionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarDocente {

    JFrame frame;
    private JTable tableDocentes;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConsultarDocente window = new ConsultarDocente();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ConsultarDocente() {
        initialize();
        cargarDatos();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 255));
        panel.setBounds(0, 0, 784, 62);
        frame.getContentPane().add(panel);

        JLabel lblNewLabel = new JLabel("Consultar Docentes");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel.setBounds(249, 73, 271, 39);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("EDITAR DOCENTE");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 255));
        btnNewButton.setBounds(64, 149, 178, 33);
        frame.getContentPane().add(btnNewButton);

        JButton btnEliminarAlumno = new JButton("ELIMINAR DOCENTE");
        btnEliminarAlumno.setForeground(new Color(0, 0, 0));
        btnEliminarAlumno.setBackground(new Color(255, 128, 128));
        btnEliminarAlumno.setBounds(533, 149, 178, 33);
        frame.getContentPane().add(btnEliminarAlumno);

        JButton btnCrearAlumno = new JButton("CREAR DOCENTE");
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.dispose(); // Cierra la ventana actual
                CrearDocentes crearDocente = new CrearDocentes();
                crearDocente.frame.setVisible(true); // Abre la ventana CrearAlumno

            }
        });
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBackground(new Color(0, 0, 255));
        btnCrearAlumno.setBounds(290, 149, 178, 33);
        frame.getContentPane().add(btnCrearAlumno);

        tableDocentes = new JTable();
        tableDocentes.setBackground(new Color(192, 192, 192));
        tableDocentes.setBounds(48, 216, 675, 209);
        frame.getContentPane().add(tableDocentes);

        JButton btnRegresar = new JButton("REGRESAR");
        btnRegresar.setFont(new Font("Arial", Font.PLAIN, 12));
        btnRegresar.setForeground(new Color(0, 0, 0));
        btnRegresar.setBackground(new Color(255, 128, 128));
        btnRegresar.setBounds(10, 73, 140, 23);
        frame.getContentPane().add(btnRegresar);

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Modulo_Docentes moduloDocente = new Modulo_Docentes();
                moduloDocente.setVisible(true);
            }
        });

        
    }

    private void cargarDatos() {
    	
    	   tableModel = new DefaultTableModel();
           tableModel.addColumn("Nombre");
           tableModel.addColumn("ApellidoPaterno");
           tableModel.addColumn("ApellidoMaterno");
           tableModel.addColumn("FechaNacimiento");
           tableModel.addColumn("correo");
           tableModel.addColumn("telefono");
           // Agrega más columnas según tus necesidades

           try {
               Connection connection = ConexionMySQL.getConnection();
               Statement statement = connection.createStatement();
               // Aquí debes modificar la consulta SQL según la estructura de tu tabla
               ResultSet resultSet = statement.executeQuery("SELECT * FROM docentes");

               while (resultSet.next()) {
                   String nombre = resultSet.getString("NombreDoc");
                   String ApellidoP = resultSet.getString("ApellidoPaternoDOC");
                   String ApellidoM = resultSet.getString("ApellidoMaternoDOC");
                   String FechaNa = resultSet.getString("FechaNacimientoDOC");
                   String Correo = resultSet.getString("correoDOC");
                   String Telefono = resultSet.getString("telefonoDOC");

                   // Obtén los demás campos de la tabla según necesites

                   tableModel.addRow(new Object[] { nombre, ApellidoP, ApellidoM, FechaNa, Correo, Telefono });
               }

               tableDocentes.setModel(tableModel);
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }
}

