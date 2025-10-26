package Tugas4;

import java.util.Scanner;

public class Hari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("\n===KODE HARI=== ");
        System.out.println("1 = senin ");
        System.out.println("2 = Selasa");
        System.out.println("3 = Rabu ");
        System.out.println("4 = kamis");
        System.out.println("5 = jumat");
        System.out.println("6 = sabtu");
        System.out.println("7 = minggu");
        
        System.out.println("Masukkan kode hari (1-7): ");
        int kode = input.nextInt();

        switch (kode) {
            case 1: 
            	System.out.println("Senin"); 
            	break;
            case 2: 
            	System.out.println("Selasa"); 
            	break;
            case 3: 
            	System.out.println("Rabu"); 
            	break;
            case 4: 
            	System.out.println("Kamis"); 
            	break;
            case 5: 
            	System.out.println("Jumat");
            	break;
            case 6: 
            	System.out.println("Sabtu"); 
            	break;
            case 7: 
            	System.out.println("Minggu"); 
            	break;
            default: 
            	System.out.println("Kode hari tidak valid.");
        }

		
	}

}
