package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 1; x <= 100; x++) {
			if(x%3 == 0 && x%5 != 0) {
				System.out.println(x + " - editado01");
			} else if(x%5 == 0 && x%3 != 0) {
				System.out.println(x + " - Buzz");
			} else if(x%3 == 0 && x%5 == 0) {
				System.out.println(x + " - editado02");
			}
			else {
				System.out.println(x);
			}
		}

	}
	
}
