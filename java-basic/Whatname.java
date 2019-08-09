import java.util.Scanner;
class Whatname{
    public static void main(String[] args) {
        System.out.println("이름은 뭐니?");
        String name = "";
        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("이름은 " + name + "이다");
        System.out.print("몇살이에요?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print("나이는 "+ age + "이다");
    }
}