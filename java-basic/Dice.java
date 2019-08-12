import java.util.Scanner;
import java.util.Random;
class Dice{
     /**주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수인것 같으면 '홀' 을 선택 나머지는 '짝'선택
     * 한다고 할때, 결과를 출력하세요.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        String answer = "";
        System.out.println("주사위가 '홀수'인지 '짝수'인지 선택하세요");
        answer = scanner.next();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나운 수 %d",dice));
        if(dice == 1){
            System.out.println("홀수입니다");
        }else if(dice == 2){
            System.out.println("짝수입니다");
        }else if(dice == 3){
            System.out.println("홀수입니다");
        }else if(dice == 4){
            System.out.println("짝수입니다");
        }else if(dice == 5){
            System.out.println("홀수입니다");
        }else{
            System.out.println("짝수입니다");
        }
        
    }
}