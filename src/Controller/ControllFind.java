
package Controller;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class ControllFind {
    private JTable jtb;
  //  private TextField TField;
    public ControllFind(JTable jtb){
       // this.TField=TField;
        this.jtb=jtb;
    }
    public void find_KH(String text){
        try {   
                jtb.removeAll();
                String[] arr={"Mã khách hàng","Họ tên","Ngày sinh","Giới tính","Số điện thoại","Địa chỉ"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                PreparedStatement pStmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                pStmt = x.prepareStatement("select * from khachhang where Ma_KH like ? or Ho_Ten like ?");
                pStmt.setString(1,"%"+text+"%");
                pStmt.setString(2,"%"+text+"%");
                rs = pStmt.executeQuery();
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
              }
    }
    public void find_HH(String text){
        try {   
                jtb.removeAll();
                String[] arr={"Mã hàng hóa","Tên hàng hóa","Mã loại","Mã nhà phân phối", "Giá"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                PreparedStatement pStmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                pStmt = x.prepareStatement("select * from hanghoa where Ma_HH like ? or Ten_HH like ? or Ma_Loai like ?");
                pStmt.setString(1,"%"+text+"%");
                pStmt.setString(2,"%"+text+"%");
                pStmt.setString(3,"%"+text+"%");
                rs = pStmt.executeQuery();
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
              }
    }
    public void find_NCC(String text){
        try {   
                jtb.removeAll();
                String[] arr={"Mã nhà phân phối","Tên nhà phân phối","Số điện thoại","Địa chỉ"};
                DefaultTableModel model=new DefaultTableModel(arr,0);
                PreparedStatement pStmt = null;
                ResultSet rs = null;
                DataConnection c=new DataConnection();
                Connection x=c.getConnection();
                pStmt = x.prepareStatement("select * from nhacungcap where Ma_NCC like ? or Ten_NCC like ?");
                pStmt.setString(1,"%"+text+"%");
                pStmt.setString(2,"%"+text+"%");
                rs = pStmt.executeQuery();
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
              }
    }
}