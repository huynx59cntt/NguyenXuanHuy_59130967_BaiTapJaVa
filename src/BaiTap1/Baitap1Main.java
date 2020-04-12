/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import BaiTap1.NhanVien.NhanVien;



/**
 *
 * @author asus
 */
public class Baitap1Main {
    public static void main(String[] args) {
        //khởi tạo constructor ko tham số
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyen Xuan Huy");
        nv1.setTuoi(21);
        nv1.setLuong(100000);
        nv1.setDiachi("Ninh Thuan");
        nv1.setTonggiolam(205);
        //hiển thị nv1
        System.out.println(nv1.getTT()); 
        System.out.println("tien thuong: " + nv1.tinhThuong());
        //khởi tạo constructor có tham số
        NhanVien nv2 = new NhanVien("Nguyen Xuan Hoang",22,"Khanh Hoa",20000,80);
          //hiển thị nv1
        System.out.println("\n\n"+ nv2.getTT()); 
        System.out.println("tien thuong: " + nv2.tinhThuong());
    }
}
