package banksystem;
//���й���ϵͳ��ҳ
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class zhuface extends JFrame implements ActionListener{
JPanel j1=new JPanel();
JButton b1=new JButton("����");
JButton b2=new JButton("�˳�");
public zhuface() {
	// TODO Auto-generated constructor stub
	super();
	this.setTitle("��ӭ�����й����й���ϵͳ��");
	ImageIcon icon=new ImageIcon("../bank//src//yinhang.jpg");
	JLabel label;
	Container container=this.getContentPane();
	container.add(new JLabel(icon),BorderLayout.NORTH);
	j1.add(b1,BorderLayout.EAST);
	j1.add(b2,BorderLayout.WEST);
	container.add(j1,BorderLayout.SOUTH);
	//��Ӽ���
	b1.addActionListener(this);
	b2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	
	// TODO Auto-generated method stub
	if (e.getSource()==b1) {
		//�������밴ť����������й���ϵͳ
		this.setVisible(false);
		zhufacea a=new zhufacea();
		a.pack();
		a.setLocationRelativeTo(null);
		a.setBackground(Color.white);
		a.setDefaultLookAndFeelDecorated(true);
		a.setVisible(true);
		return ;
	}
	else if (e.getSource()==b2) {
		//�����˳�ϵͳ��ʱ�򣬹ر���ʾ����
		JOptionPane.showMessageDialog(this, "��ӭ�´ι��٣�");
		System.exit(0);
	}
}
public static void main(String args[]){
	zhuface z=new zhuface();
	z.pack();
	z.setLocationRelativeTo(null);
	z.setBackground(Color.gray);
	z.setVisible(true);
}
}
