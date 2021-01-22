
package Controller;
import View.KhachHangJPanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import View.DonHangJPanel;
import View.HangHoaJPanel;
import View.NhaCungCapJPanel;
import View.MainJFrame;
import java.util.List;

public class ChuyenManHinh {
    private JPanel jpn;
    private String kind="";
    private List<DanhMuc> listDanhMuc = null;
    public ChuyenManHinh(JPanel jpn1){
        this.jpn=jpn1;
    }
    public void setView(JPanel jp,JLabel jl){
        kind="KhachHang";
        jp.setBackground(new Color(0, 51, 204));
        jl.setBackground(new Color(0, 51,204));
        jpn.removeAll();
        jpn.setLayout(new BorderLayout());
        jpn.add(new KhachHangJPanel());
        jpn.validate();
        jpn.repaint();   
    }
    public void setEvent(List<DanhMuc> listDanhMuc) {
     this.listDanhMuc = listDanhMuc;
     for (DanhMuc item : listDanhMuc) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
     }
}

class LabelEvent implements MouseListener {

      private JPanel node;
      private String kindlabelevent;

      private JPanel jpnItem;
      private JLabel jlbItem;

      public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kindlabelevent = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            kind=kindlabelevent;
            switch (kind) {
                case "KhachHang":
                 node = new KhachHangJPanel();
                    break;
                case "HangHoa":
                 node = new HangHoaJPanel();
                    break;
                case "NhaCungCap":
                node= new NhaCungCapJPanel();
                    break;
                case "DonHang":
                        node= new DonHangJPanel();
                        break;   
                default:
                    break;
           }
           jpnItem.setBackground(new Color(0, 51, 204));
           jlbItem.setBackground(new Color(0, 51, 204));
           jpn.removeAll();
           jpn.setLayout(new BorderLayout());
           jpn.add(node);
           jpn.validate();
           jpn.repaint();
           changebackground(kind);
      }

      @Override
      public void mousePressed(MouseEvent e) {
           jpnItem.setBackground(new Color(0, 51, 204));
           jlbItem.setBackground(new Color(0, 51, 204));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(0, 51, 204));
          jlbItem.setBackground(new Color(0, 51, 204));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kind.equalsIgnoreCase(kindlabelevent)) {
                jpnItem.setBackground(new Color(0,102,255));
                jlbItem.setBackground(new Color(0,102,255));
          }
      }
      private void changebackground( String kindlabelevent){
          for(DanhMuc item : listDanhMuc){
              if(item.getKind().equalsIgnoreCase(kindlabelevent))
              { item.getJpn().setBackground(new Color(0, 51, 204));
                  item.getJlb().setBackground(new Color(0, 51, 204));}
          
              else {
                  item.getJpn().setBackground(new Color(0,102,255));
                  item.getJlb().setBackground(new Color(0,102,255));
              }
      }

}
    
}}
