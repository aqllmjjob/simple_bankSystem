package banksystem;
//ʵ��ע��ҳ��
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class zhufaceb extends JFrame implements ActionListener{
	first f=new first();
	zhufacea wZhufacea=new zhufacea();
JLabel l1=new JLabel("������ע���ֻ���(�ֻ��ź�8λ):");
JTextField f1=new JTextField();
JLabel l2=new JLabel("������ע������(8λ):");
JTextField p1=new JTextField();
JLabel l3=new JLabel("���ٴ�����ע������(8λ):");
JTextField p2=new JTextField();
JButton b1=new JButton("ȷ��");
JButton b2=new JButton("ȡ��");
JButton b3=new JButton("������һ��");
JButton b4=new JButton("�˳�");
zhufaceb(){
	super();
	ImageIcon icon=new ImageIcon("../bank//src//zhuce.jpg");
	JLabel label=new JLabel(icon);
	Container container =this.getContentPane();
	JPanel jPanel=new JPanel();
	jPanel.setLayout(new GridLayout(5,2));
	jPanel.add(l1);
	jPanel.add(f1);
	jPanel.add(l2);
	jPanel.add(p1);
	jPanel.add(l3);
	jPanel.add(p2);
	jPanel.add(b1);
	jPanel.add(b2);
	jPanel.add(b3);
	jPanel.add(b4);
	container.add(label, BorderLayout.NORTH);
	container.add(jPanel);
	//���Ӽ���
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==b1) {
			//����˰�ť������ķ����������������ӵ����ݿⱣ��
			try {
				this.find();
				zhufacec wZhufacea=new zhufacec();
				wZhufacea.pack();
				wZhufacea.setLocationRelativeTo(null);
				wZhufacea.setBackground(Color.white);
				wZhufacea.setDefaultLookAndFeelDecorated(true);
				wZhufacea.setVisible(true);
				this.setVisible(false);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
	//��ע����Ϣ�������ݿ�
	public  void find() throws SQLException{

		String s1=f1.getText();
		String s2=p1.getText();
		String s3=p2.getText();
		String s4="0";
		//ͨ���ֻ����жϸ��û��Ƿ�ע���
		 if (s2.equals(s3)&&s1!=""&&s2!=""&&s3!="") {
			 //�ж���������������Ƿ����
			 //�����ȣ������ݴ������ݿ⣬�����˿���ʾע��ɹ�
			 String sql="select * from banks"; 
			 //������ݵ�ʱ��Ӧ�������ĸ��У�ǰ����
			 
			 String sql1="insert into banks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
		f.insert(sql1);
		f.select(sql);
		JOptionPane.showMessageDialog(this, "ע��ɹ���");
		
		}
//		 else if (s1==null||s2==null||s3==null) {
//			 JOptionPane.showMessageDialog(this, "�û�����Ϊ�գ����������룡");
//		}
		 else{
			 //��������������벻��ȣ�
			 //��˴ε����ݲ��������ݿ⣬�����˿���ʾ�������Ҫ������������
			 JOptionPane.showMessageDialog(this, "������������벻��ȣ����������룡");
		 }
		}
		

public static void main(String[] args) {
	zhufaceb as=new zhufaceb();
	as.pack();
	as.setLocationRelativeTo(null);
	as.setBackground(Color.cyan);
	as.setDefaultLookAndFeelDecorated(true);
	as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	as.setVisible(true);
}
}
