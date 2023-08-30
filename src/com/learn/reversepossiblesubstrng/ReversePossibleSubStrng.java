package com.learn.reversepossiblesubstrng;

import java.util.Scanner;

public class ReversePossibleSubStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String !");
		String str= scan.nextLine();
		
		ReversePossibleSubStrngApp.revsePossible(str);

	}

}
