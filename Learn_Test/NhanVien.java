public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    public static double luongCoBan = 750000;
    public static double LUONG_MAX = 200000000;

    public static void NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public void setTenNhanVien(String tenNhanVien) { 
        this.tenNhanVien = tenNhanVien;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.setLuongCoBan = setLuongCoBan;
    }

    public void setheSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLUONG_MAX(double LUONG_MAX)) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double LUONG_MAX() {
        return LUONG_MAX;
    }

    public boolean tangLUONG(double luong) {
        heSoLuong += luong;
        if (tinhLuong() > LUONG_MAX) {
            heSoLuong -= luong;
            System.out.println("Can not increase");
            return false;
        }
        else {
            System.out.println("Success");
            return true;
        }
    }

    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

    public inTTin() {
        System.out.println("Ten Nhan Vien: " + tenNhanVien);
        System.out.println("Luong: " + this.tinhLuong());
    }
}