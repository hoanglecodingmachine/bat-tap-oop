import java.util.Scanner;
import java.util.Arrays;    
public class DanhSachCuaHangDienThoai{
private static Scanner sc = new Scanner(System.in);
private int num;
private CUAHANGDIENTHOAI[] sp;
public DanhSachCuaHangDienThoai(){}
public DanhSachCuaHangDienThoai(int num,CUAHANGDIENTHOAI[] sp){
        this.num = num;
        this.sp = sp;
    }
public int getNum(){
        return num;
    }
public void setNum(int num){
        this.num = num;
        sp = new CUAHANGDIENTHOAI[num];
    }
public CUAHANGDIENTHOAI[] getSP(){
        return sp;
    }
public void setSP(CUAHANGDIENTHOAI[] sp){
        this.sp = sp;
    }
public void nhap(){
        System.out.println("vui long nhap so luong san pham ban dau ");
        num = sc.nextInt();
        sp = new CUAHANGDIENTHOAI[num];
        int i = 0;
        while(i < num){
            int choice = 0;
            System.out.println("nhap lua chon de nhap san pham (1 smartphone , 2 ordinary phone): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
            case 1:
               System.out.println("vui long nhap thong tin cua dien thoai thong minh:");
               sp[i] = new DienThoaiThongMinh();
               sp[i].nhap();
               i++;
               break;
            
            case 2:
                System.out.println("vui long nhap thong tin cua dien thoai co dien:");
                sp[i] = new DienThoaiCoDien();
                sp[i].nhap();
                i++;
                break;
            
            default:
               System.out.println("loi vui long nhap lai ");
               break;
          }
        }
    }
public void xuat(){
        System.out.printf("%50s","danh sach san pham co trong cua hang la ");
        for(int i = 0 ; i < num ; i++){
            sp[i].xuat();
        }
    }
public void ThemSP(CUAHANGDIENTHOAI sp1){
        sp = Arrays.copyOf(sp,num + 1);
        sp[num] = sp1;
        num++;
        System.out.println("Da them san pham thanh cong !");
    }
public void ThemSP() {
    int choice = 0;
    System.out.println("Vui lòng chọn loại sản phẩm cần thêm:");
    System.out.println("1. Smartphone");
    System.out.println("2. Ordinary Phone");
    System.out.print("Lựa chọn của bạn: ");
    choice = sc.nextInt();
    sc.nextLine();

    CUAHANGDIENTHOAI sp1;

    switch (choice) {
        case 1:
            sp1 = new DienThoaiThongMinh();
            System.out.println("Nhập thông tin điện thoại thông minh:");
            sp1.nhap();
            ThemSP(sp1);
            break;

        case 2:
            sp1 = new DienThoaiCoDien();
            System.out.println("Nhập thông tin điện thoại cổ điển:");
            sp1.nhap();
            ThemSP(sp1);
            break;

        default:
            System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            break;
    }
}
public void xoa(String ma){
    boolean found = false;
    for(int i = 0; i < num ; i++){
        if(sp[i].getMaSP().equals(ma)){
          found = true;
          for (int j = i; j < num - 1; j++) {
                sp[j] = sp[j + 1];
            }
          sp = Arrays.copyOf(sp,num - 1);
          num--;
          System.out.println("Da xoa san pham thanh cong ");
          break;
        }
    }
    if(!found){
        System.out.println("khong tim thay san pham ");
    }
}
public void xoa(){
    String ma ;
    System.out.printf("vui long nhap ma san pham de xoa:");
    ma = sc.nextLine();
    xoa(ma);
}
public void sua(String ma, int choice) {
    boolean found = false;
    for (int i = 0; i < num; i++) {
        if (sp[i].getMaSP().equals(ma)) {
            found = true;
            switch (choice) {
                case 1:
                    System.out.println("vui lonng nhap ten san pham moi");
                    sp[i].setTenSP(sc.nextLine());
                    System.out.println("Đã sửa tên thành công!");
                    break;
                case 2:
                    System.out.println("vui long nhap so luong moi ");
                    sp[i].setSoLuong(sc.nextInt());
                    System.out.println("Đã sửa số lượng thành công!");
                    break;
                case 3:
                    System.out.println("vui long nhap don vi tien moi ");
                    sp[i].setDonViTien(sc.nextLine());
                    System.out.println("Đã sửa đơn vị tiền thành công!");
                    break;
                case 4:
                    System.out.println("vui long nhap don gia moi ");
                    sp[i].setDonGia(sc.nextLine());
                    System.out.println("Đã sửa đơn giá thành công!");
                    break;
                case 5:
                    if (sp[i] instanceof DienThoaiThongMinh) {
                        System.out.println("vui long nhap he dieu hanh moi ");
                        ((DienThoaiThongMinh) sp[i]).setHeDieuHanh(sc.nextLine());
                        System.out.println("Đã sửa hệ điều hành thành công!");
                    } else {
                        System.out.println("Sản phẩm này không có hệ điều hành!");
                    }
                    break;
                case 6:
                    if (sp[i] instanceof DienThoaiThongMinh) {
                        System.out.println("nhap dung luong moi cho san pham ");
                        ((DienThoaiThongMinh) sp[i]).setDungLuong(sc.nextLine());
                        System.out.println("Đã sửa dung lượng thành công!");
                    } else {
                        System.out.println("Sản phẩm này không có dung lượng!");
                    }
                    break;
                case 7:
                    if (sp[i] instanceof DienThoaiCoDien) {
                        System.out.println("nhap thoi gian thoai moi cho san pham ");
                        ((DienThoaiCoDien) sp[i]).setBanPhim(sc.nextLine());
                        System.out.println("Đã sửa kiểu bàn phím thành công!");
                    } else {
                        System.out.println("Sản phẩm này không có bàn phím!");
                    }
                    break;
                case 8:
                    if (sp[i] instanceof DienThoaiCoDien) {
                        System.out.println("nhap thoi gian thoai moi cho san pham ");
                        ((DienThoaiCoDien) sp[i]).setThoiGianThoai(sc.nextLine());
                        System.out.println("Đã sửa thời gian thoại thành công!");
                    } else {
                        System.out.println("Sản phẩm này không có thời gian thoại!");
                    }
                    break;
                case 0:
                    sp[i].nhap();
                    System.out.println("sua tat ca thanh cong ");
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
    if (!found) {
        System.out.println("Không tìm thấy sản phẩm có mã: " + ma);
    }
}
public void sua(){
    System.out.println("vui long nhap ma can sua ");
    String ma = sc.nextLine();
    for(int i = 0 ; i < num;i++){
        if(sp[i].getMaSP().equals(ma)){
            System.out.println("da tim thay san pham . Vui long nhap lua chon de sua ");
            System.out.println("1 sua san pham, 2 so luong, 3 don vi tien,4 don gia ,5 he dieu thanh , 6 dung luong , 7 kieu ban phim , 8 thoi gian thoai , 0 sua het ");
            int choice = sc.nextInt();
            sc.nextLine();
            sua(ma,choice); 
        }
    }
}
}