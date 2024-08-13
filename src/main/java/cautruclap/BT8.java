/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT8 {
    public static void main(String[] args) {
        int n;
        int s;
        System.out.println("Giải Tổng Số nguyên từ 1+2+3=....+N");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap n =");
        n=sc.nextInt();
        
        // thuật toán
        s=0;
        for (int i = 1; i <=n; i++) {
            s=s+i;
        }
        // in ra kết quả
        System.out.println("kết quả tổng số nguyên là = "+ s);
        
    }
}
