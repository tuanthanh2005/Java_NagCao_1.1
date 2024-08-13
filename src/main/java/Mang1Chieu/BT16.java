/*
 Bài 16: Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤20) từ bàn
phím.
a. Xuất mảng ra màn hình
b. Tính tổng giá trị các phần tử của mảng
c. Đếm có bao nhiêu số dương lẻ
d. Tìm phần tử lớn nhất của mảng

 */
package Mang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;int []a;
        System.out.println("Nhap So Nguyen N:");
        n=sc.nextInt();
        // cấp phát số phần tử cho mảng
        a=new int[n];
        nhapMang(a,sc);
        xuatMang(a,sc);
        int sum=tinhTongMang(a);
        System.out.println("Tong gia tri cac phan tu là"+sum);
        int dem_duong_le=demDuongLe(a);
        System.out.println("Cac so le duong là "+dem_duong_le);
        int max=timMax(a);
        System.out.println("Phan tu lon nhat cua mang la"+ max);
       
       
       
       
       
        // tính tổng mảng
    }
    public static int docPhantu(Scanner sc){
        int n=0;
           do {            
               System.out.println("nhập vào mảng số nguyên có n phần tử (1≤n≤20)");
               n=sc.nextInt();
        } while (n<=0||n>20);
           return n;
         }       
       
    
     public static void nhapMang(int[] a,Scanner sc){
           for (int i = 0; i < a.length; i++) {
               System.out.print("Nhap a:["+i+"]:");
               a[i]=sc.nextInt();
         }       
       }
         public static void xuatMang(int[] a,Scanner sc){
             for (int x : a) {
                 System.out.print(x+" ");
             }
     
       }           
       public static int tinhTongMang(int[] a){
           int sum =0;
           for (int x : a) {
               sum +=x;
           }
           return sum;
       }
      // Đếm có bao nhiêu số dương lẻ
       public static int demDuongLe(int[]a){
           int dem_duong_le=0;
           for (int x : a) {
               if (x>0&&x%2!=0) {
                   dem_duong_le++;
               }
           }
        return dem_duong_le;
    }
       // tìm phần tử max trong mảng
       
       public static int timMax(int[] a){
           int max=a[0];
           for (int i = 0; i < a.length; i++) {
               if (a[i]>max) {
                   max=a[i];
               }
           }
           return max;
       }
}
