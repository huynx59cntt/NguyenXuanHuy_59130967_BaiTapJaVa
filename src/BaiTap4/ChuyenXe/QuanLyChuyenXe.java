/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4.ChuyenXe;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class QuanLyChuyenXe {
    
   
    ArrayList<ChuyenXe> ds  = new ArrayList<ChuyenXe>();

    public QuanLyChuyenXe() {
    }

    public void themChuyenXe(ChuyenXe CX)
    {
        ds.add(CX);
    }
    
    public void thongtinDSCX(){
        for(var x: ds)
        {
            x.xuat();
        } 
    }
   
    public double tongDTNoiThanh(){
        double tong = 0;
        for(var x: ds)
        {
            if(x instanceof ChuyenXeNoiThanh)
                tong += ((ChuyenXeNoiThanh) x).doanhThu;
        }
        return tong;
    }
      public double tongDTNgoaiThanh(){
        double tong = 0;
        for(var x: ds)
        {
            if(x instanceof ChuyenXeNgoaiThanh)
                tong += ((ChuyenXeNgoaiThanh) x).doanhThu;
        }
        return tong;
    }
     public double tongDTCaHai() {
        double tong = 0; 
          for (var x :ds) 
          {
             tong += x.doanhThu; 
         }
        return tong;
    }
}
