import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class kiosk3  extends JPanel implements ActionListener
{
	// gridlayout�� 3�� panel, ������ �¼� �����
	JPanel p1, p2;
	JLabel l1, l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

	public kiosk3() 
	{
		setLayout(new BorderLayout());

		p1 = new JPanel(); // ��ư ��ġ�� ���� panel
		p2 = new JPanel(); // label ��ġ�� ���� panel
		l1 = new JLabel("�¼��� �����ϼ���.");
		l2 = new JLabel("�����ϸ� ȭ�鿡 ǥ�õ˴ϴ�.");
		setSize(400,300);
		p1.setLayout(new GridLayout(3,3));

		// ������ �¼� 9�� ���� �����ϱ�(���� �̺�Ʈ ������ ���� for�� ���X)
		b1 = new JButton("s1"); // ��ư ����
		b1.setBackground(new Color(153,204,255)); // ��ư ��� ����
		b1.setFont(new Font("Arial", Font.BOLD, 20)); // ��ư ��Ʈ ����
		b1.addActionListener(this); // �̺�Ʈ ���

		// ���� ������� 8�� �� ����
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

		// ��ư ���̱�
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);

		// label ���̱�
		p2.add(l1);
		p2.add(l2);
		
		// panel ��ġ ����
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){ // �̺�Ʈ ����
		if (e.getSource() == b1){
			b1.setText("x"); // ��ư�� ������ �¼� ���� �Ϸ�� ���� Xǥ��
			b1.setBackground(Color.RED); // ��ư�� ���� ������ �Ϸ�Ǹ� ���������� �ٲ�
			l1.setText("s1 �¼��� ���� �Ϸ�Ǿ����ϴ�."); // ���õ� �ڼ����� label�� ǥ��
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b2){
			b2.setText("x");
			b2.setBackground(Color.RED);
			l1.setText("s2 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b3){
			b3.setText("x");
			b3.setBackground(Color.RED);
			l1.setText("s3 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b4){
			b4.setText("x");
			b4.setBackground(Color.RED);
			l1.setText("s4 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b5){
			b5.setText("x");
			b5.setBackground(Color.RED);
			l1.setText("s5 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b6){
			b6.setText("x");
			b6.setBackground(Color.RED);
			l1.setText("s6 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b7){
			b7.setText("x");
			b7.setBackground(Color.RED);
			l1.setText("s7 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b8){
			b8.setText("x");
			b8.setBackground(Color.RED);
			l1.setText("s8 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}
		if (e.getSource() == b9){
			b9.setText("x");
			b9.setBackground(Color.RED);
			l1.setText("s9 �¼��� ���� �Ϸ�Ǿ����ϴ�.");
			l2.setText("�¼� �������� ��µ˴ϴ�.");
		}



	}
	
}
