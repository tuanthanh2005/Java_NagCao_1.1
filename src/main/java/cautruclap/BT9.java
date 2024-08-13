/*
Bài 9: Viết chương trình đếm số ước số của số nguyên dương N (n>0).
 Ví dụ: N=12
 số ước số của 12 là 6
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BT9 {
    public static void main(String[] args) {
        int n=12;
        int dem;
        Scanner sc = new Scanner (System.in);     
           dem = demcacso(n);
           System.out.println("so uoc cua"+ n +"la: "+dem);
    }
        public static int demcacso(int n){
                                 int dem = 0;
                                 for (int i = 1; i <= n; i++) {
                                     if (n%i==0) {
                                         dem++;
                                     }
                                 }
        return dem;
                              
        }
}
       
         
//    public class CountDivisors {
//
//    public static void main(String[] args) {
//        // Ví dụ: Số nguyên dương N
//        int N = 12; // Bạn có thể thay đổi giá trị này để kiểm tra số khác
//        int count = countDivisors(N);
//        System.out.println("Số ước số của " + N + " là: " + count);
//    }
//
//    // Hàm đếm số ước số của N
//    public static int countDivisors(int N) {
//        int count = 0;
//        
//        // Lặp qua các số từ 1 đến N để kiểm tra ước số
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                count++;
//            }
//        }
//        
//        return count;
//    }
//}


