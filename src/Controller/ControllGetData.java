
package Controller;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import Controller.DataConnection;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ControllGetData {
    private JTable jtb;
    public ControllGetData(JTable jtb){
        this.jtb=jtb;
    }
    public void getData_KH(){
        try {   
                jtb.removeAll();
                String[] arr={"Mã khách hàng","Họ tên","Ngày sinh","Giới tính","Số điện thoại","Địa chỉ"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                 Statement stmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                stmt = x.createStatement();
                rs = stmt.executeQuery("select * from khachhang");
                while (rs.next()) {
                        Vector vector=new Vector();
                	vector.add(rs.getString("Ma_KH"));
                	vector.add(rs.getString("Ho_Ten"));
                	vector.add(rs.getString("Ngay_Sinh"));
                	vector.add(rs.getString("Gioi_Tinh"));
                	vector.add(rs.getString("So_DT_KH"));
                	vector.add(rs.getString("Dia_Chi_KH"));
                        model.addRow(vector);
                }
                jtb.setModel(model);
                
            } catch (SQLException ex){
               System.out.println("SQLException: " + ex.getMessage());
               JOptionPane.showMessageDialog(null,"Lỗi!");
              } 
      } 
    public void getData_HD(){
    try{
        jtb.removeAll();
        String [] arr={"Mã hóa đơn","Mã khách hàng","Ngày lập"};
        DefaultTableModel model=new DefaultTableModel(arr,0);
        Statement stmt = null;
        ResultSet rs = null;
        DataConnection c=new DataConnection();
        Connection x=c.getConnection();
        stmt = x.createStatement();
        rs = stmt.executeQuery("select * from donhang");
        while(rs.next()){
            Vector vector=new Vector();
            vector.add(rs.getString("Ma_DH"));
            vector.add(rs.getString("Ma_KH"));
            vector.add(rs.getString("Ngay_Lap"));
            model.addRow(vector);
        }
        jtb.setModel(model);
    }catch(SQLException ex){
        System.out.println("SQLException: " + ex.getMessage());
        JOptionPane.showMessageDialog(null,"Lỗi!");
    }
    }
    public void getData_HH(){
        try {   
                jtb.removeAll();
                String[] arr={"Mã hàng hóa","Tên hàng hóa","Mã loại","Mã nhà cung cấp","Giá"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                Statement stmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                stmt = x.createStatement();
                rs = stmt.executeQuery("select * from hanghoa");
                while (rs.next()) {
                        Vector vector=new Vector();
                	vector.add(rs.getString("Ma_HH"));
                	vector.add(rs.getString("Ten_HH"));
                	vector.add(rs.getString("Ma_Loai"));
                	vector.add(rs.getString("Ma_NCC"));
                	vector.add(rs.getInt("Gia"));
                        model.addRow(vector);
                }
                jtb.setModel(model);
                
            } catch (SQLException ex){
               System.out.println("SQLException: " + ex.getMessage());
               JOptionPane.showMessageDialog(null,"Lỗi!");
              } 
    }
    public void getData_NCC(){
        try {   
                jtb.removeAll();
                String[] arr={"Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                Statement stmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                stmt = x.createStatement();
                rs = stmt.executeQuery("select * from nhacungcap");
                while (rs.next()) {
                        Vector vector=new Vector();
                	vector.add(rs.getString("Ma_NCC"));
                	vector.add(rs.getString("Ten_NCC"));
                	vector.add(rs.getString("So_DT_NCC"));
                	vector.add(rs.getString("Dia_Chi_NCC"));
                        model.addRow(vector);
                }
                jtb.setModel(model);
                
            } catch (SQLException ex){
               System.out.println("SQLException: " + ex.getMessage()); 
               JOptionPane.showMessageDialog(null,"Lỗi!");         
              }
    }
    public void getData_HHN(){
        try {   
                jtb.removeAll();
                String[] arr={"Mã hàng hóa", "Ngày nhập hàng", "Số lượng", "Giá nhập"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                Statement stmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                stmt = x.createStatement();
                rs = stmt.executeQuery("select * from nhaphang");
                while (rs.next()) {
                        Vector vector=new Vector();
                	vector.add(rs.getString("Ma_HH"));
                	vector.add(rs.getString("Ngay_Nhap"));
                	vector.add(rs.getString("SL_Nhap"));
                	vector.add(rs.getString("Gia_Nhap"));
                        model.addRow(vector);
                }
                jtb.setModel(model);
                
            } catch (SQLException ex){
               System.out.println("SQLException: " + ex.getMessage());
               JOptionPane.showMessageDialog(null,"Lỗi!");
              }
    }
    public void getData_LOAIHH(){
        try {   
                jtb.removeAll();
                String[] arr={"Mã loại","Tên loại"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                Statement stmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                stmt = x.createStatement();
                rs = stmt.executeQuery("select * from loai");
                while (rs.next()) {
                        Vector vector=new Vector();
                	vector.add(rs.getString("Ma_Loai"));
                	vector.add(rs.getString("Ten_Loai"));
                        model.addRow(vector);
                }
                jtb.setModel(model);
            } catch (SQLException ex){
               System.out.println("SQLException: " + ex.getMessage());  
               JOptionPane.showMessageDialog(null,"Lỗi!");
              }
    }
        
       
  
    
}
    