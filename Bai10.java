import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        // Khai báo biến
        int n; // Số phần tử của mảng
        int[] A; // Mảng số nguyên
        Scanner sc = new Scanner(System.in); // Đối tượng nhập liệu từ bàn phím

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();

        // Khởi tạo mảng A có n phần tử
        A = new int[n];

        // Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        // In ra màn hình mảng ban đầu
        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        
	// Sắp xếp mảng theo thứ tự tăng dần bằng phương pháp sắp xếp chèn
	for (int i = 1; i < n; i++) {
	    int key = A[i]; // Phần tử cần chèn vào vị trí thích hợp
	    int j = i - 1; // Chỉ số của các phần tử đã được sắp xếp

	    // Di chuyển các phần tử lớn hơn key sang bên phải để tạo khoảng trống cho key
	    while (j >= 0 && A[j] > key) {
	        A[j + 1] = A[j];
	        j--;
	    }

	    // Chèn key vào vị trí thích hợp trong dãy đã được sắp xếp
	    A[j + 1] = key;
	}

	// In ra màn hình mảng sau khi sắp xếp
	System.out.println("\nMang sau khi sap xep la: ");
	for (int i = 0; i < n; i++) {
	    System.out.print(A[i] + " ");
	}
    }
}