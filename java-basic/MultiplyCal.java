import java.util.Scanner;
class MultiplyCal{
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요");
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        int multiply = a*b;
        System.out.println("두 수의 곱은 "+multiply + "입니다");
    }
}