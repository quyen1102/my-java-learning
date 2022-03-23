import java.util.Arrays;
import java.util.HashSet;

public class arrays2_example {
    public static void main(String[] args) {
        int[] arrInt1 = new int[] {1,2,3};
        int[] arrInt2 = {4 , 5, 6};

        //ghep mang 2 chieu tu mang 1 chieu
        int[][] arrInt = {arrInt1, arrInt2};
        for(int[] row: arrInt){
            for(int value:row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        // cach 2
        System.out.println(Arrays.deepToString(arrInt));
        System.out.println(Arrays.toString(arrInt));

        //hop 2 mang 1 chieu kieu doi tuong tuong uwng
        Integer[] ArrINT1 = Arrays.stream(arrInt1).boxed().toArray(Integer[]::new);
        Integer[] ArrINT2 = Arrays.stream(arrInt2).boxed().toArray(Integer[]::new);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(ArrINT1));// add elemt ArrINT -> set
        set.addAll(Arrays.asList(ArrINT2));// ArrINT2 -> set
        System.out.println(set); // 

        // chuyen ve dang mang
        Integer[] unionIntegers = {};
        unionIntegers = set.toArray(unionIntegers);
        System.out.println("mang sau khi hop");
        System.out.println(Arrays.toString(unionIntegers));
        // giao hai mang mot chieu
        ArrINT1 = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7,8, 9};
        ArrINT2 = new Integer[] {1,3,5,2,10,23,34};
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(ArrINT1));
        set2.retainAll(Arrays.asList(ArrINT2));
        System.out.println(set2);
    }
}
