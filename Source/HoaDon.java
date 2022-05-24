import java.util.*;
import java.io.*;

public class HoaDon{
    private ArrayList<SanPham> dsSanPham;

    public HoaDon(String path){
       dsSanPham = docDSSanPham(path);
    }

    public ArrayList<SanPham> docDSSanPham(String path){
        //code here
        return null;
    }

    private String layDonViTinh(String maSP){
        //code here;
        return "";
    }

    public double tinhTongGiaTriHoaDon(){
        //code here
        return 0;
    }

    public void inThongTinSanPham(){
        if(dsSanPham == null){
            System.out.println("Khong co san pham");
            return;
        }
        for(SanPham s : dsSanPham){
           System.out.println(s);
        }
    }
}