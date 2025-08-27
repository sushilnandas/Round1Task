package com;

import java.util.Scanner;

public class Problem2 {

	
	
public static void seriesOfNum(int n) {	
int i =1,count =1;
	while(count<=n){
if(i%2!=0 ){
System.out.print(i+" " );
i =i+2;
}
count ++;
}
}


public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter your input");
	int n = scanner.nextInt();
	scanner.close();
	seriesOfNum(n);
}
	
	
	
}
