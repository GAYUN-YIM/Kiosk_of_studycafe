import javax.swing.*;
import java.awt.*;

public class kiosk1  extends JPanel
{

	public kiosk1() 
	{
		setLayout(null);

	}

	public void paintComponent(Graphics g){
		
		// ���͵� ī�� �ΰ� �� �������� ���� ����
		g.setColor(new Color(051,153,255));
		g.fillRect(0,0,400,30);
		g.setColor(Color.BLACK);
		g.setFont(new Font("���� ���",Font.BOLD, 20));
		g.drawString("SMU STUDY CAFE", 10, 20); // ���͵� ī�� �ΰ�

		g.setFont(new Font("���� ���", Font.BOLD, 13));
		g.drawString("*���� �Ʒ� �¼��� �������Դϴ�.", 20, 50); // ������ �Ұ�
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
		g2.drawString("-���Ĺ� ���� X",25,100);
		g2.drawString("-��Ʈ�� ��� X",25,120);
		g2.drawString("-��ȭ ����",25,140);

		g2.drawString("-�¼��� �����Ϸ���",225,100);
		g2.drawString(" �Ʒ� ��ư�� ��������.",225,120);
		g2.setColor(Color.RED);
		g2.drawString("-������ �¼���",225,140);
		g2.setColor(Color.BLACK);
		g2.drawString(" �̹� ������� �¼��Դϴ�.",225,160);




	}
}
