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
public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen;
    double soKm;

//constructor    
    public ChuyenXeNoiThanh(int maSoChuyen, String hoTen, int soXe, double doanhThu) {
        super(maSoChuyen, hoTen, soXe, doanhThu);
    }
    public ChuyenXeNoiThanh(int soTuyen, double soKm, int maSoChuyen, String hoTen, int soXe, double doanhThu) {
        super(maSoChuyen, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
  //set 

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
    //xuat

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("SoTuyen: " + soTuyen + "\n"
                            +"SoKM: " + soKm);
    }
}
