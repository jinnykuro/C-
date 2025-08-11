import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Final grade calculator");
        
        System.out.print("Prelim Average Grade: ");
        double lim = scan.nextDouble();
        lim = (lim * 0.20);
        System.out.print("Midterm Average Grade: ");
        double mid = scan.nextDouble();
        mid = (mid * 0.20);
        System.out.print("Pre-finals Average Grade: ");
        double pre = scan.nextDouble();
        pre = (pre * 0.20);
        System.out.print("Finals Average Grade: ");
        double fin = scan.nextDouble();
        fin = (fin * 0.40);
        double finals = lim + mid + pre + fin;
        double finalg = (int)finals;
        double point = 5.00 - (finals * 4.0 / 100);
        double point1 = ((int)(point*100))/100.0;
        if(finals >= 98 && finals < 100){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 1.00");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("EXCELLENT!");
            }
        else if(finals >= 95 && finals < 97.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 1.25 ");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("SUPERIOR!");
        }
        else if(finals >= 91 && finals < 94.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 1.5 ");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("VERY GOOD!");
        }
        else if(finals >= 82 && finals < 90.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 1.75");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("GOOD!");
        }
        else if(finals >= 85 && finals < 87.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 2.0");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("ABOVE AVERAGE");
        }
        else if(finals >= 82 && finals < 84.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 2.25");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("AVERAGE");
        }
        else if(finals >= 79 && finals < 81.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 2.5");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("VERY SATISFACTORY");
        }
        else if(finals >= 76 && finals < 78.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 2.75 ");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("SATISFACTORY");
        }
        else if(finals == 75 && finals <= 75.99){
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 3.0");
            System.out.println("Accurate GPA: "+point1);
            System.out.println("PASSING");
        }
        else{
            System.out.println("-------------–---------------");
            System.out.println("Total final grade is "+finalg);
            System.out.println("GPA: 5.0");
            System.out.println("FAILED!");
        }
        
    }
}