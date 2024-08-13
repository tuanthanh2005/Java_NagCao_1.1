/*
Bài 12: Nhập một số nguyên dương n (n > 0). Hãy cho biết chữ số lớn nhất và nhỏ
nhất?
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Nhap So Nguyen N: ");
        n=sc.nextInt();

       // Xuất kết quả
      
        
        
        int max=0;
        int min=9;
       
        
        // dk max &min
         int sonhap=n;
        while (sonhap>0) {
           int so = sonhap%10; // laays so cuoi
            if (so>max) {
                max=so;
            }
            if (so<min) {
                min=so;
            }
            sonhap=sonhap/10; // lay so dau tien    
            
            
              System.out.println("Chữ số lớn nhất là: " + max);
        System.out.println("Chữ số nhỏ nhất là: " + min);
        }
    }
}
