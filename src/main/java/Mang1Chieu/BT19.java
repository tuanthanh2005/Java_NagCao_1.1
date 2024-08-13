/*
Bài 19: Viết chương trình phát sinh mảng số nguyên với giá trị ngẫu nhiên có n
phần tử (1≤n≤20), n nhập từ bàn phím
a. Sắp xếp mảng tăng dần và xuất ra màn hình
b. Nhập số nguyên x. Liệt kê các phần tử là ước số của x.

 */
package Mang1Chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;int []a;int x;
        System.out.println("Nhap So Nguyen N:");
        n=sc.nextInt();
        // cấp phát số phần tử cho mảng
        a=new int[n];
         phatSinhMang(a);
           System.out.println("\n Mang Duoc Phat Sinh");
            xuatMang(a);
            
            sapXepTang(a);
            System.out.println("\n Mang Sau khi sap xep tang: ");
             xuatMang(a);
       
     
       
       
           
           System.out.println("Cac phan tu gia tri x:: ");
           x=sc.nextInt();
           System.out.println("Cac phan tu la uoc: ");
           lietKeUoc(a,x);

       
       
       
       
       
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
         public static void xuatMang(int[] a){
             for (int x : a) {
                 System.out.print(x+" ");
             }
     
       }           
       public static void sapXepTang(int[] a){
         Arrays.sort(a);
       }
       
  
       public static void phatSinhMang(int[]a){
           Random rd =new Random();
           for (int i = 0; i < a.length; i++) {
               a[i]=rd.nextInt(100);
           }
           }

       
       public static void lietKeUoc(int[] a,int x){
           for (int item : a) {
               if (x%item==0) {
                   System.out.println(item+" ");
               }
           }
       }
}

