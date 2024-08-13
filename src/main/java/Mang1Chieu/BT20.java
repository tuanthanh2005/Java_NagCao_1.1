/*
 Bài 20: Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤20) từ bàn
phím
a. Nhập số nguyên x. Cho biết x có xuất hiện trong mảng a? Nếu có thì ở
vị trí đầu tiên nào?
b. Kiểm tra mảng có tính chất tăng dần không?
 */
package Mang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT20 {
    public static void main(String[] args) {
        

     Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng phần tử của mảng
        System.out.println("Nhap N");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 20) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        
        int[] array = new int[n];
        
        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Nhập số nguyên x
        System.out.print("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        
        // Tìm và kiểm tra số x có xuất hiện trong mảng không
        int index = timViTri(array, x);
        if (index != -1) {
            System.out.println("Số " + x + " xuất hiện trong mảng tại vị trí đầu tiên: " + index);
        } else {
            System.out.println("Số " + x + " không có trong mảng.");
        }
        
        // Kiểm tra mảng có tính chất tăng dần không
        if (Kiemtramang(array)) {
            System.out.println("Mảng có tính chất tăng dần.");
        } else {
            System.out.println("Mảng không có tính chất tăng dần.");
        }
        
        scanner.close();
    }
    
    // Phương thức tìm chỉ số xuất hiện đầu tiên của số x trong mảng
    public static int timViTri(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i; // Trả về chỉ số đầu tiên của x
            }
        }
        return -1; // Nếu x không có trong mảng
    }
    
    // Phương thức kiểm tra mảng có được sắp xếp theo thứ tự tăng dần không
    public static boolean Kiemtramang(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Nếu có phần tử nào nhỏ hơn phần tử trước đó, mảng không tăng dần
            }
        }
        return true; // Mảng đã được sắp xếp theo thứ tự tăng dần
    }
}

