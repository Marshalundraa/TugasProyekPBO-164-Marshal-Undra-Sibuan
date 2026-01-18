package model;

public class BantuanBarang extends Bantuan {
    private Barang barang;
    private int jumlah;

    public BantuanBarang(Donatur donatur, Barang barang, int jumlah) {
        super(donatur);
        this.barang = barang;
        this.jumlah = jumlah;
    }

    @Override
    public String getDetail() {
        return donatur.getNama() + " menyumbang " +
                barang.getNama() + " sebanyak " + jumlah;
    }
}
