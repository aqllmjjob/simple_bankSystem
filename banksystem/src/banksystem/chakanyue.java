package banksystem;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
//https://www.cnblogs.com/zhaotiancheng/p/6250184.html
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class chakanyue extends JFrame implements ActionListener {
	JLabel b1=new JLabel("�鿴�����˻�");
	 JTextField t1=new JTextField();
		
		JButton b3=new JButton("ȷ��");
		JButton b4=new JButton("ȡ��");
		 chakanyue(){
		super();	
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(2,2));
		container.add(b1);
		container.add(t1);
		
		container.add(b3);
		container.add(b4);
		//���Ӽ���
		
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		}
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==b3) {
					try {
						Savepoint();	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	
				else if (e.getSource()==b4) {
					this.setVisible(false);
					JOptionPane.showMessageDialog(this,"��ӭʹ�����й���ϵͳ��");
				}
			}
		 //�����ݿ���Ӵ�Ǯ���
		 public void Savepoint()throws SQLException{
			 String string=t1.getText();
			
			int awe=Integer.valueOf(string);
				first f=new first();
				String a1="select * from banks where name='"+string+"'";
				String yue1=(f.select1(a1,4));
				this.setVisible(false);
				JOptionPane.showMessageDialog(this,"���Ϊ��"+yue1);
		 }
		public static void main(String[] args) {
			chakanyue aCunqian=new chakanyue();
			aCunqian.pack();
			aCunqian.setLocationRelativeTo(null);
			aCunqian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCunqian.setDefaultLookAndFeelDecorated(true);
			aCunqian.setVisible(true);
		}
}

