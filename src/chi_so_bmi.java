import java.util.Scanner;

public class chi_so_bmi {
    public static void main(String[] args) {
        double h, w, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào trọng lượng cơ thể: ");
        w = sc.nextDouble();
        System.out.print("Nhập vào chiều cao: ");
        h = sc.nextDouble();
        bmi = w / (Math.pow(h, 2));
        if (bmi < 18.5) {
            System.out.print("Bạn bị thiếu cân");
        } else if (bmi < 25 && bmi >= 18.5) {
            System.out.println("Cơ thể cân đối");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Bạn bị thừa cân");
        } else if (bmi > 30) {
            System.out.println("Bạn bị béo phì");
        }
    }
}
