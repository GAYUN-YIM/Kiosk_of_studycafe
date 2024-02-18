import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class kiosk3  extends JPanel implements ActionListener
{
	// gridlayout의 3번 panel, 소음존 좌석 만들기
	JPanel p1, p2;
	JLabel l1, l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

	public kiosk3() 
	{
		setLayout(new BorderLayout());

		p1 = new JPanel(); // 버튼 배치를 위한 panel
		p2 = new JPanel(); // label 배치를 위한 panel
		l1 = new JLabel("좌석을 선택하세요.");
		l2 = new JLabel("선택하면 화면에 표시됩니다.");
		setSize(400,300);
		p1.setLayout(new GridLayout(3,3));

		// 정숙존 좌석 9개 각각 설정하기(상세한 이벤트 설정을 위해 for문 사용X)
		b1 = new JButton("s1"); // 버튼 생성
		b1.setBackground(new Color(153,204,255)); // 버튼 배경 설정
		b1.setFont(new Font("Arial", Font.BOLD, 20)); // 버튼 폰트 설정
		b1.addActionListener(this); // 이벤트 대기

		// 같은 방식으로 8개 더 설정
		b2 = new JButton("s2");
		b2.setBackground(new Color(153,204,255));
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.addActionListener(this);
		b3 = new JButton("s3");
		b3.setBackground(new Color(153,204,255));
		b3.setFont(new Font("Arial", Font.BOLD, 20));
		b3.addActionListener(this);
		b4 = new JButton("s4");
		b4.setBackground(new Color(153,204,255));
		b4.setFont(new Font("Arial", Font.BOLD, 20));
		b4.addActionListener(this);
		b5 = new JButton("s5");
		b5.setBackground(new Color(153,204,255));
		b5.setFont(new Font("Arial", Font.BOLD, 20));
		b5.addActionListener(this);
		b6 = new JButton("s6");
		b6.setBackground(new Color(153,204,255));
		b6.setFont(new Font("Arial", Font.BOLD, 20));
		b6.addActionListener(this);
		b7 = new JButton("s7");
		b7.setBackground(new Color(153,204,255));
		b7.setFont(new Font("Arial", Font.BOLD, 20));
		b7.addActionListener(this);
		b8 = new JButton("s8");
		b8.setBackground(new Color(153,204,255));
		b8.setFont(new Font("Arial", Font.BOLD, 20));
		b8.addActionListener(this);
		b9 = new JButton("s9");
		b9.setBackground(new Color(153,204,255));
		b9.setFont(new Font("Arial", Font.BOLD, 20));
		b9.addActionListener(this);

		// 버튼 붙이기
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);

		// label 붙이기
		p2.add(l1);
		p2.add(l2);
		
		// panel 위치 설정
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){ // 이벤트 설정
		if (e.getSource() == b1){
			b1.setText("x"); // 버튼을 누르면 좌석 선택 완료로 인해 X표시
			b1.setBackground(Color.RED); // 버튼을 눌러 선택이 완료되면 빨간색으로 바뀜
			l1.setText("s1 좌석이 선택 완료되었습니다."); // 선택된 자석으로 label에 표시
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b2){
			b2.setText("x");
			b2.setBackground(Color.RED);
			l1.setText("s2 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b3){
			b3.setText("x");
			b3.setBackground(Color.RED);
			l1.setText("s3 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b4){
			b4.setText("x");
			b4.setBackground(Color.RED);
			l1.setText("s4 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b5){
			b5.setText("x");
			b5.setBackground(Color.RED);
			l1.setText("s5 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b6){
			b6.setText("x");
			b6.setBackground(Color.RED);
			l1.setText("s6 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b7){
			b7.setText("x");
			b7.setBackground(Color.RED);
			l1.setText("s7 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b8){
			b8.setText("x");
			b8.setBackground(Color.RED);
			l1.setText("s8 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}
		if (e.getSource() == b9){
			b9.setText("x");
			b9.setBackground(Color.RED);
			l1.setText("s9 좌석이 선택 완료되었습니다.");
			l2.setText("좌석 영수증이 출력됩니다.");
		}



	}
	
}
