/*
 Bài 6: Nhập vào 2 số nguyên và 1 phép toán.
– Nếu phép toán là “+”, “-”, “*” thì in ra kết quả là tổng,hiệu, tích của 2 số.
– Nếu phép toán là “/” thì kiểm tra xem số thứ 2 có khác không hay không? Nếu
khác không thì in ra thương của chúng, ngược lại thì in ra thông báo “Không thể
chia cho 0!!”.
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BaiTap6 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        b = sc.nextInt();

        System.out.println("Chon phep tinh + , - , * , /");
        char chon = sc.next().charAt(0);

        switch (chon) {
            case '+':
                System.out.println("Ket qua Cong =" + (a + b));
                break;
            case '-':
                System.out.println("Ket qua tru là = " + (a - b));
                break;
            case '*':
                System.out.println("Ket qua nhan =" +(a * b));
                break;
            case '/':
                if (b !=0 ) {
                    // ép kiểu double để khi chia có số lẽ vd : 2,5 ; 2,1
                    System.out.println("Ket qua chia = "+ (a/(double)b));
                } else {
                    System.out.println("Không thể chia 0");
                }
                break;
            default:
                System.out.println("Không Hợp Lệ");
                break;
        }
    }
}
