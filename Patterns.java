import java.util.Scanner;
public class Patterns {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the No of Patterns: ");
		n = sc.nextInt();
		/*
	   //Square Pattern
		  for(i=1;i<=n;i++){
		    for(j=1;j<=n;j++) {System.out.print("* ");}
		    System.out.println("");
		  }
	  //Increasing Triangle Pattern	  
		  for(i=1;i<=n;i++){
		    for(j=1;j<=i;j++){
		      System.out.print("* "); }
		    System.out.println("");
		  }
	  //Decreasing Triangle pattern
	     for(i=1;i<=n;i++){
		    for(j=i;j<=n;j++){
		      System.out.print("* "); }
		    System.out.println("");
		 }
      //Right Sided Increasing Triangle 
		  for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {System.out.print("s ");}
			for(j=1;j<=i;j++) {System.out.print("* ");}
		  	System.out.println(".");
		  }
	  //Right Sided Decreasing Triangle
	    for(i=1;i<=n;i++) {
		    for(j=1;j<=i;j++) {System.out.print("s ");}
			for(j=i;j<=n;j++) {System.out.print("* ");}
			System.out.println(" ");
		}
	  //Hill Pattern 
	   for(i=1;i<=n;i++) {
		    for(j=i;j<=n;j++) {System.out.print("  ");}
			for(j=1;j<=i;j++) {System.out.print("* ");}
			for(j=1;j<i;j++) {System.out.print("* ");}
			System.out.println("");
		} 
      //Reverse Hill Pattern
         for(i=1;i<=n;i++) {
		    for(j=1;j<=i;j++) System.out.print("  ");
		    for(j=i;j<=n;j++) System.out.print("* ");
		    for(j=i;j<n;j++) System.out.print("* ");
			System.out.println("");
		} 