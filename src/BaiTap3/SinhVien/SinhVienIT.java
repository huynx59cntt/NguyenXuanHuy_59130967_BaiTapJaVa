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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    //constructor
    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Diem: " + getDiem() +"\n"
                            +"HocLuc: " + getHocLuc())  ;
    }
}
