package service;

import model.Bantuan;
import java.util.ArrayList;
import java.util.List;

public class PencatatanDonasi {

    private List<Bantuan> daftarDonasi = new ArrayList<>();

    public void tambahDonasi(Bantuan bantuan) {
        daftarDonasi.add(bantuan);
        System.out.println("Donasi berhasil dicatat.");
    }

    public void tampilkanDonasi() {
        if (daftarDonasi.isEmpty()) {
            System.out.println("Belum ada donasi.");
            return;
        }

        System.out.println("\n=== DATA DONASI ===");
        for (Bantuan b : daftarDonasi) {
            System.out.println(b.getDetail());
        }
    }
}
