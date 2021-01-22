
package View;

import Controller.ControllGetData;
import Controller.ControllFind;
import Controller.DataConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JTable;
import View.MainJFrame;
import Main.Main;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import View.TKHangDaBanJFrame;
import java.sql.CallableStatement;
import java.util.Vector;

public class HangHoaJPanel extends javax.swing.JPanel {
    public HangHoaJPanel() {
        initComponents();
        ControllGetData JTable=new ControllGetData(jtbHangHoa);
        JTable.getData_HH();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jtfHangHoa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbHangHoa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbt_xoahh = new javax.swing.JButton();
        jbt_capnhathh = new javax.swing.JButton();
        jbt_themhh = new javax.swing.JButton();
        jbt_nhaphang = new javax.swing.JButton();
        jbt_thongke = new javax.swing.JButton();
        jbt_hangtonkho = new javax.swing.JButton();
        jbt_timkiem = new javax.swing.JButton();
        jbt_loaihh = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 576));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN HÀNG HÓA");
        jLabel1.setMaximumSize(new java.awt.Dimension(123, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(123, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(123, 14));

        jLabelName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelName.setText("Nhập tên hàng hóa, mã hàng hóa hoặc mã loại:");
        jLabelName.setMaximumSize(new java.awt.Dimension(160, 14));
        jLabelName.setMinimumSize(new java.awt.Dimension(160, 14));
        jLabelName.setPreferredSize(new java.awt.Dimension(160, 14));

        jtfHangHoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtbHangHoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbHangHoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng hóa", "Tên hàng hóa", "Mã loại", "Mã nhà phân phối", "Giá"
            }
        ));
        jScrollPane3.setViewportView(jtbHangHoa);

        jbt_xoahh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_xoahh.setText("Xóa hàng hóa");
        jbt_xoahh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_xoahhActionPerformed(evt);
            }
        });

        jbt_capnhathh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_capnhathh.setText("Cập nhật thông tin");
        jbt_capnhathh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_capnhathhActionPerformed(evt);
            }
        });

        jbt_themhh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_themhh.setText("Thêm hàng hóa");
        jbt_themhh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_themhhActionPerformed(evt);
            }
        });

        jbt_nhaphang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_nhaphang.setText("Nhập hàng");
        jbt_nhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_nhaphangActionPerformed(evt);
            }
        });

        jbt_thongke.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_thongke.setText("Thống kê hàng đã bán");
        jbt_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thongkeActionPerformed(evt);
            }
        });

        jbt_hangtonkho.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_hangtonkho.setText("Hàng tồn kho");
        jbt_hangtonkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_hangtonkhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_themhh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_capnhathh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_xoahh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_nhaphang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_thongke)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_hangtonkho)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_xoahh)
                    .addComponent(jbt_capnhathh)
                    .addComponent(jbt_themhh)
                    .addComponent(jbt_nhaphang)
                    .addComponent(jbt_thongke)
                    .addComponent(jbt_hangtonkho))
                .addGap(40, 40, 40))
        );

        jbt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_timkiem.setText("Tìm kiếm");
        jbt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_timkiemActionPerformed(evt);
            }
        });

        jbt_loaihh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbt_loaihh.setText("Loại hàng hóa");
        jbt_loaihh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_loaihhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(jtfHangHoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jbt_timkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_loaihh)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_timkiem)
                    .addComponent(jtfHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_loaihh))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_timkiemActionPerformed

        ControllFind tfc=new ControllFind(jtbHangHoa);
        tfc.find_HH(jtfHangHoa.getText());
    }//GEN-LAST:event_jbt_timkiemActionPerformed

    private void jbt_xoahhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_xoahhActionPerformed
        int n=JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa hàng hóa này chứ?",null, JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            int row=jtbHangHoa.getSelectedRow();
            if(row>-1){
                PreparedStatement pStmt=null;
                DataConnection con=new DataConnection();
                Connection c=con.getConnection();
                try{
                pStmt=c.prepareStatement("delete from hanghoa where Ma_HH=?");
                pStmt.setString(1, (String) jtbHangHoa.getValueAt(row,0));
                pStmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Xóa thành công!");
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Xóa không thành công!");
                }
            }
        }    
    }//GEN-LAST:event_jbt_xoahhActionPerformed

    private void jbt_capnhathhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_capnhathhActionPerformed
         CapNhatHHJFrame JF=new CapNhatHHJFrame();
         JF.setResizable(false);
         JF.setVisible(true);
         JF.pack();
         JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         int row=jtbHangHoa.getSelectedRow();
         if(row>-1){
           JF.jtfID().setText((String) jtbHangHoa.getValueAt(row,0));
           JF.jtfID().setEditable(false);
           JF.jtfName().setText((String) jtbHangHoa.getValueAt(row, 1));
           JF.jtfIDL().setText((String) jtbHangHoa.getValueAt(row, 2));
           JF.jtfIDNPP().setText((String) jtbHangHoa.getValueAt(row,3));
           JF.jtfGia().setText(String.valueOf(jtbHangHoa.getValueAt(row, 4)));
           
         }
    }//GEN-LAST:event_jbt_capnhathhActionPerformed

    private void jbt_themhhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_themhhActionPerformed
        JFrame JF=new ThemHHJFrame();
         JF.setResizable(false);
         JF.setVisible(true);
         JF.pack();
         JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_themhhActionPerformed

    private void jbt_nhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_nhaphangActionPerformed
        NhapHangJFrame nh = new NhapHangJFrame();
        nh.setResizable(false);
        nh.setVisible(true);
        nh.pack();
        nh.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_nhaphangActionPerformed

    private void jbt_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thongkeActionPerformed
        // TODO add your handling code here:
        TKHangDaBanJFrame tk=new TKHangDaBanJFrame();
        tk.setResizable(false);
        tk.setVisible(true);
        tk.pack();
        tk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_thongkeActionPerformed

    private void jbt_hangtonkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_hangtonkhoActionPerformed
        // TODO add your handling code here:
        HangTonKhoJFrame HTK=new HangTonKhoJFrame();
        HTK.setResizable(false);
        HTK.setVisible(true);
        HTK.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTable jtb_hangtonkho=HTK.getJTable();
        DataConnection con=new DataConnection();
        Connection c=con.getConnection();
        CallableStatement pStmt=null;
        ResultSet rs=null;
        try{
            pStmt=c.prepareCall("call HANGTONKHO()");
            rs=pStmt.executeQuery();
            String arg[]={"Mã hàng","Tên hàng","Tồn kho"};
            DefaultTableModel model=new DefaultTableModel(arg,0);
            while(rs.next()){
                Vector vector=new Vector();
                vector.add(rs.getString("Ma_HH"));
                vector.add(rs.getString("Ten_HH"));
                vector.add(rs.getString("Ton_Kho"));
                model.addRow(vector);
            }
            jtb_hangtonkho.setModel(model);
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Lỗi!");
        }
    }//GEN-LAST:event_jbt_hangtonkhoActionPerformed

    private void jbt_loaihhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_loaihhActionPerformed
        // TODO add your handling code here:
        LoaiHangHoaJFrame LHH=new LoaiHangHoaJFrame();
        LHH.setVisible(true);
        LHH.setResizable(false);
        LHH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbt_loaihhActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbt_capnhathh;
    private javax.swing.JButton jbt_hangtonkho;
    private javax.swing.JButton jbt_loaihh;
    private javax.swing.JButton jbt_nhaphang;
    private javax.swing.JButton jbt_themhh;
    private javax.swing.JButton jbt_thongke;
    private javax.swing.JButton jbt_timkiem;
    private javax.swing.JButton jbt_xoahh;
    private javax.swing.JTable jtbHangHoa;
    private javax.swing.JTextField jtfHangHoa;
    // End of variables declaration//GEN-END:variables
    

    
}
