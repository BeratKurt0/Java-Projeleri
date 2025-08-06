package ders08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Yazı_Şekil {
	static Scanner scan = new Scanner(System.in);
	
	static String RESET = "\u001B[0m";
	static String BLACK = "\u001B[30m";
	static String RED = "\u001B[31m";
	static String GREEN = "\u001B[32m";
	static String YELLOW = "\u001B[33m";
	static String BLUE = "\u001B[34m";
	static String PURPLE = "\u001B[35m";
	static String LIGHT_BLUE = "\u001B[36m";
	static String WHITE = "\u001B[37m";
	
	static String BOLD = "\u001B[37m";
	static String ITALIC= "\u001B[37m";
	static String WHİTE = "\u001B[37m";
	static String UNDER = "\u001B[37m";
	static String INVERSE = "\u001B[37m";
	static String STRIKE = "\u001B[37m";
	
	static int Index() {
		int index;
		while(true) {
			try {
				index = scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.print(RED + "Lütfen değeri bir sayı olarak giriniz: " + LIGHT_BLUE);
				scan.nextLine();
				continue;
			}
			break;
		}
		return index;
	}
}
