import javax.swing.*;
import java.awt.*;

public class kiosk2  extends JPanel
{

	public kiosk2() 
	{
		setLayout(null);
		Clock c = new Clock("clock"); // ������ ����� �ִ� Clock Ŭ���� ��������
		add(c);
	}

	public void paintComponent(Graphics g){
		
		// �������� ���� ����
		g.setFont(new Font("���� ���", Font.BOLD, 13));
		g.drawString("*������ �Ʒ� �¼��� �������Դϴ�.", 20, 50);

	}

	public void paint(Graphics g){
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.BLACK);
		g2.drawRect(20,60,170,110);
		g2.setFont(new Font("���� ���",Font.BOLD, 15));
		g2.drawString("*NOTICE*",25,80);
		g2.setFont(new Font("���� ���",Font.BOLD, 13));

		// ������ Ư¡ �Ұ�
		g2.drawString("-�Һ� ���� O",25,100);
		g2.drawString("-��Ʈ�� ��� O",25,120);
		g2.drawString("-��ȭ ����",25,140);

		g2.drawString("-�¼��� �����ϸ�",225,100);
		g2.drawString(" �������� ��µ˴ϴ�.",225,120);
		g2.drawString("-����: 010-1234-5678",225,150);



	}
}
