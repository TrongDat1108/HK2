public class XuLyTaiKhoan {
    TaiKhoan tkDangXuLy;

    public XuLyTaiKhoan(String tenDangNhap, String matKhau) {
        QuanLyTaiKhoan qltk = new QuanLyTaiKhoan("DanhSachTaiKhoan.txt");
        tkDangXuLy = qltk.dangNhap(tenDangNhap, matKhau);
    }

    public boolean kiemTraDangNhap() {
        if (tkDangXuLy == null) {
            return false;
        }
        return true;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (kiemTraDangNhap() == false) {
            return false;
        }
        if (tkDangXuLy.doiMatKhau(matKhauCu, matKhauMoi) == true) {
            return true;
        }
        return false;
    }

    public boolean congDiemThuong(int diemThuong) {
        if (kiemTraDangNhap() == false) {
            return false;
        }
        TaiKhoanVIP tkvip = (TaiKhoanVIP) tkDangXuLy;
        if (tkvip.congDiemThuong(diemThuong) == true) {
            return true;
        }
        return false;
    }

    public String inThongTin() {
        if (kiemTraDangNhap() == false) {
            return "Dang nhap that bai";
        }
        return tkDangXuLy.toString();
    }
}
