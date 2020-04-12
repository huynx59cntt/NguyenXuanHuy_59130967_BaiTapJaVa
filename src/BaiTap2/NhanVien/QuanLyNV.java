/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2.NhanVien;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class QuanLyNV implements IQuanLy{
 
    ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
            
    @Override
    public void them(NhanVien nv) {
        ds.add(nv);
    }

    @Override
    public void inDS() {
        for(var x: ds)
        {
            System.out.println("\n" + x.getTT());
            System.out.println(x.tinhThuong());
        }
    }

 
}
