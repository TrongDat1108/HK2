public class KhachSan extends DichVuLuuTru {
    private String tenKS;
    private int soSao;

    public KhachSan() {
        super();
        tenKS = "";
        soSao = 0;
    }

    public KhachSan(String viTri, double giaCoBan, String tenKS, int soSao) {
        super(viTri, giaCoBan);
        this.tenKS = tenKS;
        this.soSao = soSao;
    }

    @Override
    public double tinhGiaThueCoBan() {
        double giaThue = 0.0;
        if (this.soSao <= 2) {
            giaThue = super.giaCoBan;
        }
        if (this.soSao >= 3) {
            giaThue = super.giaCoBan * 1.1;
        }
        double giaThueCoBan = giaThue + super.tinhThue() * giaThue;
        return giaThueCoBan;
    }
}
