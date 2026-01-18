package model;

public class BarangPokok extends Barang {
    private String kategori;

    public BarangPokok(String kode, String nama, int stok, String kategori) {
        super(kode, nama, stok);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public String getJenis() {
        return "Barang Pokok";
    }
}
