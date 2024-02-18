import javax.swing.*;
import java.awt.*;

public class kiosk1  extends JPanel
{

	public kiosk1() 
	{
		setLayout(null);

	}

	public void paintComponent(Graphics g){
		
		// 스터디 카페 로고 및 정숙존에 대한 설명
		g.setColor(new Color(051,153,255));
		g.fillRect(0,0,400,30);
		g.setColor(Color.BLACK);
		g.setFont(new Font("맑은 고딕",Font.BOLD, 20));
		g.drawString("SMU STUDY CAFE", 10, 20); // 스터디 카페 로고

		g.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		g.drawString("*왼쪽 아래 좌석은 정숙존입니다.", 20, 50); // 정숙존 소개
	}

	public void paint(Graphics g){
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.BLACK);
		g2.drawRect(20,60,170,110);
		g2.setFont(new Font("맑은 고딕",Font.BOLD, 15));
		g2.drawString("*NOTICE*",25,80);
		g2.setFont(new Font("맑은 고딕",Font.BOLD, 13));

		// 정숙존 특징 소개
		g2.drawString("-음식물 반입 X",25,100);
		g2.drawString("-노트북 사용 X",25,120);
		g2.drawString("-대화 금지",25,140);

		g2.drawString("-좌석을 선택하려면",225,100);
		g2.drawString(" 아래 버튼을 누르세요.",225,120);
		g2.setColor(Color.RED);
		g2.drawString("-빨간색 좌석은",225,140);
		g2.setColor(Color.BLACK);
		g2.drawString(" 이미 사용중인 좌석입니다.",225,160);




	}
}
