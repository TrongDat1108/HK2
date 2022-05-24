public class Villa extends DichVuLuuTru {
    private String tenVilla;
    private int soPhongNgu;

    public Villa() {
        super();
        tenVilla = "";
        soPhongNgu = 0;
    }

    public Villa(String viTri, double giaCoBan, String tenVilla, int soPhongNgu) {
        super(viTri, giaCoBan);
        this.tenVilla = tenVilla;
        this.soPhongNgu = soPhongNgu;
    }

    @Override
    public double tinhGiaThueCoBan() {
        double giaThueCoBan = 0.0;

        if (this.soPhongNgu <= 2) {
            giaThueCoBan = super.giaCoBan + 3000000;
        }
        if (this.soPhongNgu <= 5 && this.soPhongNgu > 2) {
            giaThueCoBan = super.giaCoBan + 3000000;
            if (this.soPhongNgu > 3) {
                giaThueCoBan = giaThueCoBan + (this.soPhongNgu - 3) * 2000000;
            }
        }
        if (this.soPhongNgu > 5) {
            giaThueCoBan = super.giaCoBan + 3000000;
            if (this.soPhongNgu > 3 && this.soPhongNgu < 6) {
                giaThueCoBan = giaThueCoBan + (this.soPhongNgu - 3) * 2000000;
            }
            if (this.soPhongNgu >= 6) {
                giaThueCoBan = giaThueCoBan + (this.soPhongNgu - 6) * 1000000;
            }
        }
        return giaThueCoBan;
    }
}
