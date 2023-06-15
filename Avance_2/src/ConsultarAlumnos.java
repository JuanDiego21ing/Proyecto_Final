import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Conector.ConexionMySQL;

public class ConsultarAlumnos {

    JFrame frame;
    private JTable tableAlumnos;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConsultarAlumnos window = new ConsultarAlumnos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ConsultarAlumnos() {
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

        JLabel lblNewLabel = new JLabel("Consultar Alumnos");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel.setBounds(249, 73, 271, 39);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("EDITAR ALUMNO");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 255));
        btnNewButton.setBounds(64, 149, 178, 33);
        frame.getContentPane().add(btnNewButton);

        JButton btnEliminarAlumno = new JButton("ELIMINAR ALUMNO");
        btnEliminarAlumno.setForeground(new Color(0, 0, 0));
        btnEliminarAlumno.setBackground(new Color(255, 128, 128));
        btnEliminarAlumno.setBounds(533, 149, 178, 33);
        frame.getContentPane().add(btnEliminarAlumno);

        JButton btnCrearAlumno = new JButton("CREAR ALUMNO");
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra la ventana actual
                CrearAlumno crearAlumno = new CrearAlumno();
                crearAlumno.frame.setVisible(true); // Abre la ventana CrearAlumno
            }
        });
        btnCrearAlumno.setForeground(new Color(255, 255, 255));
        btnCrearAlumno.setBackground(new Color(0, 0, 255));
        btnCrearAlumno.setBounds(290, 149, 178, 33);
        frame.getContentPane().add(btnCrearAlumno);

        tableAlumnos = new JTable();
        tableAlumnos.setBackground(new Color(192, 192, 192));
        tableAlumnos.setBounds(48, 216, 675, 209);
        frame.getContentPane().add(tableAlumnos);

        JButton btnRegresar = new JButton("REGRESAR");
        btnRegresar.setFont(new Font("Arial", Font.PLAIN, 12));
        btnRegresar.setForeground(new Color(0, 0, 0));
        btnRegresar.setBackground(new Color(255, 128, 128));
        btnRegresar.setBounds(10, 73, 140, 23);
        frame.getContentPane().add(btnRegresar);

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra la ventana actual
                Modulo_Alumnos moduloAlumno = new Modulo_Alumnos();
                moduloAlumno.frame.setVisible(true); // Abre la ventana Modulo_Alumno
            }
        });

        btnEliminarAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableAlumnos.getSelectedRow();
                if (selectedRow != -1) {
                    int confirm = JOptionPane.showConfirmDialog(frame,
                            "¿Estás seguro de eliminar al alumno seleccionado?", "Confirmar eliminación",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        eliminarAlumno(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Selecciona un alumno para eliminar",
                            "Error al eliminar alumno", JOptionPane.ERROR_MESSAGE);
                }
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM alumnos");

            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                String ApellidoP = resultSet.getString("ApellidoPaterno");
                String ApellidoM = resultSet.getString("ApellidoMaterno");
                String FechaNa = resultSet.getString("FechaNacimiento");
                String Correo = resultSet.getString("correo");
                String Telefono = resultSet.getString("telefono");

                // Obtén los demás campos de la tabla según necesites

                tableModel.addRow(new Object[] { nombre, ApellidoP, ApellidoM, FechaNa, Correo, Telefono });
            }

            tableAlumnos.setModel(tableModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void eliminarAlumno(int row) {
        try {
            Connection connection = ConexionMySQL.getConnection();
            Statement statement = connection.createStatement();
            // Aquí debes modificar la consulta SQL según la estructura de tu tabla y los campos que
            // identifiquen al alumno a eliminar. Por ejemplo, si tienes un campo "id_alumno" como
            // identificador único, puedes usarlo en la cláusula WHERE.
            String nombre = (String) tableModel.getValueAt(row, 0);
            String ApellidoP = (String) tableModel.getValueAt(row, 1);
            String ApellidoM = (String) tableModel.getValueAt(row, 2);
            String query = String.format("DELETE FROM alumnos WHERE Nombre='%s' AND ApellidoPaterno='%s' AND ApellidoMaterno='%s'",
                    nombre, ApellidoP, ApellidoM);

            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                tableModel.removeRow(row);
                JOptionPane.showMessageDialog(frame, "Alumno eliminado correctamente", "Eliminación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "No se pudo eliminar al alumno", "Error al eliminar",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}








