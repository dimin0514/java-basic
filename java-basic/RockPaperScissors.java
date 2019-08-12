import java.util.Scanner;
import java.util.Random;
class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("가위바위보 게임");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("1.가위 2.바위 3.보");
        int a = 0;
        a = scan.nextInt();
        int b = ran.nextInt(3)+1;

        if(a == 1){
            if(b==1){
                System.out.println("비겼다");
            }else if(b==2){
                System.out.println("졌다");
            }else{
                System.out.println("이겼다");
            }  
        }if(a==2){
            if(b==1){
                System.out.println("이겼다");
            }else if(b==2){
                System.out.println("비겼다");
            }else{
                System.out.println("겼다");
            }
        }if(a==3){
            if(b==1){
                System.out.println("이겼다");
            }else if(b==2){
                System.out.println("겼다");
            }else{
                System.out.println("비겼다");
            }
        }
               
    }     
}