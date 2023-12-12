public class ss5_declare_variable {
    public static void main(String[] args) {
//     I. KIỂU DỮ LIỆU:
//        - Kiểu luận lý: boolean => true, false
//        - Kiểu ký tư: char
//        - Kiểu số:
//            + Kiểu số nguyên: byte, short, int, long
//            + Kiểu số thực: float, double
//        1. Kiểu nguyên int
        System.out.println("Max của số nguyên là " + Integer.MAX_VALUE);
        System.out.println("Min của số nguyên là " + Integer.MIN_VALUE);
//        2. kiểu byte
        System.out.println("Max của kiểu byte là: " + Byte.MAX_VALUE);
        System.out.println("Min của kiểu byte là: " + Byte.MIN_VALUE);
//      II. KHAI BÁO BIẾN
        // Khai báo biến kiểu int phải là số nguyên.
        int age = 10;
        System.out.println("Tuổi của bạn là: " + age);
//       Khai báo biến kểu float phải thêm đuôi f vào sau giá trị
        float randomNumber = 9.5f;
        System.out.println("Số của bạn là :" + randomNumber);
//        Khai báo biến kiểu double
        double randomNumber2 = 9.5;
        System.out.println("Số tiếp  theo của bạn là :" + randomNumber2);

        String string = "ahihi";

//        III. ÉP KIỂU DỮ LIỆU

        int a = 5;
        int b = 10;

        double c = a / b;
        double d = (double) a / b;
//        Vì a và b là kiểu dữ liệu int nên khi tính ra số thập phân thì phải ép kiểu sang bouble
        System.out.println("C là: " + c);
        System.out.println("D là: " + d);

//        - Ép kiểu hẹp
        int e = 128;
        byte f =(byte) e;
        System.out.println(e);
        System.out.println(f);

        int g = 12;
        byte h = (byte) g;
        System.out.println(g);
        System.out.println(h);
    }
}
