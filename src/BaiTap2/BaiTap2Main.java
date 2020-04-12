/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap2.NhanVien.NhanVien;
import BaiTap2.NhanVien.QuanLyNV;

/**
 *
 * @author asus
 */
public class BaiTap2Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyen Xuan Huy",21,"Ninh Thuan",220000,210);
        NhanVien nv2 = new NhanVien("Nguyen Xuan Hoang",23,"Khanh Hoa",20000,80);
        NhanVien nv3 = new NhanVien("Nguyen Thi Xuan Hoai",23,"Ninh Thuan",12000,120);
        NhanVien nv4 = new NhanVien("Nguyen Xuan Hai",20,"Nha Trang",20000,232);
        NhanVien nv5 = new NhanVien("Nguyen Thi Xuan Huong",19,"Cam Ranh",13400,141);
   
        QuanLyNV ds = new QuanLyNV();
        ds.them(nv1);
        ds.them(nv2);
        ds.them(nv3);
        ds.them(nv4);
        ds.them(nv5);
        ds.inDS();
    }
}
