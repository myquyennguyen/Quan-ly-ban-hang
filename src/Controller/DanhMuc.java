
package Controller;
import Main.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class DanhMuc {
    private String kind;
    private JPanel jpn;
    private JLabel jlb;
    public DanhMuc(String kind1,JPanel jpn1,JLabel jlb1){
        kind=kind1;
        jpn=jpn1;
        jlb=jlb1;
    }
    public String getKind(){
        return kind;
    }
    public void setKind(String kind1){
        kind=kind1;
    }
    public JPanel getJpn(){
        return jpn;
    }
    public void setJpn(JPanel jpn1){
        jpn=jpn1;
    }
    public JLabel getJlb(){
        return jlb;
    }
    public void setJlb(JLabel jlb1){
        jlb=jlb1;
    }
}
