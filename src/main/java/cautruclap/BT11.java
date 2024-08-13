/*
 Bài 11: Nhập một số nguyên dương n (n > 0). Hãy cho biết n có phải là số đối
xứng? Ví dụ: 121, 12321, ...
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int sodao;
        System.out.println("Nhap so nguyen n: ");
        n=sc.nextInt();
        sodao=sodaon(n);
        if (sodao==n) {
            System.out.println("Doi xung");
        }else
            System.out.println("Khong doi xung");
        // Tìm Số Đối
    }
        
        
        public static int sodaon(int n){
                int sodao=0;
                while (n>0) {
                     sodao=sodao*10+n%10;
                n=n/10;
            }
        return sodao;
               
        }
        
    }

