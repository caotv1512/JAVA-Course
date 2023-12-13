public class ss7_basic_operators {
    public static void main(String[] args) {
//      I. TOÁN TỬ SỐ HỌC
        int number1 = 15;
        int number2 = 20;
        double result = (double) number1 / number2;

//        Phép cộng:
        System.out.println("number1+number2 =" + (number1 + number2));
        System.out.println("number1 x number2 =" + (number1 * number2));
        System.out.println("number1 / number2 =" + ((double) number1 / number2));
        System.out.println("number1 - number2 =" + (number1 - number2));

//      II. TOÁN TỬ SO SÁNH
        int a = 10;
        int b = 10;
        double c = 10;

        System.out.println(a == b);
        System.out.println(b != c);


//      III. TOÁN TỬ LOGIC
//      &&(và), ||(hoặc), !(phủ định)
        System.out.println(10 < 20 || 10 >20);
        System.out.println(10 < 20 && 10 >20);
        System.out.println(10 < 20 && !(10 >20));

//      IV. TIỀN TỐ, HẬU TỐ
        int a1 = 3;
        int b1 = 5;
        int c1 = a1++ + ++b1 + 1;
        System.out.println(c1);

    }
}
