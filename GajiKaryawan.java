package Tugas4;

import java.util.Scanner;

public class GajiKaryawan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String NIK, nama, stskawin = "";
        int kdgol, jmlanak = 0;
        double gapok = 0, tnjanak = 0, tnjpass = 0, gaber = 0;
          
        System.out.print("Masukkan NIK Karyawan: ");
        NIK = input.nextLine();
        System.out.print("Masukkan Nama Karyawan: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        kdgol = input.nextInt();

        if (kdgol == 1) {
            stskawin = "Menikah";
            gapok = 1200000;
            tnjpass = 0.1 * gapok;
            gaber = gapok + tnjpass;
            
        } else if (kdgol == 2) {
            stskawin = "Belum menikah";
            gapok = 1500000;
            gaber = gapok;
            
        } else if (kdgol == 3) {
            stskawin = "Cerai";
            gapok = 1750000;
            tnjpass = 0.1 * gapok;
            gaber = gapok + tnjpass;
            
        } else if (kdgol == 4) {
            stskawin = "Menikah dan punya anak";
            gapok = 2000000;
            System.out.print("Masukkan Jumlah Anak: ");
            jmlanak = input.nextInt();
            
            tnjpass = 0.1 * gapok;
            tnjanak = 0.05 * gapok * jmlanak;
            gaber = gapok + tnjpass + tnjanak;
            
        } else {
            stskawin = "Kode golongan tidak valid";
            gapok = 0;
            gaber = 0;
        }
        
        // Output hasil
        System.out.println("\n====== Output Data Karyawan ======");
        System.out.println("NIK Karyawan       : " + NIK);
        System.out.println("Nama Karyawan      : " + nama);
        System.out.println("Kode Golongan      : " + kdgol);
        System.out.println("Status Kawin       : " + stskawin);
        System.out.println("Gaji Pokok         : Rp " + gapok);
        System.out.println("Tunjangan Pasangan : Rp " + tnjpass);
        System.out.println("Tunjangan Anak     : Rp " + tnjanak);
        System.out.println("Gaji Bersih        : Rp " + gaber);
        
        input.close();

	}

}
