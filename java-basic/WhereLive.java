import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디 사세요?");
        Scanner scanner = new Scanner(System.in);
        String where = "";
        where = scanner.next();
        System.out.print(String.format("사는곳은 %s 입니다", where));
    }
}