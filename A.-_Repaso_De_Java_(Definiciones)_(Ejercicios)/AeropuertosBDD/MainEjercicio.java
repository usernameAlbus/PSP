import java.awt.BorderLayout;

import java.awt.EventQueue;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;

import javax.swing.JLabel;

import java.awt.Font;

import java.awt.Panel;

import javax.swing.JTable;

import javax.swing.JTextPane;

import java.awt.TextArea;

import java.awt.CardLayout;

import java.awt.Desktop;

import java.awt.List;

import javax.swing.JList;

import javax.swing.JSpinner;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.net.URI;

import java.net.URISyntaxException;

import java.util.ArrayList;

import java.awt.event.ActionEvent;

import java.awt.Color;



public class MainEjercicio extends JFrame {



	private JPanel contentPane;

	private static JTextField txtBuscar;



	private static ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();



	private String nombreAeropuerto = "";

	private static String resultado = "";



	/**

	 * Launch the application.

	 */



	private static void datosArray() throws Exception {

		File fic = new File("airports.dat");

		FileReader reader = new FileReader(fic);

		BufferedReader fic1 = new BufferedReader(reader);



		String linea;



		while ((linea = fic1.readLine()) != null) {

			String[] seccion = linea.split(",");

			aeropuertos.add(new Aeropuerto(seccion[0], seccion[1], seccion[2], seccion[3], seccion[4]));

		}

	}



	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					datosArray();



					MainEjercicio frame = new MainEjercicio();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}



	/**

	 * Create the frame.

	 */

	public MainEjercicio() {

		setTitle("AEROPUERTOR 5000S+");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1280, 720);

		contentPane = new JPanel();

		contentPane.setBackground(new Color(255, 218, 185));

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);



		txtBuscar = new JTextField();

		txtBuscar.setBounds(44, 70, 257, 25);

		contentPane.add(txtBuscar);

		txtBuscar.setColumns(10);



		JLabel lblPonElDato = new JLabel("Pon el nombre o ciudad de un aeropuerto");

		lblPonElDato.setFont(new Font("Arial Black", Font.PLAIN, 20));

		lblPonElDato.setBounds(44, 11, 466, 48);

		contentPane.add(lblPonElDato);



		Panel panel = new Panel();

		panel.setBounds(42, 131, 1175, 219);

		contentPane.add(panel);

		panel.setLayout(new BorderLayout(0, 0));



		JComboBox comboBoxResult = new JComboBox();

		panel.add(comboBoxResult, BorderLayout.NORTH);



		JLabel lblResultado = new JLabel("Resultado");

		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 14));

		lblResultado.setBounds(44, 111, 78, 14);

		contentPane.add(lblResultado);



		JLabel label = new JLabel("");

		label.setForeground(Color.RED);

		label.setBounds(494, 425, 264, 14);

		contentPane.add(label);



		JButton btnSource = new JButton("GOOGLE MAPS");

		btnSource.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				if (!txtBuscar.getText().equals("")) {

					Desktop browser = Desktop.getDesktop();



					for (Aeropuerto a : aeropuertos) {

						if (comboBoxResult.getSelectedItem().equals(a.toString())) {

							nombreAeropuerto = a.getNombre() + "+" + a.getCiudad() + "+" + a.getPais();

						}

					}



					String adiosEspacios = nombreAeropuerto.replaceAll(" ", "");



					try {

						browser.browse(new URI("https://www.google.es/maps/search/aeropuerto+" + adiosEspacios));

					} catch (IOException e) {

						// TODO Auto-generated catch block

						e.printStackTrace();

					} catch (URISyntaxException e) {

						// TODO Auto-generated catch block

						e.printStackTrace();

					}



				} else {

					label.setText("Tienes que poner algo en el buscador.");

				}

			}

		});

		btnSource.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnSource.setBounds(573, 391, 139, 23);

		contentPane.add(btnSource);



		JButton btnBuscar = new JButton("Buscar");

		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));

		btnBuscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {



				if (!txtBuscar.getText().equals("")) {

					String resultado = "";

					if (btnBuscar.getText().equals("Buscar")) {



						for (int i = 0; i < aeropuertos.size(); i++) {

							if (aeropuertos.get(i).toString().toUpperCase()

									.contains(txtBuscar.getText().toString().toUpperCase())) {

								resultado = aeropuertos.get(i).toString();

								comboBoxResult.addItem(resultado);

							}

						}

						btnBuscar.setText("Volver a Buscar");

						label.setText("");



						txtBuscar.setEditable(false);

					} else if (btnBuscar.getText().equals("Volver a Buscar")) {

						comboBoxResult.removeAllItems();

						btnBuscar.setText("Buscar");

						txtBuscar.setEditable(true);

						label.setText("");

					}

				}



			}

		});

		btnBuscar.setBounds(315, 63, 167, 39);

		contentPane.add(btnBuscar);



	}

}