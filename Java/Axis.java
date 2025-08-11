import java.util.*;
public class Axis {
	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	
boolean Function=true;
				
	while (Function){
		System.out.println("ENTER x axis ");
			int x=input.nextInt();
		input.nextLine();
			
	System.out.println("ENTER y axis ");
			int y=input.nextInt();
	input.nextLine();
	
	System.out.println("("+x+","+y+")");
	
		if (x>0&&y>0){
		System.out.print("First Quadrant");
			
}	
			else if (x<0&&y>0){
			System.out.print("2nd Quadrant");	}
							
			else if (x<0&&y<0){
			System.out.print("3rd Quadrant");	}
				
			else if (x>0&&y<0){
			System.out.print("4th Quadrant"+"\n");
			continue;	
		}	
		System.out.println("\n\nDO YOU WANT TO DO IT AGAIN\n"+"Yes or No?");
		String Word=input.nextLine();
		String Word1=Word.toUpperCase();
		
		if (Word1.equals("NO")){
		Function=false;
		}	else{
			Function=true;
			}		
	}
	}
}