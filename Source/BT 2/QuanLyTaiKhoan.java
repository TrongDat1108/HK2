import java.util.*;
import java.io.*;

public class QuanLyTaiKhoan {
    private ArrayList<TaiKhoan> tkList;

    public QuanLyTaiKhoan(String path) {
        this.tkList = docDanhSachTaiKhoan(path);
    }

    public ArrayList<TaiKhoan> docDanhSachTaiKhoan(String path) {
        ArrayList<TaiKhoan> index = new ArrayList<TaiKhoan>();

        try {
            File file = new File(path);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                if (tokens.length == 3) {
                    TaiKhoan taiKhoan = new TaiKhoan(tokens[0], tokens[1], tokens[2]);
                    index.add(taiKhoan);
                } else if (tokens.length == 4) {
                    TaiKhoanVIP taiKhoanVIP = new TaiKhoanVIP(tokens[0], tokens[1], tokens[2],
                            Integer.parseInt(tokens[3]));
                    index.add(taiKhoanVIP);
                }
            }
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return index;
    }

    public TaiKhoan dangNhap(String tenDangNhap, String matKhau) {
        for (TaiKhoan taiKhoan : tkList) {
            if (taiKhoan.getTenDangNhap().equals(tenDangNhap) && taiKhoan.kiemTraDangNhap(matKhau)) {
                return taiKhoan;
            }
        }
        return null;
    }
}