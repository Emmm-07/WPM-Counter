import java.util.Scanner;

public class noNeed{ 
	
	public static void main(String[]args) {
		Scanner sc=new
		Scanner(System.in);
		String oper;
 do{
 System.out.println("[a]add\n[s] subtract\n[m] multiply\n[d]divide");
 System.out.print("enter code(a/s/m/d): ");
 String choice=sc.nextLine();

 int n1,n2;
 switch(choice){
 case "a":
	 System.out.println("Math Operation is: add\nenter two (2)");
	
	System.out.print("num1=");n1=sc.nextInt();
	
	System.out.print("num2=");n2=sc.nextInt();
	 System.out.print("Result is: "+(n1+n2));break;
 case "s":
	 System.out.println("Math Operation is: subtract\nenter two (2)");
	
	System.out.print("num1=");n1=sc.nextInt();
	
	System.out.print("num2=");n2=sc.nextInt();
	 System.out.print("Result is: "+(n1-n2));break;
 case "m":
	 System.out.println("Math Operation is: multiply\nenter two (2)");
	
	System.out.print("num1=");n1=sc.nextInt();
	
	System.out.print("num2=");n2=sc.nextInt();
	 System.out.print("Result is: "+(n1*n2));break;
 case "d":
	 System.out.println("Math Operation is: divide\nenter two (2)");
	
	System.out.print("num1=");n1=sc.nextInt();
	
	System.out.print("num2=");n2=sc.nextInt();
	 System.out.print("Result is: "+(n1/n2));break;
 }
 System.out.print("\nTry again (Y/N)?: ");
 oper=sc.next();
 }while(!oper.equals("N"));

}
}