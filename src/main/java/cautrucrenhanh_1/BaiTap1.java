/*
 Giai PT Bac 1 java_nangcao
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap1 {
    public static void main(String[] args) {
        double a,b;
        String kq ="";
        Scanner sc =new Scanner(System.in);
        System.out.println("Giải Phương trình bậc 1");
        System.out.print("Nhập hệ số a = ");
        a=sc.nextDouble();
        System.out.print("Nhập hệ số b = ");
        b=sc.nextDouble();       
        
        // thuật toán
        if (a==0) {
            if (b==0) {
                kq="Phương trình VSN";
            } else {
                kq="Phương trình Vo Ngiem";
            }
        } else {
            kq="Phương trình có nghiệm x= "+ (-b/a);
        }
        
        // in kết quả
        System.out.println(kq);
    }
        
}
