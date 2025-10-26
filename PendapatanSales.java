package Tugas4;

import java.util.Scanner;

public class PendapatanSales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double penjualan, jasa = 0, komisi = 0, totalPendapatan;

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        }

        totalPendapatan = jasa + komisi;

        System.out.println("\n===== Pendapatan Salesman =====");
        System.out.println("Total Penjualan     : Rp " + penjualan);
        System.out.println("Uang Jasa           : Rp " + jasa);
        System.out.println("Komisi Penjualan    : Rp " + komisi);
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);

	}

}
