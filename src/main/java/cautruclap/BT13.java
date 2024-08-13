/*
Bài 13: Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99
sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó.
 */
package cautruclap;

/**
 *
 * @author trant
 */
public class BT13 {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            int so1 = number/10; // lấy sô nguyên
            int so2=number%10; // lấy số dư
            
            
            // tích và tổng của 2 chử số
            
            int sum1 = so1*so2;
            int sum2 = so1+so2;
               if (sum1 == 2 * sum2) {
                // In ra số thỏa mãn điều kiện
                System.out.println(number);
            }
        }
   
    }
}
