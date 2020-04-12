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
public class ChuyenXe {
    int maSoChuyen;
    String hoTen;
    int soXe;
    double doanhThu;
    //constructor

    public ChuyenXe() {
    }

    public ChuyenXe(int maSoChuyen, String hoTen, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    //set

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    //xuat
    public void xuat(){
        System.out.println("MaSo: " + maSoChuyen + "\n"
                           +"TenTaiXe: " + hoTen  + "\n"
                           +"SO Xe: " + soXe  + "\n"
                           +"Doanh Thu: " + doanhThu);
    }
}
