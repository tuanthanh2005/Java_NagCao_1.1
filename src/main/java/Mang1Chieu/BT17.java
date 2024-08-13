/*
 Viết chương trình nhập vào mảng số thực có n phần tử (1≤n≤20) từ bàn
phím
a. Xuất mảng ra màn hình
b. Tính trung bình giá trị của mảng
c. Tìm phần tử có giá trị nhỏ nhất mảng
 */
package Mang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a;
        int n;
        System.out.println("Nhap So Nguyen N:");
        n = sc.nextInt();
        
        // cấp phát số phần tử cho mảng
        a = new double[n];
        nhapMang(a,sc);
        xuatMang(a,sc);
         double sum=tinhTrungBinh(a);
         System.out.println("Trung binh gia tri cua phan tu là"+sum);
        double min=timMin(a);
        System.out.println("Phan tu nho nhat cua mang la"+ min);
    

        // tính tổng mảng
    }

    public static double docPhantu(Scanner sc) {
        int n = 0;
        do {
            System.out.println("nhập vào mảng số nguyên có n phần tử (1≤n≤20)");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a:[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(double[] a, Scanner sc) {
        for (double x : a) {
            System.out.print(x + " ");
        }

    }

    public static double tinhTrungBinh(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum/a.length;
    }

    // tìm phần tử max trong mảng
    public static double timMin(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
