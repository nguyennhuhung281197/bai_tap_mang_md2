import java.util.Arrays;
import java.util.Scanner;

public class duyet_diem_thi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm của kì thi : ");
        int size = sc.nextInt();

        while (size > 30) {
            System.out.println("Không Hợp lệ mời nhập lại");
            size = sc.nextInt();
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Điểm thi " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println("số điểm đạt : " + count);
    }
}
