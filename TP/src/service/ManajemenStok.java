package service;

import model.Barang;
import java.util.ArrayList;
import java.util.List;

public class ManajemenStok implements DistribusiService {

    private List<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan.");
    }

    public Barang cariBarang(String kode) {
        for (Barang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    @Override
    public void distribusikan(Barang barang, int jumlah) {
        if (barang.kurangiStok(jumlah)) {
            System.out.println("Distribusi berhasil.");
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}
