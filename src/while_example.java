

public class while_example {
    public static void main(String[] args) throws Exception {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);     

        System.out.println("a = "+ a+ " b = "+ b);

        if(a * b != 0) {
            while (a != b) {
                if(a > b) {
                    a -=b;
                }else {
                    b-=a;
                }
            }   
            System.out.println("UCLN(a,b) = "+ a);
        }else {
            System.out.println("UCLN(a,b) = 1");
        }
    }

    
}
