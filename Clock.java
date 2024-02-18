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

		setFont(new Font("맑은 고딕", Font.BOLD,15));
		setVisible(true);

		Thread thread = new Thread(this); //스레드 생성
		thread.start();

	}

	public void paint(Graphics g){
			SimpleDateFormat sdf = new SimpleDateFormat("a hh시 mm분 ss초"); //시계 형식 설정
			Date d = new Date();
			g.setColor(Color.BLUE);
			g.drawString(sdf.format(d),15,20);
		}



	@Override
	public void run(){
		while(true){ // 과부하 방지를 위해 계속해서 객체 생성하고 지우기

			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			repaint(); // 반복하므로 JPanel이 아닌 Panel을 상속받아 오류 방지하기
		}
	}

}