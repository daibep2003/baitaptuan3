import java.util.Scanner;

 public class Bai8 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhập số lượng số nguyên: ");
         int n = input.nextInt();
         int sum = 0;
         for (int i = 0; i < n; i++) {
             System.out.print("Nhập số nguyên thứ " + (i+1) + ": ");
             sum += input.nextInt();
         }
         double avg = (double) sum / n;
         System.out.println("Trung bình cộng của các số nguyên đã nhập là: " + avg);
     }
 }