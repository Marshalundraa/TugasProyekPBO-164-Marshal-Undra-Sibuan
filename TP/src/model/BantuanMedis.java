package model;

public class BantuanMedis extends Barang {

    public BantuanMedis(String kode, String nama, int stok) {
        super(kode, nama, stok);
    }

    @Override
    public String getJenis() {
        return "Bantuan Medis";
    }
}
