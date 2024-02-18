import java.awt.*;
import javax.swing.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Graphics;
import java.awt.Font;
import java.lang.Thread;

class Clock extends Panel implements Runnable
{

	public Clock(String title){
		setSize(200,25);
		setLayout(new FlowLayout());

		setFont(new Font("���� ���", Font.BOLD,15));
		setVisible(true);

		Thread thread = new Thread(this); //������ ����
		thread.start();

	}

	public void paint(Graphics g){
			SimpleDateFormat sdf = new SimpleDateFormat("a hh�� mm�� ss��"); //�ð� ���� ����
			Date d = new Date();
			g.setColor(Color.BLUE);
			g.drawString(sdf.format(d),15,20);
		}



	@Override
	public void run(){
		while(true){ // ������ ������ ���� ����ؼ� ��ü �����ϰ� �����

			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			repaint(); // �ݺ��ϹǷ� JPanel�� �ƴ� Panel�� ��ӹ޾� ���� �����ϱ�
		}
	}

}