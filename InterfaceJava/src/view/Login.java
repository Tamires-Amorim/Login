package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txtLogin;
	private JButton btnEntrar;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException  | javax.swing.UnsupportedLookAndFeelException ex) {
	           System.err.println(ex);
	        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(108, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(108, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(108, 127, 206, 28);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))){
					JOptionPane.showMessageDialog(null, "Bem, vindo ao sistema!");
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos!");
				}
				
			}
		});
		btnEntrar.setBounds(167, 237, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(108, 180, 206, 28);
		frame.getContentPane().add(txtSenha);
	}

	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario")&& senha.equals("123");
	}
}
