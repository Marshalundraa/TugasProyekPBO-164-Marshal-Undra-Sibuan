package model;

import java.time.LocalDateTime;

public class TransaksiStok {
    private Barang barang;
    private int jumlah;
    private String tipe;
    private LocalDateTime waktu;

    public TransaksiStok(Barang barang, int jumlah, String tipe) {
        this.barang = barang;
        this.jumlah = jumlah;
        this.tipe = tipe;
        this.waktu = LocalDateTime.now();
    }

    public String getDetail() {
        return waktu + " | " + barang.getNama() + " | " + tipe + " | " + jumlah;
    }
}
