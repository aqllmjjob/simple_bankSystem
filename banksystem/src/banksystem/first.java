package banksystem;
import java.sql.*;
//���ݿ���ɾ�Ĳ��������
public class first {
	Connection con=null;
	Statement state=null;
	 ResultSet rs=null;
	//������ݿ�����
	public void fand(){
	try {
		Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		  try {
			con= DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1434;DatabaseName=bank","sa","sa");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
	//��������
	public void insert(String sql){
		this.fand();
		try {
			state = con.createStatement();
		 //����
	        //String sql="insert into banks values('"+b1+"','"+b2+"','"+b3+"')";   //SQL���
				state.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}         //��sql����ϴ������ݿ�ִ��
	        finally{
	        	try {
	        		if (state!=null) {
	        			state.close();
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
	        try {
	        	if (con!=null) {
	        		con.close();	
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}//�ر�ͨ��
	        }
	}
	//�޸����ݿ�
	public void uppdate(String sql){
		this.fand();
		try{
		  state=con.createStatement();   //����
	        //String sql="update banks set name='��ΰ' where acount='����' ";   //SQL���
	        state.executeUpdate(sql);         //��sql����ϴ������ݿ�ִ��
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if (state!=null) {
					state.close();
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	        try {
	        	if (con!=null) {
	        		con.close();
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}//�ر�ͨ��
		}
	}
	//ɾ������
	public void delete(String sql){
		this.fand();
	    try{
        state=con.createStatement();   //����
      //  String sql="delete from banks where name='��ΰ'";   //SQL���
        state.executeUpdate(sql);         //��sql����ϴ������ݿ�ִ��
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
		}
	    finally{
	    	try {
	    		if (state!=null) {
	    			state.close();
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
        try {
        	if (con!=null) {
        		con.close();
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}//�ر�ͨ��
	}
	}
	//��ѯ���ݿ�
	public String[] select(String sql){
		 String arr[]=new String [100];
		    int i=0;
		this.fand();
		try{
		state=con.createStatement();//����
	   // String sql="select * from banks";           //sql���
	    rs=state.executeQuery(sql);     //��sql��䴫�����ݿ⣬���ص�ֵΪһ���ַ�����һ���������� 
	   
	    while(rs.next()){    //next������ȡ���������
	    String s=(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
	                         //getString��n����ȡ��n�е�����
	           arr[i++]=s;                 //���ݿ��е������Ǵ�1��ʼ��
	   
	    }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	    
	    finally{
	    	try {
	    		if (state!=null) {
	    			state.close();
				}
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	    try {
	    	if (rs!=null) {
	    		rs.close();
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	    try {
	    	if (con!=null) {
	    		con.close();
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    }
		return arr;
	}
	//��ѯ���ݿ�
		public String select1(String sql,int i){
			this.fand();
			String yue=null;
			try{
			state=con.createStatement();//����
		   // String sql="select * from banks";           //sql���
		    rs=state.executeQuery(sql);     //��sql��䴫�����ݿ⣬���ص�ֵΪһ���ַ�����һ���������� 
		    
		    while(rs.next()){    //next������ȡ���������
		   yue=(rs.getString(i));
		                         //getString��n����ȡ��n�е�����
		                            //���ݿ��е������Ǵ�1��ʼ��
		    }
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		    
		    finally{
		    	try {
		    		if (state!=null) {
		    			state.close();
					}
					
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
		    try {
		    	if (rs!=null) {
		    		rs.close();	
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		    try {
		    	if (con!=null) {
		    		con.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		    }
		return yue;
		}
}
