import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class arrays_example {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 10) + 10;
        System.out.println("So phan tu mang: " + n);
        //mang kieu gia tri nguyen thuy
        int[] arrInt = new int[n]; // cap phat bo nho dong
        int arrInt1[];
        for(int i = 0; i<n; i++) {
            arrInt[i] = (int)(Math.random()*100);
        }
        // sao chep mang
        arrInt1 = arrInt.clone();
        arrInt[4]  = 1000;
        for (int value:arrInt1) {
            System.out.println(value + " ");
        }
        System.out.println("arrInt1[4] = " +arrInt[4]);

        // sap xep mang
        Arrays.sort(arrInt1);
        System.out.println(Arrays.toString(arrInt1));
        
        System.out.println(Arrays.toString(arrInt));

        // mang kieu doi tuong tuong ung
        Integer[] ArrINT = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
        Integer[] ArrINT1 = IntStream.of( arrInt ).boxed().toArray(Integer[]::new);
        Integer[] ArrINT2 = new Integer[arrInt.length];
        Arrays.setAll(ArrINT2, (i) -> arrInt[i] );

        //auto-unboxing
        for(int value:ArrINT2) {
            System.out.println(value + " ");
        }
    }
}
