	import java.util.Scanner;
public class HIGHEST_NO {
public static void main(String[] args) {
			int a,b,c;
		System.out.println("Enter the Number:");
		Scanner r=new Scanner(System.in);
		 a=r.nextInt();
		 b=r.nextInt();
		 c=r.nextInt();
		 if(a>b&&a>c)
		 {
			 System.out.println("the first Number is Highest");
		 }
		 else if(b>a&&b>c)
		 {
			 System.out.println("the Second Number is Highest");
		 }
		 else if(c>a&&c>b)
		 {
			 System.out.println("the Third Number is Highest");
		 }
		 else
		 {
			 System.out.println("Input number are not distinct");
		 }
		}

	}

	


