
package View;

import Controller.DataConnection;
import Controller.ControllGetData;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class NhapHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemHH
     */
    public NhapHangJFrame() {
        initComponents();
        setTitle("Nhập hàng hóa");
        ControllGetData JTable=new ControllGetData(jtbNhapHang);
        JTable.getData_HHN();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelList = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfSL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbNhapHang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfgia_nhap = new javax.swing.JTextField();
        jbt_them = new javax.swing.JButton();
        jbt_xoa = new javax.swing.JButton();
        jbt_thongke = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfthang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfnam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtftongtien = new javax.swing.JTextField();
        jbt_trove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtf_ngay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_thang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_nam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelList.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelList.setText("NHẬP HÀNG HÓA");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã hàng hóa:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ngày nhập hàng:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Số lượng:");

        jtfID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfSL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtbNhapHang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbNhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng hóa", "Ngày nhập hàng", "Số lượng", "Giá nhập"
            }
        ));
        jtbNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbNhapHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbNhapHang);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Giá nhập:");

        jtfgia_nhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jbt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_them.setText("Thêm");
        jbt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_themActionPerformed(evt);
            }
        });

        jbt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_xoa.setText("Xóa");
        jbt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_xoaActionPerformed(evt);
            }
        });

        jbt_thongke.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_thongke.setText("Thống kê");
        jbt_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thongkeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tháng:");

        jtfthang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfthangActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Năm:");

        jtfnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnamActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tổng tiền nhập hàng:");

        jbt_trove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_trove.setText("Trở về");
        jbt_trove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_troveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Ngày:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Tháng:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Năm:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbt_them)
                                .addGap(33, 33, 33)
                                .addComponent(jbt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfSL)
                            .addComponent(jtfID)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfgia_nhap))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbt_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbt_trove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jtfthang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfnam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addComponent(jtftongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelList, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jtf_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jtf_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jtf_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtftongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfgia_nhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_thongke))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_them)
                    .addComponent(jbt_xoa)
                    .addComponent(jbt_trove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbNhapHangMouseClicked
     /*   DefaultTableModel model = (DefaultTableModel) jtbNhapHang.getModel();
        jtfID.setText(model.getValueAt(jtbNhapHang.getSelectedRow(), 0).toString());
       // jtfDate.setText(model.getValueAt(jtbNhapHang.getSelectedRow(), 1).toString());
        jtfSL.setText(model.getValueAt(jtbNhapHang.getSelectedRow(), 2).toString());
        jtfgia_nhap.setText(model.getValueAt(jtbNhapHang.getSelectedRow(), 3).toString()); */
    }//GEN-LAST:event_jtbNhapHangMouseClicked

    private void jbt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_themActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtbNhapHang.getModel();
        Vector vector=new Vector();
        vector.add(jtfID.getText());
        vector.add(jtf_nam.getText()+"-"+jtf_thang.getText()+"-"+jtf_ngay.getText());
        vector.add(jtfSL.getText());
        vector.add(jtfgia_nhap.getText());
        model.addRow(vector);
        DataConnection con=new DataConnection();
        Connection c=con.getConnection();
        PreparedStatement pStmt=null;
        try{
            pStmt=c.prepareStatement("insert into nhaphang values (?,?,?,?)");
            pStmt.setString(1,jtfID.getText());
            pStmt.setString(2,jtf_nam.getText()+"-"+jtf_thang.getText()+"-"+jtf_ngay.getText());
            pStmt.setInt(3,Integer.parseInt( (String) jtfSL.getText()));
            pStmt.setInt(4,Integer.parseInt( (String) jtfgia_nhap.getText()));
            pStmt.executeUpdate();
            jtfID.setText(null);
            jtf_ngay.setText(null);
            jtf_thang.setText(null);
            jtf_nam.setText(null);
            jtfSL.setText(null);
            jtfgia_nhap.setText(null);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Lỗi!");
        }
    }//GEN-LAST:event_jbt_themActionPerformed

    private void jbt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_xoaActionPerformed
        // TODO add your handling code here:
        int n=JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa chứ?",null, JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
        int row=jtbNhapHang.getSelectedRow();
        if(row>-1){
            DataConnection con=new DataConnection();
            Connection c=con.getConnection();
            PreparedStatement pStmt=null;
            String Ma_HH=new String();
            Ma_HH=(String)jtbNhapHang.getValueAt(row,0);
            try{
                pStmt=c.prepareStatement("delete from nhaphang where Ma_HH=?;");
                pStmt.setString(1, Ma_HH);
                pStmt.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) jtbNhapHang.getModel();
                model.removeRow(row);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Lỗi!");
            }
        }
        }
    }//GEN-LAST:event_jbt_xoaActionPerformed

    private void jtfthangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfthangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfthangActionPerformed

    private void jtfnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnamActionPerformed

    private void jbt_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thongkeActionPerformed
        // TODO add your handling code here:
        DataConnection con=new DataConnection();
        Connection c=con.getConnection();
        String[] arr={"Mã hàng hóa","Ngày nhập hàng","Số lượng","Giá nhập"};
        DefaultTableModel model=new DefaultTableModel(arr,0);
        PreparedStatement pStmt=null;
        ResultSet rs = null,rs2=null;
        try{
            pStmt=c.prepareStatement("select * from nhaphang where month(Ngay_Nhap)=? and year(Ngay_Nhap)=?");
            pStmt.setInt(1,Integer.parseInt(jtfthang.getText()));
            pStmt.setInt(2,Integer.parseInt(jtfnam.getText()));
            rs=pStmt.executeQuery();
            while(rs.next()){
                Vector vector=new Vector();
                vector.add(rs.getString("Ma_HH"));
                vector.add(rs.getString("Ngay_Nhap"));
                vector.add(rs.getString("SL_Nhap"));
                vector.add(rs.getString("Gia_Nhap"));
                model.addRow(vector);
            }
            jtbNhapHang.setModel(model);
             CallableStatement cStmt2=null;
             cStmt2=c.prepareCall("{? = call TIENNHAPHANG(?,?)}");
            cStmt2.registerOutParameter(1, Types.INTEGER);
            cStmt2.setString(2,(String)jtfthang.getText());
             cStmt2.setString(3,(String)jtfnam.getText());
            cStmt2.execute();
            int tongtien=cStmt2.getInt(1);
            String s=String.valueOf(tongtien);
            jtftongtien.setText(s);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Lỗi!");
        }
    }//GEN-LAST:event_jbt_thongkeActionPerformed

    private void jbt_troveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_troveActionPerformed
        // TODO add your handling code here:
        jtfthang.setText(null);
        jtfnam.setText(null);
        jtftongtien.setText(null);
        ControllGetData JTable=new ControllGetData(jtbNhapHang);
        JTable.getData_HHN();
    }//GEN-LAST:event_jbt_troveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbt_them;
    private javax.swing.JButton jbt_thongke;
    private javax.swing.JButton jbt_trove;
    private javax.swing.JButton jbt_xoa;
    private javax.swing.JTable jtbNhapHang;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfSL;
    private javax.swing.JTextField jtf_nam;
    private javax.swing.JTextField jtf_ngay;
    private javax.swing.JTextField jtf_thang;
    private javax.swing.JTextField jtfgia_nhap;
    private javax.swing.JTextField jtfnam;
    private javax.swing.JTextField jtfthang;
    private javax.swing.JTextField jtftongtien;
    // End of variables declaration//GEN-END:variables
}
