package banksystem;
//ʵ�ֵ�¼����
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
public class zhufacec extends JFrame implements ActionListener {
first f=new first();//���ݿ�Ĳ���
JLabel l2=new JLabel("�������¼�˺ţ��ֻ��ţ�");
JTextField t2=new JTextField();
JLabel l3=new JLabel("�������¼����");
JTextField t3=new JTextField();
JButton b1=new JButton("��¼");
JButton b2=new JButton("ȡ��");
JButton b3=new JButton("������һ��");
JButton b4=new JButton("�˳�");
 zhufacec() {
	// TODO Auto-generated constructor stub
	 super();
	 Container container=this.getContentPane();
	 ImageIcon icon=new ImageIcon("../bank//src//o.jpg");
	 JLabel label=new JLabel(icon);
	 JPanel jPanel=new JPanel();
	 container.add(label, BorderLayout.NORTH);
	 jPanel.setLayout(new GridLayout(4,2));
	 jPanel.add(l2);
	 jPanel.add(t2);
	 jPanel.add(l3);
	 jPanel.add(t3);
	 jPanel.add(b1);
	 jPanel.add(b2);
	 jPanel.add(b3);
	 jPanel.add(b4);
	 container.add(jPanel);
	 //��Ӽ���
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
}
 //ͨ���ͻ��������������������ж����Ƿ�ע��������ע�����
 //��ע���������������Ǯ��ת�˵ȹ��ܵĲ�������
 //��û��ע�ᣬ����Ҫ�˿�ע�����ʾ��
 //Ĭ��һ���ֻ��ź��λ��ͬ���˻�Ϊͬһ���˺�
 //Ĭ�ϵ�¼����Ϊע���������
 public boolean findone(){
	 String s1=t2.getText();
		String s2=t3.getText();
		/*System.out.println(s1);
		System.out.println(s2);*/
		String arr1[]=new String[1024];
	 String sql="select * from banks"; 
	 String arr[]=f.select(sql);
	 int k=0;
	 for(int i=0;i<arr.length;i++){
		 String s0=arr[i];
		 if (s0!=null) {
			 arr1=s0.split(",");
	 for(int j=0;j<arr1.length;j+=3){
		 
		 if (arr1[j]!=null) {
			/* System.out.println(arr1[j]+"  "+arr1[j+1])*/;//ȡ���˻�������
			 if ((arr1[j].equals(s1))&&(arr1[j+1].equals(s2))) {
				 return true;
			}
			
		}
		 else break;
	 }
		}
		 else break;
	 }
	 return false;
	
 }
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			//����˰�ť�������в���ϵͳ
			if(findone()){
				this.setVisible(false);
			zhufaced wZhufaced=new zhufaced();
			wZhufaced.setSize(300, 300);
			wZhufaced.setLocationRelativeTo(null);
			wZhufaced.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			wZhufaced.setDefaultLookAndFeelDecorated(true);
			wZhufaced.setVisible(true);
		
			}
			else{
				
				JOptionPane.showMessageDialog(this, "�û������ڣ����������룡");
				zhuface as=new zhuface();
				
				as.setLocationRelativeTo(null);
				as.setBackground(Color.cyan);
				as.setDefaultLookAndFeelDecorated(true);
				as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				as.setVisible(true);
			}
		}
		else if (e.getSource()==b2) {
			//����˰�ť������������
			JOptionPane.showMessageDialog(this, "��ӭ�´ι��٣�");
			System.exit(0);
			return ;
		}
		else if (e.getSource()==b3) {
			zhufacea wZhufacea=new zhufacea();
			wZhufacea.pack();
			wZhufacea.setLocationRelativeTo(null);
			wZhufacea.setBackground(Color.white);
			wZhufacea.setDefaultLookAndFeelDecorated(true);
			wZhufacea.setVisible(true);
			this.setVisible(false);
			return;
		}
		else if (e.getSource()==b4) {
			JOptionPane.showMessageDialog(this, "��ӭ�´ι��٣�");
			System.exit(0);
			return ;
		}
	}
	public static void main(String[] args) {
		zhufacec wZhufacec=new zhufacec();
		wZhufacec.setSize(400, 400);
		wZhufacec.setLocationRelativeTo(null);
		wZhufacec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wZhufacec.setDefaultLookAndFeelDecorated(true);
		wZhufacec.setVisible(true);
	}

}
