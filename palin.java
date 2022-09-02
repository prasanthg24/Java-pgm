import java.util.Scanner;

public class palin{
   public static void main(String args[])
   {
     int n,rem,sum=0;
     Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the number...");
	 n = scn.nextInt();
	 while(n !=0){
	 rem = n%10;
	 sum = (sum*10)+rem;
	 n = n / 10;
	 }
	 System.out.println(sum);
   }
}