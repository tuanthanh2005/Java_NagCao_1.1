/*
x   Nhập 3 số nguyên in ra số nhỏ nhất
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap3 {
    public static void main(String[] args) {
        int a , b , c;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải bài Nhập 3 Số nguyên in ra số nhỏ nhất");
        System.out.print("Nhap so nguyen a = ");
        a=sc.nextInt();
        System.out.print("Nhap so nguyen b = ");
        b=sc.nextInt();
        System.out.print("Nhap so nguyen c = ");
        c=sc.nextInt();
        
        
        // thuật toán
        int min = a;
        if(b<min)
        {
          min=b; 
        }
        if(c<min)
        {
          min =c;
        }
        
        System.out.println("Xuất Kết Quả Min: = "+ min);
        
        
    }
}
