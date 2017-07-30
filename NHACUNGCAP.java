package ONgiaodien;
public class NHACUNGCAP
{
    private String MaNhaCC;
    private String TenNhaCC;
    private int SDT;
    
    public NHACUNGCAP()
    {
        
    }
        public NHACUNGCAP(String MaNhaCC, String TenNhaCC, int SDT)
    {
        this.MaNhaCC=MaNhaCC;
        this.TenNhaCC=TenNhaCC;
        this.SDT = SDT;
    }
        public String getMaNhaCC()
    {
        return MaNhaCC;
    }
    public String getTenNhaCC()
    {
        return TenNhaCC;
    }
    public int getSDT()
    {
        return SDT;
    }
    public void setMaNhaCC(String MaNhaCC)
    {
        this.MaNhaCC=MaNhaCC;
    }
    public void setTenNhaCC(String TenNhaCC)
    {
        this.TenNhaCC=TenNhaCC;
    }
    public void setSDT(int SDT)
    {
        this.SDT=SDT;
    }

}
