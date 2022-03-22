public class ChuyenKieuDuLieu {
    public static void main(String[] args) throws Exception {
        // chuyen kieu rong (widening)
        int i = 5;
        float f;
        f = i;
        System.out.println("i = " + i + ", f = " + f);
        // chuyen kiue hep
        f = 5.54f;
        i = (int) f;
        System.out.println("i = " + i + ", f = " + f);
        // mot so vi du
        
    }
}
