import java.util.Scanner;
class MinusCal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("첫번째 수를 입력하세요");
        a = scan.nextInt();
        System.out.println("두번째 수를 입력하세요");
        b = scan.nextInt();
        c = a - b;
        System.out.println(a + "-" +b+"="+c);
    }
}
