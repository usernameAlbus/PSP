import java.awt.BorderLayout;

import java.awt.EventQueue;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.awt.Color;

import java.awt.Font;

import javax.swing.ImageIcon;



public class Main extends JFrame {



	private JPanel contentPane;



	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Main frame = new Main();

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

	public Main() {

		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 321, 114);

		contentPane = new JPanel();

		contentPane.setBackground(Color.WHITE);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JButton BtnBoton1 = new JButton("");

		BtnBoton1.setIcon(new ImageIcon("C:\\Users\\Albus\\Pictures\\EclipseLogo.jpg"));

		BtnBoton1.setFont(new Font("Tahoma", Font.BOLD, 10));

		BtnBoton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				try {

					ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Albus\\eclipse\\java-2018-09\\eclipse\\eclipse.exe");

					pb.start();

				} catch (Exception e) {

					System.out.println("Exception " + e);

				}

			}

		});

		BtnBoton1.setBounds(85, 11, 65, 65);

		contentPane.add(BtnBoton1);

		

		JButton BtnBoton2 = new JButton("");

		BtnBoton2.setIcon(new ImageIcon("C:\\Users\\Albus\\Pictures\\AudacityLogo.png"));

		BtnBoton2.setFont(new Font("Tahoma", Font.BOLD, 10));

		BtnBoton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				try {

					ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Audacity\\audacity.exe");

					pb.start();

				} catch (Exception e) {

					System.out.println("Exception " + e);

				}

			}

		});

		BtnBoton2.setBounds(10, 11, 65, 65);

		contentPane.add(BtnBoton2);

		

		JButton BtnBoton3 = new JButton("");

		BtnBoton3.setIcon(new ImageIcon("C:\\Users\\Albus\\Pictures\\AndroidStudioLogo.jpg"));

		BtnBoton3.setFont(new Font("Tahoma", Font.BOLD, 10));

		BtnBoton3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe");

					pb.start();

				} catch (Exception e1) {

					System.out.println("Exception " + e1);

				}

			}

		});

		BtnBoton3.setBounds(160, 11, 65, 65);

		contentPane.add(BtnBoton3);

		

		JButton BtnBoton4 = new JButton("");

		BtnBoton4.setIcon(new ImageIcon("C:\\Users\\Albus\\Pictures\\ChromeLogo.png"));

		BtnBoton4.setFont(new Font("Tahoma", Font.BOLD, 10));

		BtnBoton4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

					pb.start();

				} catch (Exception e1) {

					System.out.println("Exception " + e1);

				}

			}

		});

		BtnBoton4.setBounds(235, 11, 65, 65);

		contentPane.add(BtnBoton4);

	}

}