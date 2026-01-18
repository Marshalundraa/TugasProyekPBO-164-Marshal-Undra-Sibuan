package app;

import model.*;
import service.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ManajemenStok sistem = new ManajemenStok();
        PencatatanDonasi donasi = new PencatatanDonasi();

        while (true) {
            System.out.println("\n===== MENU POSKO BENCANA =====");
            System.out.println("1. Input Barang");
            System.out.println("2. Input Donasi");
            System.out.println("3. Distribusi Barang");
            System.out.println("4. Lihat Laporan Stok");
            System.out.println("5. Lihat Data Donasi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();
            input.nextLine();

            if (menu == 0) break;

            switch (menu) {

                case 1 -> {
                    System.out.print("Kode Barang: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Barang: ");
                    String nama = input.nextLine();

                    System.out.print("Jenis (1.Pokok 2.Medis): ");
                    int jenis = input.nextInt();

                    System.out.print("Jumlah Stok: ");
                    int stok = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {
                        System.out.print("Kategori: ");
                        String kategori = input.nextLine();
                        sistem.tambahBarang(new BarangPokok(kode, nama, stok, kategori));
                    } else {
                        sistem.tambahBarang(new BantuanMedis(kode, nama, stok));
                    }
                }

                case 2 -> {
                    System.out.print("Nama Donatur: ");
                    String namaDonatur = input.nextLine();
                    Donatur d = new Donatur(namaDonatur);

                    System.out.println("Jenis Donasi:");
                    System.out.println("1. Barang Pokok");
                    System.out.println("2. Barang Medis");
                    System.out.println("3. Uang");
                    System.out.print("Pilih: ");
                    int jns = input.nextInt();
                    input.nextLine();

                    if (jns == 3) {
                        System.out.print("Nominal Uang: ");
                        int uang = input.nextInt();
                        input.nextLine();
                        donasi.tambahDonasi(new BantuanUang(d, uang));
                    } else {
                        System.out.print("Kode Barang: ");
                        String k = input.nextLine();
                        Barang b = sistem.cariBarang(k);

                        if (b != null) {
                            System.out.print("Jumlah: ");
                            int j = input.nextInt();
                            input.nextLine();
                            donasi.tambahDonasi(new BantuanBarang(d, b, j));
                            b.tambahStok(j);
                        } else {
                            System.out.println("Barang tidak ditemukan!");
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Kode Barang: ");
                    String k = input.nextLine();
                    Barang b = sistem.cariBarang(k);

                    if (b != null) {
                        System.out.print("Jumlah Distribusi: ");
                        int j = input.nextInt();
                        input.nextLine();
                        sistem.distribusikan(b, j);
                    }
                }

                case 4 -> {
                    Laporan laporan = new Laporan(sistem.getDaftarBarang());
                    laporan.cetakLaporan();
                }

                case 5 -> donasi.tampilkanDonasi();
            }
        }
    }
}
