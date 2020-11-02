import java.util.*;
public class JavaExercise2 {

	public static void main(String[] args) {
		printQuestion4();
		printQuestion5();
		printQuestion6();
		printQuestion7();
		printQuestion11();
		printQuestion32();
		printQuestion33();
		printQuestion34();
		printQuestion46();
		printQuestion49();
	
	}
	
	public static void printQuestion4() {
		int a = -5+8*6;
		int b = (55+9)%9;
		int c = 20+-3*5/8;
		int d = 5+15/3*2-8%3;
		System.out.println(a + "\t" +b +"\t" +c +"\t" +d);
		
	}
	
	public static void printQuestion5() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input first number :");
		int firstnum = in.nextInt();
		
		System.out.print("Input second number : ");
		int secondnum = in.nextInt();
		
		int product = firstnum * secondnum;
		System.out.println(firstnum + " x " +secondnum + " = " +product);
	}
	
	public static void printQuestion6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number : ");
		int num1 = in.nextInt();
		
		System.out.print("Input second number : ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " + " +num2 + " = " + (num1+num2) );
		System.out.println(num1 + " - " +num2 + " = " + Math.abs(num1-num2));
		System.out.println(num1 + " x " +num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " +num2 + " = " + (num1/num2));
		System.out.println(num1 + " mod " +num2 + " = " + (num1%num2));
	
	}
	
	public static void printQuestion7() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number : ");
		int num = in.nextInt();
		
		Integer number,i;
		for (i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}
		
	public static void printQuestion11() {
		Scanner in = new Scanner (System.in);
		System.out.print("Radius : ");
		double rad = in.nextDouble();
		
		double perimeter = (2 * Math.PI* rad);
		System.out.println("Perimeter is " +perimeter);
		
		double area = (Math.PI * (rad *rad));
		System.out.println("Area is " +area);
		
	}
	
	public static void printQuestion32() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input first integer : ");
		int num1 = in.nextInt();
		
		System.out.print("Input second integer : ");
		int num2 = in.nextInt();
		
		if (num1 == num2)
		System.out.printf("%d == %d\n", num1,num2);
		
		if (num1 != num2)
		System.out.printf("%d != %d\n", num1, num2);
		
		if (num1 < num2)
		System.out.printf("%d < %d\n",  num1, num2);
		
		if (num1 > num2 )
		System.out.printf("%d > %d\n", num1, num2);
		
		if (num1 <= num2)
		System.out.printf("%d <= %d\n", num1, num2);
		
		if (num1>= num2)
		System.out.printf("%d >= %d\n", num1, num2);
		
	}
	
	public static void printQuestion33() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input an integer : ");
		int num = in.nextInt();
		
		int firstnum = num%10;
		int secondnum = num/10;
		
		int sum = firstnum + secondnum;
		System.out.println("The sum of the digits is " +sum);
		
	}
	
	public static void printQuestion34() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input the length of a side of the hexagon : ");
		int length = in.nextInt();
		
		double area = (6*(length*length)) / (4 * Math.tan((Math.PI / 6)));
		System.out.println("The area of hexagon is " +area);
		
	}
	
	public static void printQuestion46() {
		System.out.format("Current Date time : %tc%n", System.currentTimeMillis());

	}
	
	public static void printQuestion49() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number : ");
		int num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	

}
				
				
				
				
				
				
				
				
				
		
		
	
	
	
	
