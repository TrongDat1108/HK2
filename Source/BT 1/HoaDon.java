import java.util.*;
import java.io.*;

public class HoaDon {
    private ArrayList<SanPham> dsSanPham;

    public HoaDon(String path) {
        dsSanPham = docDSSanPham(path);
    }

    public ArrayList<SanPham> docDSSanPham(String path) {
        ArrayList<SanPham> index = new ArrayList<SanPham>();
        try {
            File newFile = new File(path);
            Scanner input = new Scanner(newFile);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                if (this.layDonViTinh(tokens[0]).equals("kg")) {
                    index.add(new TraiCay(tokens[0], tokens[1], layDonViTinh(tokens[0]), Double.parseDouble(tokens[2]),
                            Double.parseDouble(tokens[3])));
                } else if (this.layDonViTinh(tokens[0]).equals("hop")) {
                    index.add(new BanhMut(tokens[0], tokens[1], layDonViTinh(tokens[0]), Double.parseDouble(tokens[2]),
                            Integer.parseInt(tokens[3])));
                }
            }
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
            return null;
        }
        return index;
    }

    private String layDonViTinh(String maSP) {
        // code here;
        if (maSP.startsWith("T")) {
            return "kg";
        }
        return "hop";
    }

    public double tinhTongGiaTriHoaDon() {
        // code here
        double tongTienHoaDon = 0.0;
        for (SanPham sanPham : dsSanPham) {
            tongTienHoaDon = tongTienHoaDon + sanPham.thanhTien() + sanPham.thanhTien() * sanPham.tinhThue();
        }
        return tongTienHoaDon;
    }

    public void inThongTinSanPham() {
        if (dsSanPham == null) {
            System.out.println("Khong co san pham");
            return;
        }
        for (SanPham s : dsSanPham) {
            System.out.println(s);
        }
    }
}