// IT21355196 - K.L.S.Kalpajith
// Malabe - Weekday - Group 07.02
// Assignment 1 - Question_01

package Question_01;

import java.util.Scanner;

public class RoomChargeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\n******_Room_Charge_Calculator_******\n");
		
		System.out.println("---User_Menu---\n");
		System.out.println("1.Delux-Double");
		System.out.println("2.Standard-Family");
		System.out.println("3.Standard-Single");
		System.out.println("4.Quit");
		
		System.out.print("\nEnter your choice(1-4): ");
		  int num = sc.nextInt();
		
		if(num>0 && num<=4){
			
		switch(num){
			
		case 1: 
			System.out.println("\n Delux Double room Fixed fee = 5000\n");
			
			getChargeDeluxDouble();		
			break;
			
		case 2: 
			System.out.println("\n Standard Family Room Fixed fee = 3000\n");
			
			getChargeStandardFamily();
            break;
		   
        case 3: 
        	System.out.println("\n Standard Single Room Fixed fee = 2000\n");
			
        	getChargeStandardSingle();
			break;
			
        case 4: 
        	System.out.println("\nThank you for your Response :-) ");
    		System.out.println("\n --- Quit --- ");
            break;	  
		 }
		
	  }
	else {
		System.out.println("\n---Outside the Range---");
		System.out.println("\nPlease input (1 - 4)");
	}		
	
	}
	
	
	public static void getChargeDeluxDouble() {
		
		Scanner sc = new Scanner(System.in);
	
		int totalFee= 0;
		  
		    System.out.println("\n---Aditional Services---");
			System.out.println(" Balcony Charge Fee: 500" );
			System.out.println(" Parking Charge Fee: 200");
			System.out.println(" TV Charge Fee     : 200");
			System.out.println(" Kitchen Charge Fee: 1000");
			System.out.println(" WiFi Charge Fee   : 100");
			
		System.out.print("\n Do you want Balcony Service? yes(1)/no(0): ");
	    int balcony = sc.nextInt();
		
		if(balcony == 1) {
			totalFee = totalFee + 500;
			}
		
		System.out.print(" Do you want Parking Service? yes(1)/no(0): ");
		int parking = sc.nextInt();
		
		if(parking == 1) {
			totalFee = totalFee + 200;
		
		}
		
		System.out.print(" Do you want TV Service? yes(1)/no(0): ");
		int tv = sc.nextInt();
		 
		if(tv == 1) {
			totalFee = totalFee + 200;
		
		}
		
		System.out.print(" Do you want Kitchen Service? yes(1)/no(0): ");
		int kitchen = sc.nextInt();
		
		if(kitchen == 1) {
			totalFee = totalFee + 1000;
		
		}
		
		System.out.print(" Do you want Wifi Service? yes(1)/no(0): ");
		int wifi = sc.nextInt();
		if(wifi == 1) {
			totalFee = totalFee + 100;
		}
		
		System.out.println("\n Total_Room_Charge_Fee = " + (totalFee + 5000));
		
	}

	public static void getChargeStandardFamily() {
		
		Scanner sc = new Scanner(System.in);
		
		int totalFee = 0;
		
			System.out.println("\n---Aditional Services---");
			System.out.println(" Parking Charge Fee: 200");
			System.out.println(" Kitchen Charge Fee: 500");
			System.out.println(" Garden Charge Fee : 200");
		
		
		
		System.out.print("\n Do you want Parking Service? yes(1)/no(0): ");
		int parking = sc.nextInt();
		if(parking == 1) {
			totalFee = totalFee + 200;
		
		}
		
		System.out.print(" Do you want Kitchen Service? yes(1)/no(0): ");
		int kitchen = sc.nextInt();
		if(kitchen == 1) {
			totalFee = totalFee + 500;
		
		}
		
		System.out.print(" Do you want Wifi Service? yes(1)/no(0): ");
		int garden = sc.nextInt();
		if(garden == 1) {
			totalFee = totalFee + 200;
		}
		
		System.out.println("\n Total_Room_Charge_Fee = " + (totalFee + 3000));
	}
	
	public static void getChargeStandardSingle() {
		
		   System.out.println("\n--- Aditional Services ---");
		   System.out.println(" Parking Charge Fee: 200");
		   System.out.println(" AC Charge Fee     : 500");
		   System.out.println(" WiFi Charge Fee   : 100");

		
		Scanner sc = new Scanner(System.in);
		
		int totalFee = 0;
		
		System.out.print("\n Do you want Parking Service? yes(1)/no(0): ");
		int parking = sc.nextInt();
		if(parking == 1) {
			totalFee = totalFee + 200;
		
		}
		
		System.out.print(" Do you want Ac Service? yes(1)/no(0): ");
		int ac = sc.nextInt();
		
		if(ac == 1) {
			totalFee = totalFee + 500;
		
		}
		
		System.out.print(" Do you want Wifi Service? yes(1)/no(0): ");
		int wifi = sc.nextInt();
		if(wifi == 1) {
			totalFee = totalFee + 100;
		}
		
		System.out.println("\nTotal_Room_Charge_Fee = " + (totalFee + 2000));
	}

}

