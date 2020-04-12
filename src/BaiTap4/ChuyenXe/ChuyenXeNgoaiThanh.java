/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4.ChuyenXe;

/**
 *
 * @author asus
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;
    //constructor 

    public ChuyenXeNgoaiThanh(int maSoChuyen, String hoTen, int soXe, double doanhThu) {
        super(maSoChuyen, hoTen, soXe, doanhThu);
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi, int maSoChuyen, String hoTen, int soXe, double doanhThu) {
        super(maSoChuyen, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    
    //set 

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
    
    //xuat

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Noi Den: " + noiDen + "\n"
                           +"SoNgayDi: " + soNgayDi);
    }
    
}
