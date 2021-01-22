package View;

import Controller.DataConnection;
import Controller.ControllGetData;
import Controller.ControllFind;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NhaCungCapJPanel extends javax.swing.JPanel {
    
    public NhaCungCapJPanel() {
        initComponents();
        ControllGetData JTable=new ControllGetData(jtbNhaCungCap);
        JTable.getData_NCC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTT = new javax.swing.JLabel();
        jLabelInput = new javax.swing.JLabel();
        jtf_NCC = new javax.swing.JTextField();
        jbt_timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNhaCungCap = new javax.swing.JTable();
        jbt_xoaNCC = new javax.swing.JButton();
        jbt_capnhat = new javax.swing.JButton();
        jbt_themNCC = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 576));

        jLabelTT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTT.setText("THÔNG TIN NHÀ CUNG CẤP");
        jLabelTT.setToolTipText("");
        jLabelTT.setMaximumSize(new java.awt.Dimension(123, 14));
        jLabelTT.setMinimumSize(new java.awt.Dimension(123, 14));
        jLabelTT.setPreferredSize(new java.awt.Dimension(123, 14));

        jLabelInput.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelInput.setText("Nhập tên NCC hoặc mã NCC:");
        jLabelInput.setMaximumSize(new java.awt.Dimension(160, 14));
        jLabelInput.setMinimumSize(new java.awt.Dimension(160, 14));
        jLabelInput.setPreferredSize(new java.awt.Dimension(160, 14));

        jtf_NCC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_NCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_NCCActionPerformed(evt);
            }
        });

        jbt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_timkiem.setText("Tìm kiếm");
        jbt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_timkiemActionPerformed(evt);
            }
        });

        jtbNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(jtbNhaCungCap);

        jbt_xoaNCC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_xoaNCC.setText("Xóa NCC");
        jbt_xoaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_xoaNCCActionPerformed(evt);
            }
        });

        jbt_capnhat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_capnhat.setText("Cập nhật thông tin");
        jbt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_capnhatActionPerformed(evt);
            }
        });

        jbt_themNCC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_themNCC.setText("Thêm NCC");
        jbt_themNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_themNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addComponent(jLabelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jbt_timkiem))
                            .addComponent(jLabelTT, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbt_themNCC)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_capnhat)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_xoaNCC)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_timkiem))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_xoaNCC)
                    .addComponent(jbt_capnhat)
                    .addComponent(jbt_themNCC))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_timkiemActionPerformed
  
        ControllFind tfc=new ControllFind(jtbNhaCungCap);
        tfc.find_NCC(jtf_NCC.getText());
    }//GEN-LAST:event_jbt_timkiemActionPerformed

    private void jtf_NCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_NCCActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_jtf_NCCActionPerformed

    private void jbt_themNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_themNCCActionPerformed
        ThemNCCJFrame add = new ThemNCCJFrame();
        add.setResizable(false);
        add.setVisible(true);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_themNCCActionPerformed

    private void jbt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_capnhatActionPerformed
        CapNhatNCCJFrame cn = new CapNhatNCCJFrame();
        cn.setResizable(false);
        cn.setVisible(true);
        cn.pack();
        cn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int row=jtbNhaCungCap.getSelectedRow();
        if(row>-1){
          cn.jtfID().setText((String) jtbNhaCungCap.getValueAt(row,0));
          cn.jtfID().setEditable(false);
          cn.jtfName().setText((String) jtbNhaCungCap.getValueAt(row, 1));
          cn.jtfSDT().setText((String) jtbNhaCungCap.getValueAt(row, 2));
          cn.jtfDC().setText((String) jtbNhaCungCap.getValueAt(row,3));
        }
    }//GEN-LAST:event_jbt_capnhatActionPerformed

    private void jbt_xoaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_xoaNCCActionPerformed
        int n=JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa nhà cung cấp này chứ?",null, JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            int row=jtbNhaCungCap.getSelectedRow();
            if(row>-1){
                PreparedStatement pStmt=null;
                DataConnection con=new DataConnection();
                Connection c=con.getConnection();
                try{
                pStmt=c.prepareStatement("delete from nhacungcap where Ma_NCC=?");
                pStmt.setString(1, (String) jtbNhaCungCap.getValueAt(row,0));
                pStmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Xóa thành công!");
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Xóa không thành công!");
                }
            }
        }
        
    }//GEN-LAST:event_jbt_xoaNCCActionPerformed
                                         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelInput;
    private javax.swing.JLabel jLabelTT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_capnhat;
    private javax.swing.JButton jbt_themNCC;
    private javax.swing.JButton jbt_timkiem;
    private javax.swing.JButton jbt_xoaNCC;
    private javax.swing.JTable jtbNhaCungCap;
    private javax.swing.JTextField jtf_NCC;
    // End of variables declaration//GEN-END:variables
}
