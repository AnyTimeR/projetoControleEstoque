package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuPrincipal {

	private JFrame frmControleDeEstoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frmControleDeEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControleDeEstoque = new JFrame();
		frmControleDeEstoque.setTitle("Controle de Estoque v1.0");
		frmControleDeEstoque.setSize(1920, 1080);
		frmControleDeEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControleDeEstoque.getContentPane().setLayout(null);
	}
}
