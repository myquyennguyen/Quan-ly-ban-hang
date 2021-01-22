
package View;
import Controller.DataConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import Controller.ControllGetData;
import Controller.ControllFind;
import javax.swing.JFrame;
import javax.swing.JTable;
import View.MainJFrame;
import Main.Main;
import javax.swing.table.DefaultTableModel;
import View.CapnhatKHJFrame;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class KhachHangJPanel extends javax.swing.JPanel {
    public KhachHangJPanel() {
        initComponents();
        ControllGetData JTable=new ControllGetData(jtbKhachHang);
        JTable.getData_KH();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfKhachHang = new javax.swing.JTextField();
        jbt_timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbKhachHang = new javax.swing.JTable();
        jbt_themkh = new javax.swing.JButton();
        jbt_capnhat = new javax.swing.JButton();
        jbt_xoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(628, 534));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN KHÁCH HÀNG");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nhập họ tên hoặc mã khách hàng");

        jtfKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKhachHangActionPerformed(evt);
            }
        });

        jbt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_timkiem.setText("Tìm kiếm");
        jbt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_timkiemActionPerformed(evt);
            }
        });

        jtbKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(jtbKhachHang);

        jbt_themkh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_themkh.setText("Thêm khách hàng");
        jbt_themkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_themkhActionPerformed(evt);
            }
        });

        jbt_capnhat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_capnhat.setText("Cập nhật thông tin ");
        jbt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_capnhatActionPerformed(evt);
            }
        });

        jbt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_xoa.setText("Xóa khách hàng");
        jbt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_themkh)
                .addGap(30, 30, 30)
                .addComponent(jbt_capnhat)
                .addGap(30, 30, 30)
                .addComponent(jbt_xoa)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jtfKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jbt_timkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_timkiem))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_xoa)
                    .addComponent(jbt_capnhat)
                    .addComponent(jbt_themkh))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKhachHangActionPerformed

    private void jbt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_timkiemActionPerformed
        // TODO add your handling code here:
        ControllFind tfc=new ControllFind(jtbKhachHang);
        tfc.find_KH(jtfKhachHang.getText());
    }//GEN-LAST:event_jbt_timkiemActionPerformed

    private void jbt_themkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_themkhActionPerformed
        // TODO add your handling code here:
        JFrame JF=new ThemKHJFrame();
        //  JF.setResizable(false);
        JF.setVisible(true);
        JF.pack();
        JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_themkhActionPerformed

    private void jbt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_capnhatActionPerformed
        CapnhatKHJFrame JF=new CapnhatKHJFrame();
        JF.setResizable(false);
        JF.setVisible(true);
        // JF.pack();
        JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int row=jtbKhachHang.getSelectedRow();
        if(row>-1){
            JF.jtfma_kh().setText((String) jtbKhachHang.getValueAt(row,0));
            JF.jtfma_kh().setEditable(false);
            JF.jtfhoten().setText((String) jtbKhachHang.getValueAt(row, 1));
            JF.jtfgioitinh().setText((String) jtbKhachHang.getValueAt(row,3));
            JF.jtfsdt().setText((String) jtbKhachHang.getValueAt(row, 4));
            JF.jtfdiachi().setText((String) jtbKhachHang.getValueAt(row, 5));
            //   JF.jtfngaysinh().setText((String) jtbKhachHang.getValueAt(row, 2));
            DataConnection con=new DataConnection();
            Connection c=con.getConnection();
            PreparedStatement pStmt=null,pStmt2=null,pStmt3=null;
            ResultSet rs1=null,rs2=null,rs3=null;
            try{
                pStmt=c.prepareStatement("select day(Ngay_Sinh) ngay from khachhang where Ma_KH=?");
                pStmt.setString(1,(String) jtbKhachHang.getValueAt(row,0));
                rs1=pStmt.executeQuery();
                pStmt2=c.prepareStatement("select month(Ngay_Sinh) thang from khachhang where Ma_KH=?");
                pStmt2.setString(1,(String) jtbKhachHang.getValueAt(row,0));
                rs2=pStmt2.executeQuery();
                pStmt3=c.prepareStatement("select year(Ngay_Sinh) nam from khachhang where Ma_KH=?");
                pStmt3.setString(1,(String) jtbKhachHang.getValueAt(row,0));
                rs3=pStmt3.executeQuery();
                rs1.next();
                JF.jtfngay().setText(String.valueOf(rs1.getInt("ngay")));
                rs2.next();
                JF.jtfthang().setText(String.valueOf(rs2.getInt("thang")));
                rs3.next();
                JF.jtfnam().setText(String.valueOf(rs3.getInt("nam")));
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Lỗi!");
                System.out.println("SQLException: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_jbt_capnhatActionPerformed

    private void jbt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_xoaActionPerformed
        // TODO add your handling code here:
        int n=JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa khách hàng này chứ?",null, JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            int row=jtbKhachHang.getSelectedRow();
            if(row>-1){
                PreparedStatement pStmt=null;
                DataConnection con=new DataConnection();
                Connection c=con.getConnection();
                try{
                    pStmt=c.prepareStatement("delete from khachhang where Ma_KH=?");
                    pStmt.setString(1, (String) jtbKhachHang.getValueAt(row,0));
                    pStmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Xóa thành công!");
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Xóa không thành công!");
                }
            }
        }
    }//GEN-LAST:event_jbt_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_capnhat;
    private javax.swing.JButton jbt_themkh;
    private javax.swing.JButton jbt_timkiem;
    private javax.swing.JButton jbt_xoa;
    private javax.swing.JTable jtbKhachHang;
    private javax.swing.JTextField jtfKhachHang;
    // End of variables declaration//GEN-END:variables
}
