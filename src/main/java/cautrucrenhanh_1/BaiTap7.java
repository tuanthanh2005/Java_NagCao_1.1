/*
 Bài 7: Nhập vào một tháng trong năm. In ra số ngày của tháng đó.
– Tháng có 31 ngày: 1, 3, 5, 7, 8, 10, 12
– Tháng có 30 ngày: 4, 6, 9, 11
– Tháng có 28 hoặc 29 ngày : 2
– Các trường hợp khác thì in ra câu thông báo “Tháng không hợp lệ!“.
 */
package cautrucrenhanh_1;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BaiTap7 {

    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
         System.out.println("Nhap nam: ");
        nam = sc.nextInt();
        switch (thang) {
            case 1:
                System.out.println(thang+ " có 31 ngày");
                break;
            case 3:
                System.out.println(thang+ " có 31 ngày");
                break;
            case 5:
                System.out.println(thang+ " có 31 ngày");
                break;
            case 7:
                System.out.println(thang+ " có 31 ngày");
                break;
            case 8:
                System.out.println(thang+ " có 31 ngày");
                break;
            case 10:
                System.out.println(thang+ " có 31 ngày");
                break;             
            case 12:
                System.out.println(thang+ " có 31 ngày");
                
                break;

            case 4:
                System.out.println(thang+ " có 30 ngày");
                break;
            case 6:
                System.out.println(thang+ " có 30 ngày");
                break;
            case 9:
                System.out.println(thang+ " có 30 ngày");
                break;
            case 11:
                  System.out.println(thang+ " có 30 ngày");
                break;

            case 2:
                if (nam%4==0) {
                    System.out.println("Nam nhuan co 29 ngay"+ nam);
                } else {
                    System.out.println("Nam khong nhuan co 28 ngay"+nam);
                }
                break;

            default:
                System.out.println("Không hợp lệ!!");
        }
    }
}
