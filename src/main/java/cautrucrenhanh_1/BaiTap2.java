/*
// Xếp loai theo điểm
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap2 {
    public static void main(String[] args) {
        double toan , van , anh;
        double dtb ;
        String kq = "";
        System.out.println("Xếp Loại học sinh Yếu , Trung Bình , Khá");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem Toan: = ");
        toan = sc.nextDouble();
        System.out.print("Nhap Diem van: = ");
        van = sc.nextDouble();
        System.out.print("Nhap Diem Anh: = ");
        anh = sc.nextDouble();
        
        
        // thuật toán
        dtb= (toan+van+anh)/3;
        // điều kiện xếp loại
        if (dtb<4) {
            kq="Yeu";    
        }else if(dtb <6.5){
            kq="Trung Binh";    
        }else if(dtb<8){
            kq="Khá";
        }else
            kq="Giỏi";
       
        
       // in kết quả 
        System.out.print("Điểm"+dtb+"Xếp Loại"+kq);
        
        
    }
}
