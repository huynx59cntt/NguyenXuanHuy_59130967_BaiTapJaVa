/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2.NhanVien;

/**
 *
 * @author asus
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double luong;
    int tonggiolam;
   //constructor 
    public NhanVien(){}

    public NhanVien(String ten, int tuoi, String diachi, double luong, int tonggiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tonggiolam = tonggiolam;
    }
 
    // set
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }

    public int getTonggiolam() {
        return tonggiolam;
    }
    //trả về thông tin Nhân viên
    public String getTT(){
        return  "ten: "+ ten +"\n"
                + "tuoi: " + tuoi +"\n"
                + "diachi: " + diachi +"\n"
                + "luong: " + luong + "\n"
                + "tonggiolam: " + tonggiolam;
    }
    //tính lương
    public double tinhThuong(){
        if (tonggiolam>=200) return luong *0.2;
        else if(tonggiolam<200 && tonggiolam>=100)  return luong *0.1;
             else return 0; 
 
    }
    
}
