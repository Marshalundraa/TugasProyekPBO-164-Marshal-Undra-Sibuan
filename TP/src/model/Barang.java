package model;

public abstract class Barang {
    protected String kode;
    protected String nama;
    protected int stok;

    public Barang(String kode, String nama, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    public abstract String getJenis();
}
