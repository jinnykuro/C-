import java.util.*;
public class FactorialCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("<-----FACTORIAL CALCULATOR-----.>");
        boolean ban = true;
        int op = 0;
        while(ban){
            op++;
            int factor1 = 1;
            int factor = 1;
            System.out.print("\n"+"Enter a positive number for factorial: ");
        int num = scan.nextInt();
             if(num > 0){
                System.out.print(num+"! = ");
                for(factor1 = 1;factor1 <= num; factor1++){
                    System.out.print(factor1);
                    factor = factor * factor1;
                    if(factor1 < factor){
                        System.out.print(" x ");
                    }
                }System.out.print("\n"+"The factorial of "+num+" is = "+factor);
            }else{
                ban = false;
                System.out.print("Error not a positive number"+"\n"+"End of program!!!");
                break;
            }
        }
    }
}