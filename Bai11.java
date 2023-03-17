import java.util.Scanner; 


public class Bai11 {

    public static void main(String[] args) {
        
        String s; 
        char c; 
        int count = 0;
        Scanner sc = new Scanner(System.in);
       
        do {
            System.out.print("Nhập một chuỗi không quá 80 ký tự: ");
            s = sc.nextLine();
        } while (s.length() > 80);

      
        System.out.print("Nhập một ký tự bất kỳ: ");
        c = sc.next().charAt(0);

      
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

	
	System.out.println("Số lần xuất hiện của ký tự " + c + " trong chuỗi " + s + " là: " + count);
    }
}
