public class KieuDuLieuNguyenThuy {
    public static void main(String[] args) throws Exception {
        byte b = 120;
        // Byte B = new Byte(b); // chuyen doi nguyen thuy sang doi tuong(wrapper) su dung contructor
        // System.out.println(B);
        Byte B1 = Byte.valueOf(b);
        System.out.println("Gia tri cua so nguyen byte la: " + B1);
        // Khai baos mot doi tuong Integer
        // Integer I = new Integer(1234); K dung tu phien ban JDK 9
        Integer I1 = 120; // Ki thuat autoboxing cua java chuyen doi tu so -> obj I1 la Obj
        int i = 1234;
        int v = i + I1; // ki thuat auto unboxing nguoc lai cua autoboxing
        System.out.println("v = " + v);
        int m = 10_000_000; // tu phien ban java 7 duoc ho tro
        System.out.println("m = " + m);
        // khai bao ky tu
        Character ch = 'j';// autoboxing
        char ch1 = ch.charValue(); 
        Integer a = 123;
        System.out.println(a instanceof Integer);
        System.out.println("ch1 = " + ch1);
    }

    
}
