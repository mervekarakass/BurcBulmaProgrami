package burcBulmaProgrami;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class BurcBulmaProgrami {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Dogum gunuzu giriniz (ornegin, 26): ");
		int day = scanner.nextInt();
		
		System.out.print("Dogum ayinizi giriniz (ornegin, 1): ");
		int month = scanner.nextInt();
		
		String burc = burcBul(day, month);
		
		System.out.println("Burcunuz: " + burc);
		
		scanner.close();
	
	}
	
	public static String burcBul(int day, int month) {
		
		switch (month) {
		case 1:
			return (day >= 22) ? "Kova" : "Oğlak";
			
		case 2: 
			return (day >= 20) ? "Balik" : "Kova";
		case 3:
			return (day >= 21) ? "Koc" : "Balik";
		case 4:
			return (day >= 21 ) ? "Balik" : "Koc";
		case 5: 
			return (day >= 22) ? "Ikizler" : "Boga";
		case 6:
			return (day >= 23) ? "Yengec" : "Ikizler";
		case 7:
			return (day >= 23) ? "Aslan" : "Ikizler";
		case 8:
			return (day >= 23) ? "Basak" : "Aslan";
		case 9:
			return (day>= 23)  ? "Terazi" : "Basak";
		case 10:
			return (day >= 23) ? "Akrep" : "Terazi";
		case 11:
			return (day>= 22) ? "Yay" : "Akrep";
		case 12:
			return (day>= 22) ? "Oglak" : "Yay";
			default :
				return "Gecersiz ay";
					
				
				
				
				
				
				
			
			
				
				
		
		
		}
}
}