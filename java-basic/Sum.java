import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("첫번째 수를 입력하세요");
        a = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요");
        b = scanner.nextInt();
        String op = "";
        System.out.println("연산 종류를 선택하세요 +, -, *, / ");
        op = scanner.next();
        if(op.equals("+")){
              c = a + b;
            System.out.println(String.format("%d + %d = %d",a,b,c));
        }else if(op.equals("-")){
               c = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        }else if(op.equals("*")){
               c = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        }else if(op.equals("/")){
                c = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        }else{
            System.out.println("잘못 입력하셨습니다");
        }
    }
}