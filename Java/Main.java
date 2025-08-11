import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("<-----FACTORIAL CALCULATOR-----.>");
        boolean ban = true;
        int op = 0;
        while(ban){
            op++;
            int num = 1;
            int tor = 1;
            System.out.print("\n"+"Enter a positive number for factorial: ");
        int fac = scan.nextInt();
             if(fac > 0){
                System.out.print(fac+"! = ");
                for(num = 1;num <= fac; num++){
                    System.out.print(num);
                    tor = tor * num;
                    if(num < fac){
                        System.out.print(" x ");
                    }
                }System.out.print("\n"+"The factorial of "+fac+" is = "+tor);
            }else{
                ban = false;
                System.out.print("Error not a positive number"+"\n"+"End of program!!!");
                break;
            }
        }
    }
}