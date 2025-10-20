import java.util.Scanner;

public class CUAHANGDIENTHOAI implements inhapxuat{
  private static final Scanner sc = new Scanner(System.in);
  private String masp;
  private String tensp;
  private int soluong;
  private String donvitien;
  private float dongia;
  public CUAHANGDIENTHOAI(){}
  public CUAHANGDIENTHOAI(String masp,String tensp,int soluong,String donvitien,float dongia){
    this.masp = masp;
    this.tensp = tensp;
    this.soluong = soluong;
    this.donvitien = donvitien;
    this.dongia = dongia;
  }
  public CUAHANGDIENTHOAI(CUAHANGDIENTHOAI other){
    this.masp = other.masp;
    this.tensp = other.tensp;
    this.soluong = other.soluong;
    this.donvitien = other.donvitien;
    this.dongia = other.dongia;
  }
  public String getMaSP(){
    return masp;
  }
  public void SetMaSP(String masp){
    this.masp = masp;
  }
    public String getTenSP(){
    return tensp;
  }
  public void SetTenSP(String tensp){
    this.tensp = tensp;
  }
    public int getSoLuong(){
    return soluong;
  }
  public void SetSoLuong(int soluong){
    this.soluong = soluong;
  }
    public String getDonViTien(){
    return donvitien;
  }
  public void SetDonViTien(String donvitien){
    this.donvitien = donvitien;
  }
    public float getDonGia(){
    return dongia;
  }
  public void SetDonGia(float dongia){
    this.dongia = dongia;
  }
 
  
    public void nhap(){
        System.out.println("nhap ma san pham ");
        masp = sc.nextLine();
        System.out.println("nhap ten san pham ");
        tensp = sc.nextLine();
        System.out.println("nhap so luong san pham ");
        soluong = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap don vi tien (vnd , usd ,euro) ");
        donvitien = sc.nextLine();
        System.out.println("nhap don gia cho san pham ");
        dongia = sc.nextFloat();
        sc.nextLine();
    }
   public static void inTieuDe() {
    System.out.printf("%-15s %-20s %-10s %-10s %-10s%n",
            "Mã SP", "Tên SP", "Số lượng", "Tiền tệ", "Đơn giá");
    System.out.println("--------------------------------------------------------------");
}
public void xuat() {
    System.out.printf("%-15s %-20s %-10d %-10s %-10.2f%n",
            masp, tensp, soluong, donvitien, dongia);
}
  
} 