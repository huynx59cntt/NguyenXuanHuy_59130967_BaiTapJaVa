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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    
    //constructor
    public SinhVienPoly() {
    }
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    //set

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    //get

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    
    
    public abstract  double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5) return "Yeu";
        else if(getDiem()>=5 && getDiem() <6.5) return "Trung Binh";
        else if(getDiem()>=6.5 && getDiem() <7.5) return "Kha";
        else if(getDiem()>=7.5 && getDiem() <9) return "Gioi";
        else return "Xuat Sac";
    }
    public void xuat(){
        System.out.println("Ho va ten: " + hoTen + "\n" + 
                            "Nganh: " + nganh );
    };
}

