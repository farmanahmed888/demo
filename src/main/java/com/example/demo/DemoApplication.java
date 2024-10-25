package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class DemoApplication {

	public static void dosqrt(Scanner sc){
		System.out.println("Enter the number");
		double n=sc.nextInt();
		System.out.println("Square root of "+n+" is "+Math.sqrt(n));
	}
	public static void dofact(Scanner sc){
		System.out.println("Enter the number");
		long n=sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
	public static void dolog(Scanner sc){
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Log of "+n+" is "+Math.log(n));
	}
	public static void dopow(Scanner sc){
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the power");
		int p=sc.nextInt();
		System.out.println(n+" raised to the power "+p+" is "+Math.pow(n,p));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		if(ch==1){
			dosqrt(sc);
		}else if(ch==2){
			dofact(sc);
		}else if(ch==3){
			dolog(sc);
		}else if(ch==4){
			dopow(sc);
		}else {
			System.out.println("Invalid choice");
		}

	}

}
