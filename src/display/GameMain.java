package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GameMain extends JFrame{
	JPanel p_quiz; // 상단 퀴즈 패널
	JLabel la_quiz; //퀴즈 출력 라벨
	JPanel p_contianer; //중단 o,유저 대기지점,x, 정보및 시작,나가기
	JPanel p_left; // o 
	JPanel p_waitRoom;//대기 및 미선택시 유저 아이콘 위치할곳
	JPanel p_right; // x
	JPanel p_info;// 현재 스테이지, 점수, 시작, 나가기 버튼
	JLabel la_myId;
	JLabel la_stage;
	JLabel la_score;
	JButton bt_start;
	JButton bt_exit;
	JPanel p_system; //하단 채팅,시스템 패널
	JTextArea a_chat; //채팅 및 시스템 출력
	JTextField a_input; // 채팅 입력
	
	boolean isMaster = false; //방장 여부 = 버튼 비활성화. 활성화 여부 체크
	public GameMain() {
		p_quiz = new JPanel();
		p_quiz.setPreferredSize(new Dimension(1600,150));
		p_quiz.setBackground(Color.GRAY);
		la_quiz = new JLabel("퀴즈 내용이 출력될 장소!");
		la_quiz.setFont(new Font("궁서", Font.BOLD, 40));
		la_quiz.setHorizontalAlignment(JLabel.CENTER);
		
		
//		p_contianer = new JPanel();
//		p_contianer.setPreferredSize(new Dimension(1600,500));
//		p_contianer.setBackground(Color.PINK);
		p_left = new JPanel();
		p_left.setPreferredSize(new Dimension(450,450));
		p_left.setBackground(Color.RED);
		p_waitRoom = new JPanel();
		p_waitRoom.setPreferredSize(new Dimension(400,450));
		p_waitRoom.setBackground(Color.YELLOW);
		p_right = new JPanel();
		p_right.setPreferredSize(new Dimension(450,450));
		p_right.setBackground(Color.BLUE);
		p_info = new JPanel();
		p_info.setPreferredSize(new Dimension(260,450));
		p_info.setBackground(Color.WHITE);
		la_myId = new JLabel("user id");
		la_myId.setPreferredSize(new Dimension(260,30));
		la_stage = new JLabel("stage");
		la_stage.setPreferredSize(new Dimension(260,30));
		la_score = new JLabel("my score");
		la_score.setPreferredSize(new Dimension(260,30));
		bt_start = new JButton("게임시작");
		bt_start.setPreferredSize(new Dimension(260,100));
		bt_exit = new JButton("나가기");
		bt_exit.setPreferredSize(new Dimension(260,100));
		
		p_system = new JPanel();
		p_system.setPreferredSize(new Dimension(1600,250));
		p_system.setBackground(Color.LIGHT_GRAY);
		a_chat = new JTextArea(10,10);
		a_chat.setPreferredSize(new Dimension(1500,200));
		a_input = new JTextField(100);
		a_input.setPreferredSize(new Dimension(1600,40));
		a_input.setFont(new Font("굴림", Font.PLAIN, 16));
		
		//p_contianer.setLayout(new GridBagLayout());
		p_quiz.setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		p_quiz.add(la_quiz);
		
		p_info.add(la_myId);
		p_info.add(la_stage);
		p_info.add(la_score);
		p_info.add(bt_start);
		p_info.add(bt_exit);
		
		p_system.add(a_chat);
		p_system.add(a_input);
		
		add(p_quiz);
		add(p_left);
		add(p_waitRoom);
		add(p_right);
		add(p_info);
		//add(p_contianer);
		add(p_system);
		
		setSize(1600,900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new GameMain();
	}
}
