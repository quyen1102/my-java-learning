import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOexamples {
    public static void main(String[] args) {
        // cach 1 : su dung bo dem doc
        int n1;
        BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
        try {
            n1 = Integer.parseInt(in1.readLine());
            System.out.println("Nhap gia tri theo cach thong thuong, n = "  + n1);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        // cach 2 theo jdk1.5
        Scanner in2 = new Scanner(System.in);
        int n2 = in2.nextInt();
        in2.close();
        System.out.println("Nhap gia tri theo jdk, n = " + n2);

        float f = (float)n2;
        System.out.printf("Gia tri nguyen duoc nhap vao: %10.2f\n", f);
    }
}
