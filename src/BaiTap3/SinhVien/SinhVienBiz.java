/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.SinhVien;

/**
 *
 * @author asus
 */
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(String hoTen, String nganh) {
        super(hoTen, nganh);
    }
    
    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    //set
    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Diem: " + getDiem() +"\n"
                            +"Hoc Luc: " + getHocLuc());
    }
    
    
}
