package banksystem;
//��¼�ɹ���Ը��˺Ž��в���
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class zhufaced extends JFrame implements ActionListener {
JButton b1=new JButton("�鿴���");
JButton b2=new JButton("��Ǯ");
JButton b3=new JButton("ת��");
JButton b4=new JButton("ȡ��");
JButton b5=new JButton("������һҳ");
JButton b6=new JButton("�˳�");
 zhufaced() {
	// TODO Auto-generated constructor stub
	 super();
	 Container container=this.getContentPane();
	 ImageIcon icon=new ImageIcon("../bank//src//q.jpg");
	 JPanel jPanel=new JPanel();
	 JLabel jLabel=new JLabel(icon);
	 container.add(jLabel, BorderLayout.NORTH);
	 jPanel.setLayout(new GridLayout(3,2));
	 jPanel.add(b1);
	 jPanel.add(b2);
	 jPanel.add(b3);
	 jPanel.add(b4);
	 jPanel.add(b5);
	 jPanel.add(b6);
	 container.add(jPanel);
	 //��Ӽ���
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	 b6.addActionListener(this);
}
 //������b1ʱ�Ĳ���
 public void  finda(){
	 JButton b1=new JButton("������");
		JButton b2=new JButton("��ǰ���");
		JButton b3=new JButton("ȷ��");
		JButton b4=new JButton("ȡ��");
//		 public init(){
//			Container container=this.getContentPane();
//		}
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
		//���ú���ȡ���˻�������������ֵ
			chakanyue aCunqian=new chakanyue();
			aCunqian.pack();
			aCunqian.setLocationRelativeTo(null);
			aCunqian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCunqian.setDefaultLookAndFeelDecorated(true);
			this.setVisible(false);
			
			aCunqian.setVisible(true);
		}
		else if (e.getSource()==b2) {
			//���ú������д�Ǯ����������Ǯ��������ʾ�˻����
			cunqian aCunqian=new cunqian();
			aCunqian.pack();
			aCunqian.setLocationRelativeTo(null);
			aCunqian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCunqian.setDefaultLookAndFeelDecorated(true);
			this.setVisible(false);
			
			aCunqian.setVisible(true);
		}
		else if (e.getSource()==b3) {
			//���ת�˹��ܣ�Ҫ����ת�˵��˻��Լ�ת��Ľ����ж�ת��Ľ���Ƿ񳬳����˻������
			//ת�˽�������ʾ�˻����
			zhuanzhang  aCunqian=new zhuanzhang();
			aCunqian.pack();
			aCunqian.setLocationRelativeTo(null);
			aCunqian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCunqian.setDefaultLookAndFeelDecorated(true);
			this.setVisible(false);
			
			aCunqian.setVisible(true);
		}
		else if (e.getSource()==b4) {
			//���ȡ��ܣ�Ҫ���ж������ת�˽���Ƿ񳬳����˻�����
			//ת�˺���ʾ���
			qukuan aCunqian=new qukuan();
			aCunqian.pack();
			aCunqian.setLocationRelativeTo(null);
			aCunqian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCunqian.setDefaultLookAndFeelDecorated(true);
			this.setVisible(false);
			
			aCunqian.setVisible(true);
		}
		else if (e.getSource()==b5) {
			zhufacec wZhufacec=new zhufacec();
			wZhufacec.pack();
			wZhufacec.setLocationRelativeTo(null);
			wZhufacec.setBackground(Color.white);
			wZhufacec.setDefaultLookAndFeelDecorated(true);
			wZhufacec.setVisible(true);
			this.setVisible(false);
			return;
		}
		else if (e.getSource()==b6) {
			JOptionPane.showMessageDialog(this, "��ӭ�´ι��٣�");
			System.exit(0);
			return ;
		}
	}
public static void main(String[] args) {
	zhufaced wZhufaced=new zhufaced();
	wZhufaced.setSize(300, 300);
	wZhufaced.setLocationRelativeTo(null);
	wZhufaced.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	wZhufaced.setDefaultLookAndFeelDecorated(true);
	wZhufaced.setVisible(true);
}
}
