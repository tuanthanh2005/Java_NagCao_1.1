/*
Bài 10: Nhập số nguyên dương n. Kiểm tra n có phải là số nguyên tố không? Ví
dụ: 2, 3, 5, 7
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n ;
        System.out.println("Nhap n la so nguyen to");
        n = sc.nextInt();
        
        
        if (kiemtra(n)) {
            System.out.println("La so nguyen to");
        }else
            System.out.println("Khong phai so nguyen to");
    }
        
        // kiêm tra so nguyen tố
        
        public static boolean kiemtra(int n){
            if (n<=1) {  
               return false;
            }
            if (n==2) {
                return true;
            }
            if (n%2==0) {
                return false;
            }
            
            for (int i = 3; i*i <=n; i=i+2) {
                if (n%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
    