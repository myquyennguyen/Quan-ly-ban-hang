package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
public class DataConnection {
    public DataConnection(){};
    public Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection("jdbc:mysql://localhost/quanlybanhang?"+"user=root");
            System.out.print("\nNoi ket thanh cong");
        }
        catch(Exception e){
                System.out.print("\nNoi ket khong thanh cong");
                e.printStackTrace();
                }
        return conn;
    }
    
    }
   

