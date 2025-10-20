import java.util.Scanner;
public class DienThoaiCoDien extends CUAHANGDIENTHOAI{
    private static Scanner sc = new Scanner(System.in);
    private String banphim;
    private String thoigianthoai;
    public DienThoaiCoDien(){}
    public DienThoaiCoDien(String masp,String tensp,int soluong,String donvitien,float dongia,String banphim, String thoigianthoai){
        super(masp,tensp,soluong,donvitien,dongia);
        this.banphim = banphim;
        this.thoigianthoai = thoigianthoai;
    }
    public DienThoaiCoDien(DienThoaiCoDien other){
        super(other);
        this.banphim = banphim;
        this.thoigianthoai = thoigianthoai;
    }
    public String setBanPhim(){
        return banphim;
    }
    public void getBanPhim(String banphim){
        this.banphim = banphim;
    }
    public String setThoiGianThoai(){
        return thoigianthoai;
    }
    public void getThoiGianThoai(String thoigianthoai){
        this.thoigianthoai = thoigianthoai;
    }
    @Override public void nhap(){
        System.out
    }
}