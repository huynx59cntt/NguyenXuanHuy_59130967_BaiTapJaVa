/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import BaiTap3.SinhVien.SinhVienBiz;
import BaiTap3.SinhVien.SinhVienIT;
import BaiTap3.SinhVien.SinhVienPoly;

/**
 *
 * @author asus
 */
public class BaiTap3Main {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienIT(4, 3, 2, "Nguyen Teo", "FULL-STACK");
        SinhVienIT  sv2 = new SinhVienIT(7, 8, 9, "Nguyen Xuan Huy", "Font-end");
        SinhVienBiz sv3 = new SinhVienBiz(6, 7, "Nguyen Thi Xuan Hoai", "Sales");
        
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
    }
}
