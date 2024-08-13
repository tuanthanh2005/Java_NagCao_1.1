/*
Tính tiền đi taxi từ số km nhập vào. Biết:
a. 1 km đầu giá 15000đ
b. Từ km thứ 2 đến km thứ 5 giá 13500đ
c. Từ km thứ 6 trở đi giá 11000đ
d. Nếu trên 120km được giảm 10% tổng tiền.
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap5 {
    public static void main(String[] args) {
        double n;
        double tong;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Tính tiền đi taxi từ số km nhập vào");
        System.out.print("Nhap so km = ");
        n=sc.nextDouble();
  
        // Thuật toán tính tiền đi taxi
           
           if(n<=1){
               tong=15000;
           }else if(n<=2){
               tong = 15000+(n-1)*13500;
           }else{
               tong= 15000+4*13500+(n-5)*11000;
           }
           // giải tiền giảm
           
           if (n>120) {
               tong = tong*0.9;
            
        }
           System.out.println("Tien Tra"+tong);                     
        
    }
}
