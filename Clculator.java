import java.util.*;
public class Clculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner in =new Scanner(System.in);
 char operator;
 double n1 ,n2 , FR;
 System.out.println("HI , this is my simple Calculator , try it now :)");
 System.out.println(" Choose your arithmetic operation : + ,* , / , - ");
  operator = in.next().charAt(0);
  System.out.println(" Enter your first number :");
  n1 = in.nextDouble();
  System.out.println(" Enter your second number :");
  n2 = in.nextDouble();
   
  switch  (operator) {
  
  case '+':
	  FR = n1 +n2;
	  System.out.println(n1 +" + "+n2+ " = "+FR);
  case '*':
	  FR = n1 *n2;
	  System.out.println(n1 +"* "+ +n2+ " = "+FR);
  case '/':
	  FR = n1 /n2;
	  System.out.println(n1 +" / "+n2+ " = "+FR);
  case '-':
	  FR = n1 -n2;
	  System.out.println(n1 +" - "+n2+ " = "+FR);
  }
  
  
  
  
  
	}

}
