public class do_while_example {
    public static void main(String[] args) throws Exception {
        int num, digit = 0;
        num = (int) (Math.random() * 10_000_000);
        System.out.println(num);
        do{
            digit = num % 10;
            num /= 10;
            System.out.print(digit);
        }while(num != 0);
    }
}
