/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import BaiTap4.ChuyenXe.ChuyenXeNgoaiThanh;
import BaiTap4.ChuyenXe.ChuyenXeNoiThanh;
import BaiTap4.ChuyenXe.QuanLyChuyenXe;

/**
 *
 * @author asus
 */
public class BaiTap4Main {
    public static void main(String[] args) {
        ChuyenXeNgoaiThanh cxnt1 = new ChuyenXeNgoaiThanh("Ninh Thuan", 2, 232, "Huy", 6, 200000);
        ChuyenXeNgoaiThanh cxnt2 = new ChuyenXeNgoaiThanh("Binh  Thuan", 6, 54, "Hai", 2, 250000);
        ChuyenXeNgoaiThanh cxnt3 = new ChuyenXeNgoaiThanh("Dong Nai", 2, 52, "Binh", 5, 300000);

        ChuyenXeNoiThanh n_cxnt1 = new ChuyenXeNoiThanh(12, 120, 43, "Hoang", 23, 100000);
        ChuyenXeNoiThanh n_cxnt2 = new ChuyenXeNoiThanh(11, 140, 23, "Hung", 26, 120000);
        ChuyenXeNoiThanh n_cxnt3 = new ChuyenXeNoiThanh(13, 160, 63, "Lim", 28, 130000);
    
        QuanLyChuyenXe ds = new   QuanLyChuyenXe();
        ds.themChuyenXe(cxnt1);
        ds.themChuyenXe(cxnt2);
        ds.themChuyenXe(cxnt3);
        
        ds.themChuyenXe(n_cxnt1);
        ds.themChuyenXe(n_cxnt2);
        ds.themChuyenXe(n_cxnt3);
        ds.thongtinDSCX();
        
        System.out.println("\nTong chuyen xe noi thanh la: "+ ds.tongDTNoiThanh());
        System.out.println("\nTong chuyen xe ngoai thanh la: "+ ds.tongDTNgoaiThanh());
        System.out.println("\nTong 2 chuyen xe la: "+ ds.tongDTCaHai());
        
    }
   
}
