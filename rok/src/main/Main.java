package main;

import java.util.Arrays;
import java.util.Scanner;

import rok.Rok;

public class Main {
	public static void main(String[] args) {
		Rok rok = new Rok();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int n1=Integer.parseInt(sc.nextLine());
		System.out.println("숫자 입력 : ");
		int n2=Integer.parseInt(sc.nextLine());
		System.out.println("숫자 입력 : ");
		int n3=Integer.parseInt(sc.nextLine());
		System.out.println("숫자 입력 : ");
		int n4=Integer.parseInt(sc.nextLine());
		System.out.println("숫자 입력 : ");
		int n5=Integer.parseInt(sc.nextLine());
		
		int[] num1 = rok.num1(n1,n2);
		int[] num2 = rok.num2(n1,n2,n3);
		int[] num3 = rok.num3(n1,n2,n3,n4);
		int[] num4 = rok.num3(n1,n2,n3,n4);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
