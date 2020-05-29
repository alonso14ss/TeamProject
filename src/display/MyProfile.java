package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyProfile extends JFrame{
	JPanel profile;
	JPanel myIcon;
	JPanel myStorage;
	JLabel user_id;
	JLabel user_point;
	JLabel user_winrate;
	JTextArea note;
	JPanel p_bt;
	JButton bt_exit;
	
	public MyProfile() {
		profile = new JPanel();
		profile.setPreferredSize(new Dimension(400,900));
		profile.setBackground(Color.LIGHT_GRAY);
		profile.setBorder(BorderFactory.createEmptyBorder(30 ,0 , 0 , 0));
		myIcon = new JPanel();
		myIcon.setPreferredSize(new Dimension(300,300));
		myIcon.setBackground(Color.WHITE);
		user_id = new JLabel("유저 아이디");
		user_id.setPreferredSize(new Dimension(400,40));
		user_id.setHorizontalAlignment(JLabel.CENTER);
		user_point = new JLabel("유저 포인트");
		user_point.setPreferredSize(new Dimension(400,40));
		user_point.setHorizontalAlignment(JLabel.CENTER);
		user_winrate = new JLabel("유저 아이디");
		user_winrate.setPreferredSize(new Dimension(400,40));
		user_winrate.setHorizontalAlignment(JLabel.CENTER);
		myStorage = new JPanel();
		myStorage.setPreferredSize(new Dimension(360,360));
		myStorage.setBackground(Color.PINK);
		
		note = new JTextArea();
		note.setEditable(false);
		note.setText("오답노트가 들어갈 영역");
		
		p_bt = new JPanel();
		p_bt.setPreferredSize(new Dimension(200,900));
		p_bt.setBackground(Color.GRAY);
		p_bt.setLayout(new BorderLayout());
		bt_exit = new JButton("나가기");
		bt_exit.setPreferredSize(new Dimension(180,120));
		
		
		profile.add(myIcon);
		profile.add(user_id);
		profile.add(user_point);
		profile.add(user_winrate);
		profile.add(myStorage);
		
		p_bt.add(bt_exit,BorderLayout.SOUTH);
		
		add(profile, BorderLayout.WEST);
		add(note);
		add(p_bt, BorderLayout.EAST);
		
		setSize(1600,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new MyProfile();
	}
}
