package ONgiaodien;
public class SanPham
{
    private String MaSP;
    private String TenSP;
    private int DonGia;
    public SanPham()
    {
        
    }
    public SanPham(String MaSP, String TenSP, int DonGia)
    {
        this.MaSP=MaSP;
        this.TenSP=TenSP;
        this.DonGia=DonGia;
    }
    public String getMaSP()
    {
        return MaSP;
    }
    public String getTenSP()
    {
        return TenSP;
    }
    public int getDonGia()
    {
        return DonGia;
    }
    public void setMaSP(String MaSP1)
    {
        this.MaSP=MaSP1;
    }
    public void setTenSP(String TenSP1)
    {
        this.TenSP=TenSP1;
    }
    public void setDonGia(int DonGia1)
    {
        this.DonGia=DonGia1;
    }

}
