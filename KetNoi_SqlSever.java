package CSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public class KetNoi_SqlSever 
{
    private Connection con;
    public KetNoi_SqlSever() throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String s="jdbc:sqlserver://PHUCCOI\\PHUCCOI;databaseName=KETNOT_SQLSEVER";
        this.con=DriverManager.getConnection(s, "sa", "123456");
    }
    public ResultSet GetData (String tbName) throws SQLException
    {
        ResultSet kq=null;
        Statement statement = this.con.createStatement();
        String sql="select * from SANPHAM";
        kq=statement.executeQuery(sql);
        return kq;
    }
    public void Update(String MaSP,String TenSP,int SoLuong) throws SQLException
    {
        Statement sta= this.con.createStatement();
        String sql1= "Update SANPHAM set TenSP='"+TenSP+"' where MaSP='"+MaSP+"'";
        String sql2= "Update SANPHAM set SoLuong='"+SoLuong+"' where MaSP='"+MaSP+"'";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);
    }
    public void Insert (String TenSP,int SoLuong) throws SQLException
    {
        Statement sta= this.con.createStatement();
        String sql= "INSERT SANPHAM(TenSP,SoLuong) VALUES (N'"+TenSP+","+SoLuong+")";
        sta.executeUpdate(sql);
    }
        public void Delete (String MaSP) throws SQLException
    {
        Statement sta= this.con.createStatement();
        String sql= "DELETE SANPHAM Where MaSP="+MaSP+"";
        sta.executeUpdate(sql);
    }
    public void Close() throws SQLException 
    {
            if(this.con!=null)
                this.con.close();
    }
        
//        public static void Main(String[] args) 
//        {
//            KetNoi_SqlSever con;
//        try {
//            con = new KetNoi_SqlSever(); ResultSet rs=con.GetData("p");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KetNoi_SqlSever.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(KetNoi_SqlSever.class.getName()).log(Level.SEVERE, null, ex);
//        }
//           
//        }
}
