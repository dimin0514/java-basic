import java.util.Scanner;
class GenderChecker{
    public static void main(String[] args){
        System.out.println("성별 판독기 입니다. 주민번호를 입력하세요");
        Scanner scan = new Scanner(System.in);
        String ssn = "";
        ssn = scan.next();

        String num = ssn.substring(7,8);
        
        if(num.equals("9")){
            System.out.println("1800 ~ 1899년에 태어난 남성");
        }else if(num.equals("0")){
            System.out.println("1800 ~ 1899년에 태어난 여성");
        }else if(num.equals("1")){
            System.out.println("1900 ~ 1999년에 태어난 남성");
        }else if(num.equals("2")){
            System.out.println("1900 ~ 1999년에 태어난 여성");
        }else if(num.equals("3")){
            System.out.println("2000 ~ 2099년에 태어난 남성");
        }else if(num.equals("4")){
            System.out.println("2000 ~ 2099년에 태어난 여성");
        }else if(num.equals("5")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
        }else if(num.equals("6")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
        }else if(num.equals("7")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 남성");
        }else{
            System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
        }   

    }
}