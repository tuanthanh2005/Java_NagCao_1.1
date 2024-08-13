/*
 Bài 4: Nhập vào một số nguyên. Kiểm tra số vừa nhập là số chẵn hay lẻ.
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap4 {
    public static void main(String[] args) {
        int a;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên. Kiểm tra số vừa nhập là số chẵn hay lẻ");
        System.out.print("Nhap so nguyen a = ");
        a=sc.nextInt();
        
        
        // kiểm tra chăn hay lẻ
        
       
        if(a%2==0){
        kq="Số chẳn";
        }else
            kq="Số Lẻ";
        
        
        
        // in kết quả
        
        System.out.println(kq);
    }
}
