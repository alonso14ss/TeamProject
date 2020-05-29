package display;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	JPanel p_id;
	JLabel la_id;
	JTextField t_id;
	JPanel p_pw;
	JLabel la_pw;
	JPasswordField t_pw;
	JButton bt_login;
	JLabel la_reg;
	
	JPanel background; //배경이미지
	ImageIcon icon;
	
	GameMain gameMain;
	
	public Login() {
		p_id = new JPanel();
		p_id.setPreferredSize(new Dimension(200,30));
		la_id  = new JLabel("   ID");
		t_id = new JTextField(10);
		p_pw= new JPanel();
		p_pw.setPreferredSize(new Dimension(200,30));
		la_pw = new JLabel("PW");
		t_pw = new JPasswordField(10);
		bt_login = new JButton("로그인");
		bt_login.setPreferredSize(new Dimension(140,30));
		bt_login.setFont(new Font("돋움", Font.BOLD, 20));
		la_reg = new JLabel("회원가입");
		
		setLayout(new FlowLayout());
		
		p_id.add(la_id);
		p_id.add(t_id);
		p_pw.add(la_pw);
		p_pw.add(t_pw);
		add(p_id);
		add(p_pw);
		add(bt_login);
		add(la_reg);
		
		setSize(200,180);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bt_login.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Login.this, "로그인");
				new GameMain();
			}
		});
		
		la_reg.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Login.this, "회원가입");
			}
		});
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
