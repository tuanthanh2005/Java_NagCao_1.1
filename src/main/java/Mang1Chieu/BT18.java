/*
 * Bài 18: Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤50) từ bàn
phím.
a. Xuất mảng ra màn hình
b. Liệt kê các phần tử không phải số nguyên tố
c. Tính giá trị trung bình của phần tử là số nguyên tố.
 */
package Mang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT18 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n;
        System.out.println("Nhap So Nguyen N:");
        n = sc.nextInt();
        // cấp phát số phần tử cho mảng
        a = new int[n];
        nhapMang(a,sc);
        xuatMang(a,sc);
        khongPhaiSoNguyenTo(a);
        
        
        
        
        double tinhTrungBinhsnt=tinhTrungBinhSNT(a);
        System.out.println("Trung Binh Cua So Nguyen To la"+ tinhTrungBinhsnt);
             
    

        // tính tổng mảng
    }

    public static int docPhantu(Scanner sc) {
        int n = 0;
        do {
            System.out.println("nhập vào mảng số nguyên có n phần tử (1≤n≤20)");
            n = sc.nextInt();
        } while (n <= 0 || n > 50);
        return n;
    }

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a:[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a, Scanner sc) {
        for (double x : a) {
            System.out.print(x + " ");
        }

    }

    public static boolean isPrime(int num) {
      if (num < 2) return false; // Số nhỏ hơn 2 không phải là số nguyên tố
        for (int i = 2; i * i <= num; i++) { // Kiểm tra từ 2 đến căn bậc hai của num
            if (num % i == 0) return false; // Nếu num chia hết cho i, không phải số nguyên tố
        }
        return true; // Nếu không có ước số nào khác ngoài 1 và chính num, thì num là số nguyên tố
    }

 
   public static void khongPhaiSoNguyenTo(int[] a){
        // Liệt kê các phần tử không phải số nguyên tố
        System.out.print("Cac phan tu khong phai so nguyen to la: ");
        for (int x : a) {
            if (!isPrime(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
}
   public static double tinhTrungBinhSNT(int[] a) {
         int sum = 0;
        int count = 0;
        for (int x : a) {
            if (isPrime(x)) {
                sum += x;
                count++;
            }
             
        }     
 return (count >0)? (double) sum/count:-1;
}
}