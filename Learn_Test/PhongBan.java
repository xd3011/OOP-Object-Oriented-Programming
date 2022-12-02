public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public static byte SO_NV_MAX = 100;
    private NhanVien[] listNhanVien;

    public PhongBan(String tenPB){
        listNhanVien = new NhanVien[SO_NV_MAX];
        tenPhongBan = tenPB; soNhanVien = 0;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getTenPhongBan() { 
        return tenPhongBan;
    }

    public void setSoNhanVien(byte soNhanVien) { 
        this.soNhanVien = soNhanVien;
    }

    public byte getSoNhanVien() { 
        return soNhanVien;
    }

    public boolean themNV(NhanVien NhanVien) {
        if (soNhanVien < SO_NV_MAX) {
            listNhanVien[soNhanVien - 1] = NhanVien;   
            soNhanVien++;
            return true;
        }
        else return false;
    }

    public NhanVien xoaNV() {
        if(soNhanVien > 0) {
            NhanVien tmp = listNhanVien[soNhanVien - 1];
            listNhanVien[soNhanVien - 1] = null;
            soNhanVien -= 1;
            return tmp;
        }
        else return null;
    }

    public double tongLuong() {
        double luong = 0.0;
        for(int i = 0; i < soNhanVien; i++) {
            luong += listNhanVien[i].tinhLuong(); 
        }
        return luong;
    }   

    public void inTTin() {
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("So NV: " + soNhanVien);
        System.out.println("Thong tin cac NV: ");
        for(int i = 0; i < soNhanVien; i++) {
            listNhanVien[i].inTTin();
        }
    }
}