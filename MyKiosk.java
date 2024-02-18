import javax.swing.*;
import java.awt.*;

public class MyKiosk 
{
	MyKiosk(String msg){
		JFrame jf = new JFrame(msg);

		jf.setLayout(new GridLayout(2,2)); // 총 4개의 panel 배치


		// 4개가 각각 레이아웃으로
		kiosk1 k1 = new kiosk1();
		jf.add(k1);

		kiosk2 k2 = new kiosk2();
		jf.add(k2);

		kiosk3 k3 = new kiosk3();
		jf.add(k3);

		kiosk4 k4 = new kiosk4();
		jf.add(k4);

		jf.setSize(800, 400);
		jf.setVisible(true);
	}
}
