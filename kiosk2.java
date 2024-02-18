import javax.swing.*;
import java.awt.*;

public class kiosk2  extends JPanel
{

	public kiosk2() 
	{
		setLayout(null);
		Clock c = new Clock("clock"); // 스레드 기능이 있는 Clock 클래스 가져오기
		add(c);
	}

	public void paintComponent(Graphics g){
		
		// 소음존에 대한 설명
		g.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		g.drawString("*오른쪽 아래 좌석은 소음존입니다.", 20, 50);

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

		// 소음존 특징 소개
		g2.drawString("-텀블러 소지 O",25,100);
		g2.drawString("-노트북 사용 O",25,120);
		g2.drawString("-대화 가능",25,140);

		g2.drawString("-좌석을 선택하면",225,100);
		g2.drawString(" 영수증이 출력됩니다.",225,120);
		g2.drawString("-문의: 010-1234-5678",225,150);



	}
}
