package model;

import service.LaporanService;
import java.util.List;

public class Laporan implements LaporanService {

    private List<Barang> data;

    public Laporan(List<Barang> data) {
        this.data = data;
    }

    @Override
    public void cetakLaporan() {
        System.out.println("\n===== LAPORAN STOK POSKO =====");
        for (Barang b : data) {
            System.out.println(
                    b.getKode() + " | " +
                            b.getNama() + " | " +
                            b.getJenis() + " | Stok: " +
                            b.getStok()
            );
        }
        System.out.println("=============================");
    }
}
