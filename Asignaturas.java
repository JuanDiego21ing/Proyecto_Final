package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Asignaturas {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtMatematicas;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asignaturas window = new Asignaturas();
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
	public Asignaturas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel panelConsultaMateria = new JPanel();
		panelConsultaMateria.setBackground(new Color(255, 255, 128));
		panelConsultaMateria.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Datos de la materia");
		lblNewLabel_11.setBounds(167, 11, 93, 14);
		panelConsultaMateria.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Nombre del profesor\r\n");
		lblNewLabel_12.setBounds(10, 51, 123, 14);
		panelConsultaMateria.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Asignatura");
		lblNewLabel_13.setBounds(10, 92, 71, 14);
		panelConsultaMateria.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Grupos");
		lblNewLabel_14.setBounds(10, 136, 46, 14);
		panelConsultaMateria.add(lblNewLabel_14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 48, 130, 20);
		panelConsultaMateria.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(91, 89, 169, 20);
		panelConsultaMateria.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(66, 133, 194, 49);
		panelConsultaMateria.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("Regresar");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.getContentPane().remove(panelConsultaMateria);
				//frame.getContentPane().add(panelAsignaturas);
				//frame.getContentPane().revalidate();
				//frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton_13.setBounds(171, 227, 89, 23);
		panelConsultaMateria.add(btnNewButton_13);
		
		ImageIcon imagen4 =new ImageIcon("Cons.jfif");
		JButton im4=new JButton(imagen4);
		im4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		im4.setBounds(331, 11, 93, 100);
		
		Image esc4 = imagen4.getImage().getScaledInstance(im4.getWidth(), im4.getHeight(),Image.SCALE_SMOOTH);
		Icon ices4=new ImageIcon(esc4);
		im4.setIcon(ices4);
		panelConsultaMateria.add(im4);
		
		final JPanel panelConsultas = new JPanel();
		panelConsultas.setBackground(new Color(255, 255, 128));
		panelConsultas.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Regresar");
		btnNewButton_4.setBounds(10, 11, 89, 23);
		panelConsultas.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido al apartado de consulta");
		lblNewLabel_1.setBounds(109, 15, 174, 14);
		panelConsultas.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione la materia que desee consultar");
		lblNewLabel_2.setBounds(96, 52, 200, 14);
		panelConsultas.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(96, 77, 205, 83);
		panelConsultas.add(list);
		
		JButton btnNewButton_5 = new JButton("Consultar Materia");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panelConsultas);
				frame.getContentPane().add(panelConsultaMateria);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton_5.setBounds(121, 193, 146, 23);
		panelConsultas.add(btnNewButton_5);
		
		ImageIcon imagen2 =new ImageIcon("Mat.jfif");
		JButton im2=new JButton(imagen2);
		im2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		im2.setBounds(335, 11, 89, 83);
		
		Image esc1 = imagen2.getImage().getScaledInstance(im2.getWidth(), im2.getHeight(),Image.SCALE_SMOOTH);
		Icon ices1=new ImageIcon(esc1);
		im2.setIcon(ices1);
		panelConsultas.add(im2);
		
		
		
		
		
		final JPanel panelCrear = new JPanel();
		panelCrear.setBackground(new Color(255, 255, 128));
		
		panelCrear.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Regresar");
		btnNewButton_6.setBounds(10, 11, 89, 23);
		panelCrear.add(btnNewButton_6);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre del Profesor");
		lblNewLabel_3.setBounds(10, 71, 98, 14);
		panelCrear.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre de la materia");
		lblNewLabel_4.setBounds(10, 106, 128, 14);
		panelCrear.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 141, 46, 14);
		panelCrear.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(10, 166, 299, 49);
		panelCrear.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(133, 66, 141, 22);
		panelCrear.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(133, 101, 141, 22);
		panelCrear.add(textArea_2);
		
		JButton btnNewButton_7 = new JButton("Crear Materia");
		btnNewButton_7.setBounds(165, 226, 109, 23);
		panelCrear.add(btnNewButton_7);
		
		
		
		
		
		final JPanel panelEditar = new JPanel();
		panelEditar.setBackground(new Color(255, 255, 128));
		panelEditar.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Regresar\r\n");
		btnNewButton_8.setBounds(10, 11, 89, 23);
		panelEditar.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Agregar o Eliminar alumnos\r\n");
		btnNewButton_9.setBounds(36, 227, 161, 23);
		panelEditar.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Guardar Cambios\r\n");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(249, 227, 128, 23);
		panelEditar.add(btnNewButton_10);
		
		JLabel lblNewLabel_6 = new JLabel("Seleccione la materia");
		lblNewLabel_6.setBounds(162, 22, 116, 14);
		panelEditar.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 44, 282, 63);
		panelEditar.add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre del profesor\r\n");
		lblNewLabel_7.setBounds(20, 118, 98, 14);
		panelEditar.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Aignatura\r\n");
		lblNewLabel_8.setBounds(20, 143, 47, 14);
		panelEditar.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Grupos\r\n");
		lblNewLabel_9.setBounds(20, 168, 34, 14);
		panelEditar.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 115, 121, 20);
		panelEditar.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 140, 172, 20);
		panelEditar.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(64, 165, 185, 20);
		panelEditar.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		
		
		
		final JPanel panelEliminar = new JPanel();
		panelEliminar.setBackground(new Color(255, 255, 128));
		panelEliminar.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(10, 11, 89, 23);
		panelEliminar.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Eliminar Materia\r\n");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBounds(164, 227, 150, 23);
		panelEliminar.add(btnNewButton_12);
		
		JLabel lblNewLabel_10 = new JLabel("Seleccione la materia que desee eliminar");
		lblNewLabel_10.setBounds(102, 62, 205, 14);
		panelEliminar.add(lblNewLabel_10);
		
		txtMatematicas = new JTextField();
		txtMatematicas.setText("\r\n\r\nProgramación\r\n");
		txtMatematicas.setBounds(62, 100, 304, 98);
		panelEliminar.add(txtMatematicas);
		txtMatematicas.setColumns(10);
		

		ImageIcon imagen3 =new ImageIcon("ELI.jfif");
		JButton im3=new JButton(imagen3);
		im3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		im3.setBounds(335, 11, 89, 65);
		
		Image esc3 = imagen3.getImage().getScaledInstance(im3.getWidth(), im3.getHeight(),Image.SCALE_SMOOTH);
		Icon ices3=new ImageIcon(esc3);
		im3.setIcon(ices3);
		panelEliminar.add(im3);
		
		
		
		
		
		

		
		
		final JPanel panelAsignaturas = new JPanel();
		panelAsignaturas.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panelAsignaturas, BorderLayout.CENTER);
		panelAsignaturas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modulo de Asignaturas");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(122, 5, 197, 15);
		panelAsignaturas.add(lblNewLabel);
		
		ImageIcon imagen =new ImageIcon("ASI.jfif");
		JButton im1=new JButton(imagen);
		im1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		im1.setBounds(10, 36, 112, 122);
		
		Image esc = imagen.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im1.setIcon(ices);
		panelAsignaturas.add(im1);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panelAsignaturas);
				frame.getContentPane().add(panelConsultas);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton.setBounds(181, 36, 138, 23);
		panelAsignaturas.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crear Asignatura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panelAsignaturas);
				frame.getContentPane().add(panelCrear);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton_1.setBounds(181, 80, 138, 23);
		panelAsignaturas.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panelAsignaturas);
				frame.getContentPane().add(panelEditar);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton_2.setBounds(181, 135, 138, 23);
		panelAsignaturas.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panelAsignaturas);
				frame.getContentPane().add(panelEliminar);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
				
			}
		});
		btnNewButton_3.setBounds(181, 191, 138, 23);
		panelAsignaturas.add(btnNewButton_3);
	}
}
